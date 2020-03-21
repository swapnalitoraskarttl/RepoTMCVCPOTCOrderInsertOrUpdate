
package com.siebel.xml.order_20interface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderInterfaceTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderInterfaceTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfOrderInterface" type="{http://www.siebel.com/xml/Order%20Interface}ListOfOrderInterface"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderInterfaceTopElmt", propOrder = {
    "listOfOrderInterface"
})
public class ListOfOrderInterfaceTopElmt {

    @XmlElement(name = "ListOfOrderInterface", required = true)
    protected ListOfOrderInterface listOfOrderInterface;

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

}
