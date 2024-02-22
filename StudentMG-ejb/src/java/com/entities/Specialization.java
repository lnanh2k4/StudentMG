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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Specialization")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specialization.findAll", query = "SELECT s FROM Specialization s"),
    @NamedQuery(name = "Specialization.findBySpID", query = "SELECT s FROM Specialization s WHERE s.spID = :spID"),
    @NamedQuery(name = "Specialization.findBySpName", query = "SELECT s FROM Specialization s WHERE s.spName = :spName")})
public class Specialization implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "SpID")
    private String spID;
    @Size(max = 30)
    @Column(name = "SpName")
    private String spName;
    @JoinColumn(name = "MaID", referencedColumnName = "MaID")
    @ManyToOne
    private Major maID;
    @OneToMany(mappedBy = "spID")
    private Collection<Curriculum> curriculumCollection;

    public Specialization() {
    }

    public Specialization(String spID) {
        this.spID = spID;
    }

    public String getSpID() {
        return spID;
    }

    public void setSpID(String spID) {
        this.spID = spID;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public Major getMaID() {
        return maID;
    }

    public void setMaID(Major maID) {
        this.maID = maID;
    }

    @XmlTransient
    public Collection<Curriculum> getCurriculumCollection() {
        return curriculumCollection;
    }

    public void setCurriculumCollection(Collection<Curriculum> curriculumCollection) {
        this.curriculumCollection = curriculumCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spID != null ? spID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specialization)) {
            return false;
        }
        Specialization other = (Specialization) object;
        if ((this.spID == null && other.spID != null) || (this.spID != null && !this.spID.equals(other.spID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Specialization[ spID=" + spID + " ]";
    }
    
}
