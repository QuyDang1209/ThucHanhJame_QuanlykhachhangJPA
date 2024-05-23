package com.cg.thuchanhquanlykhachhangjpa.service;

import java.util.List;

public interface IGenerateService<T> {
    List<T> findAll() throws Exception;

    void save(T t);

    T findById(Long id);

    void remove(Long id);
    T findOne(Long id) throws Exception;
}
