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
@Table(name = "Campus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campus.findAll", query = "SELECT c FROM Campus c"),
    @NamedQuery(name = "Campus.findByCaID", query = "SELECT c FROM Campus c WHERE c.caID = :caID"),
    @NamedQuery(name = "Campus.findByCaName", query = "SELECT c FROM Campus c WHERE c.caName = :caName"),
    @NamedQuery(name = "Campus.findByCaAddress", query = "SELECT c FROM Campus c WHERE c.caAddress = :caAddress"),
    @NamedQuery(name = "Campus.findByCaEmail", query = "SELECT c FROM Campus c WHERE c.caEmail = :caEmail"),
    @NamedQuery(name = "Campus.findByCaHotline", query = "SELECT c FROM Campus c WHERE c.caHotline = :caHotline")})
public class Campus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "CaID")
    private String caID;
    @Size(max = 30)
    @Column(name = "CaName")
    private String caName;
    @Size(max = 255)
    @Column(name = "CaAddress")
    private String caAddress;
    @Size(max = 30)
    @Column(name = "CaEmail")
    private String caEmail;
    @Size(max = 30)
    @Column(name = "CaHotline")
    private String caHotline;
    @OneToMany(mappedBy = "caID")
    private Collection<Student> studentCollection;

    public Campus() {
    }

    public Campus(String caID) {
        this.caID = caID;
    }

    public String getCaID() {
        return caID;
    }

    public void setCaID(String caID) {
        this.caID = caID;
    }

    public String getCaName() {
        return caName;
    }

    public void setCaName(String caName) {
        this.caName = caName;
    }

    public String getCaAddress() {
        return caAddress;
    }

    public void setCaAddress(String caAddress) {
        this.caAddress = caAddress;
    }

    public String getCaEmail() {
        return caEmail;
    }

    public void setCaEmail(String caEmail) {
        this.caEmail = caEmail;
    }

    public String getCaHotline() {
        return caHotline;
    }

    public void setCaHotline(String caHotline) {
        this.caHotline = caHotline;
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
        hash += (caID != null ? caID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campus)) {
            return false;
        }
        Campus other = (Campus) object;
        if ((this.caID == null && other.caID != null) || (this.caID != null && !this.caID.equals(other.caID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Campus[ caID=" + caID + " ]";
    }
    
}
