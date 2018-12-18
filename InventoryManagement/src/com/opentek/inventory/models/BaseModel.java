/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opentek.inventory.models;

import java.util.Date;

/**
 *
 * @author gauravpunjabi
 */
public class BaseModel {
    private Date createdAt;
    private Integer createdBy;
    private boolean deleted;
    private Date updatedAt;
    
    public BaseModel(Integer createdBy) {
        this.createdAt = new Date();
        this.createdBy = createdBy;
        this.deleted = false;
        this.updatedAt = this.createdAt;
    }
}
