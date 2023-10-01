package com.example.trask_task.controller;

import com.example.trask_task.entity.Applicant;
import com.example.trask_task.service.ApplicantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicantController {
    @Autowired
    private ApplicantServiceImpl applicantService;

    @GetMapping("/applicant")
    public List<Applicant> getApplicants() {
        return applicantService.fetchAllApplicants();
    }
}
