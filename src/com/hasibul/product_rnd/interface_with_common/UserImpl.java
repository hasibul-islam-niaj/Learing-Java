package com.hasibul.product_rnd.interface_with_common;

public class UserImpl extends CommonImpl<Entity> implements User{

    @Override
    public Entity delete(Entity entity) {
        System.out.println("From User: "+ entity.getClass());
        return entity;
    }
}
