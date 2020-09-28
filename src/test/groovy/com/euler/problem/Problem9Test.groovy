package com.euler.problem

import spock.lang.Specification
import spock.lang.Unroll


class Problem9Test extends Specification {
    def problem9 = new Problem9()

    @Unroll
    def 'Calculate special Pythagorean Triplet'() {
        expect:
        "With the number ${number} the special Pythagorean Triplet should be ${expectedResult}."
        println "With the number ${number} the special Pythagorean Triplet should be ${expectedResult}."
        problem9.specialPythagoreanTriplet(number) == expectedResult

        where:
        number || expectedResult
        24     || 480
        120    || 49920
    }

    @Unroll
    def 'Check digit is Pythagorean triplet'() {
        expect:
        "Are the number ${a}, ${b} and ${c} Pythagorean triplet? ${expectedResult}."
        println "Are the number ${a}, ${b} and ${c} Pythagorean triplet? ${expectedResult}."
        problem9.isPythagoreanTriplet(a, b, c) == expectedResult

        where:
        a  | b  | c  || expectedResult
        3  | 4  | 5  || true
        3  | 4  | 6  || false
        20 | 21 | 29 || true
        20 | 22 | 29 || false
        65 | 72 | 97 || true
        65 | 72 | 98 || false
    }
}

