package com.example.trask_task.service;

import com.example.trask_task.entity.Technology;

import java.util.List;

public interface TechnologyService {
    public Technology saveTechnology(Technology technology);

    public List<Technology> fetchAllTechnology();

    public Technology fetchTechnology(Long id);

    public List<Technology> saveTechnologies(List<Technology> technologies);

    public Technology updateTechnology(Long technologyId, Technology technology);

    String removeTechnology(Long technologyId);

}
