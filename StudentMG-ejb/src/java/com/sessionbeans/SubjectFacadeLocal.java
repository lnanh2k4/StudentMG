/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sessionbeans;

import com.entities.Subject;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Nhut Anh
 */
@Local
public interface SubjectFacadeLocal {

    void create(Subject subject);

    void edit(Subject subject);

    void remove(Subject subject);

    Subject find(Object id);

    List<Subject> findAll();

    List<Subject> findRange(int[] range);

    int count();
    
}
