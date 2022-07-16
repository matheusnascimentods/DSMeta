package com.devsuperior.dsmeta.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.Model.Sales;
import com.devsuperior.dsmeta.Repository.SalesRepository;

@Service
public class SalesService {
	
	@Autowired
	private SalesRepository repository;
	
	public List<Sales> GetSales() {
		
		return repository.findAll();
		
	}

}
