package io.jonathan.converter.functions.impl;

import io.jonathan.converter.Measurement;
import io.jonathan.converter.functions.MeasurementConvertFunction;

import static io.jonathan.converter.Measurement.PLANTS_PER_ACRE;
import static io.jonathan.converter.Measurement.PLANTS_PER_HECTARE;

public class PlantsPerHectarePlantsPerAcre implements MeasurementConvertFunction {
    @Override
    public Measurement from() {
        return PLANTS_PER_HECTARE;
    }

    @Override
    public Measurement to() {
        return PLANTS_PER_ACRE;
    }

    @Override
    public Double apply(Double plantsPerHectare) {
        return plantsPerHectare / 2.471;
    }

    @Override
    public Double reverse(Double plantsPerAcre) {
        return plantsPerAcre * 2.471;
    }
}
