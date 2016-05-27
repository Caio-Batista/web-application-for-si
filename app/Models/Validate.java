package controllers.Models;

import DBManager.*;
import Models.dao.GenericDAO;
import Models.dao.GenericDAOImpl;

import java.util.*;

import controllers.Models.*;

public class Validate{

    public Validate(){}

    public static boolean validateLogin(String email, String senha, DBManager dataBaseManager){
        User user = dataBaseManager.searchUserByEmail(email);
        if (user == null) {
            return false;
        }
        if (!user.getPassword().equals(senha)) {
            return false;
        }
        return true;
    }

    public static boolean validateLogin(String email, String senha, GenericDAO dao){
        List<Object> userList =  dao.findAllByClassName("User");
        User user = null;
        for (Object u : userList) {
            User temp = (User) u;
                if(temp.getEmail().equals(email)){
                    user = temp;
                    break;
                }
        }
        if (user == null) {
            return false;
        }
        if (!user.getPassword().equals(senha)) {
            return false;
        }
        return true;
    }
}