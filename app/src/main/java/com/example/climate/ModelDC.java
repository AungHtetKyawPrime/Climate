package com.example.climate;

public class ModelDC {
    public String name;
    public String Phone;

    public ModelDC(String name, String phone) {
        this.name = name;
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
