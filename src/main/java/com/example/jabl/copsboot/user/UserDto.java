package com.example.jabl.copsboot.user;

public record UserDto(String userId, String email, String authServerId, String mobileToken) {

    public static UserDto fromUser(User user) {
        return new UserDto(
                user.getId().asString(),
                user.getEmail(),
                user.getAuthServerId().asString(),
                user.getMobileToken()
        );
    }
}
