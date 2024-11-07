package com.example.demo.service;

import com.example.demo.domain.Comment;
import com.example.demo.dto.CommentDTO;

import java.util.List;

public interface CommentService {
    public Comment createComment(Long boardId, CommentDTO commentDTO);

    public List<Comment> getComments(Long boardId);
    public void deleteComment(Long id);
}
