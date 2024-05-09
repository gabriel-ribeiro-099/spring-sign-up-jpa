package br.com.ufrn.imd.securityexample.domain;

import br.com.ufrn.imd.securityexample.PasswordEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public void save(Users user) {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            throw new RuntimeException("The username " + user.getUsername() + " is already taken.");
        }

        user.setPassword(PasswordEncoderUtil.encode(user.getPassword()));
        userRepository.save(user);
    }
}