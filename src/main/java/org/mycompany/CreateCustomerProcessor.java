package org.mycompany;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.example.createcustomer_wsdl.CreateCustomerRequest;
import org.example.createcustomer_wsdl.CreateCustomerResponse;


public class CreateCustomerProcessor implements Processor{
	
	public void process(Exchange ex)throws Exception{
		
		CreateCustomerRequest req = ex.getIn().getBody(CreateCustomerRequest.class);
		
		
		System.out.println("First Name is :"+req.getFirstName());
		
		CreateCustomerResponse resp = new CreateCustomerResponse();
		
		resp.setStatus("Success");
		
		ex.getIn().setBody(resp);
	}

}
