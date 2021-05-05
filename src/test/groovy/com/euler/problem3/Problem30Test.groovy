package com.euler.problem3

import spock.lang.Specification
import spock.lang.Unroll

class Problem30Test extends Specification {

    def problem30 = new Problem30()

    @Unroll
    def 'Calculate the sum of all the numbers that can be written as the sum of fifth powers of their digits'() {
        expect:
        "With a nthPowers of ${nthPowers} the sum of fifth powers should be ${expectedResult}."
        println "With a limit of ${nthPowers} the sum of fifth powers should be ${expectedResult}."
        problem30.digitPowers(nthPowers) == expectedResult

        where:
        nthPowers || expectedResult
        2         || 0
        3         || 1301
        4         || 19316
    }

    @Unroll
    def 'Transform numbers into digits'() {
        expect:
        "With the number ${number} the list of digits should be ${expectedResult}."
        println "With the number ${number} the list of digits should be ${expectedResult}."
        problem30.numberToDigits(number) == expectedResult

        where:
        number || expectedResult
        1634   || [1, 6, 3, 4]
        8208   || [8, 2, 0, 8]
        9474   || [9, 4, 7, 4]
        54748  || [5, 4, 7, 4, 8]
    }

    @Unroll
    def 'Calculate the sum of digit power'() {
        expect:
        "With the number ${number} the sum of ${nthPowers} power of it digits should be ${expectedResult}."
        println "With the number ${number} the sum of ${nthPowers} power of it digits should be ${expectedResult}."
        problem30.sumOfDigitsPowers(number, nthPowers) == expectedResult

        where:
        number | nthPowers || expectedResult
        1634   | 4         || 1634
        8208   | 4         || 8208
        9474   | 4         || 9474
        54748  | 5         || 54748
    }
}
