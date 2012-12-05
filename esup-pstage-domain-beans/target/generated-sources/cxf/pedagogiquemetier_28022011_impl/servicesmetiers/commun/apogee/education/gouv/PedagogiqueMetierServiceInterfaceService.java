package pedagogiquemetier_28022011_impl.servicesmetiers.commun.apogee.education.gouv;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-12-04T12:58:51.106+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "PedagogiqueMetierServiceInterfaceService", 
                  wsdlLocation = "file:/home/pstage/workspace/esup-pstage/esup-pstage-domain-beans/src/main/resources/META-INF/wsdl/PedagogiqueMetier.wsdl",
                  targetNamespace = "gouv.education.apogee.commun.servicesmetiers.PedagogiqueMetier_28022011-impl") 
public class PedagogiqueMetierServiceInterfaceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("gouv.education.apogee.commun.servicesmetiers.PedagogiqueMetier_28022011-impl", "PedagogiqueMetierServiceInterfaceService");
    public final static QName PedagogiqueMetier = new QName("gouv.education.apogee.commun.servicesmetiers.PedagogiqueMetier_28022011-impl", "PedagogiqueMetier");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/pstage/workspace/esup-pstage/esup-pstage-domain-beans/src/main/resources/META-INF/wsdl/PedagogiqueMetier.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PedagogiqueMetierServiceInterfaceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/pstage/workspace/esup-pstage/esup-pstage-domain-beans/src/main/resources/META-INF/wsdl/PedagogiqueMetier.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PedagogiqueMetierServiceInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PedagogiqueMetierServiceInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PedagogiqueMetierServiceInterfaceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns PedagogiqueMetierServiceInterface
     */
    @WebEndpoint(name = "PedagogiqueMetier")
    public PedagogiqueMetierServiceInterface getPedagogiqueMetier() {
        return super.getPort(PedagogiqueMetier, PedagogiqueMetierServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PedagogiqueMetierServiceInterface
     */
    @WebEndpoint(name = "PedagogiqueMetier")
    public PedagogiqueMetierServiceInterface getPedagogiqueMetier(WebServiceFeature... features) {
        return super.getPort(PedagogiqueMetier, PedagogiqueMetierServiceInterface.class, features);
    }

}
