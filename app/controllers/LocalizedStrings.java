package controllers;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by carlos on 16/05/16.
 */
public class LocalizedStrings {

    private static Map<String, String> tableEN = new HashMap<>();
    static {
        tableEN.put("login_login", "Login");
        tableEN.put("login_email", "Email");
        tableEN.put("login_password", "Password");
        tableEN.put("login_account", "Don't you have an account?");
        tableEN.put("login_signup", "Signup now!");
    }

    public static Map<String, String> getTable(String language) {
        switch (language) {
            case "EN":
                return tableEN;
            default:
                return null;
        }
    }

}
