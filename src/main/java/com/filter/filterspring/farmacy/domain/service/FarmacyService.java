package com.filter.filterspring.farmacy.domain.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.filter.filterspring.city.domain.repository.CityRepository;
import com.filter.filterspring.city.persistence.City;
import com.filter.filterspring.farmacy.domain.dto.FarmacyDto;
import com.filter.filterspring.farmacy.domain.repository.FarmacyRepository;
import com.filter.filterspring.farmacy.persistence.Farmacy;

import jakarta.transaction.Transactional;

@Service
public class FarmacyService {
    @Autowired
    FarmacyRepository farmacyRepository;

    @Autowired
    CityRepository cityRepository;
    
    @Transactional
    public Optional<Farmacy> delete(Long id) {
        Optional<Farmacy> optionalFarmacy = this.farmacyRepository.findById(id);
        optionalFarmacy.ifPresent(
            farmacyFound -> {
                this.farmacyRepository.delete(farmacyFound);
            }
        );
        return optionalFarmacy;
    }
 
    public List<Farmacy> findAll() {
        return (List<Farmacy>) this.farmacyRepository.findAll();
    }

    public Optional<Farmacy> findById(Long id) {
        return this.farmacyRepository.findById(id);
    }

    public Farmacy save(FarmacyDto farmacy) {
        Farmacy farmacyItem = farmacy.toFarmacy(cityRepository.findById(farmacy.getCodecityfarm()).get());
        return this.farmacyRepository.save(farmacyItem);
    }

    public Optional<Farmacy> update(Long id, FarmacyDto farmacyDto) {
        Optional<Farmacy> optionalFarmacy = this.farmacyRepository.findById(id);
        
        if (!optionalFarmacy.isPresent()) {
            return Optional.empty();
        }

        City city = cityRepository.findById(farmacyDto.getCodecityfarm())
            .orElseThrow(() -> new IllegalArgumentException("City no encontrada"));

        Farmacy farmacyItem = farmacyDto.toFarmacy(city);
        farmacyItem.setIdfarmacy(id);

        try {
            return Optional.of(this.farmacyRepository.save(farmacyItem));
        } catch (DataIntegrityViolationException e) {
            // Manejar conflicto de integridad de datos (clave única)
            return Optional.empty();
        }
    }
}