package com.example.upg3backend.post;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PostsRepository {

    private Map<String, Post> posts = new HashMap<>();

    public Post get(String title) {
        return posts.get(title.toLowerCase());
    }

    public void save(Post post) {posts.put(post.getTitle().toLowerCase(), post);}

    public void removePost(String title){
        posts.remove(title.toLowerCase());
    }

    public Collection<Post> getPosts() {
        return posts.values();
    }

    public Post getPost(String title){
        return posts.get(title.toLowerCase());
    }

}