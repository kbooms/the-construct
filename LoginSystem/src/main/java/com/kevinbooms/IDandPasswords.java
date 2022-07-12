package com.kevinbooms;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPasswords() {
        loginInfo.put("Kev", "bacon");
        loginInfo.put("Link", "hiyaaaaa");
        loginInfo.put("Oboy", "fsjal");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}
