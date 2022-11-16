package ua.ucu.edu.apps.demo.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Table @Entity @Getter @Setter
@AllArgsConstructor
public class AppUser {
    @Id @GeneratedValue
    private int id;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    @Transient
    private int age;
    private String status;

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public void update(String status) {
        this.status = status;
    }
}
