package com.example.trask_task.service;

import com.example.trask_task.entity.Applicant;
import com.example.trask_task.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantServiceImpl implements ApplicantService {
    @Autowired
    private ApplicantRepository applicantRepository;

    @Override
    public List<Applicant> fetchAllApplicants() {
        return applicantRepository.findAll();
    }
}
