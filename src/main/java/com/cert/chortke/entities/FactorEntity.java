package com.cert.chortke.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class FactorEntity {

	private Long id;
	private String title;
	private Long price;
//	private Set<StuffTypeEntity> StuffTypes;
	private Date purchaseDate;
	private UserEntity buyer;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
//
//	@ManyToMany
//	@JoinTable(name = "factor_stufftype", joinColumns = { @JoinColumn(name = "factor_id") }, inverseJoinColumns = { @JoinColumn(name = "stufftype_id") })
//	public Set<StuffTypeEntity> getStuffTypes() {
//		return StuffTypes;
//	}
//
//	public void setStuffTypes(Set<StuffTypeEntity> stuffTypes) {
//		StuffTypes = stuffTypes;
//	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@ManyToOne
	@JoinColumn(name = "buyer_id")
	public UserEntity getBuyer() {
		return buyer;
	}

	public void setBuyer(UserEntity buyer) {
		this.buyer = buyer;
	}

}
