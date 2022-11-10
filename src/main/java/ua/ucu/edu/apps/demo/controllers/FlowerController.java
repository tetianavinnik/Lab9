package ua.ucu.edu.apps.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.ucu.edu.apps.demo.flower.Flower;
import ua.ucu.edu.apps.demo.flower.FlowerService;

import java.util.List;

@RequestMapping(path = "/api/v1/flower") @RestController
public class FlowerController {
    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> hello() {
        return flowerService.getFlowers();
    }

    @PostMapping
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }
}