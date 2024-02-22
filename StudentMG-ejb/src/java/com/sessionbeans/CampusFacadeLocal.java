/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sessionbeans;

import com.entities.Campus;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Nhut Anh
 */
@Local
public interface CampusFacadeLocal {

    void create(Campus campus);

    void edit(Campus campus);

    void remove(Campus campus);

    Campus find(Object id);

    List<Campus> findAll();

    List<Campus> findRange(int[] range);

    int count();
    
}
