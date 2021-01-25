package com.coll.OnlineCollaborate.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Component
@Entity
public class Blog extends DomainResponse implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int blogid;
	String blogTitle, blogContent;
	LocalDate blogPosted;
	String status;
	int noOflikes,noOfComments, noOfViews;
	int userId;
	String username;
	@OneToMany(mappedBy="blog", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JsonManagedReference
	List<BlogComments> blogComments;
	public int getBlogid() {
		return blogid;
	}
	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogContent() {
		return blogContent;
	}
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	public LocalDate getBlogPosted() {
		return blogPosted;
	}
	public void setBlogPosted(LocalDate blogPosted) {
		this.blogPosted = blogPosted;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getNoOflikes() {
		return noOflikes;
	}
	public void setNoOflikes(int noOflikes) {
		this.noOflikes = noOflikes;
	}
	public int getNoOfComments() {
		return noOfComments;
	}
	public void setNoOfComments(int noOfComments) {
		this.noOfComments = noOfComments;
	}
	public int getNoOfViews() {
		return noOfViews;
	}
	public void setNoOfViews(int noOfViews) {
		this.noOfViews = noOfViews;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<BlogComments> getBlogComments() {
		return blogComments;
	}
	public void setBlogComments(List<BlogComments> blogComments) {
		this.blogComments = blogComments;
	}
	
}
