package com.example.trask_task.service;

import com.example.trask_task.entity.Applicant;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ApplicantService {

    public List<Applicant> fetchAllApplicants();

    public Applicant fetchApplicantById(Long id);

    public Applicant saveApplicant(Applicant applicant);

    public List<Applicant> saveApplicants(List<Applicant> applicants);
}
