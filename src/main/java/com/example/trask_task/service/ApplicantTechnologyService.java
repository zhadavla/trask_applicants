package com.example.trask_task.service;

import com.example.trask_task.entity.ApplicantTechnology;

import java.util.List;


public interface ApplicantTechnologyService {

    public List<ApplicantTechnology> fetchAllApplicantTechnologies();

    public ApplicantTechnology saveApplicantTechnology(ApplicantTechnology applicantTechnology);
}
