package com.cert.chortke.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Factor {

	private Long id;
	private String title;
	private Long price;
	private List<StuffType> StuffTypes;
	private Date purchaseDate;
	private User buyer;
	private Map<String, Long> purchaseComponent;

	public Map<String, Long> getPurchaseComponent() {
		return purchaseComponent;
	}

	public void setPurchaseComponent(Map<String, Long> purchaseComponent) {
		this.purchaseComponent = purchaseComponent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public List<StuffType> getStuffTypes() {
		return StuffTypes;
	}

	public void setStuffTypes(List<StuffType> stuffTypes) {
		StuffTypes = stuffTypes;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

}
