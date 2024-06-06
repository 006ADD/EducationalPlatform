package com.example.demo.Service;

import com.example.demo.Model.User;


import java.util.Optional;

public interface UserService {
    Optional<User> getCurrentUserOpt();
    User getCurrentUser();

}
