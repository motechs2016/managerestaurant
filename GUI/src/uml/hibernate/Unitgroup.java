package uml.hibernate;

// Generated 2012-6-16 9:24:29 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Unitgroup generated by hbm2java
 */
public class Unitgroup implements java.io.Serializable {

	private Integer unitid;
	private String unit;
	private Set products = new HashSet(0);

	public Unitgroup() {
	}

	public Unitgroup(String unit) {
		this.unit = unit;
	}

	public Unitgroup(String unit, Set products) {
		this.unit = unit;
		this.products = products;
	}

	public Integer getUnitid() {
		return this.unitid;
	}

	public void setUnitid(Integer unitid) {
		this.unitid = unitid;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}