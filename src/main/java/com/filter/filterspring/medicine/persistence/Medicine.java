package com.filter.filterspring.medicine.persistence;

import com.filter.filterspring.activePrinciple.persistence.ActivePrinciple;
import com.filter.filterspring.labatory.persistence.Labatory;
import com.filter.filterspring.modeAdministration.persistence.ModeAdministration;
import com.filter.filterspring.unitMeasurement.persistence.UnitMeasurement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmedicine;

    @Column(length = 10, nullable = false)
    private String proceedings;

    @Column(length = 100, nullable = false)
    private String namemedicine;

    @Column(length = 50, nullable = false)
    private String healthregister;

    @Column(nullable = false)
    private String description;

    @Column(length = 60, nullable = false)
    private String descriptionshort;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    ModeAdministration codemodeadmin;

    @ManyToOne
    @JoinColumn(name = "codeap", nullable = false)
    ActivePrinciple codeap;

    @ManyToOne
    @JoinColumn(name = "idum", nullable = false)
    UnitMeasurement codeum;

    @Column(length = 100, nullable = false)
    private String namerol;

    @ManyToOne
    @JoinColumn(name = "codelab", nullable = false)
    Labatory codelab;
}