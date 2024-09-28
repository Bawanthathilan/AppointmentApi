package com.appApi.model;

public class Appointment {
	private int appID;
	private String fullName;
	private int phoneNo;
	private String email;
	private String address;
	private String message;
	private Date date;
	private int hospitalID;
	private int docID;
	private int patientID;
	private String hospitalName;
	
	public int getAppID() {
		return appID;
	}
	public void setAppID(int appID) {
		this.appID = appID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHospitalID() {
		return hospitalID;
	}
	public void setHospitalID(int hospitalID) {
		this.hospitalID = hospitalID;
	}
	public int getDocID() {
		return docID;
	}
	public void setDocID(int docID) {
		this.docID = docID;
	}
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public int getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(int hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	 @Override
	    public String toString() {
	        return "Doctor{" +
	                "appID='" + appID + '\'' +
	                ", fullName='" + fullName + '\'' +
	                ", phoneNo='" + phoneNo + '\'' +
	                ", email='" + email + '\'' +
	                ", address='" + address + '\'' +
	                ", message='" + message + '\'' +
	                ", date=" + date +
	                ", hospitalID='" + hospitalID + '\'' +
	                ", docID='" + docID + '\'' +
	                ", patientID='" + patientID + '\'' +
	                ", hospitalName='" + hospitalName + '\'' +
	                '}';
	    }
	
	
		
}


