package rikkei.service;

import java.util.List;

public interface IGenericService<T> {
    List<T> findAll();
    void save(T t);
    T finById(int id);
    void deleteById(int id);
}
