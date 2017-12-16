package com.cert.chortke.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FACT_STYPE")
public class FactorStuffTypeEntity {

	private Long id;
	private String value;
	private FactorEntity factor;
	private StuffTypeEntity stuffType;

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@ManyToOne
	@JoinColumn(name="factor_id")
	public FactorEntity getFactor() {
		return factor;
	}

	public void setFactor(FactorEntity factor) {
		this.factor = factor;
	}

	@ManyToOne
	@JoinColumn(name="stuffType_id")
	public StuffTypeEntity getStuffType() {
		return stuffType;
	}

	public void setStuffType(StuffTypeEntity stuffType) {
		this.stuffType = stuffType;
	}

}
