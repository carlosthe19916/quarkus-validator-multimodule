package org.acme.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AdressModel {

    @NotNull
    @NotBlank
    private String street;

    @NotNull
    private Integer number;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
