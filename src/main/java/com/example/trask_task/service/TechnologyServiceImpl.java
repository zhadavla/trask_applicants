package com.example.trask_task.service;

import com.example.trask_task.entity.Technology;
import com.example.trask_task.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public Technology updateTechnology(Long technologyId, Technology technology) {
        Technology technologyDb = technologyRepository.findById(technologyId).get();

        if (!"".equalsIgnoreCase(technology.getTechnologyName()))
            technologyDb.setTechnologyName(technology.getTechnologyName());
        return technologyRepository.save(technologyDb);
    }

    @Override
    public String removeTechnology(Long technologyId) {
        if (technologyRepository.existsById(technologyId)) {
            technologyRepository.deleteById(technologyId);
            return "Technology successfully deleted";
        }
        return "There's no technology for specified id";
    }
}
