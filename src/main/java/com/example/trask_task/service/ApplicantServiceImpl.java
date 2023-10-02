package com.example.trask_task.service;

import com.example.trask_task.entity.Applicant;
import com.example.trask_task.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicantServiceImpl implements ApplicantService {
    @Autowired
    private ApplicantRepository applicantRepository;

    @Override
    public List<Applicant> fetchAllApplicants() {
        return applicantRepository.findAll();
    }

    @Override
    public Applicant fetchApplicantById(Long id) {
        return applicantRepository.findById(id).get();
    }

    @Override
    public Applicant saveApplicant(Applicant applicant) {
        return applicantRepository.save(applicant);
    }

    @Override
    public List<Applicant> saveApplicants(List<Applicant> applicants) {
        return applicantRepository.saveAll(applicants);
    }
}
