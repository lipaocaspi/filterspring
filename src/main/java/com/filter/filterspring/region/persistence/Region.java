package com.filter.filterspring.region.persistence;

import com.filter.filterspring.country.persistence.Country;

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
@Table(name = "region")
public class Region {
    @Id
    @Column(length = 5)
    private String codereg;

    @Column(length = 50)
    private String namereg;

    @ManyToOne
    @JoinColumn(name = "codecountry")
    Country codecountry;
}