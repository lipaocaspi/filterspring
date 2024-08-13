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

    @Column(length = 10)
    private String proceedings;

    @Column(length = 100)
    private String namemedicine;

    @Column(length = 50)
    private String healthregister;

    @Column
    private String description;

    @Column(length = 60)
    private String descriptionshort;

    @ManyToOne
    @JoinColumn(name = "id")
    ModeAdministration codemodeadmin;

    @ManyToOne
    @JoinColumn(name = "codeap")
    ActivePrinciple codeap;

    @ManyToOne
    @JoinColumn(name = "idum")
    UnitMeasurement codeum;

    @Column(length = 100)
    private String namerol;

    @ManyToOne
    @JoinColumn(name = "codelab")
    Labatory codelab;
}