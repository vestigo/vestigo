package org.nightlabs.jjqb.core.licence.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="LicenseInfo")
public class LicenseInfo
{
	private Boolean valid;
	private String customerEmail;
	private String customerName;
	private String productName;
	private String key;
	private int totalUsages;
	private int usagesLeft;
	private String purchaseDate; // TODO try to get this correctly parsed into a java.util.Date - seems to be in the format MM/dd/YYYY (just had "2/3/2012" in February).
	private String orderReferenceNumber;
	private Boolean canBeActivated;

	@XmlAttribute(name="Valid")
	@XmlJavaTypeAdapter(type=Boolean.class, value=BooleanTypeAdapter.class) // not necessary now, but better - just in case they change it later (now this ATTRIBUTE is "true", which a boolean ELEMENT is "True").
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	@XmlElement(name="CustomerEmail")
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@XmlElement(name="CustomerName")
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@XmlElement(name="ProductName")
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@XmlElement(name="Key")
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	@XmlElement(name="TotalUsages")
	public int getTotalUsages() {
		return totalUsages;
	}
	public void setTotalUsages(int totalUsages) {
		this.totalUsages = totalUsages;
	}

	@XmlElement(name="UsagesLeft")
	public int getUsagesLeft() {
		return usagesLeft;
	}
	public void setUsagesLeft(int usagesLeft) {
		this.usagesLeft = usagesLeft;
	}

	@XmlElement(name="PurchaseDate")
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@XmlElement(name="OrderReferenceNumber")
	public String getOrderReferenceNumber() {
		return orderReferenceNumber;
	}
	public void setOrderReferenceNumber(String orderReferenceNumber) {
		this.orderReferenceNumber = orderReferenceNumber;
	}

	@XmlElement(name="CanBeActivated")
	@XmlJavaTypeAdapter(type=Boolean.class, value=BooleanTypeAdapter.class)
	public Boolean getCanBeActivated() {
		return canBeActivated;
	}
	public void setCanBeActivated(Boolean canBeActivated) {
		this.canBeActivated = canBeActivated;
	}
}
