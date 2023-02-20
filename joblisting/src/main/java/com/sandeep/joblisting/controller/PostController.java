package com.sandeep.joblisting.controller;

import com.sandeep.joblisting.repository.PostRepository;
import com.sandeep.joblisting.model.Post;
import com.sandeep.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController
{

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping(value = "/posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    @GetMapping(value = "/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return srepo.findByText();
    }

    @PostMapping(value = "/post")
    public Post addPost(@RequestBody Post post){

        return repo.save(post);
    }

}
