/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sessionbeans;

import com.entities.Specialization;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Nhut Anh
 */
@Local
public interface SpecializationFacadeLocal {

    void create(Specialization specialization);

    void edit(Specialization specialization);

    void remove(Specialization specialization);

    Specialization find(Object id);

    List<Specialization> findAll();

    List<Specialization> findRange(int[] range);

    int count();
    
}
