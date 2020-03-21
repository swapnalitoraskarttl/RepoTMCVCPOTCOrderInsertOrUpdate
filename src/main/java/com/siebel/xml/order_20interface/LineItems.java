
package com.siebel.xml.order_20interface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillableFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMExcludePricingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMSalesServiceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationInventoryLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationInventoryLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationInventoryLocationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageNameOutbound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeightUnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoldFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoldReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoanerFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderHeaderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageNameInbound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAccountSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContact-FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContact-LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShiptoAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiingleDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SmartPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceInventoryLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceInventoryLocationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceInventoryLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMTaxName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeUnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccountSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedListPriceDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmountDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercentDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMSRActionTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConvenienceCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPCAMCContractPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPCAMCEnqContractKM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPCAMCType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPromisedScheduleLines" type="{http://www.siebel.com/xml/Order%20Interface}ListOfPromisedScheduleLines" minOccurs="0"/&gt;
 *         &lt;element name="ListOfRequestedScheduleLines" type="{http://www.siebel.com/xml/Order%20Interface}ListOfRequestedScheduleLines" minOccurs="0"/&gt;
 *         &lt;element name="ListOfAttributes" type="{http://www.siebel.com/xml/Order%20Interface}ListOfAttributes" minOccurs="0"/&gt;
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
@XmlType(name = "LineItems", propOrder = {
    "id",
    "availableStatus",
    "availableStatusAsOfDate",
    "actionCode",
    "startPrice",
    "statusAsOfDate",
    "assetId",
    "assetIntegrationId",
    "assetNumber",
    "availableDate",
    "availableQuantity",
    "integrationStatus",
    "basePrice",
    "billableFlag",
    "tmProduct",
    "tmExcludePricingFlag",
    "tmCurrencyCode",
    "tmExchangeDate",
    "tmSalesServiceFlag",
    "unitPrice",
    "shippingCarrier",
    "description2",
    "destinationInventoryLocationId",
    "destinationInventoryLocation",
    "destinationInventoryLocationIntegrationId",
    "discountAmount",
    "discountPercent",
    "packageNameOutbound",
    "requestedDate",
    "integrationStatusAsOfDate",
    "shippingCharges",
    "shippingTerms",
    "weight",
    "weightUnitofMeasure",
    "holdFlag",
    "holdReason",
    "integrationId",
    "lineNumber",
    "loanerFlag",
    "note",
    "orderHeaderId",
    "orderNumber",
    "packageNameInbound",
    "parentOrderItemId",
    "partNumber",
    "productName",
    "productId",
    "productIntegrationId",
    "requestedQuantity",
    "shipQuantity",
    "returnToAccountName",
    "returnToAccountId",
    "returnToAccountIntegrationId",
    "returnToAccountSite",
    "returnToAddressId",
    "returnToAddressIntegrationId",
    "returnToContactId",
    "returnToContactIntegrationId",
    "rootOrderItemId",
    "shipDate",
    "shipInstruction",
    "shipToAccount",
    "shipToAccountId",
    "shipToAccountIntegrationId",
    "returnToFirstName",
    "returnToLastName",
    "shipToContactFirstName",
    "shipToContactLastName",
    "shipToAddressId",
    "shipToContactId",
    "shipToContactIntegrationId",
    "shiptoAddressIntegrationId",
    "siingleDelivery",
    "smartPartNumber",
    "sourceInventoryLocationId",
    "sourceInventoryLocationIntegrationId",
    "sourceInventoryLocation",
    "status",
    "taxAmount",
    "tmTaxName",
    "unitofMeasure",
    "volume",
    "volumeUnitofMeasure",
    "shipToAccountSite",
    "adjustedListPriceDisplay",
    "discountAmountDisplay",
    "discountPercentDisplay",
    "lineTotal",
    "mr",
    "minimumQuantity",
    "productDescription",
    "tmsrActionTaken",
    "convenienceCharge",
    "tmpcamcContractPeriod",
    "tmpcamcEnqContractKM",
    "tmpcamcType",
    "listOfPromisedScheduleLines",
    "listOfRequestedScheduleLines",
    "listOfAttributes"
})
public class LineItems {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "AvailableStatus")
    protected String availableStatus;
    @XmlElement(name = "AvailableStatusAsOfDate")
    protected String availableStatusAsOfDate;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "StartPrice")
    protected String startPrice;
    @XmlElement(name = "StatusAsOfDate")
    protected String statusAsOfDate;
    @XmlElement(name = "AssetId")
    protected String assetId;
    @XmlElement(name = "AssetIntegrationId")
    protected String assetIntegrationId;
    @XmlElement(name = "AssetNumber")
    protected String assetNumber;
    @XmlElement(name = "AvailableDate")
    protected String availableDate;
    @XmlElement(name = "AvailableQuantity")
    protected String availableQuantity;
    @XmlElement(name = "IntegrationStatus")
    protected String integrationStatus;
    @XmlElement(name = "BasePrice")
    protected String basePrice;
    @XmlElement(name = "BillableFlag")
    protected String billableFlag;
    @XmlElement(name = "TMProduct")
    protected String tmProduct;
    @XmlElement(name = "TMExcludePricingFlag")
    protected String tmExcludePricingFlag;
    @XmlElement(name = "TMCurrencyCode")
    protected String tmCurrencyCode;
    @XmlElement(name = "TMExchangeDate")
    protected String tmExchangeDate;
    @XmlElement(name = "TMSalesServiceFlag")
    protected String tmSalesServiceFlag;
    @XmlElement(name = "UnitPrice")
    protected String unitPrice;
    @XmlElement(name = "ShippingCarrier")
    protected String shippingCarrier;
    @XmlElement(name = "Description2")
    protected String description2;
    @XmlElement(name = "DestinationInventoryLocationId")
    protected String destinationInventoryLocationId;
    @XmlElement(name = "DestinationInventoryLocation")
    protected String destinationInventoryLocation;
    @XmlElement(name = "DestinationInventoryLocationIntegrationId")
    protected String destinationInventoryLocationIntegrationId;
    @XmlElement(name = "DiscountAmount")
    protected String discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected String discountPercent;
    @XmlElement(name = "PackageNameOutbound")
    protected String packageNameOutbound;
    @XmlElement(name = "RequestedDate")
    protected String requestedDate;
    @XmlElement(name = "IntegrationStatusAsOfDate")
    protected String integrationStatusAsOfDate;
    @XmlElement(name = "ShippingCharges")
    protected String shippingCharges;
    @XmlElement(name = "ShippingTerms")
    protected String shippingTerms;
    @XmlElement(name = "Weight")
    protected String weight;
    @XmlElement(name = "WeightUnitofMeasure")
    protected String weightUnitofMeasure;
    @XmlElement(name = "HoldFlag")
    protected String holdFlag;
    @XmlElement(name = "HoldReason")
    protected String holdReason;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "LineNumber")
    protected String lineNumber;
    @XmlElement(name = "LoanerFlag")
    protected String loanerFlag;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "OrderHeaderId")
    protected String orderHeaderId;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "PackageNameInbound")
    protected String packageNameInbound;
    @XmlElement(name = "ParentOrderItemId")
    protected String parentOrderItemId;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ProductIntegrationId")
    protected String productIntegrationId;
    @XmlElement(name = "RequestedQuantity")
    protected String requestedQuantity;
    @XmlElement(name = "ShipQuantity")
    protected String shipQuantity;
    @XmlElement(name = "ReturnToAccountName")
    protected String returnToAccountName;
    @XmlElement(name = "ReturnToAccountId")
    protected String returnToAccountId;
    @XmlElement(name = "ReturnToAccountIntegrationId")
    protected String returnToAccountIntegrationId;
    @XmlElement(name = "ReturnToAccountSite")
    protected String returnToAccountSite;
    @XmlElement(name = "ReturnToAddressId")
    protected String returnToAddressId;
    @XmlElement(name = "ReturnToAddressIntegrationId")
    protected String returnToAddressIntegrationId;
    @XmlElement(name = "ReturnToContactId")
    protected String returnToContactId;
    @XmlElement(name = "ReturnToContactIntegrationId")
    protected String returnToContactIntegrationId;
    @XmlElement(name = "RootOrderItemId")
    protected String rootOrderItemId;
    @XmlElement(name = "ShipDate")
    protected String shipDate;
    @XmlElement(name = "ShipInstruction")
    protected String shipInstruction;
    @XmlElement(name = "ShipToAccount")
    protected String shipToAccount;
    @XmlElement(name = "ShipToAccountId")
    protected String shipToAccountId;
    @XmlElement(name = "ShipToAccountIntegrationId")
    protected String shipToAccountIntegrationId;
    @XmlElement(name = "ReturnToFirstName")
    protected String returnToFirstName;
    @XmlElement(name = "ReturnToLastName")
    protected String returnToLastName;
    @XmlElement(name = "ShipToContact-FirstName")
    protected String shipToContactFirstName;
    @XmlElement(name = "ShipToContact-LastName")
    protected String shipToContactLastName;
    @XmlElement(name = "ShipToAddressId")
    protected String shipToAddressId;
    @XmlElement(name = "ShipToContactId")
    protected String shipToContactId;
    @XmlElement(name = "ShipToContactIntegrationId")
    protected String shipToContactIntegrationId;
    @XmlElement(name = "ShiptoAddressIntegrationId")
    protected String shiptoAddressIntegrationId;
    @XmlElement(name = "SiingleDelivery")
    protected String siingleDelivery;
    @XmlElement(name = "SmartPartNumber")
    protected String smartPartNumber;
    @XmlElement(name = "SourceInventoryLocationId")
    protected String sourceInventoryLocationId;
    @XmlElement(name = "SourceInventoryLocationIntegrationId")
    protected String sourceInventoryLocationIntegrationId;
    @XmlElement(name = "SourceInventoryLocation")
    protected String sourceInventoryLocation;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "TaxAmount")
    protected String taxAmount;
    @XmlElement(name = "TMTaxName")
    protected String tmTaxName;
    @XmlElement(name = "UnitofMeasure")
    protected String unitofMeasure;
    @XmlElement(name = "Volume")
    protected String volume;
    @XmlElement(name = "VolumeUnitofMeasure")
    protected String volumeUnitofMeasure;
    @XmlElement(name = "ShipToAccountSite")
    protected String shipToAccountSite;
    @XmlElement(name = "AdjustedListPriceDisplay")
    protected String adjustedListPriceDisplay;
    @XmlElement(name = "DiscountAmountDisplay")
    protected String discountAmountDisplay;
    @XmlElement(name = "DiscountPercentDisplay")
    protected String discountPercentDisplay;
    @XmlElement(name = "LineTotal")
    protected String lineTotal;
    @XmlElement(name = "MR")
    protected String mr;
    @XmlElement(name = "MinimumQuantity")
    protected String minimumQuantity;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "TMSRActionTaken")
    protected String tmsrActionTaken;
    @XmlElement(name = "ConvenienceCharge")
    protected String convenienceCharge;
    @XmlElement(name = "TMPCAMCContractPeriod")
    protected String tmpcamcContractPeriod;
    @XmlElement(name = "TMPCAMCEnqContractKM")
    protected String tmpcamcEnqContractKM;
    @XmlElement(name = "TMPCAMCType")
    protected String tmpcamcType;
    @XmlElement(name = "ListOfPromisedScheduleLines")
    protected ListOfPromisedScheduleLines listOfPromisedScheduleLines;
    @XmlElement(name = "ListOfRequestedScheduleLines")
    protected ListOfRequestedScheduleLines listOfRequestedScheduleLines;
    @XmlElement(name = "ListOfAttributes")
    protected ListOfAttributes listOfAttributes;
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
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the startPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPrice() {
        return startPrice;
    }

    /**
     * Sets the value of the startPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPrice(String value) {
        this.startPrice = value;
    }

    /**
     * Gets the value of the statusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusAsOfDate() {
        return statusAsOfDate;
    }

    /**
     * Sets the value of the statusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusAsOfDate(String value) {
        this.statusAsOfDate = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetIntegrationId() {
        return assetIntegrationId;
    }

    /**
     * Sets the value of the assetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetIntegrationId(String value) {
        this.assetIntegrationId = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetNumber(String value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the availableDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableDate() {
        return availableDate;
    }

    /**
     * Sets the value of the availableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableDate(String value) {
        this.availableDate = value;
    }

    /**
     * Gets the value of the availableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableQuantity(String value) {
        this.availableQuantity = value;
    }

    /**
     * Gets the value of the integrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationStatus() {
        return integrationStatus;
    }

    /**
     * Sets the value of the integrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationStatus(String value) {
        this.integrationStatus = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the billableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillableFlag() {
        return billableFlag;
    }

    /**
     * Sets the value of the billableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillableFlag(String value) {
        this.billableFlag = value;
    }

    /**
     * Gets the value of the tmProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMProduct() {
        return tmProduct;
    }

    /**
     * Sets the value of the tmProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMProduct(String value) {
        this.tmProduct = value;
    }

    /**
     * Gets the value of the tmExcludePricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMExcludePricingFlag() {
        return tmExcludePricingFlag;
    }

    /**
     * Sets the value of the tmExcludePricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMExcludePricingFlag(String value) {
        this.tmExcludePricingFlag = value;
    }

    /**
     * Gets the value of the tmCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMCurrencyCode() {
        return tmCurrencyCode;
    }

    /**
     * Sets the value of the tmCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMCurrencyCode(String value) {
        this.tmCurrencyCode = value;
    }

    /**
     * Gets the value of the tmExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMExchangeDate() {
        return tmExchangeDate;
    }

    /**
     * Sets the value of the tmExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMExchangeDate(String value) {
        this.tmExchangeDate = value;
    }

    /**
     * Gets the value of the tmSalesServiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSalesServiceFlag() {
        return tmSalesServiceFlag;
    }

    /**
     * Sets the value of the tmSalesServiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSalesServiceFlag(String value) {
        this.tmSalesServiceFlag = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the shippingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCarrier() {
        return shippingCarrier;
    }

    /**
     * Sets the value of the shippingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCarrier(String value) {
        this.shippingCarrier = value;
    }

    /**
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription2(String value) {
        this.description2 = value;
    }

    /**
     * Gets the value of the destinationInventoryLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationInventoryLocationId() {
        return destinationInventoryLocationId;
    }

    /**
     * Sets the value of the destinationInventoryLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationInventoryLocationId(String value) {
        this.destinationInventoryLocationId = value;
    }

    /**
     * Gets the value of the destinationInventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationInventoryLocation() {
        return destinationInventoryLocation;
    }

    /**
     * Sets the value of the destinationInventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationInventoryLocation(String value) {
        this.destinationInventoryLocation = value;
    }

    /**
     * Gets the value of the destinationInventoryLocationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationInventoryLocationIntegrationId() {
        return destinationInventoryLocationIntegrationId;
    }

    /**
     * Sets the value of the destinationInventoryLocationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationInventoryLocationIntegrationId(String value) {
        this.destinationInventoryLocationIntegrationId = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercent(String value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the packageNameOutbound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageNameOutbound() {
        return packageNameOutbound;
    }

    /**
     * Sets the value of the packageNameOutbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageNameOutbound(String value) {
        this.packageNameOutbound = value;
    }

    /**
     * Gets the value of the requestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedDate() {
        return requestedDate;
    }

    /**
     * Sets the value of the requestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedDate(String value) {
        this.requestedDate = value;
    }

    /**
     * Gets the value of the integrationStatusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationStatusAsOfDate() {
        return integrationStatusAsOfDate;
    }

    /**
     * Sets the value of the integrationStatusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationStatusAsOfDate(String value) {
        this.integrationStatusAsOfDate = value;
    }

    /**
     * Gets the value of the shippingCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCharges() {
        return shippingCharges;
    }

    /**
     * Sets the value of the shippingCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCharges(String value) {
        this.shippingCharges = value;
    }

    /**
     * Gets the value of the shippingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTerms() {
        return shippingTerms;
    }

    /**
     * Sets the value of the shippingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTerms(String value) {
        this.shippingTerms = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightUnitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnitofMeasure() {
        return weightUnitofMeasure;
    }

    /**
     * Sets the value of the weightUnitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnitofMeasure(String value) {
        this.weightUnitofMeasure = value;
    }

    /**
     * Gets the value of the holdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldFlag() {
        return holdFlag;
    }

    /**
     * Sets the value of the holdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldFlag(String value) {
        this.holdFlag = value;
    }

    /**
     * Gets the value of the holdReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldReason() {
        return holdReason;
    }

    /**
     * Sets the value of the holdReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldReason(String value) {
        this.holdReason = value;
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
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the loanerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanerFlag() {
        return loanerFlag;
    }

    /**
     * Sets the value of the loanerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanerFlag(String value) {
        this.loanerFlag = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the orderHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderHeaderId() {
        return orderHeaderId;
    }

    /**
     * Sets the value of the orderHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderHeaderId(String value) {
        this.orderHeaderId = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the packageNameInbound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageNameInbound() {
        return packageNameInbound;
    }

    /**
     * Sets the value of the packageNameInbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageNameInbound(String value) {
        this.packageNameInbound = value;
    }

    /**
     * Gets the value of the parentOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrderItemId() {
        return parentOrderItemId;
    }

    /**
     * Sets the value of the parentOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrderItemId(String value) {
        this.parentOrderItemId = value;
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
     * Gets the value of the requestedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Sets the value of the requestedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedQuantity(String value) {
        this.requestedQuantity = value;
    }

    /**
     * Gets the value of the shipQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipQuantity() {
        return shipQuantity;
    }

    /**
     * Sets the value of the shipQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipQuantity(String value) {
        this.shipQuantity = value;
    }

    /**
     * Gets the value of the returnToAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAccountName() {
        return returnToAccountName;
    }

    /**
     * Sets the value of the returnToAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAccountName(String value) {
        this.returnToAccountName = value;
    }

    /**
     * Gets the value of the returnToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAccountId() {
        return returnToAccountId;
    }

    /**
     * Sets the value of the returnToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAccountId(String value) {
        this.returnToAccountId = value;
    }

    /**
     * Gets the value of the returnToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAccountIntegrationId() {
        return returnToAccountIntegrationId;
    }

    /**
     * Sets the value of the returnToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAccountIntegrationId(String value) {
        this.returnToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the returnToAccountSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAccountSite() {
        return returnToAccountSite;
    }

    /**
     * Sets the value of the returnToAccountSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAccountSite(String value) {
        this.returnToAccountSite = value;
    }

    /**
     * Gets the value of the returnToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAddressId() {
        return returnToAddressId;
    }

    /**
     * Sets the value of the returnToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAddressId(String value) {
        this.returnToAddressId = value;
    }

    /**
     * Gets the value of the returnToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAddressIntegrationId() {
        return returnToAddressIntegrationId;
    }

    /**
     * Sets the value of the returnToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAddressIntegrationId(String value) {
        this.returnToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the returnToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToContactId() {
        return returnToContactId;
    }

    /**
     * Sets the value of the returnToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToContactId(String value) {
        this.returnToContactId = value;
    }

    /**
     * Gets the value of the returnToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToContactIntegrationId() {
        return returnToContactIntegrationId;
    }

    /**
     * Sets the value of the returnToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToContactIntegrationId(String value) {
        this.returnToContactIntegrationId = value;
    }

    /**
     * Gets the value of the rootOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootOrderItemId() {
        return rootOrderItemId;
    }

    /**
     * Sets the value of the rootOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootOrderItemId(String value) {
        this.rootOrderItemId = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipDate(String value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shipInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipInstruction() {
        return shipInstruction;
    }

    /**
     * Sets the value of the shipInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipInstruction(String value) {
        this.shipInstruction = value;
    }

    /**
     * Gets the value of the shipToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccount() {
        return shipToAccount;
    }

    /**
     * Sets the value of the shipToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccount(String value) {
        this.shipToAccount = value;
    }

    /**
     * Gets the value of the shipToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountId() {
        return shipToAccountId;
    }

    /**
     * Sets the value of the shipToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountId(String value) {
        this.shipToAccountId = value;
    }

    /**
     * Gets the value of the shipToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountIntegrationId() {
        return shipToAccountIntegrationId;
    }

    /**
     * Sets the value of the shipToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountIntegrationId(String value) {
        this.shipToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the returnToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToFirstName() {
        return returnToFirstName;
    }

    /**
     * Sets the value of the returnToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToFirstName(String value) {
        this.returnToFirstName = value;
    }

    /**
     * Gets the value of the returnToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToLastName() {
        return returnToLastName;
    }

    /**
     * Sets the value of the returnToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToLastName(String value) {
        this.returnToLastName = value;
    }

    /**
     * Gets the value of the shipToContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactFirstName() {
        return shipToContactFirstName;
    }

    /**
     * Sets the value of the shipToContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactFirstName(String value) {
        this.shipToContactFirstName = value;
    }

    /**
     * Gets the value of the shipToContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactLastName() {
        return shipToContactLastName;
    }

    /**
     * Sets the value of the shipToContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactLastName(String value) {
        this.shipToContactLastName = value;
    }

    /**
     * Gets the value of the shipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddressId() {
        return shipToAddressId;
    }

    /**
     * Sets the value of the shipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddressId(String value) {
        this.shipToAddressId = value;
    }

    /**
     * Gets the value of the shipToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactId() {
        return shipToContactId;
    }

    /**
     * Sets the value of the shipToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactId(String value) {
        this.shipToContactId = value;
    }

    /**
     * Gets the value of the shipToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactIntegrationId() {
        return shipToContactIntegrationId;
    }

    /**
     * Sets the value of the shipToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactIntegrationId(String value) {
        this.shipToContactIntegrationId = value;
    }

    /**
     * Gets the value of the shiptoAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShiptoAddressIntegrationId() {
        return shiptoAddressIntegrationId;
    }

    /**
     * Sets the value of the shiptoAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiptoAddressIntegrationId(String value) {
        this.shiptoAddressIntegrationId = value;
    }

    /**
     * Gets the value of the siingleDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiingleDelivery() {
        return siingleDelivery;
    }

    /**
     * Sets the value of the siingleDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiingleDelivery(String value) {
        this.siingleDelivery = value;
    }

    /**
     * Gets the value of the smartPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartPartNumber() {
        return smartPartNumber;
    }

    /**
     * Sets the value of the smartPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartPartNumber(String value) {
        this.smartPartNumber = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the tmTaxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMTaxName() {
        return tmTaxName;
    }

    /**
     * Sets the value of the tmTaxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMTaxName(String value) {
        this.tmTaxName = value;
    }

    /**
     * Gets the value of the unitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitofMeasure() {
        return unitofMeasure;
    }

    /**
     * Sets the value of the unitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitofMeasure(String value) {
        this.unitofMeasure = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the volumeUnitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUnitofMeasure() {
        return volumeUnitofMeasure;
    }

    /**
     * Sets the value of the volumeUnitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUnitofMeasure(String value) {
        this.volumeUnitofMeasure = value;
    }

    /**
     * Gets the value of the shipToAccountSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountSite() {
        return shipToAccountSite;
    }

    /**
     * Sets the value of the shipToAccountSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountSite(String value) {
        this.shipToAccountSite = value;
    }

    /**
     * Gets the value of the adjustedListPriceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedListPriceDisplay() {
        return adjustedListPriceDisplay;
    }

    /**
     * Sets the value of the adjustedListPriceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedListPriceDisplay(String value) {
        this.adjustedListPriceDisplay = value;
    }

    /**
     * Gets the value of the discountAmountDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmountDisplay() {
        return discountAmountDisplay;
    }

    /**
     * Sets the value of the discountAmountDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmountDisplay(String value) {
        this.discountAmountDisplay = value;
    }

    /**
     * Gets the value of the discountPercentDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercentDisplay() {
        return discountPercentDisplay;
    }

    /**
     * Sets the value of the discountPercentDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercentDisplay(String value) {
        this.discountPercentDisplay = value;
    }

    /**
     * Gets the value of the lineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineTotal() {
        return lineTotal;
    }

    /**
     * Sets the value of the lineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineTotal(String value) {
        this.lineTotal = value;
    }

    /**
     * Gets the value of the mr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMR() {
        return mr;
    }

    /**
     * Sets the value of the mr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMR(String value) {
        this.mr = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumQuantity(String value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the tmsrActionTaken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSRActionTaken() {
        return tmsrActionTaken;
    }

    /**
     * Sets the value of the tmsrActionTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSRActionTaken(String value) {
        this.tmsrActionTaken = value;
    }

    /**
     * Gets the value of the convenienceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenienceCharge() {
        return convenienceCharge;
    }

    /**
     * Sets the value of the convenienceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenienceCharge(String value) {
        this.convenienceCharge = value;
    }

    /**
     * Gets the value of the tmpcamcContractPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPCAMCContractPeriod() {
        return tmpcamcContractPeriod;
    }

    /**
     * Sets the value of the tmpcamcContractPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPCAMCContractPeriod(String value) {
        this.tmpcamcContractPeriod = value;
    }

    /**
     * Gets the value of the tmpcamcEnqContractKM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPCAMCEnqContractKM() {
        return tmpcamcEnqContractKM;
    }

    /**
     * Sets the value of the tmpcamcEnqContractKM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPCAMCEnqContractKM(String value) {
        this.tmpcamcEnqContractKM = value;
    }

    /**
     * Gets the value of the tmpcamcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPCAMCType() {
        return tmpcamcType;
    }

    /**
     * Sets the value of the tmpcamcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPCAMCType(String value) {
        this.tmpcamcType = value;
    }

    /**
     * Gets the value of the listOfPromisedScheduleLines property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromisedScheduleLines }
     *     
     */
    public ListOfPromisedScheduleLines getListOfPromisedScheduleLines() {
        return listOfPromisedScheduleLines;
    }

    /**
     * Sets the value of the listOfPromisedScheduleLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromisedScheduleLines }
     *     
     */
    public void setListOfPromisedScheduleLines(ListOfPromisedScheduleLines value) {
        this.listOfPromisedScheduleLines = value;
    }

    /**
     * Gets the value of the listOfRequestedScheduleLines property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfRequestedScheduleLines }
     *     
     */
    public ListOfRequestedScheduleLines getListOfRequestedScheduleLines() {
        return listOfRequestedScheduleLines;
    }

    /**
     * Sets the value of the listOfRequestedScheduleLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfRequestedScheduleLines }
     *     
     */
    public void setListOfRequestedScheduleLines(ListOfRequestedScheduleLines value) {
        this.listOfRequestedScheduleLines = value;
    }

    /**
     * Gets the value of the listOfAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAttributes }
     *     
     */
    public ListOfAttributes getListOfAttributes() {
        return listOfAttributes;
    }

    /**
     * Sets the value of the listOfAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAttributes }
     *     
     */
    public void setListOfAttributes(ListOfAttributes value) {
        this.listOfAttributes = value;
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
