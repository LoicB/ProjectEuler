package com.euler.problem

import spock.lang.Specification
import spock.lang.Unroll

class Problem6Test extends Specification {
    def problem6 = new Problem6()

    @Unroll
    def 'Calculate sum square difference'() {
        expect:
        "With the number ${number} the sum square difference should be ${expectedResult}."
        println "With the number ${number} the sum square difference should be ${expectedResult}."
        problem6.sumSquareDifference(number) == expectedResult

        where:
        number || expectedResult
        5      || 170
        10     || 2640
        15     || 13160
        20     || 41230
    }

    @Unroll
    def 'Calculate sum of squares'() {
        expect:
        "With the number ${number} the sum of squares should be ${expectedResult}."
        println "With the number ${number} the sum of squares should be ${expectedResult}."
        problem6.sumOfSquares(number) == expectedResult

        where:
        number || expectedResult
        5      || 55
        10     || 385
        15     || 1240
        20     || 2870
    }

    @Unroll
    def 'Calculate square of sum'() {
        expect:
        "With the number ${number} the square of sum should be ${expectedResult}."
        println "With the number ${number} the square of sum should be ${expectedResult}."
        problem6.squareOfSum(number) == expectedResult

        where:
        number || expectedResult
        5      || 225
        10     || 3025
        15     || 14400
        20     || 44100
    }
}
