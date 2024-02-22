/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Le Nhut Anh
 */
@Entity
@Table(name = "Student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByStID", query = "SELECT s FROM Student s WHERE s.stID = :stID"),
    @NamedQuery(name = "Student.findByStFName", query = "SELECT s FROM Student s WHERE s.stFName = :stFName"),
    @NamedQuery(name = "Student.findByStLName", query = "SELECT s FROM Student s WHERE s.stLName = :stLName"),
    @NamedQuery(name = "Student.findByStSex", query = "SELECT s FROM Student s WHERE s.stSex = :stSex"),
    @NamedQuery(name = "Student.findByStEmail", query = "SELECT s FROM Student s WHERE s.stEmail = :stEmail"),
    @NamedQuery(name = "Student.findByStSemester", query = "SELECT s FROM Student s WHERE s.stSemester = :stSemester")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "StID")
    private String stID;
    @Size(max = 30)
    @Column(name = "StFName")
    private String stFName;
    @Size(max = 30)
    @Column(name = "StLName")
    private String stLName;
    @Column(name = "StSex")
    private Integer stSex;
    @Size(max = 30)
    @Column(name = "StEmail")
    private String stEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StSemester")
    private int stSemester;
    @JoinColumn(name = "CaID", referencedColumnName = "CaID")
    @ManyToOne
    private Campus caID;
    @JoinColumn(name = "CuID", referencedColumnName = "CuID")
    @ManyToOne
    private Curriculum cuID;

    public Student() {
    }

    public Student(String stID) {
        this.stID = stID;
    }

    public Student(String stID, int stSemester) {
        this.stID = stID;
        this.stSemester = stSemester;
    }

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStFName() {
        return stFName;
    }

    public void setStFName(String stFName) {
        this.stFName = stFName;
    }

    public String getStLName() {
        return stLName;
    }

    public void setStLName(String stLName) {
        this.stLName = stLName;
    }

    public Integer getStSex() {
        return stSex;
    }

    public void setStSex(Integer stSex) {
        this.stSex = stSex;
    }

    public String getStEmail() {
        return stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail;
    }

    public int getStSemester() {
        return stSemester;
    }

    public void setStSemester(int stSemester) {
        this.stSemester = stSemester;
    }

    public Campus getCaID() {
        return caID;
    }

    public void setCaID(Campus caID) {
        this.caID = caID;
    }

    public Curriculum getCuID() {
        return cuID;
    }

    public void setCuID(Curriculum cuID) {
        this.cuID = cuID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stID != null ? stID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.stID == null && other.stID != null) || (this.stID != null && !this.stID.equals(other.stID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Student[ stID=" + stID + " ]";
    }
    
}
