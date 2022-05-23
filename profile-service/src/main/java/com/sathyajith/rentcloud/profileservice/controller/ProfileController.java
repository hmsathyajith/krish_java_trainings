package com.sathyajith.rentcloud.profileservice.controller;

import com.sathyajith.rentcloud.commons.model.Vehicle;
import com.sathyajith.rentcloud.commons.model.Customer;
import com.sathyajith.rentcloud.profileservice.service.CustomerService;
import com.sathyajith.rentcloud.profileservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;
    @Autowired
    VehicleService vehicleService;

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public Customer fetch(@RequestParam int profileId){
        return customerService.fetchById(profileId);
    }

    @RequestMapping(value = "/profiles", method = RequestMethod.GET)
    @PreAuthorize("hasAnyAuthority('read_profile')")
    public List<Customer> fetch(){
        return customerService.fetchAllProfiles();
    }

    @RequestMapping(value = "/vehicle", method = RequestMethod.POST)
    public Vehicle save(@RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);


    }

}
