/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sessionbeans;

import com.entities.CurriculumDetail;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lnanh2k4
 */
@Local
public interface CurriculumDetailFacadeLocal {

    void create(CurriculumDetail curriculumDetail);

    void edit(CurriculumDetail curriculumDetail);

    void remove(CurriculumDetail curriculumDetail);

    CurriculumDetail find(Object id);

    List<CurriculumDetail> findAll();

    List<CurriculumDetail> findRange(int[] range);

    int count();
    
}
