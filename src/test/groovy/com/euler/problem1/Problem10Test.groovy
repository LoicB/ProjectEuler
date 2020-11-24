package com.euler.problem1

import com.euler.problem1.Problem10
import spock.lang.Specification
import spock.lang.Unroll

class Problem10Test extends Specification {
    def problem10 = new Problem10()

    @Unroll
    def 'Calculate Summation of primes'() {
        expect:
        "With the number ${number} the Summation of primes should be ${expectedResult}."
        println "With the number ${number} the Summation of primes Triplet should be ${expectedResult}."
        problem10.primeSummation(number) == expectedResult

        where:
        number  || expectedResult
        10      || 17
        17      || 41
        2001    || 277050
        140759  || 873608362
    }
}
