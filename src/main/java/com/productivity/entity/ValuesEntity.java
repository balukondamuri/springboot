package com.productivity.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class ValuesEntity {

    private @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "value_id")
    @SequenceGenerator(name = "value_id", sequenceName = "value_id", allocationSize = 1)
    long value_id;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    private Date date;

    private double targetWorkedHoursPerUnit;
    private double keyVolume;
    private double minimumVariableStaffing;
    private double fixedStaffingFTE;
    private double hoursPerFTE;
    private int daysInTimePeriod;

    public double getKeyVolume() {
        return keyVolume;
    }

    public double getTargetWorkedHoursPerUnit() {
        return targetWorkedHoursPerUnit;
    }

    public double getHoursPerFTE() {
        return hoursPerFTE;
    }

    public double getDaysInTimePeriod() {
        return daysInTimePeriod;
    }
}

