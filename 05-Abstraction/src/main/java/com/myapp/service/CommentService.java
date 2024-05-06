package com.myapp.service;

import com.myapp.model.Comment;
import com.myapp.proxy.CommentNotificationProxy;
import com.myapp.repository.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private CommentRepository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
