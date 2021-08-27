package com.whiterun.login;

import java.util.HashMap;

public class IDandPassword {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPassword(){

        logininfo.put("Dude", "322");
        logininfo.put("Mary Jane", "Who");
        logininfo.put("Spiderman", "Why");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
