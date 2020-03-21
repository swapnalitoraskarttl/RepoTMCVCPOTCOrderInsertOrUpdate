
package com.siebel.xml.order_20interface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TMAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMInvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMJobBillingEmployee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMJobCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMJobCodePicked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMLineItemDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMLineItemExtraCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMParentProductLineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMTotalJobPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMAction", propOrder = {
    "id",
    "integrationId",
    "tmInvoiceAmount",
    "tmJobBillingEmployee",
    "tmJobCodeDesc",
    "tmJobCodePicked",
    "tmLineItemDiscount",
    "tmLineItemExtraCharge",
    "tmParentProductLineName",
    "tmTotalJobPrice"
})
public class TMAction {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "TMInvoiceAmount")
    protected String tmInvoiceAmount;
    @XmlElement(name = "TMJobBillingEmployee")
    protected String tmJobBillingEmployee;
    @XmlElement(name = "TMJobCodeDesc")
    protected String tmJobCodeDesc;
    @XmlElement(name = "TMJobCodePicked")
    protected String tmJobCodePicked;
    @XmlElement(name = "TMLineItemDiscount")
    protected String tmLineItemDiscount;
    @XmlElement(name = "TMLineItemExtraCharge")
    protected String tmLineItemExtraCharge;
    @XmlElement(name = "TMParentProductLineName")
    protected String tmParentProductLineName;
    @XmlElement(name = "TMTotalJobPrice")
    protected String tmTotalJobPrice;
    @XmlAttribute(name = "operation")
    protected String operation;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the tmInvoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMInvoiceAmount() {
        return tmInvoiceAmount;
    }

    /**
     * Sets the value of the tmInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMInvoiceAmount(String value) {
        this.tmInvoiceAmount = value;
    }

    /**
     * Gets the value of the tmJobBillingEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMJobBillingEmployee() {
        return tmJobBillingEmployee;
    }

    /**
     * Sets the value of the tmJobBillingEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMJobBillingEmployee(String value) {
        this.tmJobBillingEmployee = value;
    }

    /**
     * Gets the value of the tmJobCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMJobCodeDesc() {
        return tmJobCodeDesc;
    }

    /**
     * Sets the value of the tmJobCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMJobCodeDesc(String value) {
        this.tmJobCodeDesc = value;
    }

    /**
     * Gets the value of the tmJobCodePicked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMJobCodePicked() {
        return tmJobCodePicked;
    }

    /**
     * Sets the value of the tmJobCodePicked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMJobCodePicked(String value) {
        this.tmJobCodePicked = value;
    }

    /**
     * Gets the value of the tmLineItemDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMLineItemDiscount() {
        return tmLineItemDiscount;
    }

    /**
     * Sets the value of the tmLineItemDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMLineItemDiscount(String value) {
        this.tmLineItemDiscount = value;
    }

    /**
     * Gets the value of the tmLineItemExtraCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMLineItemExtraCharge() {
        return tmLineItemExtraCharge;
    }

    /**
     * Sets the value of the tmLineItemExtraCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMLineItemExtraCharge(String value) {
        this.tmLineItemExtraCharge = value;
    }

    /**
     * Gets the value of the tmParentProductLineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMParentProductLineName() {
        return tmParentProductLineName;
    }

    /**
     * Sets the value of the tmParentProductLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMParentProductLineName(String value) {
        this.tmParentProductLineName = value;
    }

    /**
     * Gets the value of the tmTotalJobPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMTotalJobPrice() {
        return tmTotalJobPrice;
    }

    /**
     * Sets the value of the tmTotalJobPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMTotalJobPrice(String value) {
        this.tmTotalJobPrice = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
