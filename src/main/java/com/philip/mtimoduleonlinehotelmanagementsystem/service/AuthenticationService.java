package com.philip.mtimoduleonlinehotelmanagementsystem.service;

import com.example.common.exceptions.AuthenticationException;
import com.philip.mtimoduleonlinehotelmanagementsystem.exception.AuthenticationException;

public interface AuthenticationService {
    void authenticate(String username, String password) throws AuthenticationException;
}
