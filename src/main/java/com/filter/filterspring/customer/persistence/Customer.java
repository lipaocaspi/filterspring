package com.filter.filterspring.customer.persistence;

import java.time.LocalDate;

import com.filter.filterspring.city.persistence.City;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "customer")
public class Customer {
    @Id
    @Column(length = 20, nullable = false)
    private String idcustomer;

    @Column(length = 50, nullable = false)
    private String namecustomer;

    @Column(length = 50, nullable = false)
    private String lastnamecustomer;

    @ManyToOne
    @JoinColumn(name = "codecity", nullable = false)
    City codecitycustomer;

    @Column(length = 100, nullable = false)
    private String emailcustomer;

    @Column(nullable = false)
    private LocalDate birthdate;

    @Column(nullable = false)
    private Long lon;

    @Column(nullable = false)
    private Long latitud;
}