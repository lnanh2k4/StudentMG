/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sessionbeans;

import com.entities.Curriculum;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Le Nhut Anh
 */
@Stateless
public class CurriculumFacade extends AbstractFacade<Curriculum> implements CurriculumFacadeLocal {

    @PersistenceContext(unitName = "StudentMG-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CurriculumFacade() {
        super(Curriculum.class);
    }
    
}
