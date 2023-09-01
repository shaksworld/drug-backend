package com.shaks.drugproject.service;

import com.shaks.drugproject.Dto.DrugDto;

import java.util.List;

public interface DrugService {

    DrugDto createDrug(DrugDto drugDto);

    List<DrugDto> getAllDrugs();
}
