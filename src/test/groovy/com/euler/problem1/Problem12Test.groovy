package com.euler.problem1

import spock.lang.Specification
import spock.lang.Unroll

class Problem12Test extends Specification {
    def problem12 = new Problem12()

    @Unroll
    def 'Calculate divisible Triangle Number'() {
        expect:
        "With the number ${number} the divisible Triangle Number should be ${expectedResult}."
        println "With the number ${number} the divisible Triangle Number should be ${expectedResult}."
        problem12.divisibleTriangleNumber(number) == expectedResult

        where:
        number || expectedResult
        5      || 28
        23     || 630
        167    || 1385280
        167    || 1385280
        374    || 17907120
    }

    @Unroll
    def 'Calculate numbers of factors'() {
        expect:
        "With the number ${number} the numbers of factors should be ${expectedResult}."
        println "With the number ${number} the numbers of factors should be ${expectedResult}."
        problem12.countFactors(number) == expectedResult

        where:
        number || expectedResult
        1      || 1
        3      || 2
        4      || 3
        6      || 4
        10     || 4
        15     || 4
        21     || 4
        28     || 6
    }
}
