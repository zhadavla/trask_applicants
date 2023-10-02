package com.example.trask_task.controller;

import com.example.trask_task.dto.ApplicantDTO;
import com.example.trask_task.entity.Applicant;
import com.example.trask_task.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicantController {
    @Autowired
    private ApplicantService applicantService;

    @GetMapping("/dto")
    public List<ApplicantDTO> fetchAllApplicantsDto(){
        return applicantService.fetchAllApplicantsDto();
    }
    @GetMapping("/applicant")
    public List<Applicant> fetchAllApplicants() {
        return applicantService.fetchAllApplicants();
    }

    @GetMapping("/applicant/{id}")
    public Applicant fetchApplicantById(@PathVariable("id") Long id) {
        return applicantService.fetchApplicantById(id);
    }

    @PostMapping("/applicant")
    public Applicant saveApplicant(@RequestBody Applicant applicant) {
        return applicantService.saveApplicant(applicant);
    }

    @PostMapping("/applicants")
    public List<Applicant> saveApplicants(@RequestBody List<Applicant> applicants) {
        return applicantService.saveApplicants(applicants);
    }

}
