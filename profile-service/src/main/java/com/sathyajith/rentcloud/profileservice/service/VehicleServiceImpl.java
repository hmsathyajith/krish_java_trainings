package com.sathyajith.rentcloud.profileservice.service;

import com.sathyajith.rentcloud.commons.model.Vehicle;
import com.sathyajith.rentcloud.profileservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
