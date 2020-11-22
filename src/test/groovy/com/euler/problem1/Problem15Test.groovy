package com.euler.problem1

import spock.lang.Specification
import spock.lang.Unroll

class Problem15Test extends Specification {
    def problem15 = new Problem15()

    @Unroll
    def 'Calculate binomial coefficient'() {
        expect:
        "With the numbers ${nb1} and ${nb2} the binomial coefficient should be ${expectedResult}."
        println "With numbers ${nb1} and ${nb2} the binomial coefficient should be ${expectedResult}."
        problem15.binomial(nb1, nb2) == expectedResult

        where:
        nb1 | nb2 || expectedResult
        2   | 2   || 1
        4   | 2   || 6
        10  | 7   || 120
    }


    @Unroll
    def 'Calculate factorial'() {
        expect:
        "With the number ${number} the factorial should be ${expectedResult}."
        println "With the number ${number} the factorial should be ${expectedResult}."
        problem15.factorial(number) == expectedResult

        where:
        number || expectedResult
        0      || 1
        1      || 1
        2      || 2
        4      || 24
    }

    @Unroll
    def 'Calculate number of lattice paths'() {
        expect:
        "With the number ${number} the number of lattice paths should be ${expectedResult}."
        println "With the number ${number} the number of lattice paths should be ${expectedResult}."
        problem15.latticePaths(number) == expectedResult

        where:
        number || expectedResult
        4      || 70
        9      || 48620
    }
}
