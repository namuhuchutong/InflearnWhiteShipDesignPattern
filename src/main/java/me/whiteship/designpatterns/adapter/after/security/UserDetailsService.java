package me.whiteship.designpatterns.adapter.after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
