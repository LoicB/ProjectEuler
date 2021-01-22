package com.euler.problem1

import spock.lang.Specification
import spock.lang.Unroll

class Problem18Test extends Specification {
    def problem18 = new Problem18()
    def testTriangle = [[3, 0, 0, 0],
                        [7, 4, 0, 0],
                        [2, 4, 6, 0],
                        [8, 5, 9, 3]] as int[][]

    @Unroll
    def 'Find maximum path sum'() {
        expect:
        "With the numbers ${x} and ${y} the maximum path sum should be ${expectedResult}."
        println "With the numbers ${x} and ${y} the maximum path sum should be ${expectedResult}."
        problem18.maximumPathSumAt(x, y, testTriangle, [:]) == expectedResult

        where:
        x | y || expectedResult
        3 | 0 || 8
        3 | 1 || 5
        3 | 2 || 9
        3 | 3 || 3
        2 | 0 || 10
        2 | 1 || 13
        2 | 2 || 15
        1 | 0 || 20
        1 | 1 || 19
        0 | 0 || 23
    }


    @Unroll
    def 'Find if it has below row'() {
        expect:
        "With the numbers ${x} the below row should be ${expectedResult}."
        println "With the numbers ${x} the below row should be ${expectedResult}."
        problem18.hasBelowRow(x, testTriangle) == expectedResult

        where:
        x || expectedResult
        3 || false
        3 || false
        3 || false
        3 || false
        2 || true
        2 || true
        2 || true
        1 || true
        1 || true
        0 || true
    }
}
