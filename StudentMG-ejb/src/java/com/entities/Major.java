/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Le Nhut Anh
 */
@Entity
@Table(name = "Major")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Major.findAll", query = "SELECT m FROM Major m"),
    @NamedQuery(name = "Major.findByMaID", query = "SELECT m FROM Major m WHERE m.maID = :maID"),
    @NamedQuery(name = "Major.findByMaName", query = "SELECT m FROM Major m WHERE m.maName = :maName")})
public class Major implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "MaID")
    private String maID;
    @Size(max = 100)
    @Column(name = "MaName")
    private String maName;
    @OneToMany(mappedBy = "maID")
    private Collection<Specialization> specializationCollection;

    public Major() {
    }

    public Major(String maID) {
        this.maID = maID;
    }

    public String getMaID() {
        return maID;
    }

    public void setMaID(String maID) {
        this.maID = maID;
    }

    public String getMaName() {
        return maName;
    }

    public void setMaName(String maName) {
        this.maName = maName;
    }

    @XmlTransient
    public Collection<Specialization> getSpecializationCollection() {
        return specializationCollection;
    }

    public void setSpecializationCollection(Collection<Specialization> specializationCollection) {
        this.specializationCollection = specializationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maID != null ? maID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Major)) {
            return false;
        }
        Major other = (Major) object;
        if ((this.maID == null && other.maID != null) || (this.maID != null && !this.maID.equals(other.maID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Major[ maID=" + maID + " ]";
    }
    
}
