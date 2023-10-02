package com.example.trask_task.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicantDTO {
    public String applicantName;
    public String applicantSurname;

    public String tempValue;

    public List<TechnologyNoteLevelDTO> technologyNoteLevelDTOList;
}
