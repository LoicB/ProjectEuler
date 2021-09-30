package com.euler.problem3

import spock.lang.Specification
import spock.lang.Unroll

class Problem32Test extends Specification {

    def problem32 = new Problem32()

    @Unroll
    def "PandigitalProducts"() {

        expect:
        "pandigitalProducts(${n}) should return ${expectedResult}."
        println "pandigitalProducts(${n}) should return ${expectedResult}."
        problem32.pandigitalProducts(n) == expectedResult

        where:
        n || expectedResult
        4 || 12
        6 || 162
        7 || 0
        8 || 13458
    }

    @Unroll
    def "IsPandigital"() {

        expect:
        "IsPandigital(${multiplicand}, ${multiplier}, ${n}) should return ${expectedResult}."
        println "IsPandigital(${multiplicand}, ${multiplier}, ${n}) should return ${expectedResult}."
        problem32.isPandigital(multiplicand, multiplier, n) == expectedResult

        where:
        multiplicand | multiplier | n || expectedResult
        39           | 186        | 9 || true
    }

    @Unroll
    def "NumberOfDigits"() {

        expect:
        "NumberOfDigits(${number}) should return ${expectedResult}."
        println "NumberOfDigits(${number}) should return ${expectedResult}."
        problem32.numberOfDigits(number) == expectedResult

        where:
        number || expectedResult
        1      || 1
        10     || 2
        39     || 2
        186    || 3
        7254   || 4
    }
}
