package com.euler.problem

import spock.lang.Specification
import spock.lang.Unroll

class Problem7Test extends Specification {
    def problem7 = new Problem7()

    @Unroll
    def 'Calculate nth prime'() {
        expect:
        "With the number ${number} the nth prime should be ${expectedResult}."
        println "With the number ${number} the nth prime should be ${expectedResult}."
        problem7.nthPrime(number) == expectedResult

        where:
        number || expectedResult
        6      || 13
        10     || 29
        100    || 541
        1000   || 7919
    }
}
