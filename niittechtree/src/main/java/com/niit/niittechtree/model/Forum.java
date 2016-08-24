package com.niit.niittechtree.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Forum {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiscusscategory() {
		return discusscategory;
	}
	public void setDiscusscategory(String discusscategory) {
		this.discusscategory = discusscategory;
	}
	public String getDiscusstitle() {
		return discusstitle;
	}
	public void setDiscusstitle(String discusstitle) {
		this.discusstitle = discusstitle;
	}
	public String getDiscusscontent() {
		return discusscontent;
	}
	public void setDiscusscontent(String discusscontent) {
		this.discusscontent = discusscontent;
	}
	public Date getDiscusscreatedate() {
		return discusscreatedate;
	}
	public void setDiscusscreatedate(Date discusscreatedate) {
		this.discusscreatedate = discusscreatedate;
	}
	public String getDiscussusername() {
		return discussusername;
	}
	public void setDiscussusername(String discussusername) {
		this.discussusername = discussusername;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotEmpty
	private String discusscategory;
	@NotEmpty
	private String discusstitle;
	@NotEmpty
	private String discusscontent;
	@NotNull
	private Date discusscreatedate;
	@NotEmpty
	private String discussusername; 


}
