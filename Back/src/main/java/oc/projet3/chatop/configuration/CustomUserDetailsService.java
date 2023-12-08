package oc.projet3.chatop.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import oc.projet3.chatop.model.DBUser;
import oc.projet3.chatop.repository.DBUserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private DBUserRepository dbUserRepository;
	
	@Override
	public UserDetails loadUserByUsername (String email) throws UsernameNotFoundException {
		DBUser user = dbUserRepository.findByEmail(email);
		if(user != null){
			return new User(user.getEmail(), user.getPassword(), getGrantedAuthorities(user.getRole()));
		}
		return null;
	}
	
	private List<GrantedAuthority> getGrantedAuthorities(String role) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
		return authorities;
	}
}
