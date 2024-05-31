package it.epicode.m5_s3_g5test.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class LoginResponseDto {
    private long id;
    private String username;
    private String friendlyName;
    private final List<String> roles;
    private String token;

    @Builder(setterPrefix = "with")
    public LoginResponseDto(long id, String username, String friendlyName, String token, List<String> roles) {
        this.id = id;
        this.username = username;
        this.friendlyName = friendlyName;
        this.roles = roles;
        this.token = token;
    }
}
