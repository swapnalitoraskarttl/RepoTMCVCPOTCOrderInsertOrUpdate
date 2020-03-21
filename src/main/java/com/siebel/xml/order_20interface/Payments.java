
package com.siebel.xml.order_20interface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCheckMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCheckStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCheckStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssuingBankCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssuingBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssuingBankPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAccountSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SocialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VerificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckMailingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankRoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMCVDealerReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMDealerDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMCVPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMCancellationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPaymentRealization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMCVChequeDDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMCVBranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMCVBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMDepositedOnBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMCVDealerReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPaymentBalanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DesiredPayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPaymentOrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortalUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortalBillDeskRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortalTransactionRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TMPaymentSettledFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Payments", propOrder = {
    "id",
    "accountNumber",
    "authorizationCode",
    "authorizationDate",
    "billToAddressId",
    "billToAddressIntegrationId",
    "cardHolder",
    "creditCheckMessage",
    "creditCheckStatus",
    "creditCheckStatusAsOfDate",
    "creditCardExpirationMonth",
    "issuingBankCustomerId",
    "issuingBankName",
    "issuingBankPhoneNumber",
    "merchantId",
    "payment",
    "paymentAccountId",
    "paymentAccountName",
    "paymentAccountSite",
    "paymentMethod",
    "paymentStatus",
    "paymentStatusAsOfDate",
    "paymentType",
    "socialSecurityNumber",
    "transactionAmount",
    "verificationNumber",
    "integrationId",
    "paymentAccountIntegrationId",
    "creditCardExpirationYear",
    "checkMailingAddress",
    "bankRoutingNumber",
    "contactName",
    "paymentComments",
    "tmcvDealerReceiptDate",
    "approvalDate",
    "tmPaymentDate",
    "tmDealerDisplayName",
    "tmcvPaymentAmount",
    "tmCancellationReason",
    "tmPaymentRealization",
    "tmPaymentType",
    "tmcvChequeDDNo",
    "tmcvBranchName",
    "tmcvBankName",
    "tmDepositedOnBank",
    "tmcvDealerReceiptNumber",
    "tmPaymentBalanceAmount",
    "desiredPayDate",
    "orderId",
    "tmPaymentOrgId",
    "description",
    "portalUserId",
    "portalBillDeskRefNo",
    "portalTransactionRefNo",
    "tmPaymentSettledFlag"
})
public class Payments {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "AuthorizationCode")
    protected String authorizationCode;
    @XmlElement(name = "AuthorizationDate")
    protected String authorizationDate;
    @XmlElement(name = "BillToAddressId")
    protected String billToAddressId;
    @XmlElement(name = "BillToAddressIntegrationId")
    protected String billToAddressIntegrationId;
    @XmlElement(name = "CardHolder")
    protected String cardHolder;
    @XmlElement(name = "CreditCheckMessage")
    protected String creditCheckMessage;
    @XmlElement(name = "CreditCheckStatus")
    protected String creditCheckStatus;
    @XmlElement(name = "CreditCheckStatusAsOfDate")
    protected String creditCheckStatusAsOfDate;
    @XmlElement(name = "CreditCardExpirationMonth")
    protected String creditCardExpirationMonth;
    @XmlElement(name = "IssuingBankCustomerId")
    protected String issuingBankCustomerId;
    @XmlElement(name = "IssuingBankName")
    protected String issuingBankName;
    @XmlElement(name = "IssuingBankPhoneNumber")
    protected String issuingBankPhoneNumber;
    @XmlElement(name = "MerchantId")
    protected String merchantId;
    @XmlElement(name = "Payment")
    protected String payment;
    @XmlElement(name = "PaymentAccountId")
    protected String paymentAccountId;
    @XmlElement(name = "PaymentAccountName")
    protected String paymentAccountName;
    @XmlElement(name = "PaymentAccountSite")
    protected String paymentAccountSite;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "PaymentStatus")
    protected String paymentStatus;
    @XmlElement(name = "PaymentStatusAsOfDate")
    protected String paymentStatusAsOfDate;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "SocialSecurityNumber")
    protected String socialSecurityNumber;
    @XmlElement(name = "TransactionAmount")
    protected String transactionAmount;
    @XmlElement(name = "VerificationNumber")
    protected String verificationNumber;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "PaymentAccountIntegrationId")
    protected String paymentAccountIntegrationId;
    @XmlElement(name = "CreditCardExpirationYear")
    protected String creditCardExpirationYear;
    @XmlElement(name = "CheckMailingAddress")
    protected String checkMailingAddress;
    @XmlElement(name = "BankRoutingNumber")
    protected String bankRoutingNumber;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "PaymentComments")
    protected String paymentComments;
    @XmlElement(name = "TMCVDealerReceiptDate")
    protected String tmcvDealerReceiptDate;
    @XmlElement(name = "ApprovalDate")
    protected String approvalDate;
    @XmlElement(name = "TMPaymentDate")
    protected String tmPaymentDate;
    @XmlElement(name = "TMDealerDisplayName")
    protected String tmDealerDisplayName;
    @XmlElement(name = "TMCVPaymentAmount")
    protected String tmcvPaymentAmount;
    @XmlElement(name = "TMCancellationReason")
    protected String tmCancellationReason;
    @XmlElement(name = "TMPaymentRealization")
    protected String tmPaymentRealization;
    @XmlElement(name = "TMPaymentType")
    protected String tmPaymentType;
    @XmlElement(name = "TMCVChequeDDNo")
    protected String tmcvChequeDDNo;
    @XmlElement(name = "TMCVBranchName")
    protected String tmcvBranchName;
    @XmlElement(name = "TMCVBankName")
    protected String tmcvBankName;
    @XmlElement(name = "TMDepositedOnBank")
    protected String tmDepositedOnBank;
    @XmlElement(name = "TMCVDealerReceiptNumber")
    protected String tmcvDealerReceiptNumber;
    @XmlElement(name = "TMPaymentBalanceAmount")
    protected String tmPaymentBalanceAmount;
    @XmlElement(name = "DesiredPayDate")
    protected String desiredPayDate;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "TMPaymentOrgId")
    protected String tmPaymentOrgId;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PortalUserId")
    protected String portalUserId;
    @XmlElement(name = "PortalBillDeskRefNo")
    protected String portalBillDeskRefNo;
    @XmlElement(name = "PortalTransactionRefNo")
    protected String portalTransactionRefNo;
    @XmlElement(name = "TMPaymentSettledFlag")
    protected String tmPaymentSettledFlag;
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
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationDate(String value) {
        this.authorizationDate = value;
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
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the creditCheckMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCheckMessage() {
        return creditCheckMessage;
    }

    /**
     * Sets the value of the creditCheckMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCheckMessage(String value) {
        this.creditCheckMessage = value;
    }

    /**
     * Gets the value of the creditCheckStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCheckStatus() {
        return creditCheckStatus;
    }

    /**
     * Sets the value of the creditCheckStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCheckStatus(String value) {
        this.creditCheckStatus = value;
    }

    /**
     * Gets the value of the creditCheckStatusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCheckStatusAsOfDate() {
        return creditCheckStatusAsOfDate;
    }

    /**
     * Sets the value of the creditCheckStatusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCheckStatusAsOfDate(String value) {
        this.creditCheckStatusAsOfDate = value;
    }

    /**
     * Gets the value of the creditCardExpirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    /**
     * Sets the value of the creditCardExpirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationMonth(String value) {
        this.creditCardExpirationMonth = value;
    }

    /**
     * Gets the value of the issuingBankCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankCustomerId() {
        return issuingBankCustomerId;
    }

    /**
     * Sets the value of the issuingBankCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankCustomerId(String value) {
        this.issuingBankCustomerId = value;
    }

    /**
     * Gets the value of the issuingBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankName() {
        return issuingBankName;
    }

    /**
     * Sets the value of the issuingBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankName(String value) {
        this.issuingBankName = value;
    }

    /**
     * Gets the value of the issuingBankPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankPhoneNumber() {
        return issuingBankPhoneNumber;
    }

    /**
     * Sets the value of the issuingBankPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankPhoneNumber(String value) {
        this.issuingBankPhoneNumber = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayment(String value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountId() {
        return paymentAccountId;
    }

    /**
     * Sets the value of the paymentAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountId(String value) {
        this.paymentAccountId = value;
    }

    /**
     * Gets the value of the paymentAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountName() {
        return paymentAccountName;
    }

    /**
     * Sets the value of the paymentAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountName(String value) {
        this.paymentAccountName = value;
    }

    /**
     * Gets the value of the paymentAccountSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountSite() {
        return paymentAccountSite;
    }

    /**
     * Sets the value of the paymentAccountSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountSite(String value) {
        this.paymentAccountSite = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the paymentStatusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatusAsOfDate() {
        return paymentStatusAsOfDate;
    }

    /**
     * Sets the value of the paymentStatusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatusAsOfDate(String value) {
        this.paymentStatusAsOfDate = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionAmount(String value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the verificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationNumber() {
        return verificationNumber;
    }

    /**
     * Sets the value of the verificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationNumber(String value) {
        this.verificationNumber = value;
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
     * Gets the value of the paymentAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountIntegrationId() {
        return paymentAccountIntegrationId;
    }

    /**
     * Sets the value of the paymentAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountIntegrationId(String value) {
        this.paymentAccountIntegrationId = value;
    }

    /**
     * Gets the value of the creditCardExpirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    /**
     * Sets the value of the creditCardExpirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationYear(String value) {
        this.creditCardExpirationYear = value;
    }

    /**
     * Gets the value of the checkMailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckMailingAddress() {
        return checkMailingAddress;
    }

    /**
     * Sets the value of the checkMailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckMailingAddress(String value) {
        this.checkMailingAddress = value;
    }

    /**
     * Gets the value of the bankRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    /**
     * Sets the value of the bankRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankRoutingNumber(String value) {
        this.bankRoutingNumber = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the paymentComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentComments() {
        return paymentComments;
    }

    /**
     * Sets the value of the paymentComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentComments(String value) {
        this.paymentComments = value;
    }

    /**
     * Gets the value of the tmcvDealerReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMCVDealerReceiptDate() {
        return tmcvDealerReceiptDate;
    }

    /**
     * Sets the value of the tmcvDealerReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMCVDealerReceiptDate(String value) {
        this.tmcvDealerReceiptDate = value;
    }

    /**
     * Gets the value of the approvalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalDate() {
        return approvalDate;
    }

    /**
     * Sets the value of the approvalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalDate(String value) {
        this.approvalDate = value;
    }

    /**
     * Gets the value of the tmPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPaymentDate() {
        return tmPaymentDate;
    }

    /**
     * Sets the value of the tmPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPaymentDate(String value) {
        this.tmPaymentDate = value;
    }

    /**
     * Gets the value of the tmDealerDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMDealerDisplayName() {
        return tmDealerDisplayName;
    }

    /**
     * Sets the value of the tmDealerDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMDealerDisplayName(String value) {
        this.tmDealerDisplayName = value;
    }

    /**
     * Gets the value of the tmcvPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMCVPaymentAmount() {
        return tmcvPaymentAmount;
    }

    /**
     * Sets the value of the tmcvPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMCVPaymentAmount(String value) {
        this.tmcvPaymentAmount = value;
    }

    /**
     * Gets the value of the tmCancellationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMCancellationReason() {
        return tmCancellationReason;
    }

    /**
     * Sets the value of the tmCancellationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMCancellationReason(String value) {
        this.tmCancellationReason = value;
    }

    /**
     * Gets the value of the tmPaymentRealization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPaymentRealization() {
        return tmPaymentRealization;
    }

    /**
     * Sets the value of the tmPaymentRealization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPaymentRealization(String value) {
        this.tmPaymentRealization = value;
    }

    /**
     * Gets the value of the tmPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPaymentType() {
        return tmPaymentType;
    }

    /**
     * Sets the value of the tmPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPaymentType(String value) {
        this.tmPaymentType = value;
    }

    /**
     * Gets the value of the tmcvChequeDDNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMCVChequeDDNo() {
        return tmcvChequeDDNo;
    }

    /**
     * Sets the value of the tmcvChequeDDNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMCVChequeDDNo(String value) {
        this.tmcvChequeDDNo = value;
    }

    /**
     * Gets the value of the tmcvBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMCVBranchName() {
        return tmcvBranchName;
    }

    /**
     * Sets the value of the tmcvBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMCVBranchName(String value) {
        this.tmcvBranchName = value;
    }

    /**
     * Gets the value of the tmcvBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMCVBankName() {
        return tmcvBankName;
    }

    /**
     * Sets the value of the tmcvBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMCVBankName(String value) {
        this.tmcvBankName = value;
    }

    /**
     * Gets the value of the tmDepositedOnBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMDepositedOnBank() {
        return tmDepositedOnBank;
    }

    /**
     * Sets the value of the tmDepositedOnBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMDepositedOnBank(String value) {
        this.tmDepositedOnBank = value;
    }

    /**
     * Gets the value of the tmcvDealerReceiptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMCVDealerReceiptNumber() {
        return tmcvDealerReceiptNumber;
    }

    /**
     * Sets the value of the tmcvDealerReceiptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMCVDealerReceiptNumber(String value) {
        this.tmcvDealerReceiptNumber = value;
    }

    /**
     * Gets the value of the tmPaymentBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPaymentBalanceAmount() {
        return tmPaymentBalanceAmount;
    }

    /**
     * Sets the value of the tmPaymentBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPaymentBalanceAmount(String value) {
        this.tmPaymentBalanceAmount = value;
    }

    /**
     * Gets the value of the desiredPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesiredPayDate() {
        return desiredPayDate;
    }

    /**
     * Sets the value of the desiredPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesiredPayDate(String value) {
        this.desiredPayDate = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the tmPaymentOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPaymentOrgId() {
        return tmPaymentOrgId;
    }

    /**
     * Sets the value of the tmPaymentOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPaymentOrgId(String value) {
        this.tmPaymentOrgId = value;
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
     * Gets the value of the portalBillDeskRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalBillDeskRefNo() {
        return portalBillDeskRefNo;
    }

    /**
     * Sets the value of the portalBillDeskRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalBillDeskRefNo(String value) {
        this.portalBillDeskRefNo = value;
    }

    /**
     * Gets the value of the portalTransactionRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalTransactionRefNo() {
        return portalTransactionRefNo;
    }

    /**
     * Sets the value of the portalTransactionRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalTransactionRefNo(String value) {
        this.portalTransactionRefNo = value;
    }

    /**
     * Gets the value of the tmPaymentSettledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPaymentSettledFlag() {
        return tmPaymentSettledFlag;
    }

    /**
     * Sets the value of the tmPaymentSettledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPaymentSettledFlag(String value) {
        this.tmPaymentSettledFlag = value;
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
