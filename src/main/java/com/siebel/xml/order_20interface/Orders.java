
package com.siebel.xml.order_20interface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Orders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Orders"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParentProductLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductAMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Approved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovedBy-EmployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovedByDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToAccountSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillTo-FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillTo-LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayToContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayToContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo-FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo-LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillableFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CampaignIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMTaxCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMInvoiceFormatOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMOrderCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMDealerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMDivisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPCRaisedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMInvoiceFormatDiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMOrderPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPCOrderTypeVC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMFinalInvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMOtherChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPurchaseOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMOtherChargePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMSumLineItemLineTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoldReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationInventoryLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationInventoryLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationInventoryLocationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntitlementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntitlementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoldFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayToAccountSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTermIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonalShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceListIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryPositionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAccountSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRequestNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipComplete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccountSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceInventoryLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceInventoryLocationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceInventoryLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubmitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxExempt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalVolumeUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalWeightUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpportunityIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPCFinancedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMJobCardClosedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMSRAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMDivisionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortalUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelatedOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortalBenificiaryDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalPaymentsEntered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalancePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPCSoldToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMNoPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderPINNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OTCAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMSparesOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMOrderReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMOTCExpirydate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMOrderConfirmationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMGSTIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfRelatedShipment" type="{http://www.siebel.com/xml/Order%20Interface}ListOfRelatedShipment" minOccurs="0"/&gt;
 *         &lt;element name="ListOfLineItems" type="{http://www.siebel.com/xml/Order%20Interface}ListOfLineItems" minOccurs="0"/&gt;
 *         &lt;element name="ListOfRelatedOrganization" type="{http://www.siebel.com/xml/Order%20Interface}ListOfRelatedOrganization" minOccurs="0"/&gt;
 *         &lt;element name="ListOfRelatedSalesRep" type="{http://www.siebel.com/xml/Order%20Interface}ListOfRelatedSalesRep" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPayments" type="{http://www.siebel.com/xml/Order%20Interface}ListOfPayments" minOccurs="0"/&gt;
 *         &lt;element name="ListOfTMAction" type="{http://www.siebel.com/xml/Order%20Interface}ListOfTMAction" minOccurs="0"/&gt;
 *         &lt;element name="ListOfRelatedOrderType" type="{http://www.siebel.com/xml/Order%20Interface}ListOfRelatedOrderType" minOccurs="0"/&gt;
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
@XmlType(name = "Orders", propOrder = {
    "parentProductLine",
    "productAMC",
    "product",
    "productLine",
    "id",
    "availableStatus",
    "availableStatusAsOfDate",
    "account",
    "customerSegment",
    "accountId",
    "accountIntegrationId",
    "accountSite",
    "purchaseOrderNumber",
    "active",
    "contractId",
    "contractIntegrationId",
    "contractName",
    "approved",
    "approvedBy",
    "approvedByEmployeeId",
    "approvedByDate",
    "statusAsOfDate",
    "availableDate",
    "integrationMessage",
    "externalOrderNumber",
    "integrationStatus",
    "billToAccount",
    "billToAccountId",
    "billToAccountIntegrationId",
    "billToAccountSite",
    "billToAddressId",
    "billToAddressIntegrationId",
    "billToContactId",
    "billToContactIntegrationId",
    "billToFirstName",
    "billToLastName",
    "payToContactFirstName",
    "payToContactLastName",
    "shipToFirstName",
    "shipToLastName",
    "billableFlag",
    "campaignId",
    "campaignIntegrationId",
    "campaignName",
    "carrier",
    "comments",
    "contactFirstName",
    "contactId",
    "contactIntegrationId",
    "contactLastName",
    "tmTaxCategory",
    "tmInvoiceFormatOrg",
    "tmOrderCategory",
    "tmDealerState",
    "tmDivisionName",
    "tmpcRaisedBy",
    "tmInvoiceFormatDiv",
    "tmOrderPaymentType",
    "tmpcOrderTypeVC",
    "tmFinalInvoiceAmount",
    "tmOtherChargeAmount",
    "tmPurchaseOrder",
    "tmOtherChargePercent",
    "tmSumLineItemLineTotal",
    "currencyCode",
    "orderType",
    "holdReason",
    "description",
    "destinationInventoryLocationId",
    "destinationInventoryLocation",
    "destinationInventoryLocationIntegrationId",
    "discountAmount",
    "integrationStatusAsOfDate",
    "entitlementId",
    "entitlementName",
    "shippingCharges",
    "shippingTerms",
    "holdFlag",
    "integrationId",
    "opportunityName",
    "opportunityId",
    "orderDate",
    "orderNumber",
    "orderPriority",
    "orderSubType",
    "orderTypeCode",
    "orderTypeId",
    "parentOrderId",
    "payToAccount",
    "payToAccountId",
    "payToAccountIntegrationId",
    "payToAccountSite",
    "payToAddressId",
    "payToAddressIntegrationId",
    "payToContactId",
    "payToContactIntegrationId",
    "paymentTerm",
    "paymentTermId",
    "paymentTermIntegrationId",
    "personalShipToAddressId",
    "priceList",
    "priceListId",
    "priceListIntegrationId",
    "primaryOrganization",
    "primaryOrganizationId",
    "primaryPositionId",
    "projectId",
    "projectIntegrationId",
    "projectName",
    "promotionId",
    "quoteId",
    "quoteIntegrationId",
    "quoteNumber",
    "requestedDate",
    "returnReason",
    "returnToAccount",
    "returnToAccountId",
    "returnToAccountIntegrationId",
    "returnToAccountSite",
    "returnToAddressId",
    "returnToAddressIntegrationId",
    "returnToContactId",
    "returnToContactIntegrationId",
    "revision",
    "serviceRequestId",
    "serviceRequestNumber",
    "shipComplete",
    "shipInstructions",
    "shipToAccount",
    "shipToAccountId",
    "shipToAccountIntegrationId",
    "shipToAccountSite",
    "shipToAddressId",
    "shipToAddressIntegrationId",
    "shipToContactId",
    "shipToContactIntegrationId",
    "carrierPriority",
    "sourceInventoryLocationId",
    "sourceInventoryLocationIntegrationId",
    "sourceInventoryLocation",
    "status",
    "submitDate",
    "taxAmount",
    "taxExempt",
    "taxExemptId",
    "taxExemptCode",
    "taxRate",
    "totalVolume",
    "totalVolumeUoM",
    "totalWeight",
    "totalWeightUoM",
    "opportunityIntegrationId",
    "tmpcFinancedBy",
    "tmJobCardClosedDate",
    "tmsrAssetNumber",
    "tmAssetNumber",
    "tmDivisionId",
    "expectedDeliveryDate",
    "portalUserId",
    "relatedOrderNumber",
    "portalBenificiaryDetails",
    "totalPaymentsEntered",
    "orderTotal",
    "balancePayment",
    "tmApplicationName",
    "tmpcSoldToAccountId",
    "productType",
    "quoteStatus",
    "tmNoPAN",
    "orderPINNumber",
    "tmChannel",
    "otcAccountId",
    "tmSparesOrderType",
    "tmOrderReason",
    "tmotcExpirydate",
    "tmOrderConfirmationNo",
    "tmgstin",
    "listOfRelatedShipment",
    "listOfLineItems",
    "listOfRelatedOrganization",
    "listOfRelatedSalesRep",
    "listOfPayments",
    "listOfTMAction",
    "listOfRelatedOrderType"
})
public class Orders {

    @XmlElement(name = "ParentProductLine")
    protected String parentProductLine;
    @XmlElement(name = "ProductAMC")
    protected String productAMC;
    @XmlElement(name = "Product")
    protected String product;
    @XmlElement(name = "ProductLine")
    protected String productLine;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "AvailableStatus")
    protected String availableStatus;
    @XmlElement(name = "AvailableStatusAsOfDate")
    protected String availableStatusAsOfDate;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "CustomerSegment")
    protected String customerSegment;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "AccountIntegrationId")
    protected String accountIntegrationId;
    @XmlElement(name = "AccountSite")
    protected String accountSite;
    @XmlElement(name = "PurchaseOrderNumber")
    protected String purchaseOrderNumber;
    @XmlElement(name = "Active")
    protected String active;
    @XmlElement(name = "ContractId")
    protected String contractId;
    @XmlElement(name = "ContractIntegrationId")
    protected String contractIntegrationId;
    @XmlElement(name = "ContractName")
    protected String contractName;
    @XmlElement(name = "Approved")
    protected String approved;
    @XmlElement(name = "ApprovedBy")
    protected String approvedBy;
    @XmlElement(name = "ApprovedBy-EmployeeId")
    protected String approvedByEmployeeId;
    @XmlElement(name = "ApprovedByDate")
    protected String approvedByDate;
    @XmlElement(name = "StatusAsOfDate")
    protected String statusAsOfDate;
    @XmlElement(name = "AvailableDate")
    protected String availableDate;
    @XmlElement(name = "IntegrationMessage")
    protected String integrationMessage;
    @XmlElement(name = "ExternalOrderNumber")
    protected String externalOrderNumber;
    @XmlElement(name = "IntegrationStatus")
    protected String integrationStatus;
    @XmlElement(name = "BillToAccount")
    protected String billToAccount;
    @XmlElement(name = "BillToAccountId")
    protected String billToAccountId;
    @XmlElement(name = "BillToAccountIntegrationId")
    protected String billToAccountIntegrationId;
    @XmlElement(name = "BillToAccountSite")
    protected String billToAccountSite;
    @XmlElement(name = "BillToAddressId")
    protected String billToAddressId;
    @XmlElement(name = "BillToAddressIntegrationId")
    protected String billToAddressIntegrationId;
    @XmlElement(name = "BillToContactId")
    protected String billToContactId;
    @XmlElement(name = "BillToContactIntegrationId")
    protected String billToContactIntegrationId;
    @XmlElement(name = "BillTo-FirstName")
    protected String billToFirstName;
    @XmlElement(name = "BillTo-LastName")
    protected String billToLastName;
    @XmlElement(name = "PayToContactFirstName")
    protected String payToContactFirstName;
    @XmlElement(name = "PayToContactLastName")
    protected String payToContactLastName;
    @XmlElement(name = "ShipTo-FirstName")
    protected String shipToFirstName;
    @XmlElement(name = "ShipTo-LastName")
    protected String shipToLastName;
    @XmlElement(name = "BillableFlag")
    protected String billableFlag;
    @XmlElement(name = "CampaignId")
    protected String campaignId;
    @XmlElement(name = "CampaignIntegrationId")
    protected String campaignIntegrationId;
    @XmlElement(name = "CampaignName")
    protected String campaignName;
    @XmlElement(name = "Carrier")
    protected String carrier;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "ContactFirstName")
    protected String contactFirstName;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "ContactIntegrationId")
    protected String contactIntegrationId;
    @XmlElement(name = "ContactLastName")
    protected String contactLastName;
    @XmlElement(name = "TMTaxCategory")
    protected String tmTaxCategory;
    @XmlElement(name = "TMInvoiceFormatOrg")
    protected String tmInvoiceFormatOrg;
    @XmlElement(name = "TMOrderCategory")
    protected String tmOrderCategory;
    @XmlElement(name = "TMDealerState")
    protected String tmDealerState;
    @XmlElement(name = "TMDivisionName")
    protected String tmDivisionName;
    @XmlElement(name = "TMPCRaisedBy")
    protected String tmpcRaisedBy;
    @XmlElement(name = "TMInvoiceFormatDiv")
    protected String tmInvoiceFormatDiv;
    @XmlElement(name = "TMOrderPaymentType")
    protected String tmOrderPaymentType;
    @XmlElement(name = "TMPCOrderTypeVC")
    protected String tmpcOrderTypeVC;
    @XmlElement(name = "TMFinalInvoiceAmount")
    protected String tmFinalInvoiceAmount;
    @XmlElement(name = "TMOtherChargeAmount")
    protected String tmOtherChargeAmount;
    @XmlElement(name = "TMPurchaseOrder")
    protected String tmPurchaseOrder;
    @XmlElement(name = "TMOtherChargePercent")
    protected String tmOtherChargePercent;
    @XmlElement(name = "TMSumLineItemLineTotal")
    protected String tmSumLineItemLineTotal;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "OrderType")
    protected String orderType;
    @XmlElement(name = "HoldReason")
    protected String holdReason;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DestinationInventoryLocationId")
    protected String destinationInventoryLocationId;
    @XmlElement(name = "DestinationInventoryLocation")
    protected String destinationInventoryLocation;
    @XmlElement(name = "DestinationInventoryLocationIntegrationId")
    protected String destinationInventoryLocationIntegrationId;
    @XmlElement(name = "DiscountAmount")
    protected String discountAmount;
    @XmlElement(name = "IntegrationStatusAsOfDate")
    protected String integrationStatusAsOfDate;
    @XmlElement(name = "EntitlementId")
    protected String entitlementId;
    @XmlElement(name = "EntitlementName")
    protected String entitlementName;
    @XmlElement(name = "ShippingCharges")
    protected String shippingCharges;
    @XmlElement(name = "ShippingTerms")
    protected String shippingTerms;
    @XmlElement(name = "HoldFlag")
    protected String holdFlag;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "OpportunityName")
    protected String opportunityName;
    @XmlElement(name = "OpportunityId")
    protected String opportunityId;
    @XmlElement(name = "OrderDate")
    protected String orderDate;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "OrderPriority")
    protected String orderPriority;
    @XmlElement(name = "OrderSubType")
    protected String orderSubType;
    @XmlElement(name = "OrderTypeCode")
    protected String orderTypeCode;
    @XmlElement(name = "OrderTypeId")
    protected String orderTypeId;
    @XmlElement(name = "ParentOrderId")
    protected String parentOrderId;
    @XmlElement(name = "PayToAccount")
    protected String payToAccount;
    @XmlElement(name = "PayToAccountId")
    protected String payToAccountId;
    @XmlElement(name = "PayToAccountIntegrationId")
    protected String payToAccountIntegrationId;
    @XmlElement(name = "PayToAccountSite")
    protected String payToAccountSite;
    @XmlElement(name = "PayToAddressId")
    protected String payToAddressId;
    @XmlElement(name = "PayToAddressIntegrationId")
    protected String payToAddressIntegrationId;
    @XmlElement(name = "PayToContactId")
    protected String payToContactId;
    @XmlElement(name = "PayToContactIntegrationId")
    protected String payToContactIntegrationId;
    @XmlElement(name = "PaymentTerm")
    protected String paymentTerm;
    @XmlElement(name = "PaymentTermId")
    protected String paymentTermId;
    @XmlElement(name = "PaymentTermIntegrationId")
    protected String paymentTermIntegrationId;
    @XmlElement(name = "PersonalShipToAddressId")
    protected String personalShipToAddressId;
    @XmlElement(name = "PriceList")
    protected String priceList;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PriceListIntegrationId")
    protected String priceListIntegrationId;
    @XmlElement(name = "PrimaryOrganization")
    protected String primaryOrganization;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "PrimaryPositionId")
    protected String primaryPositionId;
    @XmlElement(name = "ProjectId")
    protected String projectId;
    @XmlElement(name = "ProjectIntegrationId")
    protected String projectIntegrationId;
    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElement(name = "PromotionId")
    protected String promotionId;
    @XmlElement(name = "QuoteId")
    protected String quoteId;
    @XmlElement(name = "QuoteIntegrationId")
    protected String quoteIntegrationId;
    @XmlElement(name = "QuoteNumber")
    protected String quoteNumber;
    @XmlElement(name = "RequestedDate")
    protected String requestedDate;
    @XmlElement(name = "ReturnReason")
    protected String returnReason;
    @XmlElement(name = "ReturnToAccount")
    protected String returnToAccount;
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
    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElement(name = "ServiceRequestId")
    protected String serviceRequestId;
    @XmlElement(name = "ServiceRequestNumber")
    protected String serviceRequestNumber;
    @XmlElement(name = "ShipComplete")
    protected String shipComplete;
    @XmlElement(name = "ShipInstructions")
    protected String shipInstructions;
    @XmlElement(name = "ShipToAccount")
    protected String shipToAccount;
    @XmlElement(name = "ShipToAccountId")
    protected String shipToAccountId;
    @XmlElement(name = "ShipToAccountIntegrationId")
    protected String shipToAccountIntegrationId;
    @XmlElement(name = "ShipToAccountSite")
    protected String shipToAccountSite;
    @XmlElement(name = "ShipToAddressId")
    protected String shipToAddressId;
    @XmlElement(name = "ShipToAddressIntegrationId")
    protected String shipToAddressIntegrationId;
    @XmlElement(name = "ShipToContactId")
    protected String shipToContactId;
    @XmlElement(name = "ShipToContactIntegrationId")
    protected String shipToContactIntegrationId;
    @XmlElement(name = "CarrierPriority")
    protected String carrierPriority;
    @XmlElement(name = "SourceInventoryLocationId")
    protected String sourceInventoryLocationId;
    @XmlElement(name = "SourceInventoryLocationIntegrationId")
    protected String sourceInventoryLocationIntegrationId;
    @XmlElement(name = "SourceInventoryLocation")
    protected String sourceInventoryLocation;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "SubmitDate")
    protected String submitDate;
    @XmlElement(name = "TaxAmount")
    protected String taxAmount;
    @XmlElement(name = "TaxExempt")
    protected String taxExempt;
    @XmlElement(name = "TaxExemptId")
    protected String taxExemptId;
    @XmlElement(name = "TaxExemptCode")
    protected String taxExemptCode;
    @XmlElement(name = "TaxRate")
    protected String taxRate;
    @XmlElement(name = "TotalVolume")
    protected String totalVolume;
    @XmlElement(name = "TotalVolumeUoM")
    protected String totalVolumeUoM;
    @XmlElement(name = "TotalWeight")
    protected String totalWeight;
    @XmlElement(name = "TotalWeightUoM")
    protected String totalWeightUoM;
    @XmlElement(name = "OpportunityIntegrationId")
    protected String opportunityIntegrationId;
    @XmlElement(name = "TMPCFinancedBy")
    protected String tmpcFinancedBy;
    @XmlElement(name = "TMJobCardClosedDate")
    protected String tmJobCardClosedDate;
    @XmlElement(name = "TMSRAssetNumber")
    protected String tmsrAssetNumber;
    @XmlElement(name = "TMAssetNumber")
    protected String tmAssetNumber;
    @XmlElement(name = "TMDivisionId")
    protected String tmDivisionId;
    @XmlElement(name = "ExpectedDeliveryDate")
    protected String expectedDeliveryDate;
    @XmlElement(name = "PortalUserId")
    protected String portalUserId;
    @XmlElement(name = "RelatedOrderNumber")
    protected String relatedOrderNumber;
    @XmlElement(name = "PortalBenificiaryDetails")
    protected String portalBenificiaryDetails;
    @XmlElement(name = "TotalPaymentsEntered")
    protected String totalPaymentsEntered;
    @XmlElement(name = "OrderTotal")
    protected String orderTotal;
    @XmlElement(name = "BalancePayment")
    protected String balancePayment;
    @XmlElement(name = "TMApplicationName")
    protected String tmApplicationName;
    @XmlElement(name = "TMPCSoldToAccountId")
    protected String tmpcSoldToAccountId;
    @XmlElement(name = "ProductType")
    protected String productType;
    @XmlElement(name = "QuoteStatus")
    protected String quoteStatus;
    @XmlElement(name = "TMNoPAN")
    protected String tmNoPAN;
    @XmlElement(name = "OrderPINNumber")
    protected String orderPINNumber;
    @XmlElement(name = "TMChannel")
    protected String tmChannel;
    @XmlElement(name = "OTCAccountId")
    protected String otcAccountId;
    @XmlElement(name = "TMSparesOrderType")
    protected String tmSparesOrderType;
    @XmlElement(name = "TMOrderReason")
    protected String tmOrderReason;
    @XmlElement(name = "TMOTCExpirydate")
    protected String tmotcExpirydate;
    @XmlElement(name = "TMOrderConfirmationNo")
    protected String tmOrderConfirmationNo;
    @XmlElement(name = "TMGSTIN")
    protected String tmgstin;
    @XmlElement(name = "ListOfRelatedShipment")
    protected ListOfRelatedShipment listOfRelatedShipment;
    @XmlElement(name = "ListOfLineItems")
    protected ListOfLineItems listOfLineItems;
    @XmlElement(name = "ListOfRelatedOrganization")
    protected ListOfRelatedOrganization listOfRelatedOrganization;
    @XmlElement(name = "ListOfRelatedSalesRep")
    protected ListOfRelatedSalesRep listOfRelatedSalesRep;
    @XmlElement(name = "ListOfPayments")
    protected ListOfPayments listOfPayments;
    @XmlElement(name = "ListOfTMAction")
    protected ListOfTMAction listOfTMAction;
    @XmlElement(name = "ListOfRelatedOrderType")
    protected ListOfRelatedOrderType listOfRelatedOrderType;
    @XmlAttribute(name = "operation")
    protected String operation;

    /**
     * Gets the value of the parentProductLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProductLine() {
        return parentProductLine;
    }

    /**
     * Sets the value of the parentProductLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProductLine(String value) {
        this.parentProductLine = value;
    }

    /**
     * Gets the value of the productAMC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductAMC() {
        return productAMC;
    }

    /**
     * Sets the value of the productAMC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductAMC(String value) {
        this.productAMC = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the productLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLine() {
        return productLine;
    }

    /**
     * Sets the value of the productLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLine(String value) {
        this.productLine = value;
    }

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
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the customerSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSegment() {
        return customerSegment;
    }

    /**
     * Sets the value of the customerSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSegment(String value) {
        this.customerSegment = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIntegrationId() {
        return accountIntegrationId;
    }

    /**
     * Sets the value of the accountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIntegrationId(String value) {
        this.accountIntegrationId = value;
    }

    /**
     * Gets the value of the accountSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSite() {
        return accountSite;
    }

    /**
     * Sets the value of the accountSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSite(String value) {
        this.accountSite = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the contractIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractIntegrationId() {
        return contractIntegrationId;
    }

    /**
     * Sets the value of the contractIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractIntegrationId(String value) {
        this.contractIntegrationId = value;
    }

    /**
     * Gets the value of the contractName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * Sets the value of the contractName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractName(String value) {
        this.contractName = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproved(String value) {
        this.approved = value;
    }

    /**
     * Gets the value of the approvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedBy() {
        return approvedBy;
    }

    /**
     * Sets the value of the approvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedBy(String value) {
        this.approvedBy = value;
    }

    /**
     * Gets the value of the approvedByEmployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedByEmployeeId() {
        return approvedByEmployeeId;
    }

    /**
     * Sets the value of the approvedByEmployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedByEmployeeId(String value) {
        this.approvedByEmployeeId = value;
    }

    /**
     * Gets the value of the approvedByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedByDate() {
        return approvedByDate;
    }

    /**
     * Sets the value of the approvedByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedByDate(String value) {
        this.approvedByDate = value;
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
     * Gets the value of the integrationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationMessage() {
        return integrationMessage;
    }

    /**
     * Sets the value of the integrationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationMessage(String value) {
        this.integrationMessage = value;
    }

    /**
     * Gets the value of the externalOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalOrderNumber() {
        return externalOrderNumber;
    }

    /**
     * Sets the value of the externalOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalOrderNumber(String value) {
        this.externalOrderNumber = value;
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
     * Gets the value of the billToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccount() {
        return billToAccount;
    }

    /**
     * Sets the value of the billToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccount(String value) {
        this.billToAccount = value;
    }

    /**
     * Gets the value of the billToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccountId() {
        return billToAccountId;
    }

    /**
     * Sets the value of the billToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccountId(String value) {
        this.billToAccountId = value;
    }

    /**
     * Gets the value of the billToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccountIntegrationId() {
        return billToAccountIntegrationId;
    }

    /**
     * Sets the value of the billToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccountIntegrationId(String value) {
        this.billToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the billToAccountSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccountSite() {
        return billToAccountSite;
    }

    /**
     * Sets the value of the billToAccountSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccountSite(String value) {
        this.billToAccountSite = value;
    }

    /**
     * Gets the value of the billToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddressId() {
        return billToAddressId;
    }

    /**
     * Sets the value of the billToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddressId(String value) {
        this.billToAddressId = value;
    }

    /**
     * Gets the value of the billToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddressIntegrationId() {
        return billToAddressIntegrationId;
    }

    /**
     * Sets the value of the billToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddressIntegrationId(String value) {
        this.billToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the billToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToContactId() {
        return billToContactId;
    }

    /**
     * Sets the value of the billToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToContactId(String value) {
        this.billToContactId = value;
    }

    /**
     * Gets the value of the billToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToContactIntegrationId() {
        return billToContactIntegrationId;
    }

    /**
     * Sets the value of the billToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToContactIntegrationId(String value) {
        this.billToContactIntegrationId = value;
    }

    /**
     * Gets the value of the billToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToFirstName() {
        return billToFirstName;
    }

    /**
     * Sets the value of the billToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToFirstName(String value) {
        this.billToFirstName = value;
    }

    /**
     * Gets the value of the billToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToLastName() {
        return billToLastName;
    }

    /**
     * Sets the value of the billToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToLastName(String value) {
        this.billToLastName = value;
    }

    /**
     * Gets the value of the payToContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToContactFirstName() {
        return payToContactFirstName;
    }

    /**
     * Sets the value of the payToContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToContactFirstName(String value) {
        this.payToContactFirstName = value;
    }

    /**
     * Gets the value of the payToContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToContactLastName() {
        return payToContactLastName;
    }

    /**
     * Sets the value of the payToContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToContactLastName(String value) {
        this.payToContactLastName = value;
    }

    /**
     * Gets the value of the shipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToFirstName() {
        return shipToFirstName;
    }

    /**
     * Sets the value of the shipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToFirstName(String value) {
        this.shipToFirstName = value;
    }

    /**
     * Gets the value of the shipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToLastName() {
        return shipToLastName;
    }

    /**
     * Sets the value of the shipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToLastName(String value) {
        this.shipToLastName = value;
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
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignId(String value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the campaignIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignIntegrationId() {
        return campaignIntegrationId;
    }

    /**
     * Sets the value of the campaignIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignIntegrationId(String value) {
        this.campaignIntegrationId = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the contactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFirstName() {
        return contactFirstName;
    }

    /**
     * Sets the value of the contactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFirstName(String value) {
        this.contactFirstName = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactIntegrationId() {
        return contactIntegrationId;
    }

    /**
     * Sets the value of the contactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactIntegrationId(String value) {
        this.contactIntegrationId = value;
    }

    /**
     * Gets the value of the contactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLastName() {
        return contactLastName;
    }

    /**
     * Sets the value of the contactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLastName(String value) {
        this.contactLastName = value;
    }

    /**
     * Gets the value of the tmTaxCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMTaxCategory() {
        return tmTaxCategory;
    }

    /**
     * Sets the value of the tmTaxCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMTaxCategory(String value) {
        this.tmTaxCategory = value;
    }

    /**
     * Gets the value of the tmInvoiceFormatOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMInvoiceFormatOrg() {
        return tmInvoiceFormatOrg;
    }

    /**
     * Sets the value of the tmInvoiceFormatOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMInvoiceFormatOrg(String value) {
        this.tmInvoiceFormatOrg = value;
    }

    /**
     * Gets the value of the tmOrderCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMOrderCategory() {
        return tmOrderCategory;
    }

    /**
     * Sets the value of the tmOrderCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMOrderCategory(String value) {
        this.tmOrderCategory = value;
    }

    /**
     * Gets the value of the tmDealerState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMDealerState() {
        return tmDealerState;
    }

    /**
     * Sets the value of the tmDealerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMDealerState(String value) {
        this.tmDealerState = value;
    }

    /**
     * Gets the value of the tmDivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMDivisionName() {
        return tmDivisionName;
    }

    /**
     * Sets the value of the tmDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMDivisionName(String value) {
        this.tmDivisionName = value;
    }

    /**
     * Gets the value of the tmpcRaisedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPCRaisedBy() {
        return tmpcRaisedBy;
    }

    /**
     * Sets the value of the tmpcRaisedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPCRaisedBy(String value) {
        this.tmpcRaisedBy = value;
    }

    /**
     * Gets the value of the tmInvoiceFormatDiv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMInvoiceFormatDiv() {
        return tmInvoiceFormatDiv;
    }

    /**
     * Sets the value of the tmInvoiceFormatDiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMInvoiceFormatDiv(String value) {
        this.tmInvoiceFormatDiv = value;
    }

    /**
     * Gets the value of the tmOrderPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMOrderPaymentType() {
        return tmOrderPaymentType;
    }

    /**
     * Sets the value of the tmOrderPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMOrderPaymentType(String value) {
        this.tmOrderPaymentType = value;
    }

    /**
     * Gets the value of the tmpcOrderTypeVC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPCOrderTypeVC() {
        return tmpcOrderTypeVC;
    }

    /**
     * Sets the value of the tmpcOrderTypeVC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPCOrderTypeVC(String value) {
        this.tmpcOrderTypeVC = value;
    }

    /**
     * Gets the value of the tmFinalInvoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMFinalInvoiceAmount() {
        return tmFinalInvoiceAmount;
    }

    /**
     * Sets the value of the tmFinalInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMFinalInvoiceAmount(String value) {
        this.tmFinalInvoiceAmount = value;
    }

    /**
     * Gets the value of the tmOtherChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMOtherChargeAmount() {
        return tmOtherChargeAmount;
    }

    /**
     * Sets the value of the tmOtherChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMOtherChargeAmount(String value) {
        this.tmOtherChargeAmount = value;
    }

    /**
     * Gets the value of the tmPurchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPurchaseOrder() {
        return tmPurchaseOrder;
    }

    /**
     * Sets the value of the tmPurchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPurchaseOrder(String value) {
        this.tmPurchaseOrder = value;
    }

    /**
     * Gets the value of the tmOtherChargePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMOtherChargePercent() {
        return tmOtherChargePercent;
    }

    /**
     * Sets the value of the tmOtherChargePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMOtherChargePercent(String value) {
        this.tmOtherChargePercent = value;
    }

    /**
     * Gets the value of the tmSumLineItemLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSumLineItemLineTotal() {
        return tmSumLineItemLineTotal;
    }

    /**
     * Sets the value of the tmSumLineItemLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSumLineItemLineTotal(String value) {
        this.tmSumLineItemLineTotal = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the entitlementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementId() {
        return entitlementId;
    }

    /**
     * Sets the value of the entitlementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementId(String value) {
        this.entitlementId = value;
    }

    /**
     * Gets the value of the entitlementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementName() {
        return entitlementName;
    }

    /**
     * Sets the value of the entitlementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementName(String value) {
        this.entitlementName = value;
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
     * Gets the value of the opportunityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityName() {
        return opportunityName;
    }

    /**
     * Sets the value of the opportunityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityName(String value) {
        this.opportunityName = value;
    }

    /**
     * Gets the value of the opportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityId(String value) {
        this.opportunityId = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
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
     * Gets the value of the orderPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPriority() {
        return orderPriority;
    }

    /**
     * Sets the value of the orderPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPriority(String value) {
        this.orderPriority = value;
    }

    /**
     * Gets the value of the orderSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSubType() {
        return orderSubType;
    }

    /**
     * Sets the value of the orderSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSubType(String value) {
        this.orderSubType = value;
    }

    /**
     * Gets the value of the orderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTypeCode() {
        return orderTypeCode;
    }

    /**
     * Sets the value of the orderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTypeCode(String value) {
        this.orderTypeCode = value;
    }

    /**
     * Gets the value of the orderTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTypeId() {
        return orderTypeId;
    }

    /**
     * Sets the value of the orderTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTypeId(String value) {
        this.orderTypeId = value;
    }

    /**
     * Gets the value of the parentOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrderId() {
        return parentOrderId;
    }

    /**
     * Sets the value of the parentOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrderId(String value) {
        this.parentOrderId = value;
    }

    /**
     * Gets the value of the payToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAccount() {
        return payToAccount;
    }

    /**
     * Sets the value of the payToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAccount(String value) {
        this.payToAccount = value;
    }

    /**
     * Gets the value of the payToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAccountId() {
        return payToAccountId;
    }

    /**
     * Sets the value of the payToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAccountId(String value) {
        this.payToAccountId = value;
    }

    /**
     * Gets the value of the payToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAccountIntegrationId() {
        return payToAccountIntegrationId;
    }

    /**
     * Sets the value of the payToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAccountIntegrationId(String value) {
        this.payToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the payToAccountSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAccountSite() {
        return payToAccountSite;
    }

    /**
     * Sets the value of the payToAccountSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAccountSite(String value) {
        this.payToAccountSite = value;
    }

    /**
     * Gets the value of the payToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAddressId() {
        return payToAddressId;
    }

    /**
     * Sets the value of the payToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAddressId(String value) {
        this.payToAddressId = value;
    }

    /**
     * Gets the value of the payToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToAddressIntegrationId() {
        return payToAddressIntegrationId;
    }

    /**
     * Sets the value of the payToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToAddressIntegrationId(String value) {
        this.payToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the payToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToContactId() {
        return payToContactId;
    }

    /**
     * Sets the value of the payToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToContactId(String value) {
        this.payToContactId = value;
    }

    /**
     * Gets the value of the payToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayToContactIntegrationId() {
        return payToContactIntegrationId;
    }

    /**
     * Sets the value of the payToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayToContactIntegrationId(String value) {
        this.payToContactIntegrationId = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTerm(String value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the paymentTermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermId() {
        return paymentTermId;
    }

    /**
     * Sets the value of the paymentTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermId(String value) {
        this.paymentTermId = value;
    }

    /**
     * Gets the value of the paymentTermIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermIntegrationId() {
        return paymentTermIntegrationId;
    }

    /**
     * Sets the value of the paymentTermIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermIntegrationId(String value) {
        this.paymentTermIntegrationId = value;
    }

    /**
     * Gets the value of the personalShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToAddressId() {
        return personalShipToAddressId;
    }

    /**
     * Sets the value of the personalShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToAddressId(String value) {
        this.personalShipToAddressId = value;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceList(String value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListId(String value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the priceListIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListIntegrationId() {
        return priceListIntegrationId;
    }

    /**
     * Sets the value of the priceListIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListIntegrationId(String value) {
        this.priceListIntegrationId = value;
    }

    /**
     * Gets the value of the primaryOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganization() {
        return primaryOrganization;
    }

    /**
     * Sets the value of the primaryOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganization(String value) {
        this.primaryOrganization = value;
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganizationId(String value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the primaryPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPositionId() {
        return primaryPositionId;
    }

    /**
     * Sets the value of the primaryPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPositionId(String value) {
        this.primaryPositionId = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectIntegrationId() {
        return projectIntegrationId;
    }

    /**
     * Sets the value of the projectIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectIntegrationId(String value) {
        this.projectIntegrationId = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the promotionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionId() {
        return promotionId;
    }

    /**
     * Sets the value of the promotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionId(String value) {
        this.promotionId = value;
    }

    /**
     * Gets the value of the quoteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteId() {
        return quoteId;
    }

    /**
     * Sets the value of the quoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteId(String value) {
        this.quoteId = value;
    }

    /**
     * Gets the value of the quoteIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteIntegrationId() {
        return quoteIntegrationId;
    }

    /**
     * Sets the value of the quoteIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteIntegrationId(String value) {
        this.quoteIntegrationId = value;
    }

    /**
     * Gets the value of the quoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNumber(String value) {
        this.quoteNumber = value;
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
     * Gets the value of the returnReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnReason() {
        return returnReason;
    }

    /**
     * Sets the value of the returnReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnReason(String value) {
        this.returnReason = value;
    }

    /**
     * Gets the value of the returnToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAccount() {
        return returnToAccount;
    }

    /**
     * Sets the value of the returnToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAccount(String value) {
        this.returnToAccount = value;
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
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the serviceRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequestId() {
        return serviceRequestId;
    }

    /**
     * Sets the value of the serviceRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequestId(String value) {
        this.serviceRequestId = value;
    }

    /**
     * Gets the value of the serviceRequestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequestNumber() {
        return serviceRequestNumber;
    }

    /**
     * Sets the value of the serviceRequestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequestNumber(String value) {
        this.serviceRequestNumber = value;
    }

    /**
     * Gets the value of the shipComplete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipComplete() {
        return shipComplete;
    }

    /**
     * Sets the value of the shipComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipComplete(String value) {
        this.shipComplete = value;
    }

    /**
     * Gets the value of the shipInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipInstructions() {
        return shipInstructions;
    }

    /**
     * Sets the value of the shipInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipInstructions(String value) {
        this.shipInstructions = value;
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
     * Gets the value of the shipToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddressIntegrationId() {
        return shipToAddressIntegrationId;
    }

    /**
     * Sets the value of the shipToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddressIntegrationId(String value) {
        this.shipToAddressIntegrationId = value;
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
     * Gets the value of the carrierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierPriority() {
        return carrierPriority;
    }

    /**
     * Sets the value of the carrierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierPriority(String value) {
        this.carrierPriority = value;
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
     * Gets the value of the submitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the value of the submitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitDate(String value) {
        this.submitDate = value;
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
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExempt(String value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the taxExemptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptId() {
        return taxExemptId;
    }

    /**
     * Sets the value of the taxExemptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptId(String value) {
        this.taxExemptId = value;
    }

    /**
     * Gets the value of the taxExemptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptCode() {
        return taxExemptCode;
    }

    /**
     * Sets the value of the taxExemptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptCode(String value) {
        this.taxExemptCode = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the totalVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVolume() {
        return totalVolume;
    }

    /**
     * Sets the value of the totalVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVolume(String value) {
        this.totalVolume = value;
    }

    /**
     * Gets the value of the totalVolumeUoM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVolumeUoM() {
        return totalVolumeUoM;
    }

    /**
     * Sets the value of the totalVolumeUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVolumeUoM(String value) {
        this.totalVolumeUoM = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalWeight(String value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the totalWeightUoM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalWeightUoM() {
        return totalWeightUoM;
    }

    /**
     * Sets the value of the totalWeightUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalWeightUoM(String value) {
        this.totalWeightUoM = value;
    }

    /**
     * Gets the value of the opportunityIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityIntegrationId() {
        return opportunityIntegrationId;
    }

    /**
     * Sets the value of the opportunityIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityIntegrationId(String value) {
        this.opportunityIntegrationId = value;
    }

    /**
     * Gets the value of the tmpcFinancedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPCFinancedBy() {
        return tmpcFinancedBy;
    }

    /**
     * Sets the value of the tmpcFinancedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPCFinancedBy(String value) {
        this.tmpcFinancedBy = value;
    }

    /**
     * Gets the value of the tmJobCardClosedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMJobCardClosedDate() {
        return tmJobCardClosedDate;
    }

    /**
     * Sets the value of the tmJobCardClosedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMJobCardClosedDate(String value) {
        this.tmJobCardClosedDate = value;
    }

    /**
     * Gets the value of the tmsrAssetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSRAssetNumber() {
        return tmsrAssetNumber;
    }

    /**
     * Sets the value of the tmsrAssetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSRAssetNumber(String value) {
        this.tmsrAssetNumber = value;
    }

    /**
     * Gets the value of the tmAssetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMAssetNumber() {
        return tmAssetNumber;
    }

    /**
     * Sets the value of the tmAssetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMAssetNumber(String value) {
        this.tmAssetNumber = value;
    }

    /**
     * Gets the value of the tmDivisionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMDivisionId() {
        return tmDivisionId;
    }

    /**
     * Sets the value of the tmDivisionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMDivisionId(String value) {
        this.tmDivisionId = value;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDeliveryDate(String value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * Gets the value of the portalUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalUserId() {
        return portalUserId;
    }

    /**
     * Sets the value of the portalUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalUserId(String value) {
        this.portalUserId = value;
    }

    /**
     * Gets the value of the relatedOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedOrderNumber() {
        return relatedOrderNumber;
    }

    /**
     * Sets the value of the relatedOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedOrderNumber(String value) {
        this.relatedOrderNumber = value;
    }

    /**
     * Gets the value of the portalBenificiaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalBenificiaryDetails() {
        return portalBenificiaryDetails;
    }

    /**
     * Sets the value of the portalBenificiaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalBenificiaryDetails(String value) {
        this.portalBenificiaryDetails = value;
    }

    /**
     * Gets the value of the totalPaymentsEntered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPaymentsEntered() {
        return totalPaymentsEntered;
    }

    /**
     * Sets the value of the totalPaymentsEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPaymentsEntered(String value) {
        this.totalPaymentsEntered = value;
    }

    /**
     * Gets the value of the orderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the value of the orderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTotal(String value) {
        this.orderTotal = value;
    }

    /**
     * Gets the value of the balancePayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalancePayment() {
        return balancePayment;
    }

    /**
     * Sets the value of the balancePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalancePayment(String value) {
        this.balancePayment = value;
    }

    /**
     * Gets the value of the tmApplicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMApplicationName() {
        return tmApplicationName;
    }

    /**
     * Sets the value of the tmApplicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMApplicationName(String value) {
        this.tmApplicationName = value;
    }

    /**
     * Gets the value of the tmpcSoldToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPCSoldToAccountId() {
        return tmpcSoldToAccountId;
    }

    /**
     * Sets the value of the tmpcSoldToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPCSoldToAccountId(String value) {
        this.tmpcSoldToAccountId = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the quoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteStatus() {
        return quoteStatus;
    }

    /**
     * Sets the value of the quoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteStatus(String value) {
        this.quoteStatus = value;
    }

    /**
     * Gets the value of the tmNoPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMNoPAN() {
        return tmNoPAN;
    }

    /**
     * Sets the value of the tmNoPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMNoPAN(String value) {
        this.tmNoPAN = value;
    }

    /**
     * Gets the value of the orderPINNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPINNumber() {
        return orderPINNumber;
    }

    /**
     * Sets the value of the orderPINNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPINNumber(String value) {
        this.orderPINNumber = value;
    }

    /**
     * Gets the value of the tmChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMChannel() {
        return tmChannel;
    }

    /**
     * Sets the value of the tmChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMChannel(String value) {
        this.tmChannel = value;
    }

    /**
     * Gets the value of the otcAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTCAccountId() {
        return otcAccountId;
    }

    /**
     * Sets the value of the otcAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTCAccountId(String value) {
        this.otcAccountId = value;
    }

    /**
     * Gets the value of the tmSparesOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSparesOrderType() {
        return tmSparesOrderType;
    }

    /**
     * Sets the value of the tmSparesOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSparesOrderType(String value) {
        this.tmSparesOrderType = value;
    }

    /**
     * Gets the value of the tmOrderReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMOrderReason() {
        return tmOrderReason;
    }

    /**
     * Sets the value of the tmOrderReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMOrderReason(String value) {
        this.tmOrderReason = value;
    }

    /**
     * Gets the value of the tmotcExpirydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMOTCExpirydate() {
        return tmotcExpirydate;
    }

    /**
     * Sets the value of the tmotcExpirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMOTCExpirydate(String value) {
        this.tmotcExpirydate = value;
    }

    /**
     * Gets the value of the tmOrderConfirmationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMOrderConfirmationNo() {
        return tmOrderConfirmationNo;
    }

    /**
     * Sets the value of the tmOrderConfirmationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMOrderConfirmationNo(String value) {
        this.tmOrderConfirmationNo = value;
    }

    /**
     * Gets the value of the tmgstin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMGSTIN() {
        return tmgstin;
    }

    /**
     * Sets the value of the tmgstin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMGSTIN(String value) {
        this.tmgstin = value;
    }

    /**
     * Gets the value of the listOfRelatedShipment property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfRelatedShipment }
     *     
     */
    public ListOfRelatedShipment getListOfRelatedShipment() {
        return listOfRelatedShipment;
    }

    /**
     * Sets the value of the listOfRelatedShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfRelatedShipment }
     *     
     */
    public void setListOfRelatedShipment(ListOfRelatedShipment value) {
        this.listOfRelatedShipment = value;
    }

    /**
     * Gets the value of the listOfLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfLineItems }
     *     
     */
    public ListOfLineItems getListOfLineItems() {
        return listOfLineItems;
    }

    /**
     * Sets the value of the listOfLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfLineItems }
     *     
     */
    public void setListOfLineItems(ListOfLineItems value) {
        this.listOfLineItems = value;
    }

    /**
     * Gets the value of the listOfRelatedOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfRelatedOrganization }
     *     
     */
    public ListOfRelatedOrganization getListOfRelatedOrganization() {
        return listOfRelatedOrganization;
    }

    /**
     * Sets the value of the listOfRelatedOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfRelatedOrganization }
     *     
     */
    public void setListOfRelatedOrganization(ListOfRelatedOrganization value) {
        this.listOfRelatedOrganization = value;
    }

    /**
     * Gets the value of the listOfRelatedSalesRep property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfRelatedSalesRep }
     *     
     */
    public ListOfRelatedSalesRep getListOfRelatedSalesRep() {
        return listOfRelatedSalesRep;
    }

    /**
     * Sets the value of the listOfRelatedSalesRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfRelatedSalesRep }
     *     
     */
    public void setListOfRelatedSalesRep(ListOfRelatedSalesRep value) {
        this.listOfRelatedSalesRep = value;
    }

    /**
     * Gets the value of the listOfPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPayments }
     *     
     */
    public ListOfPayments getListOfPayments() {
        return listOfPayments;
    }

    /**
     * Sets the value of the listOfPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPayments }
     *     
     */
    public void setListOfPayments(ListOfPayments value) {
        this.listOfPayments = value;
    }

    /**
     * Gets the value of the listOfTMAction property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfTMAction }
     *     
     */
    public ListOfTMAction getListOfTMAction() {
        return listOfTMAction;
    }

    /**
     * Sets the value of the listOfTMAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfTMAction }
     *     
     */
    public void setListOfTMAction(ListOfTMAction value) {
        this.listOfTMAction = value;
    }

    /**
     * Gets the value of the listOfRelatedOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfRelatedOrderType }
     *     
     */
    public ListOfRelatedOrderType getListOfRelatedOrderType() {
        return listOfRelatedOrderType;
    }

    /**
     * Sets the value of the listOfRelatedOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfRelatedOrderType }
     *     
     */
    public void setListOfRelatedOrderType(ListOfRelatedOrderType value) {
        this.listOfRelatedOrderType = value;
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
