package com.example.trask_task.controller;

import com.example.trask_task.entity.Technology;
import com.example.trask_task.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TechnologyController {
    @Autowired
    private TechnologyService technologyService;
    @PostMapping("/technology")
    public Technology saveTechnology(@RequestBody Technology technology){
        return technologyService.saveTechnology(technology);
    }
    @GetMapping("/technology")
    public List<Technology> fetchAllTechnology(){
        return technologyService.fetchAllTechnology();
    }
    @GetMapping("/technology/{id}")
    public Technology fetchTechnology(@PathVariable("id") Long id){
        return technologyService.fetchTechnology(id);
    }
}
