package com.moulika.demoJpa;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.moulika.HMS.models.Customer;
import com.moulika.HMS.repositories.CustomerRepository;


@DataJpaTest
public class CustomerRepositoryTest extends SpringBootApplicationTests{

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testSaveCustomer() {
		Customer customer = getCustomers();
		Customer cusSavedInDB = entityManager.persist(customer);
		Customer getDataFromDb = customerRepository.findOne(cusSavedInDB.getId());
		 assertThat(getDataFromDb, is(cusSavedInDB));
	}
	
	private Customer getCustomers() {
		Customer customer = new Customer();
		customer.setfName("Moulika");
		customer.setlName("Prasad");
		customer.setAddress1("1035 Boyce Rd");
		customer.setAddress2("apt 4820");
		customer.setPhone("56789010");
		customer.setCountry("USA");
		customer.setDob(new Date());
		return customer;
	}

}
