package com.filter.filterspring.city.persistence;

import com.filter.filterspring.region.persistence.Region;

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
@Table(name = "city")
public class City {
    @Id
    @Column(length = 5, nullable = false)
    private String codecity;

    @Column(length = 50, nullable = false)
    private String namecity;

    @ManyToOne
    @JoinColumn(name = "codereg", nullable = false)
    Region codereg;
}