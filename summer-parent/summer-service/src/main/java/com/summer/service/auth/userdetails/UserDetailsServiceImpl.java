package com.summer.service.auth.userdetails;

import com.summer.service.org.user.UserPassQueryDto;
import com.summer.service.org.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserService userService;

    @Autowired
    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserPassQueryDto user = userService.findUserPassByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("Username '" + username + "' " + "not found");
        return new UserDetailsImpl(user);
    }
}
