package com.euler.problem

import spock.lang.Specification
import spock.lang.Unroll

class Problem3Test extends Specification {
    def problem3 = new Problem3()

    @Unroll
    def 'Calculate largest prime factor with #number'() {
        expect:
        "With the number ${number} the largest prime factor should be ${expectedResult}."
        println "With the number ${number} the largest prime factor should be ${expectedResult}."
        problem3.largestPrimeFactor(number) == expectedResult

        where:
        number       || expectedResult
        2            || 2
        3            || 3
        5            || 5
        7            || 7
        8            || 2
        13195        || 29
        600851475143 || 6857
    }
}
