package com.example.trask_task.service;

import com.example.trask_task.entity.Applicant;
import com.example.trask_task.entity.ApplicantTechnology;

import java.util.List;


public interface ApplicantTechnologyService {

    public List<String> fetchAllApplicantTechnologies();

    public ApplicantTechnology saveApplicantTechnology(ApplicantTechnology applicantTechnology);

    public List<ApplicantTechnology> saveApplicantTechnologies(List<ApplicantTechnology> applicantTechnologies);
}
