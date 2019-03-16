/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opentek.inventory.models;

import java.util.Objects;

/**
 *
 * @author gauravpunjabi
 */
public class Category extends BaseModel {
    private String name, hsnCode;
    
    public Category(String name,
                    String hsnCode,
                    int createdBy) {
        super(createdBy);
        this.name = name;
        this.hsnCode = hsnCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHsnCode() {
        return hsnCode;
    }

    public void setHsnCode(String hsnCode) {
        this.hsnCode = hsnCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.hsnCode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Category other = (Category) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.hsnCode, other.hsnCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Category{" + "name=" + name + ", hsnCode=" + hsnCode + '}';
    }
    
    
}
