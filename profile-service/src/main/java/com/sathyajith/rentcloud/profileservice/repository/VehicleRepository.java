package com.sathyajith.rentcloud.profileservice.repository;

import com.sathyajith.rentcloud.commons.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
