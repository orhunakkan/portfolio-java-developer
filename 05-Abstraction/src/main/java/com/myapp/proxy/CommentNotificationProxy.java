package com.myapp.proxy;

import com.myapp.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);

}
