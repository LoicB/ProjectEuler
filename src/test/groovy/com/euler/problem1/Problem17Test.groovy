package com.euler.problem1

import spock.lang.Specification
import spock.lang.Unroll

class Problem17Test extends Specification {
    def problem17 = new Problem17()

    @Unroll
    def 'Transformation number To Number Letter counts'() {
        expect:
        "With the number ${number} the Number Letters counts should be ${expectedResult}."
        println "With the number ${number} the Number Letter counts should be ${expectedResult}."
        problem17.numberToNumberLetterCounts(number) == expectedResult

        where:
        number || expectedResult
        1      || 3
        10     || 3
        11     || 6
        21     || 9
        111    || 19
        191    || 22
        1000   || 11
    }


    @Unroll
    def 'Calculation number letter counts'() {
        expect:
        "With the number ${number} the number letter counts should be ${expectedResult}."
        println "With the number ${number} the number letter counts should be ${expectedResult}."
        problem17.numberLetterCounts(number) == expectedResult

        where:
        number || expectedResult
        5      || 19
        150    || 1903
    }
}
