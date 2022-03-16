package me.whiteship.designpatterns.adapter.after;

import me.whiteship.designpatterns.adapter.after.security.UserDetails;
import me.whiteship.designpatterns.adapter.after.security.UserDetailsService;

public class AccountUserDetailService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }
}
