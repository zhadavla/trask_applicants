package com.example.trask_task.service;

import com.example.trask_task.entity.Technology;
import com.example.trask_task.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyServiceImpl implements TechnologyService {
    @Autowired
    private TechnologyRepository technologyRepository;

    @Override
    public Technology saveTechnology(Technology technology) {
        return technologyRepository.save(technology);
    }

    @Override
    public List<Technology> fetchAllTechnology() {
        return technologyRepository.findAll();
    }

    @Override
    public Technology fetchTechnology(Long id) {
        return technologyRepository.findById(id).get();
    }

    @Override
    public List<Technology> saveTechnologies(List<Technology> technologies) {
        return technologyRepository.saveAll(technologies);
    }
}
