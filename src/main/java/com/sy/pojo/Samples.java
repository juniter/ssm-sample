package com.sy.pojo;

public class Samples {
    private String email;
    private String password;
    private boolean remember;

    public String getEmail() {
        return email;
    }

    public Samples setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Samples setPassword(String password) {
        this.password = password;
        return this;
    }

    public boolean isRemember() {
        return remember;
    }

    public Samples setRemember(boolean remember) {
        this.remember = remember;
        return this;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", remember=" + remember +
                '}';
    }
}
