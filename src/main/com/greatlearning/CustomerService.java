package main.com.greatlearning;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	public List<Customer> findAll();

	public Customer findById(int theId);

	public void save(Customer customer);

	public void deleteById(int theId);
}
