package com.krishantha.training.salesmanager;

import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.krishantha")
@PropertySource("application.properties")
public class ApplicationConfiguration {

    @Bean(name = "employeeService")
    @Scope("prototype")
    public EmployeeService getEmployeeService(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        return employeeService;
    }

    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceHolderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

   /* @Bean(name = "employeeRepository")
    public EmployeeRepository getEmployeeRepository(){
        return new HibernateEmployeeRepositoryImpl();
    }*/
}
