package com.euler.problem1

import spock.lang.Specification
import spock.lang.Unroll

class Problem19Test extends Specification {
    def problem19 = new Problem19()

    @Unroll
    def 'Find maximum path sum'() {
        expect:
        "With the years ${firstYear} and ${lastYear} the number of sundays should be ${expectedResult}."
        println "With the years ${firstYear} and ${lastYear} the number of sundays should be ${expectedResult}."
        problem19.countingSundays(firstYear, lastYear) == expectedResult

        where:
        firstYear | lastYear || expectedResult
        1943      | 1946     || 6
        1995      | 2000     || 10
    }

}
