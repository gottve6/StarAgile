package com.demo.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.demo.model.Invoice;

public interface InvoiceRepository extends CassandraRepository<Invoice, Integer>{
	
	List<Invoice> findByShopname(String name);
	
	@AllowFiltering//remove annotation to verify that it will not execute for UnIndexed column.
	List<Invoice> findByCity(String cityName);
	
	@AllowFiltering
	List<Invoice> findByCityAndShopname(String city, String shopname );
	
}
