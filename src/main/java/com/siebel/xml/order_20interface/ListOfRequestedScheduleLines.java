
package com.siebel.xml.order_20interface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfRequestedScheduleLines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfRequestedScheduleLines"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestedScheduleLines" type="{http://www.siebel.com/xml/Order%20Interface}RequestedScheduleLines" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfRequestedScheduleLines", propOrder = {
    "requestedScheduleLines"
})
public class ListOfRequestedScheduleLines {

    @XmlElement(name = "RequestedScheduleLines")
    protected List<RequestedScheduleLines> requestedScheduleLines;

    /**
     * Gets the value of the requestedScheduleLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedScheduleLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedScheduleLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedScheduleLines }
     * 
     * 
     */
    public List<RequestedScheduleLines> getRequestedScheduleLines() {
        if (requestedScheduleLines == null) {
            requestedScheduleLines = new ArrayList<RequestedScheduleLines>();
        }
        return this.requestedScheduleLines;
    }

}
