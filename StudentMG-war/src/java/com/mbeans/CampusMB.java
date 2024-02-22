package com.mbeans;

import com.entities.Campus;
import com.sessionbeans.CampusFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Le Nhut Anh
 */
@Named(value = "campusMB")
@RequestScoped
public class CampusMB {

    @EJB
    private CampusFacadeLocal campusFacade;
    Campus campus;

    /**
     * Creates a new instance of CampusMB
     */
    public CampusMB() {
    }

    public List<Campus> showAllCampus() {
        return campusFacade.findAll();
    }
}
