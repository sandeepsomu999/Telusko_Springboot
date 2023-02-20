package com.sandeep.joblisting.repository;

import com.sandeep.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText();
}
