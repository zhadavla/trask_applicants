package com.example.trask_task.service;

import com.example.trask_task.entity.Applicant;
import com.example.trask_task.entity.ApplicantTechnology;
import com.example.trask_task.repository.ApplicantRepository;
import com.example.trask_task.repository.ApplicantTechnologyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantTechnologyServiceImpl implements ApplicantTechnologyService{
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
}
