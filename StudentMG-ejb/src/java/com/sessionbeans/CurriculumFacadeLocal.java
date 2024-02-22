/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sessionbeans;

import com.entities.Curriculum;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lnanh2k4
 */
@Local
public interface CurriculumFacadeLocal {

    void create(Curriculum curriculum);

    void edit(Curriculum curriculum);

    void remove(Curriculum curriculum);

    Curriculum find(Object id);

    List<Curriculum> findAll();

    List<Curriculum> findRange(int[] range);

    int count();
    
}
