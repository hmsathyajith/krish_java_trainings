package com.sathyajith.rentcloud.authorizationserver.service;

import com.sathyajith.rentcloud.authorizationserver.model.AuthUserDetails;
import com.sathyajith.rentcloud.authorizationserver.model.User;
import com.sathyajith.rentcloud.authorizationserver.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service("userDetailsService")
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<User> optionalUser = userDetailsRepository.findByUsername(name);

        optionalUser.orElseThrow(() -> new UsernameNotFoundException("Username or password worng"));

        UserDetails userDetails = new AuthUserDetails(optionalUser.get());

        new AccountStatusUserDetailsChecker().check(userDetails);
        return userDetails;

    }
}
