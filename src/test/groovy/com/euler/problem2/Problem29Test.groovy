package com.euler.problem2

import com.euler.problem2.Problem29
import spock.lang.Specification
import spock.lang.Unroll

class Problem29Test extends Specification {

    def problem29 = new Problem29()

    @Unroll
    def 'Calculate the number of distinct powers'() {
        expect:
        "With a limit of ${limit} the number of distinct powers should be ${expectedResult}."
        println "With a limit of ${limit} the number of distinct powers should be ${expectedResult}."
        problem29.distinctPowers(limit) == expectedResult

        where:
        limit || expectedResult
        15    || 177
        20    || 324
        25    || 519
        30    || 755
    }
}
