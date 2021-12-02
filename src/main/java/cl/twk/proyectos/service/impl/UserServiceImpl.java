package cl.twk.proyectos.service.impl;

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

import cl.twk.proyectos.model.Authority;
import cl.twk.proyectos.repository.IUserRepo;
import cl.twk.proyectos.services.IUserService;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService {
	
	@Autowired
	private IUserRepo iUserRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		cl.twk.proyectos.model.User usuario = iUserRepo.findByUsername(username);
		
		List<GrantedAuthority> grantList = new ArrayList<>();
		
		for (Authority authority : usuario.getAuthority()) {
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
			grantList.add(grantedAuthority);
		}
		
		UserDetails user = new User(usuario.getUsername(), usuario.getPassword(), grantList);
		
		return user;
	}
}
