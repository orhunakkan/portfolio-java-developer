package com.myapp.repository;

import com.myapp.model.Comment;

public class DBCommnetRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment " + comment.getText());
    }
}
