package com.siebel.asi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-21T19:34:20.834+05:30
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "Siebel_spcOrder",
                  wsdlLocation = "file:/home/sonal/My%20Projects/RepoTMCVCPOTCOrderInsertOrUpdate/src/main/resources/CPOTC_Order.wsdl",
                  targetNamespace = "http://siebel.com/asi/")
public class SiebelSpcOrder extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://siebel.com/asi/", "Siebel_spcOrder");
    public final static QName Default = new QName("http://siebel.com/asi/", "Default");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/sonal/My%20Projects/RepoTMCVCPOTCOrderInsertOrUpdate/src/main/resources/CPOTC_Order.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SiebelSpcOrder.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/sonal/My%20Projects/RepoTMCVCPOTCOrderInsertOrUpdate/src/main/resources/CPOTC_Order.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SiebelSpcOrder(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SiebelSpcOrder(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SiebelSpcOrder() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SiebelSpcOrder(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SiebelSpcOrder(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SiebelSpcOrder(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Default
     */
    @WebEndpoint(name = "Default")
    public Default getDefault() {
        return super.getPort(Default, Default.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Default
     */
    @WebEndpoint(name = "Default")
    public Default getDefault(WebServiceFeature... features) {
        return super.getPort(Default, Default.class, features);
    }

}
