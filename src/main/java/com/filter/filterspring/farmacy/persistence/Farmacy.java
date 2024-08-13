package com.filter.filterspring.farmacy.persistence;

import com.filter.filterspring.city.persistence.City;

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
@Table(name = "farmacy")
public class Farmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfarmacy;

    @Column(length = 60, nullable = false)
    private String namefarmacy;

    @Column(length = 100, nullable = false)
    private String addressfarmacy;

    @Column(nullable = false)
    private Long long1;

    @Column(nullable = false)
    private Long latfarmacy;

    @ManyToOne
    @JoinColumn(name = "codecity", nullable = false)
    private City codecityfarm;

    @Column(length = 50, nullable = false)
    private String logofarmacy;
}