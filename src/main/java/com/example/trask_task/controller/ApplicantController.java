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

    @GetMapping("/fetchAllApplicantsDto")
    public List<ApplicantDTO> fetchAllApplicantsDto(){
        return applicantService.fetchAllApplicantsDto();
    }
    @GetMapping("/fetchAllApplicants")
    public List<Applicant> fetchAllApplicants() {
        return applicantService.fetchAllApplicants();
    }

    @GetMapping("fetchApplicantById/id/{id}")
    public Applicant fetchApplicantById(@PathVariable("id") Long id) {
        return applicantService.fetchApplicantById(id);
    }

    @PostMapping("/saveApplicant")
    public Applicant saveApplicant(@RequestBody Applicant applicant) {
        return applicantService.saveApplicant(applicant);
    }

    @PostMapping("/saveApplicants")
    public List<Applicant> c(@RequestBody List<Applicant> applicants) {
        return applicantService.saveApplicants(applicants);
    }

    @DeleteMapping("deleteApplicantById/id/{id}")
    public String deleteApplicantById(@PathVariable("id") Long applicantId){
        return applicantService.deleteApplicantById(applicantId);
    }

    @DeleteMapping("deleteApplicantByName/name/{name}")
    public String deleteApplicantByName(@PathVariable("name") String applicantName){
        return applicantService.deleteApplicantByName(applicantName);
    }
    @PutMapping("updateApplicant/id/{id}")
    public Applicant updateApplicant(@PathVariable("id") Long applicantId,
                                     @RequestBody Applicant applicant){
        return applicantService.updateApplicant(applicantId, applicant);
    }
}
