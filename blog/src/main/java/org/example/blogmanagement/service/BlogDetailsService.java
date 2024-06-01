package org.example.blogmanagement.service;

import org.example.blogmanagement.model.BlogDetails;
import org.example.blogmanagement.repository.BlogDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogDetailsService {

    @Autowired
    private BlogDetailsRepository blogDetailsRepository;

    public List<BlogDetails> findApprovedBlogs() {
        return blogDetailsRepository.findByBlogApprovedTrue();
    }
}
