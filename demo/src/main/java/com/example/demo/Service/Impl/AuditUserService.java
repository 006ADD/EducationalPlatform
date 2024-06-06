package com.example.demo.Service.Impl;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditUserService")
@Primary
@RequiredArgsConstructor
public class AuditUserService implements UserService {

    @Qualifier("userServiceImpl")
    private final UserService origin;

    @Override
    public Optional<User> getCurrentUserOpt() {
        return Optional.empty();
    }
    @Override
    public User getCurrentUser() {
        return null;
    }
}