package com.euler.problem

import spock.lang.Specification
import spock.lang.Unroll

class Problem1Test extends Specification {
    def problem1 = new Problem1()

    @Unroll
    def 'Calculate with #number'() {
        expect:
        "With the number ${number} the sum of these multiples should be ${expectedResult}."
        println "With the number ${number} the sum of these multiples is ${expectedResult}."
        problem1.multiplesOf3and5(number) == expectedResult

        where:
        number || expectedResult
        10     || 23
        49     || 543
        1000   || 233168
        8456   || 16687353
        19564  || 89301183
    }
}
