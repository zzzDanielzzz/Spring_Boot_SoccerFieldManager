package com.danielsacol.soccerfieldmanager.services;

import com.danielsacol.soccerfieldmanager.models.User;

public interface IAuthService {
    public User save(User user);
    public User login(String email);
}
