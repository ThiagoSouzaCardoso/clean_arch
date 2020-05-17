package org.example.config;

import com.example.jug.JugIdGenerator;
import org.example.db.InMemoryUserRepository;
import org.example.encoder.Sha256PasswordEncoder;
import org.example.usecase.CreateUser;
import org.example.usecase.FindUser;
import org.example.usecase.LoginUser;
import org.example.usecase.port.PasswordEncoder;
import org.example.usecase.port.UserRepository;

public class Config {

    private final UserRepository userRepository = new InMemoryUserRepository();
    private final PasswordEncoder passwordEncoder = new Sha256PasswordEncoder();

    public CreateUser createUser() {
        return new CreateUser(userRepository, passwordEncoder, new JugIdGenerator());
    }

    public FindUser findUser() {
        return new FindUser(userRepository);
    }

    public LoginUser loginUser() {
        return new LoginUser(userRepository, passwordEncoder);
    }
}