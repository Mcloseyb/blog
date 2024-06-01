package org.example.blogmanagement.repository;

import org.example.blogmanagement.model.BlogDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogDetailsRepository extends JpaRepository<BlogDetails, String> {
    List<BlogDetails> findByBlogApprovedTrue();
}
