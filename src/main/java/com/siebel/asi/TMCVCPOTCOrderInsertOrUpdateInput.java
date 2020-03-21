
package com.siebel.asi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.xml.order_20interface.ListOfOrderInterface;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siebel.com/xml/Order%20Interface}ListOfOrderInterface"/&gt;
 *         &lt;element name="StatusObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfOrderInterface",
    "statusObject"
})
@XmlRootElement(name = "TMCVCPOTCOrderInsertOrUpdate_Input")
public class TMCVCPOTCOrderInsertOrUpdateInput {

    @XmlElement(name = "ListOfOrderInterface", namespace = "http://www.siebel.com/xml/Order%20Interface", required = true)
    protected ListOfOrderInterface listOfOrderInterface;
    @XmlElement(name = "StatusObject")
    protected String statusObject;

    /**
     * Gets the value of the listOfOrderInterface property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderInterface }
     *     
     */
    public ListOfOrderInterface getListOfOrderInterface() {
        return listOfOrderInterface;
    }

    /**
     * Sets the value of the listOfOrderInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderInterface }
     *     
     */
    public void setListOfOrderInterface(ListOfOrderInterface value) {
        this.listOfOrderInterface = value;
    }

    /**
     * Gets the value of the statusObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusObject() {
        return statusObject;
    }

    /**
     * Sets the value of the statusObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusObject(String value) {
        this.statusObject = value;
    }

}
