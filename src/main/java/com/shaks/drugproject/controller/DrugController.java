package com.shaks.drugproject.controller;

import com.shaks.drugproject.Dto.DrugDto;
import com.shaks.drugproject.service.DrugService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "/api/drug")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class DrugController {

    private final DrugService drugService;

    @PostMapping
    public ResponseEntity<?> createDrug(@RequestBody DrugDto drugDto) {
        return new ResponseEntity<>(drugService.createDrug(drugDto), HttpStatus.CREATED);
    }

}
