package com.hasibul.product_rnd.interface_with_common;

public class CommonImpl<T> implements Common<T>{

    @Override
    public T create(T entity) {
        System.out.println("From Common Impl: "+ entity.getClass());
        return entity;
    }

    @Override
    public T update(T entity) {
        System.out.println("From Common Impl: "+ entity.getClass());
        return entity;
    }

    @Override
    public T delete(T entity) {
        System.out.println("From Common Impl: "+ entity.getClass());
        return entity;
    }
}
