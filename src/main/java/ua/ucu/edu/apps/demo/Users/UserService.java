package ua.ucu.edu.apps.demo.Users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(AppUser appUser) {
        if (!userRepository.findAppUserByEmail(appUser.getEmail()).isPresent()) {
            userRepository.save(appUser);
        }
    }
}
