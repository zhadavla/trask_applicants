package com.example.trask_task.service;

import com.example.trask_task.dto.ApplicantWithTechnologiesDTO;
import com.example.trask_task.dto.TechnologyNoteLevelDTO;
import com.example.trask_task.entity.Applicant;
import com.example.trask_task.entity.ApplicantTechnology;
import com.example.trask_task.repository.ApplicantRepository;
import com.example.trask_task.repository.ApplicantTechnologyRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApplicantTechnologyServiceImpl implements ApplicantTechnologyService{
    private static final Logger logger = LoggerFactory.getLogger(ApplicantTechnology.class);
    @Autowired
    private ApplicantTechnologyRepo applicantTechnologyRepo;

    @Override
    public List<String> fetchAllApplicantTechnologies() {
        return applicantTechnologyRepo.fetchApplicantsTechnologies();
    }

    @Override
    public ApplicantTechnology saveApplicantTechnology(ApplicantTechnology applicantTechnology) {
        return applicantTechnologyRepo.save(applicantTechnology);
    }

    @Override
    public List<ApplicantTechnology> saveApplicantTechnologies(List<ApplicantTechnology> applicantTechnologies) {
        return applicantTechnologyRepo.saveAll(applicantTechnologies);
    }

    @Override
    public List<ApplicantWithTechnologiesDTO> fetchAllApplicantsWithTechnologies() {
        List<String> queryResults = applicantTechnologyRepo.fetchApplicantsTechnologies();
        Map<String, ApplicantWithTechnologiesDTO> applicantMap = new HashMap<>();

        for (String string : queryResults) {
            List<String> splitedStr = List.of(string.split(","));
            String applicantName = splitedStr.get(0);
            String applicantSurname = splitedStr.get(1);

            // Create a unique key for each applicant (e.g., combining name and surname)
            String applicantKey = applicantName + " " + applicantSurname;

            // Retrieve or create the DTO for the current applicant
            ApplicantWithTechnologiesDTO applicantDTO = applicantMap.computeIfAbsent(applicantKey, k -> {
                ApplicantWithTechnologiesDTO newDTO = new ApplicantWithTechnologiesDTO();
                newDTO.setApplicantName(applicantName);
                newDTO.setApplicantSurname(applicantSurname);
                newDTO.setApplicantTechnologies(new ArrayList<>());
                return newDTO;
            });

            // Add the technology to the current applicant's list
            TechnologyNoteLevelDTO technologyNoteLevelDTO = new TechnologyNoteLevelDTO();
            technologyNoteLevelDTO.setTechnologyName(splitedStr.get(2));
            technologyNoteLevelDTO.setNote(splitedStr.get(3));
            technologyNoteLevelDTO.setLevel(splitedStr.get(4));

            applicantDTO.getApplicantTechnologies().add(technologyNoteLevelDTO);
        }

        // Convert the map values to a list
        List<ApplicantWithTechnologiesDTO> applicants = new ArrayList<>(applicantMap.values());

        return applicants;
    }

}
