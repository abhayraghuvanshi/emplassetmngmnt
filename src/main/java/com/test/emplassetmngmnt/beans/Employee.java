package com.test.emplassetmngmnt.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	public String txtEmployeeID;
    public String txtSurname;
    public String txtName;
    public String txtMobile; 
    public String txtLocation;
    public String txtDesignation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTxtEmployeeID() {
		return txtEmployeeID;
	}
	public void setTxtEmployeeID(String txtEmployeeID) {
		this.txtEmployeeID = txtEmployeeID;
	}
	public String getTxtSurname() {
		return txtSurname;
	}
	public void setTxtSurname(String txtSurname) {
		this.txtSurname = txtSurname;
	}
	public String getTxtName() {
		return txtName;
	}
	public void setTxtName(String txtName) {
		this.txtName = txtName;
	}
	public String getTxtMobile() {
		return txtMobile;
	}
	public void setTxtMobile(String txtMobile) {
		this.txtMobile = txtMobile;
	}
	public String getTxtLocation() {
		return txtLocation;
	}
	public void setTxtLocation(String txtLocation) {
		this.txtLocation = txtLocation;
	}
	public String getTxtDesignation() {
		return txtDesignation;
	}
	public void setTxtDesignation(String txtDesignation) {
		this.txtDesignation = txtDesignation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", txtEmployeeID=" + txtEmployeeID + ", txtSurname=" + txtSurname + ", txtName="
				+ txtName + ", txtMobile=" + txtMobile + ", txtLocation=" + txtLocation + ", txtDesignation="
				+ txtDesignation + "]";
	}
    
    
    
	
    
}
