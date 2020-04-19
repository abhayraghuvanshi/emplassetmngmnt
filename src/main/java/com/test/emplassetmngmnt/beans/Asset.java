package com.test.emplassetmngmnt.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Asset {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public String txtAssetID;
    public String txtProduct;
    public String txtModel; 
    public String txtCondition;
    public String txtColor;
    public String drpInUse;
    public String drpEmployeeID;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTxtAssetID() {
		return txtAssetID;
	}
	public void setTxtAssetID(String txtAssetID) {
		this.txtAssetID = txtAssetID;
	}
	public String getTxtProduct() {
		return txtProduct;
	}
	public void setTxtProduct(String txtProduct) {
		this.txtProduct = txtProduct;
	}
	public String getTxtModel() {
		return txtModel;
	}
	public void setTxtModel(String txtModel) {
		this.txtModel = txtModel;
	}
	public String getTxtCondition() {
		return txtCondition;
	}
	public void setTxtCondition(String txtCondition) {
		this.txtCondition = txtCondition;
	}
	public String getTxtColor() {
		return txtColor;
	}
	public void setTxtColor(String txtColor) {
		this.txtColor = txtColor;
	}
	public String getDrpInUse() {
		return drpInUse;
	}
	public void setDrpInUse(String drpInUse) {
		this.drpInUse = drpInUse;
	}
	public String getDrpEmployeeID() {
		return drpEmployeeID;
	}
	public void setDrpEmployeeID(String drpEmployeeID) {
		this.drpEmployeeID = drpEmployeeID;
	}
	@Override
	public String toString() {
		return "Asset [id=" + id + ", txtAssetID=" + txtAssetID + ", txtProduct=" + txtProduct + ", txtModel="
				+ txtModel + ", txtCondition=" + txtCondition + ", txtColor=" + txtColor + ", drpInUse=" + drpInUse
				+ ", drpEmployeeID=" + drpEmployeeID + "]";
	}
    
    
    
	
    
}
