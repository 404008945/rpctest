package service;

import java.io.Serializable;

public class UserResponse implements Serializable {


    private String res;


    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "res='" + res + '\'' +
                '}';
    }
}
