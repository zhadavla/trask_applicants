package com.example.trask_task.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
// It's probably working not as it supposed to
// because it cannot find applicantId
public class ApplicantTechnology {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long applicationTechnologyId;

    @NotNull
    private Long applicant_id;
    @NotNull
    private Long technology_id;

    @Nullable
    private String level;
    @Nullable
    private String note;
}