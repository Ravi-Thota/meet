package com.event.mashup.user.service;

import com.event.mashup.user.dto.RegistrationForm;
import com.event.mashup.user.model.User;

public interface UserService {
    public User registerNewUserAccount(RegistrationForm userAccountData) throws DuplicateEmailException;
}
