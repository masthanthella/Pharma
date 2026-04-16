package com.Pharma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Entity
@Data
public class WorkItem {
 private Long id;
 private String articleName;
 private String assignedTo;

 @Enumerated(EnumType.STRING)
    private WIStatus status;
}
