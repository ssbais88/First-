package com.app.bean;

public class Student {
	
	private int rollNo;
	private String sName;
	private String sAddr;
	public Student() {
		super();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddr() {
		return sAddr;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sName=" + sName + ", sAddr=" + sAddr + "]";
	}
	
	
	
}
