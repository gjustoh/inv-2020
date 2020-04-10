package com.grhabs.app;

import com.grhabs.backend.data.Usuario;
import com.grhabs.backend.services.UsuarioService;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@Primary
public class UserDetailServiceImpl implements UserDetailsService {
    private final UsuarioService us;

    public UserDetailServiceImpl(UsuarioService us) {
        this.us = us;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Usuario user = us.getuser(username);
        if(user==null){
            throw new UsernameNotFoundException("usuario no presente con el email : "+username);
        }
        else {
            return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(), Collections.singleton(new SimpleGrantedAuthority(String.valueOf(user.getRolId()))));
        }
    }
}
