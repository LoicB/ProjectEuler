package com.euler.problem

import spock.lang.Specification
import spock.lang.Unroll

class Problem4Test extends Specification {
    def problem4 = new Problem4()

    @Unroll
    def 'Test is palendrome method'() {
        expect:
        problem4.isPalindrome(number) == expectedResult

        where:
        number || expectedResult
        2      || true
        10     || false
        11     || true
        101    || true
        111    || true
        2345   || false
        2332   || true
    }


    @Unroll
    def 'Test reversing digits method'() {
        expect:
        "With the number ${number} the reversed digits number should be ${expectedResult}."
        println "With the number ${number} the reversed digits number should be ${expectedResult}."
        problem4.reverseDigits(number) == expectedResult

        where:
        number || expectedResult
        2      || 2
        10     || 1
        11     || 11
        101    || 101
        111    || 111
        2345   || 5432
        2332   || 2332
    }
}
