package it.epicode.m5_s3_g5test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Builder(setterPrefix = "with")
@AllArgsConstructor
public class RegisterUserDto extends DtoBase {
    private String username;
    private String password;
    private String friendlyName;
    private String roles;
}
