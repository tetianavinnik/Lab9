package ua.ucu.edu.apps.demo.Users;

import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public String getUsers() {
        return "hello";
    }
}
