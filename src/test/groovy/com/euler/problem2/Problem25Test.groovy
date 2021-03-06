package com.euler.problem2

import com.euler.problem2.Problem25
import spock.lang.Specification
import spock.lang.Unroll

class Problem25Test extends Specification {

    def problem25 = new Problem25()

    @Unroll
    def 'Calculate index with number of digits'() {
        expect:
        "With the number of digits ${numberOfDigits} the index should be ${expectedResult}."
        println "With the array ${numberOfDigits} the name score should be ${expectedResult}."
        problem25.indexDigitFibonacci(numberOfDigits) == expectedResult

        where:
        numberOfDigits || expectedResult
        5              || 21
        10             || 45
        15             || 69
        20             || 93
    }
}
