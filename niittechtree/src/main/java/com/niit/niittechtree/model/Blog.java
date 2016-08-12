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

public class Blog {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotEmpty
	private String blogtitle;
	@NotEmpty
	private String blogcontent;
	@NotNull
	private Date blogdate;
	@NotEmpty
	private String blogusername; 

public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBlogtitle() {
		return blogtitle;
	}
	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}
	public String getBlogcontent() {
		return blogcontent;
	}
	public void setBlogcontent(String blogcontent) {
		this.blogcontent = blogcontent;
	}
	public Date getBlogdate() {
		return blogdate;
	}
	public void setBlogdate(Date blogdate) {
		this.blogdate = blogdate;
	}
	public String getBlogusername() {
		return blogusername;
	}
	public void setBlogusername(String blogusername) {
		this.blogusername = blogusername;
	}
	
}
