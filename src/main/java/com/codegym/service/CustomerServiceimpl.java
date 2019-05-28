package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceimpl implements CustomerService {
    private static Map<Integer , Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"john","john@codegym.vn","ha noi"));
        customers.put(2,new Customer(2,"Bill","bill@codegym.vn","da nang"));
        customers.put(3,new Customer(3,"Alex","Alex@codegym.vn","sai gon"));
        customers.put(4,new Customer(4,"Tom","tom@codegym.vn","new york"));
        customers.put(5,new Customer(5,"sophia","sophia@codegym.vn","earth"));
        customers.put(6,new Customer(6,"alan","alan@codegym.vn","london"));
    }
    @Override
    public List<Customer>findAll(){
        return new ArrayList<>(customers.values());
    }
    @Override
    public void save(Customer customer){
        customers.put(customer.getId(),customer);
    }
    @Override
    public Customer findById(int id){
        return customers.get(id);
    }
    @Override
    public void update(int id, Customer customer){
        customers.put(id,customer);
    }
    @Override
    public void remove(int id){
        customers.remove(id);
    }

}
