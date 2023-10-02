package com.example.trask_task.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicantWithTechnologiesDTO {
    private String applicantName;
    private String applicantSurname;
    private List<TechnologyNoteLevelDTO> applicantTechnologies;
}
