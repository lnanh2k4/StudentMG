/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mbeans;

import com.entities.Major;
import com.sessionbeans.MajorFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


/**
 *
 * @author Le Nhut Anh
 */
@Named(value = "majorMB")
@RequestScoped
public class MajorMB {

    @EJB
    private MajorFacadeLocal majorFacade;
    Major major;

    /**
     * Creates a new instance of MajorMB
     */
    public MajorMB() {
    }

    public List<Major> showAllMajor() {
        return majorFacade.findAll();
    }
}
