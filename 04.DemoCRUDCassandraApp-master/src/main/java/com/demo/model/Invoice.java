package com.demo.model;

import java.util.Map;
import java.util.Set;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("invoice")
public class Invoice {

    @PrimaryKey
    private Integer id;
    
    @Column
    private String shopname;
    
    @Column
    private Set<String> items;
    
    @Column
    private Map<String,String> itemamount;
    
    @Column
    private String city;
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Set<String> getItems() {
		return items;
	}
	public void setItems(Set<String> items) {
		this.items = items;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public Map<String, String> getItemamount() {
		return itemamount;
	}
	public void setItemamount(Map<String, String> itemamount) {
		this.itemamount = itemamount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}