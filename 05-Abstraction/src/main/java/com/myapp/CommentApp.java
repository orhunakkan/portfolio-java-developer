package com.myapp;

import com.myapp.config.CommentConfig;
import com.myapp.model.Comment;
import com.myapp.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CommentConfig.class);
        Comment comment = new Comment();
        comment.setAuthor("ORHUN");
        comment.setText("DESCRIPTION OF A COMMENT");

        CommentService commentService = container.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}
