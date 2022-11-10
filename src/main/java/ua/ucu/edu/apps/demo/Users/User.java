package ua.ucu.edu.apps.demo.Users;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Table @Entity @Getter @Setter
public class User {
    @Id @GeneratedValue
    private int id;
    private String email;
    private LocalDate dob;
    private int age;

}
