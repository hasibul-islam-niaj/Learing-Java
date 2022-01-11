package com.hasibul.product_rnd.interface_with_common;

public interface Common<T> {
    T create(T entity);
    T update(T entity);
    T delete(T entity);
}
