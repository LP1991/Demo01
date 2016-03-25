
package com.demo.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.demo.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DataSyncResponse_QNAME = new QName("http://webservice.sync.client.rainbow.laketune.com/", "dataSyncResponse");
    private final static QName _DataSync_QNAME = new QName("http://webservice.sync.client.rainbow.laketune.com/", "dataSync");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.demo.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataSync }
     * 
     */
    public DataSync createDataSync() {
        return new DataSync();
    }

    /**
     * Create an instance of {@link DataSyncResponse }
     * 
     */
    public DataSyncResponse createDataSyncResponse() {
        return new DataSyncResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSyncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sync.client.rainbow.laketune.com/", name = "dataSyncResponse")
    public JAXBElement<DataSyncResponse> createDataSyncResponse(DataSyncResponse value) {
        return new JAXBElement<DataSyncResponse>(_DataSyncResponse_QNAME, DataSyncResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sync.client.rainbow.laketune.com/", name = "dataSync")
    public JAXBElement<DataSync> createDataSync(DataSync value) {
        return new JAXBElement<DataSync>(_DataSync_QNAME, DataSync.class, null, value);
    }

}
