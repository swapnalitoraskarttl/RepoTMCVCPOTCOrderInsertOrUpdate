
package com.siebel.xml.order_20interface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromisedScheduleLines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromisedScheduleLines"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PromisedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PromisedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineItemActionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceInventoryLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceInventoryLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceInventoryLocationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PromisedScheduleLines", propOrder = {
    "id",
    "availableStatus",
    "availableStatusAsOfDate",
    "promisedDate",
    "promisedQuantity",
    "integrationId",
    "lineItemActionNumber",
    "orderItemId",
    "orderItemIntegrationId",
    "partNumber",
    "productId",
    "productIntegrationId",
    "productName",
    "sourceInventoryLocation",
    "sourceInventoryLocationId",
    "sourceInventoryLocationIntegrationId"
})
public class PromisedScheduleLines {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "AvailableStatus")
    protected String availableStatus;
    @XmlElement(name = "AvailableStatusAsOfDate")
    protected String availableStatusAsOfDate;
    @XmlElement(name = "PromisedDate")
    protected String promisedDate;
    @XmlElement(name = "PromisedQuantity")
    protected String promisedQuantity;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "LineItemActionNumber")
    protected String lineItemActionNumber;
    @XmlElement(name = "OrderItemId")
    protected String orderItemId;
    @XmlElement(name = "OrderItemIntegrationId")
    protected String orderItemIntegrationId;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ProductIntegrationId")
    protected String productIntegrationId;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "SourceInventoryLocation")
    protected String sourceInventoryLocation;
    @XmlElement(name = "SourceInventoryLocationId")
    protected String sourceInventoryLocationId;
    @XmlElement(name = "SourceInventoryLocationIntegrationId")
    protected String sourceInventoryLocationIntegrationId;
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
     * Gets the value of the availableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableStatus() {
        return availableStatus;
    }

    /**
     * Sets the value of the availableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableStatus(String value) {
        this.availableStatus = value;
    }

    /**
     * Gets the value of the availableStatusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableStatusAsOfDate() {
        return availableStatusAsOfDate;
    }

    /**
     * Sets the value of the availableStatusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableStatusAsOfDate(String value) {
        this.availableStatusAsOfDate = value;
    }

    /**
     * Gets the value of the promisedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromisedDate() {
        return promisedDate;
    }

    /**
     * Sets the value of the promisedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromisedDate(String value) {
        this.promisedDate = value;
    }

    /**
     * Gets the value of the promisedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromisedQuantity() {
        return promisedQuantity;
    }

    /**
     * Sets the value of the promisedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromisedQuantity(String value) {
        this.promisedQuantity = value;
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
     * Gets the value of the lineItemActionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemActionNumber() {
        return lineItemActionNumber;
    }

    /**
     * Sets the value of the lineItemActionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemActionNumber(String value) {
        this.lineItemActionNumber = value;
    }

    /**
     * Gets the value of the orderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * Sets the value of the orderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemId(String value) {
        this.orderItemId = value;
    }

    /**
     * Gets the value of the orderItemIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemIntegrationId() {
        return orderItemIntegrationId;
    }

    /**
     * Sets the value of the orderItemIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemIntegrationId(String value) {
        this.orderItemIntegrationId = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIntegrationId() {
        return productIntegrationId;
    }

    /**
     * Sets the value of the productIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIntegrationId(String value) {
        this.productIntegrationId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the sourceInventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInventoryLocation() {
        return sourceInventoryLocation;
    }

    /**
     * Sets the value of the sourceInventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInventoryLocation(String value) {
        this.sourceInventoryLocation = value;
    }

    /**
     * Gets the value of the sourceInventoryLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInventoryLocationId() {
        return sourceInventoryLocationId;
    }

    /**
     * Sets the value of the sourceInventoryLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInventoryLocationId(String value) {
        this.sourceInventoryLocationId = value;
    }

    /**
     * Gets the value of the sourceInventoryLocationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInventoryLocationIntegrationId() {
        return sourceInventoryLocationIntegrationId;
    }

    /**
     * Sets the value of the sourceInventoryLocationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInventoryLocationIntegrationId(String value) {
        this.sourceInventoryLocationIntegrationId = value;
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
