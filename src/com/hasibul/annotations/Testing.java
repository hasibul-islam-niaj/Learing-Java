package com.hasibul.annotations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ValidateEntity{

    @NotEmpty(message = "Id should not be Empty")
    @MaxLength(maxLength = 10)
    public String id;

    @NotEmpty(message = "Name should not be empty")
    public String name;

    public List<String> createValidate(Map<String, String> data){
        ValidationFactory validationFactory = new ValidationFactory();
        ValidateEntity validateEntity = new ValidateEntity();

        validateEntity.id = data.get("id");
//        validateEntity.name = data.get("name");

        validationFactory.validate(validateEntity);
        return null;
    }
}

public class Testing {

    public static void main(String[] args) {
        ValidateEntity validateEntity = new ValidateEntity();

        Map<String, String> data = new HashMap<>();
        data.put("id", "1031");
        data.put("name", "Hasibul Islam");

        List errors = validateEntity.createValidate(data);

    }
}
