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
@Table(name = "Curriculum")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curriculum.findAll", query = "SELECT c FROM Curriculum c"),
    @NamedQuery(name = "Curriculum.findByCuID", query = "SELECT c FROM Curriculum c WHERE c.cuID = :cuID"),
    @NamedQuery(name = "Curriculum.findByCuName", query = "SELECT c FROM Curriculum c WHERE c.cuName = :cuName")})
public class Curriculum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "CuID")
    private String cuID;
    @Size(max = 255)
    @Column(name = "CuName")
    private String cuName;
    @OneToMany(mappedBy = "cuID")
    private Collection<CurriculumDetail> curriculumDetailCollection;
    @JoinColumn(name = "SpID", referencedColumnName = "SpID")
    @ManyToOne
    private Specialization spID;
    @OneToMany(mappedBy = "cuID")
    private Collection<Student> studentCollection;

    public Curriculum() {
    }

    public Curriculum(String cuID) {
        this.cuID = cuID;
    }

    public String getCuID() {
        return cuID;
    }

    public void setCuID(String cuID) {
        this.cuID = cuID;
    }

    public String getCuName() {
        return cuName;
    }

    public void setCuName(String cuName) {
        this.cuName = cuName;
    }

    @XmlTransient
    public Collection<CurriculumDetail> getCurriculumDetailCollection() {
        return curriculumDetailCollection;
    }

    public void setCurriculumDetailCollection(Collection<CurriculumDetail> curriculumDetailCollection) {
        this.curriculumDetailCollection = curriculumDetailCollection;
    }

    public Specialization getSpID() {
        return spID;
    }

    public void setSpID(Specialization spID) {
        this.spID = spID;
    }

    @XmlTransient
    public Collection<Student> getStudentCollection() {
        return studentCollection;
    }

    public void setStudentCollection(Collection<Student> studentCollection) {
        this.studentCollection = studentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuID != null ? cuID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curriculum)) {
            return false;
        }
        Curriculum other = (Curriculum) object;
        if ((this.cuID == null && other.cuID != null) || (this.cuID != null && !this.cuID.equals(other.cuID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Curriculum[ cuID=" + cuID + " ]";
    }
    
}
