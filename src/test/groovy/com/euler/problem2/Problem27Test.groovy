package com.euler.problem2

import com.euler.problem2.Problem27
import spock.lang.Specification
import spock.lang.Unroll

class Problem27Test extends Specification {

    def problem27 = new Problem27()

    @Unroll
    def 'Calculate the product of the coefficient'() {
        expect:
        "With a limit of ${limit} the product of the coefficient should be ${expectedResult}."
        println "With a limit of ${limit} the product of the coefficient should be ${expectedResult}."
        problem27.quadraticPrimes(limit) == expectedResult

        where:
        limit || expectedResult
        200   || -4925
        500   || -18901
        800   || -43835
    }

}
