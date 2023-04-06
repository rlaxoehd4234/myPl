package com.umbrella.project_umbrella.service;

import com.umbrella.project_umbrella.domain.Post.Post;
import com.umbrella.project_umbrella.domain.Post.PostRepository;
import com.umbrella.project_umbrella.dto.post.PostListResponseDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.parameters.P;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostServiceTest {

    @Autowired PostRepository postRepository;
    @Autowired PostService postService;
    @Test
    public void Test() {
        postRepository.save(new Post(1L,"erqwe"));
        postRepository.save(new Post(2L,"erqwe"));
        postRepository.save(new Post(3L,"erqwe"));
        postRepository.save(new Post(4L,"erqwe"));
        postRepository.save(new Post(5L,"erqwe"));
        postRepository.save(new Post(6L,"erqwe"));
        postRepository.save(new Post(7L,"erqwe"));
        postRepository.save(new Post(8L,"erqwe"));
        postRepository.save(new Post(9L,"erqwe"));
        postRepository.save(new Post(10L,"erqwe"));
        postRepository.save(new Post(11L,"erqwe"));
        postRepository.save(new Post(12L,"erqwe"));
        postRepository.save(new Post(13L,"erqwe"));
        postRepository.save(new Post(14L,"erqwe"));
        postRepository.save(new Post(15L,"erqwe"));
        postRepository.save(new Post(16L,"erqwe"));
        postRepository.save(new Post(17L,"erqwe"));
        postRepository.save(new Post(18L,"erqwe"));
        postRepository.save(new Post(19L,"erqwe"));
        postRepository.save(new Post(20L,"erqwe"));
        postRepository.save(new Post(21L,"erqwe"));
        postRepository.save(new Post(22L,"erqwe"));
        postRepository.save(new Post(23L,"erqwe"));
        postRepository.save(new Post(24L,"erqwe"));
        postRepository.save(new Post(25L,"erqwe"));
        postRepository.save(new Post(26L,"erqwe"));
        postRepository.save(new Post(27L,"erqwe"));







    }

}