package com.productivity.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class MeasureEntity {

    private @Id
    @GeneratedValue
    long id;


    private double targetWorkedHours;

    @Column(name = "FTE_Ratio")
    private double ratioFTE;


    @ManyToOne
    @JoinColumn(name = "value_id")
    ValuesEntity values;

    public void setValues(ValuesEntity values) {
        this.values = values;
    }

    public void setTargetWorkedHours(double targetWorkedHours) {
        this.targetWorkedHours = targetWorkedHours;
    }

    public void setRatioFTE(double ratioFTE) {
        this.ratioFTE = ratioFTE;
    }
}
