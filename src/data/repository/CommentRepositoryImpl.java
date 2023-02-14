package data.repository;

import data.Models.Comment;
import data.Models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CommentRepositoryImpl implements CommentRepository{
    private int count;
    private final List<Comment> comments =new ArrayList<>();
    @Override
    public Comment saveComment(Comment comment) {
        boolean userHasNotBeenSaved=comment.getId()==0;
        if (userHasNotBeenSaved){comment.setId(generateComment());
            comment.setId(generateComment());
            comments.add(comment);
            count++;}
        return comment;
    }

    private int generateComment() {
        return count+1;
    }

    @Override
    public long countComment() {
        return comments.size();
    }

    @Override
    public void findComment(Comment comment) {

    }

    @Override
    public void deleteComment(Comment comment) {
        for (Comment comment1: comments){
            if (comment.equals(comment1)){
                comments.remove(comment);
                count--;
                break;
            }}}}
