package com.example.trask_task.service;

import com.example.trask_task.entity.Applicant;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ApplicantService {

    public List<Applicant> fetchAllApplicants();
}
