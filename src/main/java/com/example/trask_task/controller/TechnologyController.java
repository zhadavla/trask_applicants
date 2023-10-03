package com.example.trask_task.controller;

import com.example.trask_task.entity.Technology;
import com.example.trask_task.service.TechnologyService;
import jakarta.persistence.UniqueConstraint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/technology")
public class TechnologyController {
    @Autowired
    private TechnologyService technologyService;

    @PostMapping
    public Technology saveTechnology(@RequestBody Technology technology) {
        return technologyService.saveTechnology(technology);
    }

    @GetMapping
    public List<Technology> fetchAllTechnology() {
        return technologyService.fetchAllTechnology();
    }

    @GetMapping("/id/{id}")
    public Technology fetchTechnology(@PathVariable("id") Long id) {
        return technologyService.fetchTechnology(id);
    }

    @PostMapping("/many")
    public List<Technology> saveTechnologies(@RequestBody List<Technology> technologies) {
        return technologyService.saveTechnologies(technologies);
    }

    @PutMapping("/id/{id}")
    public Technology updateTechnology(@PathVariable("id") Long technologyId,
                                       @RequestBody Technology technology) {
        return technologyService.updateTechnology(technologyId, technology);
    }

    @DeleteMapping("/id/{id}")
    public String removeTechnology(@PathVariable("id") Long technologyId) {
        return technologyService.removeTechnology(technologyId);
    }

}
