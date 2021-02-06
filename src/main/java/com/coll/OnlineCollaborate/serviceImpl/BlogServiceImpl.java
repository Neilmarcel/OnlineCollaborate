package com.coll.OnlineCollaborate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coll.OnlineCollaborate.dao.IBlogDao;
import com.coll.OnlineCollaborate.model.Blog;
import com.coll.OnlineCollaborate.service.IBlogService;

@Service
@Transactional
public class BlogServiceImpl implements IBlogService{
	
	@Autowired
	IBlogDao blogDao;
	
	@Override
	public List<Blog> getAllBlogs() {
		return blogDao.getAllBlogs();
	}

	@Override
	public List<Blog> getBlogsByStatus(String status) {
		// TODO Auto-generated method stub
		return blogDao.getBlogsByStatus(status);
	}

	@Override
	public List<Blog> getUserBlogs(int id) {
		// TODO Auto-generated method stub
		return blogDao.getUserBlogs(id);
	}

	@Override
	public List<Blog> mainList() {
		// TODO Auto-generated method stub
		return blogDao.mainList();
	}

	@Override
	public Blog getBlogById(int blogId) {
		// TODO Auto-generated method stub
		return blogDao.getBlogById(blogId);
	}

	@Override
	public boolean addBlog(Blog blog) {
		// TODO Auto-generated method stub
		return blogDao.addBlog(blog);
	}

	@Override
	public boolean updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		return blogDao.updateBlog(blog);
	}

	@Override
	public boolean deleteBlog(Blog blog) {
		// TODO Auto-generated method stub
		return blogDao.deleteBlog(blog);
	}
	
}
