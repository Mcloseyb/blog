package org.example.blogmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    private String blogId;
    private boolean approved;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @OneToOne(mappedBy = "blog", fetch = FetchType.LAZY)
    private BlogDetails blogDetails;

    // Getters and setters

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public BlogDetails getBlogDetails() {
        return blogDetails;
    }

    public void setBlogDetails(BlogDetails blogDetails) {
        this.blogDetails = blogDetails;
    }
}
