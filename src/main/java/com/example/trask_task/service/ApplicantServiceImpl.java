package com.example.trask_task.service;

import com.example.trask_task.dto.ApplicantDTO;
import com.example.trask_task.dto.TechnologyNoteLevelDTO;
import com.example.trask_task.entity.Applicant;
import com.example.trask_task.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ApplicantServiceImpl implements ApplicantService {
    @Autowired
    private ApplicantRepository applicantRepository;

    @Override
    public List<Applicant> fetchAllApplicants() {
        return applicantRepository.findAll();
    }

    @Override
    public Applicant fetchApplicantById(Long id) {
        return applicantRepository.findById(id).get();
    }

    @Override
    public Applicant saveApplicant(Applicant applicant) {
        return applicantRepository.save(applicant);
    }

    @Override
    public List<Applicant> saveApplicants(List<Applicant> applicants) {
        return applicantRepository.saveAll(applicants);
    }

    @Override
    public List<ApplicantDTO> fetchAllApplicantsDto() {
        ApplicantDTO applicantDTO = new ApplicantDTO();
        List<ApplicantDTO> applicantDTOS = new ArrayList<>();

        applicantDTO.setApplicantName("Some name");
        applicantDTO.setApplicantSurname("Surname");
        applicantDTO.setTempValue("temp value");
        TechnologyNoteLevelDTO technologyNoteLevelDTO1 =
                new TechnologyNoteLevelDTO("test1", "hest1", "sest1");
        TechnologyNoteLevelDTO technologyNoteLevelDTO2 =
                new TechnologyNoteLevelDTO("test2", "hest2", "sest2");
        List<TechnologyNoteLevelDTO> technologyNoteLevelDTOList = new ArrayList<>();
        technologyNoteLevelDTOList.add(technologyNoteLevelDTO1);
        technologyNoteLevelDTOList.add(technologyNoteLevelDTO2);
        applicantDTO.setTechnologyNoteLevelDTOList(technologyNoteLevelDTOList);
        applicantDTOS.add(applicantDTO);
        return applicantDTOS;
    }
}
