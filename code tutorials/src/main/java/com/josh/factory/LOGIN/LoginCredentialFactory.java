package com.josh.factory.login;
import com.josh.domain.login.LoginCredential;

public class LoginCredentialFactory {
    public static LoginCredential buildLoginCredential() {
        return new LoginCredential().build();
    }
}