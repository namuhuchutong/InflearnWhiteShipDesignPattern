package me.whiteship.designpatterns.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
