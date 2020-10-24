package com.euler.problem1

import com.euler.problem1.Problem11
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Problem11Test extends Specification {
    def problem11 = new Problem11()
    @Shared
    int[][] testGrid = [
            [40, 17, 81, 18, 57],
            [74, 4, 36, 16, 29],
            [36, 42, 69, 73, 45],
            [51, 54, 69, 16, 92],
            [7, 97, 57, 32, 16]
    ]

    @Unroll
    def 'Calculate greatest product of four adjacent numbers'() {
        expect:
        "Largest product in a grid ${expectedResult}."
        println "Largest product in a grid ${expectedResult}."
        problem11.largestGridProduct(number) == expectedResult

        where:
        number   || expectedResult
        testGrid || 14169081
    }


    @Unroll
    def 'Calculate greatest product of four adjacent Horizontal numbers'() {
        expect:
        "Largest product in a grid ${expectedResult}."
        println "Largest product in a grid ${expectedResult}."
        problem11.largestHorizontalProductAt(number, x, y) == expectedResult

        where:
        number   | x | y || expectedResult
        testGrid | 0 | 0 || 991440
        testGrid | 4 | 0 || 1238496
        testGrid | 0 | 4 || 0
        testGrid | 4 | 4 || 0
    }


    @Unroll
    def 'Calculate greatest product of four adjacent Vertical numbers'() {
        expect:
        "Largest product in a grid ${expectedResult}."
        println "Largest product in a grid ${expectedResult}."
        problem11.largestVerticalProductAt(number, x, y) == expectedResult

        where:
        number   | x | y || expectedResult
        testGrid | 0 | 0 || 5434560
        testGrid | 4 | 0 || 0
        testGrid | 0 | 4 || 6843420
        testGrid | 4 | 4 || 0
    }


    @Unroll
    def 'Calculate greatest product of four adjacent Diagonal Up numbers'() {
        expect:
        "Largest product in a grid ${expectedResult}."
        println "Largest product in a grid ${expectedResult}."
        problem11.largestDiagonalUpProductAt(number, x, y) == expectedResult

        where:
        number   | x | y || expectedResult
        testGrid | 0 | 0 || 176640
        testGrid | 4 | 0 || 0
        testGrid | 0 | 4 || 0
        testGrid | 4 | 4 || 0
    }


    @Unroll
    def 'Calculate greatest product of four adjacent Diagonal Down numbers'() {
        expect:
        "Largest product in a grid ${expectedResult}."
        println "Largest product in a grid ${expectedResult}."
        problem11.largestDiagonalDownProductAt(number, x, y) == expectedResult

        where:
        number   | x | y || expectedResult
        testGrid | 0 | 0 || 0
        testGrid | 4 | 0 || 417312
        testGrid | 0 | 4 || 0
        testGrid | 4 | 4 || 0
    }
}
