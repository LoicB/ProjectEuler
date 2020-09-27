package com.euler.problem

import spock.lang.Specification
import spock.lang.Unroll

class Problem8Test extends Specification {
    def problem8 = new Problem8()

    @Unroll
    def 'Calculate nth prime'() {
        expect:
        "With the number ${number} the largest product should be ${expectedResult}."
        println "With the number ${number} the largest product should be ${expectedResult}."
        problem8.largestProductInASeries(number) == expectedResult

        where:
        number || expectedResult
        4      || 5832
    }


    @Unroll
    def 'Calculate product of adjacent digits'() {
        expect:
        "With the number ${number} the product of adjacent digits should be ${expectedResult}."
        println "With the number ${number} the product of adjacent digits should be ${expectedResult}."
        println 9 * 7 * 8 * 1 * 7 * 9 * 7 * 7 * 8 * 4 * 6 * 1 * 7
        problem8.productAt(number, numberOfDigits) == expectedResult

        where:
        number | numberOfDigits || expectedResult
        0      | 4              || 126
        0      | 5              || 882
        0      | 13             || 5000940
        615    | 4              || 5832
        615    | 13             || 0


    }
}
