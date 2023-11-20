package com.java.ejb;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance_details")
public class Insurance implements Serializable{
	
	@Id
	@GeneratedValue
	
	@Column(name = "Insurance_id")
	private int insId;
	@Column(name = "Insurance_Name")
	private String insName;
	@Column(name = "Type")
	private String type;
	@Column(name = "PremiumStart")
	private Date premiumStart;
	@Column(name = "PremiumEnd")
	private Date premiumEnd;
	@Column(name = "MinPeriod")
	private int minPeriod;
	@Column(name = "MaxPeriod")
	private int maxPeriod;
	@Column(name = "LaunchDate")
	private Date lunchDate;
	@Column(name = "Status")
	private String status;
	public int getInsId() {
		return insId;
	}
	public void setInsId(int insId) {
		this.insId = insId;
	}
	public String getInsName() {
		return insName;
	}
	public void setInsName(String insName) {
		this.insName = insName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getPremiumStart() {
		return premiumStart;
	}
	public void setPremiumStart(Date premiumStart) {
		this.premiumStart = premiumStart;
	}
	public Date getPremiumEnd() {
		return premiumEnd;
	}
	public void setPremiumEnd(Date premiumEnd) {
		this.premiumEnd = premiumEnd;
	}
	public int getMinPeriod() {
		return minPeriod;
	}
	public void setMinPeriod(int minPeriod) {
		this.minPeriod = minPeriod;
	}
	public int getMaxPeriod() {
		return maxPeriod;
	}
	public void setMaxPeriod(int maxPeriod) {
		this.maxPeriod = maxPeriod;
	}
	public Date getLunchDate() {
		return lunchDate;
	}
	public void setLunchDate(Date lunchDate) {
		this.lunchDate = lunchDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
