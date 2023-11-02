package com.cabapp.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabapp.pro.entity.TripBooking;



@Repository
public interface ITripBookingRepository extends JpaRepository<TripBooking, Integer> {

}
