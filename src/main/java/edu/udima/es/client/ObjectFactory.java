
package edu.udima.es.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.udima.es.client package. 
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

    private final static QName _AplicarIVAResponse_QNAME = new QName("http://edu.udima.es/servicios", "aplicarIVAResponse");
    private final static QName _AplicarIVA_QNAME = new QName("http://edu.udima.es/servicios", "aplicarIVA");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.udima.es.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AplicarIVA }
     * 
     */
    public AplicarIVA createAplicarIVA() {
        return new AplicarIVA();
    }

    /**
     * Create an instance of {@link AplicarIVAResponse }
     * 
     */
    public AplicarIVAResponse createAplicarIVAResponse() {
        return new AplicarIVAResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicarIVAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://edu.udima.es/servicios", name = "aplicarIVAResponse")
    public JAXBElement<AplicarIVAResponse> createAplicarIVAResponse(AplicarIVAResponse value) {
        return new JAXBElement<AplicarIVAResponse>(_AplicarIVAResponse_QNAME, AplicarIVAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicarIVA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://edu.udima.es/servicios", name = "aplicarIVA")
    public JAXBElement<AplicarIVA> createAplicarIVA(AplicarIVA value) {
        return new JAXBElement<AplicarIVA>(_AplicarIVA_QNAME, AplicarIVA.class, null, value);
    }

}
