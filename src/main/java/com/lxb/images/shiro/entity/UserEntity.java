package com.lxb.images.shiro.entity;

import com.lxb.images.util.Sex;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    private String id;
    private String name;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private Sex sex;
}
