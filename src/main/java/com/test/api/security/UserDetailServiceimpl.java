package com.test.api.security;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.test.api.model.User;
import com.test.api.repository.UserRepository;

@Service
public class UserDetailServiceimpl implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email)throws UsernameNotFoundException{
		User user = userRepository
		.findOneByEmail(email)
		//si nose encuentra un usuario apartir de este email
		.orElseThrow(() -> new UsernameNotFoundException("el usuario con email" + email + "no existe."));
		
		return new UserDetailsImpl(user);
	}
	
}
