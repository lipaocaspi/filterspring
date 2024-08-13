package com.filter.filterspring.unitMeasurement.persistence;

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
@Table(name = "unit_measurement")
public class UnitMeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idum;

    @Column(length = 50, nullable = false)
    private String nameum;
}