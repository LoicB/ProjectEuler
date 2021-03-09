package com.euler.com.euler.tools


import com.euler.tools.PrimeUtils
import spock.lang.Specification
import spock.lang.Unroll

class PrimeUtilsTest extends Specification {

    @Unroll
    def 'Determinate if number is prime'() {
        expect:
        "With ${number} the result should be ${expectedResult}."
        println "With ${number} the result should be ${expectedResult}."
        PrimeUtils.isPrime(number) == expectedResult

        where:
        number || expectedResult
        1      || false
        2      || true
        3      || true
        4      || false
        5      || true
    }
}
