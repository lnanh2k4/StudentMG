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
import javax.persistence.Lob;
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
@Table(name = "Subject")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subject.findAll", query = "SELECT s FROM Subject s"),
    @NamedQuery(name = "Subject.findBySuID", query = "SELECT s FROM Subject s WHERE s.suID = :suID"),
    @NamedQuery(name = "Subject.findBySuName", query = "SELECT s FROM Subject s WHERE s.suName = :suName"),
    @NamedQuery(name = "Subject.findBySuNoCredit", query = "SELECT s FROM Subject s WHERE s.suNoCredit = :suNoCredit")})
public class Subject implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SuID")
    private String suID;
    @Size(max = 255)
    @Column(name = "SuName")
    private String suName;
    @Column(name = "SuNoCredit")
    private Integer suNoCredit;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "SuPrerequisite")
    private String suPrerequisite;
    @OneToMany(mappedBy = "suID")
    private Collection<CurriculumDetail> curriculumDetailCollection;

    public Subject() {
    }

    public Subject(String suID) {
        this.suID = suID;
    }

    public String getSuID() {
        return suID;
    }

    public void setSuID(String suID) {
        this.suID = suID;
    }

    public String getSuName() {
        return suName;
    }

    public void setSuName(String suName) {
        this.suName = suName;
    }

    public Integer getSuNoCredit() {
        return suNoCredit;
    }

    public void setSuNoCredit(Integer suNoCredit) {
        this.suNoCredit = suNoCredit;
    }

    public String getSuPrerequisite() {
        return suPrerequisite;
    }

    public void setSuPrerequisite(String suPrerequisite) {
        this.suPrerequisite = suPrerequisite;
    }

    @XmlTransient
    public Collection<CurriculumDetail> getCurriculumDetailCollection() {
        return curriculumDetailCollection;
    }

    public void setCurriculumDetailCollection(Collection<CurriculumDetail> curriculumDetailCollection) {
        this.curriculumDetailCollection = curriculumDetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (suID != null ? suID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
        if ((this.suID == null && other.suID != null) || (this.suID != null && !this.suID.equals(other.suID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Subject[ suID=" + suID + " ]";
    }
    
}
