package com.filter.filterspring.farmacy.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filter.filterspring.farmacy.domain.dto.FarmacyDto;
import com.filter.filterspring.farmacy.domain.service.FarmacyService;
import com.filter.filterspring.farmacy.persistence.Farmacy;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/farmacies")
public class FarmacyController {
    @Autowired
    private FarmacyService farmacyService;

    @GetMapping
    public List<Farmacy> listFarmacy(){
        return this.farmacyService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Farmacy> view(@PathVariable Long id){
        Optional<Farmacy> optionalFarmacy  = farmacyService.findById(id);
        if (optionalFarmacy.isPresent()){
            return ResponseEntity.ok(optionalFarmacy.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody FarmacyDto farmacy, BindingResult result){
        if (result.hasFieldErrors()) {
            return validation(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(farmacyService.save(farmacy));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Farmacy> update(@PathVariable Long id, @Valid @RequestBody FarmacyDto farmacy){
        Optional<Farmacy> farmacyOptional = this.farmacyService.update(id, farmacy);
        if (farmacyOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(farmacyOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try {
            Optional<Farmacy> optionalFarmacy = this.farmacyService.delete(id);
            if (optionalFarmacy.isPresent()){
                return ResponseEntity.ok(optionalFarmacy.orElseThrow());
            }
            return ResponseEntity.notFound().build();

        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("No se puede eliminar");
        }
        
    }

    private ResponseEntity<?> validation(BindingResult result) {
        Map<String, String> errors = new HashMap<>();
        result.getFieldErrors().forEach(err -> {
            errors.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }
}