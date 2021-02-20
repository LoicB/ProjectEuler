package com.euler.problem2

import com.euler.problem2.Problem21
import spock.lang.Specification
import spock.lang.Unroll

class Problem21Test extends Specification {

    def problem21 = new Problem21()

    @Unroll
    def 'Sum of amicable number'() {
        expect:
        "With the number ${number} the Sum of amicable number should be ${expectedResult}."
        println "With the number ${number} the Sum of amicable number should be ${expectedResult}."
        problem21.sumAmicableNum(number) == expectedResult

        where:
        number || expectedResult
        1000   || 504
        2000   || 2898
        5000   || 8442
    }


    @Unroll
    def 'Sum of Proper Divisors'() {
        expect:
        "At the index ${index} the Sum of Proper Divisors should be ${expectedResult}."
        println "At the index ${index} the Sum of Proper Divisors should be ${expectedResult}."
        problem21.initSumProperDivisorsList(500)[index] == expectedResult

        where:
        index | expectedResult
        220   | 284
        284   | 220
    }

}
