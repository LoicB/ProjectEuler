package com.euler.problem2

import spock.lang.Specification
import spock.lang.Unroll

class Problem28Test extends Specification {

    def problem28 = new Problem28()

    @Unroll
    def 'Calculate the sum of the spiral diagonal'() {
        expect:
        "With a squareSize of ${squareSize} the sum of the spiral diagonal should be ${expectedResult}."
        println "With a squareSize of ${squareSize} the sum of the spiral diagonal should be ${expectedResult}."
        problem28.spiralDiagonalSum(squareSize) == expectedResult

        where:
        squareSize || expectedResult
        5          || 101
        101        || 692101
        303        || 18591725
        505        || 85986601
    }

}
