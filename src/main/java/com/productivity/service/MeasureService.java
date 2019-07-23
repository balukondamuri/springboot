package com.productivity.service;

import com.productivity.entity.MeasureEntity;
import com.productivity.entity.ValuesEntity;

import java.util.List;

public interface MeasureService {

    MeasureEntity calcMeasures(ValuesEntity values);
    List<MeasureEntity> getMeasures();


}
