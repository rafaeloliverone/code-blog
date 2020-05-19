package com.spring.codeblog.repository;
import com.spring.codeblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeBlogRepository extends JpaRepository<Post, Long> {
}
