package com.example.jabl.copsboot.user;

import com.example.jabl.orm.jpa.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "copsboot_user")
public class User extends AbstractEntity<UserId> {

    private String email;
    private AuthServerId authServerId;
    private String mobileToken;

    /*
    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @NotNull
    private Set<UserRole> roles;
    */

    protected User() {}

    public User(UserId id, String email, AuthServerId authServerId, String mobileToken) {
        super(id);
        this.email = email;
        this.authServerId = authServerId;
        this.mobileToken = mobileToken;
    }

    public String getEmail() {
        return email;
    }

    public AuthServerId getAuthServerId() {
        return authServerId;
    }

    public String getMobileToken() {
        return mobileToken;
    }
}
