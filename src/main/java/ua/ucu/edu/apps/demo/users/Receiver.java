package ua.ucu.edu.apps.demo.users;

import java.time.LocalDate;

public class Receiver extends AppUser {
    public Receiver(int id, String email, LocalDate dob,
                    int age, String status) {
        super(id, email, dob, age, status);
    }
}
