package ua.ucu.edu.apps.demo.users;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Sender extends AppUser{
    public Sender(int id, String email, LocalDate dob, int age, String status) {
        super(id, email, dob, age, status);
    }
}
