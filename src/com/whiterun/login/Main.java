package com.whiterun.login;

public class Main {

    public static void main(String[] args) {

        IDandPassword idandPassword = new IDandPassword();
        idandPassword.getLoginInfo();

        LoginPage loginPage = new LoginPage(idandPassword.getLoginInfo());

    }
}
