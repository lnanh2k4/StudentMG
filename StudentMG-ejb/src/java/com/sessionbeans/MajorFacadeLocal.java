/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sessionbeans;

import com.entities.Major;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Nhut Anh
 */
@Local
public interface MajorFacadeLocal {

    void create(Major major);

    void edit(Major major);

    void remove(Major major);

    Major find(Object id);

    List<Major> findAll();

    List<Major> findRange(int[] range);

    int count();
    
}
