package com.euler.problem2

import com.euler.problem2.Problem26
import spock.lang.Specification
import spock.lang.Unroll

class Problem26Test extends Specification {

    def problem26 = new Problem26()

    @Unroll
    def 'Calculate the longest recurring cycle'() {
        expect:
        "With a limit of ${limit} the longest recurring cycle should be ${expectedResult}."
        println "With a limit of ${limit} the longest recurring cycle should be ${expectedResult}."
        problem26.longestRecurringCycle(limit) == expectedResult

        where:
        limit || expectedResult
        700   || 659
        800   || 743
        900   || 887
    }


    @Unroll
    def 'Find cycle for given number'() {
        expect:
        "With the number ${number} the cycle should be ${expectedResult}."
        println "With the number ${number} the cycle should be ${expectedResult}."
        problem26.findRecurringCycle(number) == expectedResult

        where:
        number || expectedResult
        2      || 0
        3      || 1
        4      || 0
        5      || 0
        6      || 1
        7      || 6
        8      || 0
        9      || 1
        10     || 0
    }
}
