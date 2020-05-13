package service;

import java.io.Serializable;

public class UserRequest implements Serializable {

    private String req;

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "req='" + req + '\'' +
                '}';
    }
}
