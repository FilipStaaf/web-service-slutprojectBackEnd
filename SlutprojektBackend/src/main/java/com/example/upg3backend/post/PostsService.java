package com.example.upg3backend.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PostsService {

    @Autowired
    PostsRepository postsRepository;

    public int createPosts(Post posts) {
        Post existing = postsRepository.get(posts.getTitle());
        if (existing != null)
            return 1;

        postsRepository.save(posts);

        return 0;
    }

    public Collection<Post> getPosts() {
        return postsRepository.getPosts();
    }


    public boolean deletePost(String postTitle) {
        if (postsRepository.getPost(postTitle) == null)
            return false;

        postsRepository.removePost(postTitle);
        return true;
    }
}