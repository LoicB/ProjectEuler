package com.euler.problem1


import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class Problem13Test extends Specification {
    def problem13 = new Problem13()
    @Shared
    String[] testNums = [
            '37107287533902102798797998220837590246510135740250',
            '46376937677490009712648124896970078050417018260538'
    ]

    @Unroll
    def 'Test calculation of the first ten digits of a large sum '() {
        expect:
        "The sum shoudl be ${expectedResult}."
        println "The sum shoudl be ${expectedResult}."
        problem13.largeSum(testNums) == expectedResult

        where:
        expectedResult | _
        8348422521     | _
    }

}
