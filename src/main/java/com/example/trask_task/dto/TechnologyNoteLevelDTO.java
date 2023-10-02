package com.example.trask_task.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TechnologyNoteLevelDTO {
    private String technologyName;
    private String note;
    private String level;

    public TechnologyNoteLevelDTO(String technologyName, String note, String level) {
        this.technologyName = technologyName;
        this.note = note;
        this.level = level;
    }
}
