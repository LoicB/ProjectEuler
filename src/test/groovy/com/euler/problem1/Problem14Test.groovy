package com.euler.problem1

import spock.lang.Specification
import spock.lang.Unroll

class Problem14Test extends Specification {
    def problem14 = new Problem14()

    @Unroll
    def 'Calculate Collatz Next Value'() {
        expect:
        "With the number ${number} the Collatz Next Value should be ${expectedResult}."
        println "With the number ${number} the Collatz Next Value should be ${expectedResult}."
        problem14.collatzNextValue(number) == expectedResult

        where:
        number || expectedResult
        13     || 40
        40     || 20
        20     || 10
        10     || 5
        5      || 16
        16     || 8
        8      || 4
        4      || 2
        2      || 1
    }


    @Unroll
    def 'Calculate Collatz Sequence length'() {
        expect:
        "With the number ${number} the Collatz  Sequence length should be ${expectedResult}."
        println "With the number ${number} the Collatz  Sequence length should be ${expectedResult}."
        problem14.collatzSequenceLength(number) == expectedResult

        where:
        number || expectedResult
        13     || 10
        40     || 9
        20     || 8
        10     || 7
        5      || 6
        16     || 5
        8      || 4
        4      || 3
        2      || 2
        1      || 1
    }


    @Unroll
    def 'Calculate longest Collatz sequence'() {
        expect:
        "With the number ${number} the longest Collatz sequence should be ${expectedResult}."
        println "With the number ${number} the longest Collatz sequence should be ${expectedResult}."
        problem14.longestCollatzSequence(number) == expectedResult

        where:
        number || expectedResult
        14     || 9
        5847   || 3711
        46500  || 35655
        54512  || 52527
        100000 || 77031
    }
}
