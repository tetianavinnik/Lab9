package ua.ucu.edu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.ucu.edu.apps.demo.order.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Getter
public class Flower extends Item {
    @Id @GeneratedValue
    private int id;
    @Getter
    private double sepalLength;
    @Getter
    private String color;
    @Getter
    private int price;

    @Override
    public double getPrice() {
        return this.price;
    }
}
