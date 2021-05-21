package com.euler.problem3

import spock.lang.Specification
import spock.lang.Unroll

class Problem31Test extends Specification {

    def problem31 = new Problem31()

    @Unroll
    def 'Calculate how many different ways a sum be made using any number of coins'() {
        expect:
        "With a sum of ${sum} the number of different ways should be ${expectedResult}."
        println "With a sum of ${sum} the number of different ways should be ${expectedResult}."
        problem31.coinSums(sum) == expectedResult

        where:
        sum || expectedResult
        2   || 2
        3   || 2
        5   || 4
        50  || 451
        100 || 4563
        150 || 21873
    }

}
