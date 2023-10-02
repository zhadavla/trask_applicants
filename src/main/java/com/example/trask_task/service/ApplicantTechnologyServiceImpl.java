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
import java.util.List;

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
        List<String> splitedStr = null;
        for (String string : queryResults) {
            splitedStr = List.of(string.split(","));
            for (int i = 0; i < splitedStr.size(); i++) {
                logger.info("i = " + i + "splitted[i] = " + splitedStr.get(i));
            }
        }
        List<ApplicantWithTechnologiesDTO> applicants = new ArrayList<>();
        ApplicantWithTechnologiesDTO applicantWithTechnologiesDTO = new ApplicantWithTechnologiesDTO();

        applicantWithTechnologiesDTO.setApplicantName(splitedStr.get(0));
        applicantWithTechnologiesDTO.setApplicantSurname(splitedStr.get(1));

        TechnologyNoteLevelDTO technologyNoteLevelDTO = new TechnologyNoteLevelDTO();
        List<TechnologyNoteLevelDTO> technologyNoteLevelDTOList = new ArrayList<>();

        technologyNoteLevelDTO.setTechnologyName(splitedStr.get(2));
        technologyNoteLevelDTO.setNote(splitedStr.get(3));
        technologyNoteLevelDTO.setLevel(splitedStr.get(4));

        technologyNoteLevelDTOList.add(technologyNoteLevelDTO);

        applicantWithTechnologiesDTO.setApplicantTechnologies(technologyNoteLevelDTOList);

        applicants.add(applicantWithTechnologiesDTO);
        return applicants;
    }
}
