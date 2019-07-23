package com.productivity.service.impl;

import com.productivity.entity.MeasureEntity;
import com.productivity.entity.ValuesEntity;
import com.productivity.repository.MeasureRepository;
import com.productivity.repository.ValuesRepository;
import com.productivity.service.MeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasureServiceImpl implements MeasureService {


    @Autowired
    MeasureRepository measureRepository;

    @Autowired
    ValuesRepository valuesRepository;

    @Override
    public MeasureEntity calcMeasures(ValuesEntity values) {
        valuesRepository.save(values);
        MeasureEntity measures = new MeasureEntity();
        measures.setValues(values);
        //Target Worked Hours
        double targetWH = values.getKeyVolume() * values.getTargetWorkedHoursPerUnit();
        measures.setTargetWorkedHours(targetWH);

        //FTE Ratio
        double fteRatio = values.getHoursPerFTE() * values.getDaysInTimePeriod() / 365;
        measures.setRatioFTE(fteRatio);
        measureRepository.save(measures);
        return measures;
    }

    @Override
    public List<MeasureEntity> getMeasures() {
        List<MeasureEntity> measureEntities = measureRepository.findAll();
        return measureEntities;
    }

}
