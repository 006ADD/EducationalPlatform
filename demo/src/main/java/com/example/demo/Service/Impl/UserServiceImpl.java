package com.example.demo.Service.Impl;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("userServiceImpl")
@Primary
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
  //  @LogExecutionTime
//    @Auditable
    @Cacheable
    public User getCurrentUser() {
        return null;
    }

    @Override
    public Optional<User> getCurrentUserOpt() {
        try {
            return Optional.of(getCurrentUser());
        } catch (Exception e) {
            log.error("Error during retrieving current user", e);
            return Optional.empty();
        }
    }
}