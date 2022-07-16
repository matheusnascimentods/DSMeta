package com.devsuperior.dsmeta.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.Model.Sales;
import com.devsuperior.dsmeta.Service.SalesService;


@RestController 
public class SalesController {
	
	@Autowired
	private SalesService service;
	
	@GetMapping
	public List<Sales> GetSales() {
		
		return service.GetSales();
		
	}
	
}
