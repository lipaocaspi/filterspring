package com.filter.filterspring.activePrinciple.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "active_principle")
public class ActivePrinciple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idap;

    @Column(length = 60)
    private String nameap;
}