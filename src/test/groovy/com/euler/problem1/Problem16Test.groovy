package com.euler.problem1

import spock.lang.Specification
import spock.lang.Unroll

class Problem16Test extends Specification {
    def problem16 = new Problem16()


    @Unroll
    def 'Calculate sum of power digits'() {
        expect:
        "With the number ${number} the sum of power digits should be ${expectedResult}."
        println "With the number ${number} the sum of power digits should be ${expectedResult}."
        problem16.powerDigitSum(number) == expectedResult

        where:
        number || expectedResult
        15     || 26
        128    || 166
    }

}
