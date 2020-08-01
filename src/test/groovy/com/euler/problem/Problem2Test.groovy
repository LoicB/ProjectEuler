package com.euler.problem

import spock.lang.Specification
import spock.lang.Unroll

class Problem2Test extends Specification {
    def problem2 = new Problem2()

    @Unroll
    def 'Calculate find the sum of the even-valued terms below numbers with #number'() {
        expect:
        "With the number below ${number} the sum of the even-valued terms should be ${expectedResult}."
        println "With the number ${number} the sum of the even-valued terms is ${expectedResult}."
        problem2.fiboEvenSum(number) == expectedResult

        where:
        number  || expectedResult
        10      || 10
        60      || 44
        1000    || 798
        100000  || 60696
        4000000 || 4613732
    }
}
