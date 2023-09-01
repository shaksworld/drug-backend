package com.shaks.drugproject.service.Impl;

import com.shaks.drugproject.Dto.DrugDto;
import com.shaks.drugproject.entity.Drug;
import com.shaks.drugproject.repository.DrugRepo;
import com.shaks.drugproject.service.DrugService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DrugServiceImpl implements DrugService {

    private final DrugRepo drugRepo;
    @Override
    public DrugDto createDrug(DrugDto drugDto) {
        Drug drug = mapToDrug(drugDto);
        Drug savedDrug = drugRepo.save(drug);

        DrugDto savedDrugDto = mapToDrugDto(savedDrug);
        return savedDrugDto;
    }

    @Override
    public List<DrugDto> getAllDrugs() {
        DrugDto drugDto = new DrugDto();
        Drug drug = mapToDrug(drugDto);
        Drug savedDrug = drugRepo.save(drug);
        return null;
    }

    private DrugDto mapToDrugDto(Drug savedDrug) {
        DrugDto drugDto = new DrugDto();
        drugDto.setDrugName(savedDrug.getDrugName());
        drugDto.setBrandName(savedDrug.getBrandName());
        drugDto.setStatus(savedDrug.getStatus().name());
        return drugDto;
    }

    private Drug mapToDrug(DrugDto drugDto) {
        Drug drug = new Drug();
        drug.setDrugName(drugDto.getDrugName());
        drug.setBrandName(drugDto.getBrandName());
//        drug.setStatus(Enum.valueOf(drugDto.getStatus()).toString());
        return drug;
    }


}
