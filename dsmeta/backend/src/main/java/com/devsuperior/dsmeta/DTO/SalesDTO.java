package com.devsuperior.dsmeta.DTO;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.devsuperior.dsmeta.Model.Sales;

public class SalesDTO {

	@NotEmpty @NotNull
	private String sellerName;
	
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	public Sales toEntity() {

		Sales sale = new Sales(sellerName, visited, deals, amount, date);
		
		return sale;
		
	}
	
	public String getSellerName() {
		
		return sellerName;
	
	}
	
	public void setSellerName(String sellerName) {
	
		this.sellerName = sellerName;
	
	}
	
	public Integer getVisited() {
	
		return visited;
	
	}
	
	public void setVisited(Integer visited) {
	
		this.visited = visited;
	
	}
	
	public Integer getDeals() {
	
		return deals;
	
	}
	
	public void setDeals(Integer deals) {
	
		this.deals = deals;
	
	}
	
	public Double getAmount() {
	
		return amount;
	
	}
	
	public void setAmount(Double amount) {
	
		this.amount = amount;
	
	}
	
	public LocalDate getDate() {
	
		return date;
	
	}
	
	public void setDate(LocalDate date) {
	
		this.date = date;
	
	}
	
}
