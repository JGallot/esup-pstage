package org.esupportail.pstage.domain.referentiel;

import java.util.List;

import org.apache.log4j.Logger;
import org.esupportail.pstage.dao.referentiel.PersonalDataRepositoryDaoWS;
import org.esupportail.pstagedata.remote.EnseignantDTO;
import org.esupportail.pstagedata.remote.PersonnelCentreGestionDTO;


/**
 * 
 * acces aux donnees du personnel
 *
 */

public class PersonalDataRepositoryDomainWS implements
		PersonalDataRepositoryDomain {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3598515568295577686L;

	/**
	 * 
	 */
	final Logger logger = Logger.getLogger(PersonalDataRepositoryDomainWS.class);

	/**
	 * 
	 */
	private PersonalDataRepositoryDaoWS personalDataRepositoryDaoWS; 

	
	/**
	 * @see org.esupportail.pstage.domain.referentiel.PersonalDataRepositoryDomain#getEnseignantRef(java.lang.String, java.lang.String)
	 */
	public EnseignantDTO getEnseignantRef(String universityCode, String id) {
		return personalDataRepositoryDaoWS.getEnseignantRef(universityCode, id);
	}

	@Override
	public List<EnseignantDTO> getEnseignantsByName(String universityCode,
			String name) {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * @see org.esupportail.pstage.domain.referentiel.PersonalDataRepositoryDomain#getEnseignantsByName(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public List<EnseignantDTO> getEnseignantsByName(String universityCode,
			String name, String firstName, String codeAffectation) {
		if(logger.isInfoEnabled()){
			logger.info(" Appel de PersonalDataRepositoryWS.getEnseignantsByName(universityCode, name,firstName,codeAffectation) : " + universityCode +  " name : " + name 
					+ " firstName : " + firstName + "codeAffectation : " + codeAffectation);
		}
		
		List<EnseignantDTO>  lEnseignant = personalDataRepositoryDaoWS.getEnseignantsByName(universityCode, name, firstName, codeAffectation);
		if(logger.isDebugEnabled()){
			
			logger.debug(" PersonalDataRepositoryDomainWS lEnseignant  ==> " + lEnseignant.size());
		}
		return lEnseignant;
	}

	
	/**
	 * @see org.esupportail.pstage.domain.referentiel.PersonalDataRepositoryDomain#getPersonnelCentreGestionRef(java.lang.String, java.lang.String)
	 */
	public PersonnelCentreGestionDTO getPersonnelCentreGestionRef(
			String universityCode, String id) {
		PersonnelCentreGestionDTO personnelCentreGestion = personalDataRepositoryDaoWS.getPersonnelCentreGestionRef(universityCode, id);
		return personnelCentreGestion;
	}


	/**
	 * @see org.esupportail.pstage.domain.referentiel.PersonalDataRepositoryDomain#getPersonnelCentreGestionRefByName(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public List<PersonnelCentreGestionDTO> getPersonnelCentreGestionRefByName(
			String universityCode, String name, String firstName,
			String codeAffectation) {
		List<PersonnelCentreGestionDTO> lPersonnelCentreGestion = personalDataRepositoryDaoWS.getPersonnelCentreGestionRefByName(universityCode, name, firstName, codeAffectation);

		return lPersonnelCentreGestion;
	}

	/**
	 * @return the personalDataRepositoryDaoWS
	 */
	public PersonalDataRepositoryDaoWS getPersonalDataRepositoryDaoWS() {
		return personalDataRepositoryDaoWS;
	}

	/**
	 * @param personalDataRepositoryDaoWS the personalDataRepositoryDaoWS to set
	 */
	public void setPersonalDataRepositoryDaoWS(
			PersonalDataRepositoryDaoWS personalDataRepositoryDaoWS) {
		this.personalDataRepositoryDaoWS = personalDataRepositoryDaoWS;
	}



	


}
