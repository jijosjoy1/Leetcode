package com.codingShuttle.prodready.WFH.ENTITY;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class WFHRequest {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String emailId;
        private String approverId;
        private String fromDate;
        private String toDate;
        private String status; // New, Approved, Rejected

        // Getters and Setters
    }

