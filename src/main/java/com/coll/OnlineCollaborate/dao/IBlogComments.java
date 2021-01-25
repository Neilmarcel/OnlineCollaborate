package com.coll.OnlineCollaborate.dao;

import java.util.List;

import com.coll.OnlineCollaborate.model.BlogComments;

public interface IBlogComments {
	List<BlogComments> getAllBlogComments();
	BlogComments getBlogCommentsById(int blogCommentId);
	boolean addBlogComments(BlogComments blogComments);
	boolean updateBlogComments(BlogComments blogComments);
}
