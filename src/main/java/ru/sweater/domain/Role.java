package ru.sweater.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Алексей on 29.04.2018.
 */
public enum Role implements GrantedAuthority{
    USER, ADMIN;

    @Override
    public String getAuthority(){
        return name();
    }
}
