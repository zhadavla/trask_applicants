package com.example.trask_task.controller;

import com.example.trask_task.dto.ApplicantWithTechnologiesDTO;
import com.example.trask_task.entity.Applicant;
import com.example.trask_task.entity.ApplicantTechnology;
import com.example.trask_task.entity.Technology;
import com.example.trask_task.service.ApplicantTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicantTechnologyController {
    @Autowired
    private ApplicantTechnologyService applicantTechnologyService;

    @GetMapping("/fetchAllApplTech")
    public List<ApplicantTechnology> fetchAllApplTech(){
        return applicantTechnologyService.fetchAllApplTech();
    }
    @GetMapping("/fetchAllApplicantsWithTechnologies")
    public List<ApplicantWithTechnologiesDTO> fetchAllApplicantsWithTechnologies(){
        return applicantTechnologyService.fetchAllApplicantsWithTechnologies();
    }

    @PostMapping("/saveApplicantTechnology")
    public ApplicantTechnology saveApplicantTechnology(@RequestBody ApplicantTechnology applicantTechnology) {
        return applicantTechnologyService.saveApplicantTechnology(applicantTechnology);
    }

    @PostMapping("/saveApplicantTechnologies")
    public List<ApplicantTechnology> saveApplicantTechnologies(@RequestBody List<ApplicantTechnology> applicantTechnologies) {
        return applicantTechnologyService.saveApplicantTechnologies(applicantTechnologies);
    }
}
