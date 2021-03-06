package org.esupportail.pstage.dao.referentiel.ldap;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.esupportail.commons.services.ldap.LdapException;
import org.esupportail.commons.services.ldap.LdapGroup;
import org.esupportail.commons.services.ldap.LdapGroupService;
import org.esupportail.pstage.dao.referentiel.StudentComponentRepositoryDao;
import org.esupportail.pstage.domain.beans.EtabRef;
import org.esupportail.pstage.domain.beans.LdapGroupeAttributs;
import org.esupportail.pstage.domain.beans.SignataireRef;
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.ldap.filter.OrFilter;
import org.springframework.ldap.filter.WhitespaceWildcardsFilter;

public class StudentComponentRepositoryDaoLdap implements
StudentComponentRepositoryDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(StudentComponentRepositoryDaoLdap.class);

	/**
	 * Groupe service pour la recheches des etapes
	 * Elle sert sutout pour l'attribut ou=Etape 
	 */
	private LdapGroupService ldapGroupServiceSpecial;
	/**
	 * Groupe service pour la recheches des composantes Ldap 
	 */
	private LdapGroupService composanteLdapGroupService;
	/**
	 * 
	 */
	private LdapGroupeAttributs ldapGroupeAttributs;

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		Assert.notNull(ldapGroupeAttributs,"La propriété ldapGroupeAttributs ne peut être null.");
//	}

	/**
	 * recherche informations Etablissement de Reference
	 */
	@Override
	public EtabRef getEtabRef(String universityCode) {
		// FIXME 
		return null;
	}

	@Override
	public Map<String, String> getEtapesRef(String universityCode) {
		List<LdapGroup> ldapGroups =null;

		Map<String, String> composantes=null ;
		AndFilter filter = new AndFilter();
		WhitespaceWildcardsFilter espaceFiltre = new WhitespaceWildcardsFilter(ldapGroupeAttributs.getLdapCodePrincipalesFormations(), " ");
		filter.and(espaceFiltre);
		String encode = filter.encode();   
		encode=encode.substring(1, encode.length()-1);
		if(logger.isInfoEnabled()){
			logger.info("Filtre ldap " + encode);
		}
		try {

			ldapGroups= ldapGroupServiceSpecial.getLdapGroupsFromFilter(encode);

		}
		catch (LdapException ldae) {
			logger.error("Probleme pendant l'appel de getLdapGroupsFromFilter dans la classe "+this.getClass().getSimpleName()+" : ",ldae.getCause());
		}

		if(!ldapGroups.isEmpty()){

			String compCode=null;
			String compLibelle =null;
			composantes = new LinkedHashMap<String, String>(ldapGroups.size());
			//on formate pour le map
			for(LdapGroup group : ldapGroups){
				compCode = group.getAttribute(ldapGroupeAttributs.getLdapComposanteCode());
				compLibelle = group.getAttribute(ldapGroupeAttributs.getLdapComposanteLibelle());
				composantes.put(compCode, compLibelle);
			}	
		}
		return composantes;
	}

	@Override
	public SignataireRef getSigCompoRef(String universityCode, String Composante) {
		return null;
	}

	/**
	 * Recherches des de composantes ufrs
	 */
	@Override
	public Map<String, String> getComposantesPrincipalesRef(String universityCode,
			Map<String, String> lesComposantes) {

		List<LdapGroup> ldapGroups =null;
		Map<String, String> composantes=null;

		AndFilter filter = new AndFilter();       
		String valFormationsPrincipales= ldapGroupeAttributs.getLdapValCodeFormationsPrincipales();
		String  codeFormationsPrincipales = ldapGroupeAttributs.getLdapCodePrincipalesFormations();
		if(valFormationsPrincipales.contains(LdapGroupeAttributs.sperateurValeurLdap)){
			String[]  valsFormaPrinc = valFormationsPrincipales.split(LdapGroupeAttributs.sperateurValeurLdap);
			OrFilter filtreOu = new OrFilter();
			for(String valFormaPrinc : valsFormaPrinc){
				filtreOu.or(new EqualsFilter(codeFormationsPrincipales, valFormaPrinc));
			}
			filter.and(filtreOu);
		} else {
			//un seul attribut
			filter.and(new EqualsFilter(codeFormationsPrincipales, valFormationsPrincipales));

		}
		String encode = filter.encode();   
		encode=encode.substring(1, encode.length()-1);
		if(logger.isInfoEnabled())
			logger.info("Filtre ldap " + encode);

		try {
			ldapGroups= composanteLdapGroupService.getLdapGroupsFromFilter(encode);
			if(!ldapGroups.isEmpty()){

				String compCode=null;
				String compLibelle =null;
				composantes = new LinkedHashMap<String, String>(ldapGroups.size());
				//on formate pour le map
				for(LdapGroup group : ldapGroups){
					compCode = group.getAttribute(ldapGroupeAttributs.getLdapComposanteCode());
					compLibelle = group.getAttribute(ldapGroupeAttributs.getLdapComposanteLibelle());
					composantes.put(compCode, compLibelle);
				}	
			}

		} catch (LdapException ldae) {
			logger.error("Probleme pendant l'appel de getLdapGroupsFromFilter dans la classe "+this.getClass().getSimpleName()+" : ",ldae.getCause());
		}
		return composantes;
	}

	/**
	 * @param ldapGroupServiceSpecial the ldapGroupServiceSpecial to set
	 */
	public void setLdapGroupServiceSpecial(LdapGroupService ldapGroupService) {
		this.ldapGroupServiceSpecial = ldapGroupService;
	}

	/**
	 * @param ldapGroupeAttributs the ldapGroupeAttributs to set
	 */
	public void setLdapGroupeAttributs(LdapGroupeAttributs ldapGroupeAttributs) {
		this.ldapGroupeAttributs = ldapGroupeAttributs;
	}

	/**
	 * @param composanteLdapGroupService the composanteLdapGroupService to set
	 */
	public void setComposanteLdapGroupService(
			LdapGroupService cldgserice) {
		this.composanteLdapGroupService = cldgserice;
	}
}
