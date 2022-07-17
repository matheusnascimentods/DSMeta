package com.devsuperior.dsmeta.Service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.Model.Sales;
import com.devsuperior.dsmeta.Repository.SalesRepository;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Service
public class SmsService {
	
	@Autowired
	private SalesRepository repository;

	@Value("${twilio.sid}")
	private String twilioSid;

	@Value("${twilio.key}")
	private String twilioKey;

	@Value("${twilio.phone.from}")
	private String twilioPhoneFrom;

	@Value("${twilio.phone.to}")
	private String twilioPhoneTo;

	public void SendSMS(Long ID) {

		Twilio.init(twilioSid, twilioKey);

		PhoneNumber to = new PhoneNumber(twilioPhoneTo);
		PhoneNumber from = new PhoneNumber(twilioPhoneFrom);
		
		Sales sale = repository.findById(ID).get(); 
	
		String messageContent = "Na data " + sale.getDate() + 
								", com " + sale.getVisited() + 
								" visitas e " + sale.getDeals() + 
								" vendas, o vendedor " + sale.getSellerName() + 
								" obteve um total de R$" + sale.getAmount(); 
		
		Message message = Message.creator(to, from, messageContent).create();

		System.out.println(message.getSid());
	}
}
