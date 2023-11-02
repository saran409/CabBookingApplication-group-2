package com.cabapp.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabapp.pro.entity.Driver;



@Repository
public interface IDriverRepository extends JpaRepository<Driver, Integer> {

}
