package com.sandeep.joblisting.repository;

import com.sandeep.joblisting.model.Post;

import java.util.ArrayList;
import java.util.List;

public class searchRepositoryImpl implements SearchRepository{

    @Override
    public List<Post> findByText() {
        final List<Post> posts = new ArrayList<>();
        return posts;
    }
}
