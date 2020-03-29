package org.acme.models;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PersonModel {

    @NotNull
    @NotBlank
    private String name;

    @Valid
    private AdressModel address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdressModel getAddress() {
        return address;
    }

    public void setAddress(AdressModel address) {
        this.address = address;
    }
}
