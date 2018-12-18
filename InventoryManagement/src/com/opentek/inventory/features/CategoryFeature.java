/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opentek.inventory.features;

import com.opentek.inventory.models.Category;

/**
 *
 * @author gauravpunjabi
 */
public interface CategoryFeature {
    void add(Category category);
    void update(Category category);
    void deleted(Category category);
}
