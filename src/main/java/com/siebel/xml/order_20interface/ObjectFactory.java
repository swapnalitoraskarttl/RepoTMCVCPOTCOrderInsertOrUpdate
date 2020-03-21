
package com.siebel.xml.order_20interface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.order_20interface package. 
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

    private final static QName _ListOfOrderInterface_QNAME = new QName("http://www.siebel.com/xml/Order%20Interface", "ListOfOrderInterface");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.order_20interface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfOrderInterface }
     * 
     */
    public ListOfOrderInterface createListOfOrderInterface() {
        return new ListOfOrderInterface();
    }

    /**
     * Create an instance of {@link ListOfOrderInterfaceTopElmt }
     * 
     */
    public ListOfOrderInterfaceTopElmt createListOfOrderInterfaceTopElmt() {
        return new ListOfOrderInterfaceTopElmt();
    }

    /**
     * Create an instance of {@link Orders }
     * 
     */
    public Orders createOrders() {
        return new Orders();
    }

    /**
     * Create an instance of {@link ListOfRelatedShipment }
     * 
     */
    public ListOfRelatedShipment createListOfRelatedShipment() {
        return new ListOfRelatedShipment();
    }

    /**
     * Create an instance of {@link RelatedShipment }
     * 
     */
    public RelatedShipment createRelatedShipment() {
        return new RelatedShipment();
    }

    /**
     * Create an instance of {@link ListOfLineItems }
     * 
     */
    public ListOfLineItems createListOfLineItems() {
        return new ListOfLineItems();
    }

    /**
     * Create an instance of {@link LineItems }
     * 
     */
    public LineItems createLineItems() {
        return new LineItems();
    }

    /**
     * Create an instance of {@link ListOfRelatedOrganization }
     * 
     */
    public ListOfRelatedOrganization createListOfRelatedOrganization() {
        return new ListOfRelatedOrganization();
    }

    /**
     * Create an instance of {@link RelatedOrganization }
     * 
     */
    public RelatedOrganization createRelatedOrganization() {
        return new RelatedOrganization();
    }

    /**
     * Create an instance of {@link ListOfRelatedSalesRep }
     * 
     */
    public ListOfRelatedSalesRep createListOfRelatedSalesRep() {
        return new ListOfRelatedSalesRep();
    }

    /**
     * Create an instance of {@link RelatedSalesRep }
     * 
     */
    public RelatedSalesRep createRelatedSalesRep() {
        return new RelatedSalesRep();
    }

    /**
     * Create an instance of {@link ListOfPayments }
     * 
     */
    public ListOfPayments createListOfPayments() {
        return new ListOfPayments();
    }

    /**
     * Create an instance of {@link Payments }
     * 
     */
    public Payments createPayments() {
        return new Payments();
    }

    /**
     * Create an instance of {@link ListOfTMAction }
     * 
     */
    public ListOfTMAction createListOfTMAction() {
        return new ListOfTMAction();
    }

    /**
     * Create an instance of {@link TMAction }
     * 
     */
    public TMAction createTMAction() {
        return new TMAction();
    }

    /**
     * Create an instance of {@link ListOfRelatedOrderType }
     * 
     */
    public ListOfRelatedOrderType createListOfRelatedOrderType() {
        return new ListOfRelatedOrderType();
    }

    /**
     * Create an instance of {@link RelatedOrderType }
     * 
     */
    public RelatedOrderType createRelatedOrderType() {
        return new RelatedOrderType();
    }

    /**
     * Create an instance of {@link ListOfPromisedScheduleLines }
     * 
     */
    public ListOfPromisedScheduleLines createListOfPromisedScheduleLines() {
        return new ListOfPromisedScheduleLines();
    }

    /**
     * Create an instance of {@link PromisedScheduleLines }
     * 
     */
    public PromisedScheduleLines createPromisedScheduleLines() {
        return new PromisedScheduleLines();
    }

    /**
     * Create an instance of {@link ListOfRequestedScheduleLines }
     * 
     */
    public ListOfRequestedScheduleLines createListOfRequestedScheduleLines() {
        return new ListOfRequestedScheduleLines();
    }

    /**
     * Create an instance of {@link RequestedScheduleLines }
     * 
     */
    public RequestedScheduleLines createRequestedScheduleLines() {
        return new RequestedScheduleLines();
    }

    /**
     * Create an instance of {@link ListOfAttributes }
     * 
     */
    public ListOfAttributes createListOfAttributes() {
        return new ListOfAttributes();
    }

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOrderInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/Order%20Interface", name = "ListOfOrderInterface")
    public JAXBElement<ListOfOrderInterface> createListOfOrderInterface(ListOfOrderInterface value) {
        return new JAXBElement<ListOfOrderInterface>(_ListOfOrderInterface_QNAME, ListOfOrderInterface.class, null, value);
    }

}
