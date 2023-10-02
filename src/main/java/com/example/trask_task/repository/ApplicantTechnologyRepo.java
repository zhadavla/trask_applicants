package com.example.trask_task.repository;

import com.example.trask_task.entity.Applicant;
import com.example.trask_task.entity.ApplicantTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ApplicantTechnologyRepo extends JpaRepository<ApplicantTechnology, Long> {
    @Query(value = "select a.applicant_surname, a.applicant_name, t.technology_name, ap.note, ap.level\n" +
            "from applicant_technology ap\n" +
            "         join public.applicant a on ap.applicant_id = a.applicant_id\n" +
            "         join public.technology t on ap.technology_id = t.technology_id", nativeQuery = true)
    public List<String> fetchApplicantsTechnologies();
}
