package com.euler.problem2

import com.euler.problem2.Problem23
import spock.lang.Specification
import spock.lang.Unroll

class Problem23Test extends Specification {

    def problem23 = new Problem23()


    @Unroll
    def 'Calculate sum of Non Abundant Numbers'() {
        expect:
        "With the number ${number} the sum of Non Abundant Numbers should be ${expectedResult}."
        println "With the number ${number} the sum of Non Abundant Numbers should be ${expectedResult}."
        problem23.sumOfNonAbundantNumbers(number) == expectedResult

        where:
        number || expectedResult
        25     || 301
        50     || 891
        10000  || 3731004
        15000  || 4039939
        20000  || 4159710
    }

    @Unroll
    def 'Generate Abundant Numbers list'() {
        expect:
        "With the number ${number} the Abundant Numbers list should be ${expectedResult}."
        println "With the number ${number} the Abundant Numbers list should be ${expectedResult}."
        problem23.createAbundantNumbersList(number) == expectedResult

        where:
        number || expectedResult
        10     || []
        20     || [12, 18, 20]
        30     || [12, 18, 20, 24, 30]
        40     || [12, 18, 20, 24, 30, 36, 40]
        50     || [12, 18, 20, 24, 30, 36, 40, 42, 48]
    }


}
