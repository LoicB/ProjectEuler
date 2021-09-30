package com.euler.tools


import spock.lang.Specification
import spock.lang.Unroll

class NumberUtilsTest extends Specification {
    def numberUtils = new NumberUtils()

    @Unroll
    def "DigitsFromNumber"() {

        expect:
        "DigitsFromNumber(${number}) should return ${expectedResult}."
        println "DigitsFromNumber(${number}) should return ${expectedResult}."
        numberUtils.digitsFromNumber(number) == expectedResult

        where:
        number || expectedResult
        1      || [1]
        10     || [1, 0]
        39     || [3, 9]
        186    || [1, 8, 6]
        7254   || [7, 2, 5, 4]
        1634   || [1, 6, 3, 4]
        8208   || [8, 2, 0, 8]
        9474   || [9, 4, 7, 4]
        54748  || [5, 4, 7, 4, 8]
    }
}
