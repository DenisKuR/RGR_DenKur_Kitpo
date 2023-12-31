package com.example.rgr_denkur.comparator;

import java.io.Serializable;

import com.example.rgr_denkur.types.DoubleType;

public class DoubleComparator implements Comparator, Serializable {
    @Override
    public double compare(Object o1, Object o2) {
        return ((DoubleType)o1).getDoubleTypeValue() - ((DoubleType)o2).getDoubleTypeValue();
    }
}
