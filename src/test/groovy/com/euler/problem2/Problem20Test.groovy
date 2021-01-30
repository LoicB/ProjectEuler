package com.euler.problem2

import spock.lang.Specification
import spock.lang.Unroll

class Problem20Test extends Specification {
    def problem20 = new Problem20()


    @Unroll
    def 'Calculate sum of the factorial digits'() {
        expect:
        "With the number ${number} the sum of the factorial digits should be ${expectedResult}."
        println "With the number ${number} the sum of the factorial digits should be ${expectedResult}."
        problem20.sumFactorialDigits(number) == expectedResult

        where:
        number || expectedResult
        10     || 27
        25     || 72
        50     || 216
        75     || 432
    }


    @Unroll
    def 'Calculate the factorial'() {
        expect:
        "With the number ${number} the factorial should be ${expectedResult}."
        println "With the number ${number} the factorial should be ${expectedResult}."
        problem20.factorial(number) == expectedResult

        where:
        number || expectedResult
        0      || 1G
        1      || 1G
        10     || 3_628_800G
        15     || 1_307_674_368_000G
    }

    @Unroll
    def 'Calculate sum of the digits'() {
        expect:
        "With the number ${number} the sum of the digits should be ${expectedResult}."
        println "With the number ${number} the sum of the digits should be ${expectedResult}."
        problem20.sumDigits(number) == expectedResult

        where:
        number   || expectedResult
        10G      || 1
        25G      || 7
        50G      || 5
        75G      || 12
        432G     || 9
        3628800G || 27
    }

}
