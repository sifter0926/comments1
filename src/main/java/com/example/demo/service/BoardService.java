package com.example.demo.service;



import com.example.demo.domain.Board;
import com.example.demo.domain.User;

import java.util.List;

public interface BoardService {
    void insert(Board board, User user);
    public List<Board> list();
    public Board findById(Long num);
    public void update(Board board);
    public void delete(Long num);
}
