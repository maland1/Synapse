package com.maland1.synapse.dto;

import com.maland1.synapse.enums.UserRole;
import com.maland1.synapse.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDTO
{
    private Long id;
    private String username;
    private String email;
    private UserRole role;

    public UserDTO(User user) {
        this.id = getId();
        this.username = getUsername();
        this.role = getRole();
        this.email = getEmail();
    }

    public User asUser() {
        User user = new User();
        user.setId(this.id);
        user.setUsername(this.username);
        user.setRole(this.role);
        user.setEmail(this.email);
        return user;
    }


}
