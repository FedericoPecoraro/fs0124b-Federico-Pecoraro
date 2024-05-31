package it.epicode.m5_s3_g5test.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class LoggedUserDto {
    private long id;
    private String username;
    private String friendlyName;
    private final List<String> roles;

    @Builder(setterPrefix = "with")
    public LoggedUserDto(long id, String username, String friendlyName, String token, List<String> roles) {
        this.id = id;
        this.username = username;
        this.friendlyName = friendlyName;
        this.roles = roles;
    }
}
