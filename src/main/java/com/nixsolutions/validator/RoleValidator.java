package com.nixsolutions.validator;

import com.nixsolutions.entity.Role;

public class RoleValidator {
    public void validate(final Role role) {
        if (role.getName().length() == 0) {
            throw new IllegalArgumentException("Role's name is empty");
        }
    }
}
