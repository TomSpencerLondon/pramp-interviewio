package com.codurance.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RootOfNumberShould {
    @ParameterizedTest
    @CsvSource(value = {
            "7,3,1.913",
            "9,2,3"
    })
    void find_root_of_number(double input, int root, double result) {
        RootOfNumber rootOfNumber = new RootOfNumber();
        assertEquals(result, rootOfNumber.root(input, root));
    }
}
