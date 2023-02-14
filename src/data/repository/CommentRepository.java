package data.repository;

import data.Models.Comment;

public interface  CommentRepository {

    Comment saveComment(Comment comment);
    long countComment();
    void findComment(Comment comment);
    void deleteComment(Comment comment);

}
