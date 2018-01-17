package com.sy.pojo;

public class Sample {
    private String email;
    private String password;
    private boolean remember;

    public String getEmail() {
        return email;
    }

    public Sample setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Sample setPassword(String password) {
        this.password = password;
        return this;
    }

    public boolean isRemember() {
        return remember;
    }

    public Sample setRemember(boolean remember) {
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
