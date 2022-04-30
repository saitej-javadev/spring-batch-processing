package com.saitej.springbatchprocessing.config;

import com.saitej.springbatchprocessing.model.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    @Override


    public Customer process(Customer customer) throws Exception {

        if(customer.getFirstName().startsWith("S")) {
            return customer;
        }else{
            return null;
        }
      //  return customer;
    }
}
