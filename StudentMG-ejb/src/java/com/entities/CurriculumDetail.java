/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Le Nhut Anh
 */
@Entity
@Table(name = "CurriculumDetail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CurriculumDetail.findAll", query = "SELECT c FROM CurriculumDetail c"),
    @NamedQuery(name = "CurriculumDetail.findByCdid", query = "SELECT c FROM CurriculumDetail c WHERE c.cdid = :cdid"),
    @NamedQuery(name = "CurriculumDetail.findByCDSemester", query = "SELECT c FROM CurriculumDetail c WHERE c.cDSemester = :cDSemester")})
public class CurriculumDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CDID")
    private Integer cdid;
    @Column(name = "CDSemester")
    private Integer cDSemester;
    @JoinColumn(name = "CuID", referencedColumnName = "CuID")
    @ManyToOne
    private Curriculum cuID;
    @JoinColumn(name = "SuID", referencedColumnName = "SuID")
    @ManyToOne
    private Subject suID;

    public CurriculumDetail() {
    }

    public CurriculumDetail(Integer cdid) {
        this.cdid = cdid;
    }

    public Integer getCdid() {
        return cdid;
    }

    public void setCdid(Integer cdid) {
        this.cdid = cdid;
    }

    public Integer getCDSemester() {
        return cDSemester;
    }

    public void setCDSemester(Integer cDSemester) {
        this.cDSemester = cDSemester;
    }

    public Curriculum getCuID() {
        return cuID;
    }

    public void setCuID(Curriculum cuID) {
        this.cuID = cuID;
    }

    public Subject getSuID() {
        return suID;
    }

    public void setSuID(Subject suID) {
        this.suID = suID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdid != null ? cdid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurriculumDetail)) {
            return false;
        }
        CurriculumDetail other = (CurriculumDetail) object;
        if ((this.cdid == null && other.cdid != null) || (this.cdid != null && !this.cdid.equals(other.cdid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.CurriculumDetail[ cdid=" + cdid + " ]";
    }
    
}
