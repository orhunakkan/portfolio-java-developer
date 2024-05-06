package com.myapp.repository;

import com.myapp.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);

}
