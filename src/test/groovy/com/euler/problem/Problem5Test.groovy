package com.euler.problem

import spock.lang.Specification
import spock.lang.Unroll

class Problem5Test extends Specification {
    def problem5 = new Problem5()

    @Unroll
    def 'Calculate Smallest multiple #number'() {
        expect:
        "With the number ${number} the smallest multiple should be ${expectedResult}."
        println "With the number ${number} the smallest multiple should be ${expectedResult}."
        problem5.smallestMultiple(number) == expectedResult

        where:
        number || expectedResult
        5      || 60
        7      || 420
        10     || 2520
        13     || 360360
    }


    @Unroll
    def 'Test generate divisors'() {
        expect:
        "From ${from} to ${to} the divisors should be ${expectedResult}."
        println "From ${from} to ${to} the divisors should be ${expectedResult}."
        problem5.generateDivisors(from, to) == expectedResult

        where:
        from | to || expectedResult
        2    | 5  || [2, 3, 4, 5] as int[]
        2    | 7  || [2, 3, 4, 5, 6, 7] as int[]
        8    | 10 || [8, 9, 10] as int[]
        10   | 13 || [10, 11, 12, 13] as int[]
    }


    @Unroll
    def 'Test applying multiple to future number'() {
        expect:
        "With the multiple at ${index} the adjusted divisors be ${expectedResult}."
        println "With the multiple at ${index} the adjusted divisors be ${expectedResult}."
        problem5.applyMultipleToFutureNumber(index, divisors)
        divisors == expectedResult

        where:
        index | divisors                    || expectedResult
        0     | [2, 3, 4, 5] as int[]       || [2, 3, 2, 5] as int[]
        0     | [2, 3, 4, 5, 7, 8] as int[] || [2, 3, 2, 5, 7, 4] as int[]
        2     | [2, 3, 4, 5, 7, 8] as int[] || [2, 3, 4, 5, 7, 2] as int[]

    }
}
