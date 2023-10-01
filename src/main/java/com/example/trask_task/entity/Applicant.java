package com.example.trask_task.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long applicantId;
    @NotNull
    private String applicantName;
    @NotNull
    private String applicantSurname;

    @OneToMany(mappedBy = "applicant")
    private Collection<ApplicantTechnology> applicantTechnology;

    public Collection<ApplicantTechnology> getApplicantTechnology() {
        return applicantTechnology;
    }

    public void setApplicantTechnology(Collection<ApplicantTechnology> applicantTechnology) {
        this.applicantTechnology = applicantTechnology;
    }
}
