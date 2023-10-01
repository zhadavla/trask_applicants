package com.example.trask_task.controller;

import com.example.trask_task.entity.ApplicantTechnology;
import com.example.trask_task.service.ApplicantTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applicant-technology") // Base URL for this controller
public class ApplicantTechnologyController {
    @Autowired
    private ApplicantTechnologyService applicantTechnologyService;

    @GetMapping
    public List<ApplicantTechnology> fetchAllApplicantTechnologies() {
        return applicantTechnologyService.fetchAllApplicantTechnologies();
    }

//    @GetMapping("/{id}")
//    public ApplicantTechnology fetchApplicantTechnologyById(@PathVariable("id") Long id) {
//        return applicantTechnologyService.fetchApplicantTechnologyById(id);
//    }

    @PostMapping
    public ApplicantTechnology saveApplicantTechnology(@RequestBody ApplicantTechnology applicantTechnology) {
        return applicantTechnologyService.saveApplicantTechnology(applicantTechnology);
    }

//    @PutMapping("/{id}")
//    public ApplicantTechnology updateApplicantTechnology(
//            @PathVariable("id") Long id,
//            @RequestBody ApplicantTechnology applicantTechnology
//    ) {
//        return applicantTechnologyService.updateApplicantTechnology(id, applicantTechnology);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteApplicantTechnology(@PathVariable("id") Long id) {
//        applicantTechnologyService.deleteApplicantTechnology(id);
//    }
}
