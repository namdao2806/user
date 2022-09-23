package com.codegym.dao;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface GeneralService<T> {
    public void insert(T t) throws SQLException;

    public T select(int id);

    public List<T> selectAll();

    public boolean delete(int id) throws SQLException;

    public boolean update(T t) throws SQLException;
}
