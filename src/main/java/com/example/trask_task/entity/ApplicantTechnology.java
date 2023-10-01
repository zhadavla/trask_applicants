package com.example.trask_task.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicantTechnology {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long applicationTechnologyId;

    @ManyToOne
    @JoinColumn(name = "applicant_id", nullable = false)
    private Applicant applicant;

    @ManyToOne
    @JoinColumn(name = "technology_id", nullable = false)
    private Technology technology;

    @Nullable
    private String level;
    @Nullable
    private String note;
}