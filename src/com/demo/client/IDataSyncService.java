
package com.demo.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "IDataSyncService", targetNamespace = "http://webservice.sync.client.rainbow.laketune.com/", wsdlLocation = "http://192.168.13.153:8080/ems/service/DataSync?wsdl")
public class IDataSyncService
    extends Service
{

    private final static URL IDATASYNCSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://192.168.13.153:8080/ems/service/DataSync?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        IDATASYNCSERVICE_WSDL_LOCATION = url;
    }

    public IDataSyncService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IDataSyncService() {
        super(IDATASYNCSERVICE_WSDL_LOCATION, new QName("http://webservice.sync.client.rainbow.laketune.com/", "IDataSyncService"));
    }

    /**
     * 
     * @return
     *     returns IDataSync
     */
    @WebEndpoint(name = "IDataSyncPort")
    public IDataSync getIDataSyncPort() {
        return (IDataSync)super.getPort(new QName("http://webservice.sync.client.rainbow.laketune.com/", "IDataSyncPort"), IDataSync.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IDataSync
     */
    @WebEndpoint(name = "IDataSyncPort")
    public IDataSync getIDataSyncPort(WebServiceFeature... features) {
        return (IDataSync)super.getPort(new QName("http://webservice.sync.client.rainbow.laketune.com/", "IDataSyncPort"), IDataSync.class, features);
    }

}
