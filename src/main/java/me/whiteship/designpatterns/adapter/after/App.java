package me.whiteship.designpatterns.adapter.after;

import me.whiteship.designpatterns.adapter.after.security.LoginHandler;
import me.whiteship.designpatterns.adapter.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("hello", "hello");
        System.out.println("login = " + login);
    }
}
