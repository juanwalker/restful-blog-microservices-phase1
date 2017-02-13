package com.benjsicam.restfulblog.service;

import java.util.List;

import com.benjsicam.restfulblog.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.benjsicam.restfulblog.dao.PostRepository;
import com.benjsicam.restfulblog.domain.Post;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	@Transactional
	public void create(Post post) {		
		postRepository.saveAndFlush(post);
	}
	
	@Transactional
	public void update(Post post) {		
		postRepository.saveAndFlush(post);
	}
	
	@Transactional
	public void delete(Long id) {
		postRepository.delete(id);
	}
	
	public List<Post> find() {
		return postRepository.findAll();
	}
	
	public Post findById(Long id ) {
		return postRepository.findOne(id);
	}

	public Long findPostAuthor(Long id) {
		return postRepository.findPostAuthor(id);
	}
	
	public List<Post> findPostsByCategoryId(Long id) {
		return postRepository.findPostsByCategoryId(id);
	}

	public List<Post> findByAuthor(@PathVariable("authorId") Long authorId) {
		return postRepository.findByAuthor(authorId);
	}

}
