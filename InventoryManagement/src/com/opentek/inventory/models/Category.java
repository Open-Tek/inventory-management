/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opentek.inventory.models;

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
}
