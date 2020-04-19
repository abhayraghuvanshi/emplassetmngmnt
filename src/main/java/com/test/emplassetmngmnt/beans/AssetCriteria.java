package com.test.emplassetmngmnt.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AssetCriteria {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	
	
	public String txtSearchAssetId;
    public String txtSearchEmployeeId;
	
	public String getTxtSearchAssetId() {
		return txtSearchAssetId;
	}
	public void setTxtSearchAssetId(String txtSearchAssetId) {
		this.txtSearchAssetId = txtSearchAssetId;
	}
	public String getTxtSearchEmployeeId() {
		return txtSearchEmployeeId;
	}
	public void setTxtSearchEmployeeId(String txtSearchEmployeeId) {
		this.txtSearchEmployeeId = txtSearchEmployeeId;
	}
	
	

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "AssetCriteria [id=" + id + ", txtSearchAssetId=" + txtSearchAssetId + ", txtSearchEmployeeId="
				+ txtSearchEmployeeId + "]";
	}
	
	
	
    
    
    
    
    
	
    
}
