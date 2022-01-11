package com.hasibul.product_rnd.interface_with_common;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity();
        User user = new UserImpl();

        user.create(entity);
        user.update(entity);
        user.delete(entity);

    }
}
