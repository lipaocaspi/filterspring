package com.filter.filterspring.farmacyMedicine.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "farmacy_medicine")
public class FarmacyMedicine {
    @Id
    private Long idfarmacy;

    @Column
    private Long idmedicinefatrm;

    @Column
    private Long price;
}