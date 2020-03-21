
package com.siebel.xml.order_20interface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPromisedScheduleLines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPromisedScheduleLines"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromisedScheduleLines" type="{http://www.siebel.com/xml/Order%20Interface}PromisedScheduleLines" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPromisedScheduleLines", propOrder = {
    "promisedScheduleLines"
})
public class ListOfPromisedScheduleLines {

    @XmlElement(name = "PromisedScheduleLines")
    protected List<PromisedScheduleLines> promisedScheduleLines;

    /**
     * Gets the value of the promisedScheduleLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promisedScheduleLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromisedScheduleLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromisedScheduleLines }
     * 
     * 
     */
    public List<PromisedScheduleLines> getPromisedScheduleLines() {
        if (promisedScheduleLines == null) {
            promisedScheduleLines = new ArrayList<PromisedScheduleLines>();
        }
        return this.promisedScheduleLines;
    }

}
