package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        double arrayLength = arrayList.size();
        return arrayList.stream()
                .reduce(0,((integer, integer2) -> integer + integer2))/arrayLength;
    }

    public int getMaxValue() {
        return arrayList.stream()
                .reduce(0,((integer, integer2) -> Integer.max(integer,integer2)));
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }
}
