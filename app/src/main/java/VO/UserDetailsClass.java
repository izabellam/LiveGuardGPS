package VO;

import java.util.ArrayList;

import VO.PetsClass;

/**
 * Created by Keren on 12/01/2018.
 */

public class UserDetailsClass {

    private static String userEmail;
    private static String userPswd;
    private static ArrayList<PetsClass> petsClasses;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPswd() {
        return userPswd;
    }

    public void setUserPswd(String userPswd) {
        this.userPswd = userPswd;
    }

    public ArrayList<PetsClass> getPetsClasses() {
        return petsClasses;
    }

    public void setPetsClasses(ArrayList<PetsClass> petsClasses) {
        this.petsClasses = petsClasses;
    }
}
