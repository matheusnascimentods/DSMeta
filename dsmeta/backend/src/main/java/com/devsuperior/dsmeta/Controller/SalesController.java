package com.devsuperior.dsmeta.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.Model.Sales;
import com.devsuperior.dsmeta.Service.SalesService;
import com.devsuperior.dsmeta.Service.SmsService;


@RestController @RequestMapping("Sales")
public class SalesController {
	
	@Autowired
	private SalesService service;
	
	@Autowired
	private SmsService smsService;
	
	@GetMapping
	public Page<Sales> GetSales(@RequestParam(value = "minDate", defaultValue = "") String minDate, @RequestParam(value = "maxDate", defaultValue = "")String maxDate, Pageable pageable) {
						
		return service.GetSales(minDate, maxDate, pageable);
		
	}
	
	@GetMapping("/{id}/Notification")
	public String SendSMS(@PathVariable Long id) {

		smsService.SendSMS(id);
		
		return "SMS enviado com êxito.";
		
	}
	
}
