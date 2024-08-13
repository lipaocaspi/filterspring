package com.filter.filterspring.farmacy.domain.dto;

import com.filter.filterspring.city.persistence.City;
import com.filter.filterspring.farmacy.persistence.Farmacy;

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
public class FarmacyDto {
    private Long idfarmacy;
    private String namefarmacy;
    private String addressfarmacy;
    private Long long1;
    private Long latfarmacy;
    private String codecityfarm;
    private String logofarmacy;

    public Farmacy toFarmacy(City city) {
        Farmacy farmacy = new Farmacy();
        if (this.idfarmacy != null) {
            farmacy.setIdfarmacy(this.idfarmacy);
        }
        farmacy.setNamefarmacy(this.namefarmacy);
        farmacy.setAddressfarmacy(this.addressfarmacy);
        farmacy.setLong1(this.long1);
        farmacy.setLatfarmacy(this.latfarmacy);
        farmacy.setCodecityfarm(city);
        farmacy.setLogofarmacy(this.logofarmacy);
        return farmacy;
    }
}