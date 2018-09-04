package com.imaro.myapp.dao;

public class testVO {
private String id;
private String pwd;
private String name;
private String phone;
private String postno;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPostno() {
	return postno;
}
public void setPostno(String postno) {
	this.postno = postno;
}
@Override
public String toString() {
	return "testVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone + ", postno=" + postno + "]";
}


}
