package com.cg.thuchanhquanlykhachhangjpa.repository;

import com.cg.thuchanhquanlykhachhangjpa.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
