package com.productivity.controller;

import com.productivity.entity.MeasureEntity;
import com.productivity.entity.ValuesEntity;
import com.productivity.service.MeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "productivity")
public class MeasureController {

    @Autowired
    MeasureService measureService;

    @PostMapping(value = "/calc")
    MeasureEntity calcMeasures(@RequestBody ValuesEntity valuesEntity) {
        return measureService.calcMeasures(valuesEntity);
    }

    @GetMapping(value="/values")
    List<MeasureEntity> getAllValues(){
        return measureService.getMeasures();
    }

}
