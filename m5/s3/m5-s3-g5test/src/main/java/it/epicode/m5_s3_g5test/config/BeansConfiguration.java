package it.epicode.m5_s3_g5test.config;

import it.epicode.m5_s3_g5test.Mapper;
import it.epicode.m5_s3_g5test.dto.LoggedUserDto;
import it.epicode.m5_s3_g5test.dto.LoginResponseDto;
import it.epicode.m5_s3_g5test.dto.RegisterUserDto;
import it.epicode.m5_s3_g5test.entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BeansConfiguration {
    @Bean
    @Scope("singleton")
    Mapper<RegisterUserDto, User> mapRegisterUser2UserEntity() {
        return (input) -> User.builder()
                .withNome(input.getUsername())
                .withPassword(input.getPassword())
                .withEmail(input.getUsername())
                .build();
    }

    @Bean
    @Scope("singleton")
    Mapper<User, LoggedUserDto> mapUserEntity2RegisteredUser() {
        return (input) -> LoggedUserDto.builder()
                .withFriendlyName(input.getNome())
                .withId(input.getId())
                .withUsername(input.getNome())
                .withRoles(input.getRoles().stream().map(r -> r.getNome()).toList())
                .build();
    }

    @Bean
    @Scope("singleton")
    Mapper<User, LoginResponseDto> mapUserEntity2LoginResponse() {
        return (input) -> LoginResponseDto.builder()
                .withFriendlyName(input.getNome()) //
                .withId(input.getId()) //
                .withUsername(input.getNome()) //
                .withRoles(input.getRoles().stream().map(r -> r.getNome()).toList()) //
                .build();
    }
}