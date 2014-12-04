
package edu.udima.es.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aplicarIVA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aplicarIVA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precioSinIVA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aplicarIVA", propOrder = {
    "precioSinIVA"
})
public class AplicarIVA {

    protected Float precioSinIVA;

    /**
     * Obtiene el valor de la propiedad precioSinIVA.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrecioSinIVA() {
        return precioSinIVA;
    }

    /**
     * Define el valor de la propiedad precioSinIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrecioSinIVA(Float value) {
        this.precioSinIVA = value;
    }

}
