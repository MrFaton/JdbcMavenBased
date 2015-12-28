package com.nixsolutions.validator;

import com.nixsolutions.entity.User;

public class UserValidator {
    
    public void validate(final User user) {
        if (user.getLogin().length() == 0) {
            throw new IllegalArgumentException("Login is empty");
        }

        if (user.getPassword().length() == 0) {
            throw new IllegalArgumentException("Password is empty");
        }

        if (user.getEmail().length() == 0) {
            throw new IllegalArgumentException("Email is empty");
        }

        if (user.getRole().getName().length() == 0) {
            throw new IllegalArgumentException("Role's name is empty");
        }
    }
}
