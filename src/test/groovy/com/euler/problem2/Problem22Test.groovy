package com.euler.problem2

import com.euler.problem2.Problem22
import spock.lang.Specification
import spock.lang.Unroll

class Problem22Test extends Specification {

    def problem22 = new Problem22()

    @Unroll
    def 'Calculate name scores'() {
        expect:
        "With the array ${id} the name score should be ${expectedResult}."
        println "With the array ${id} the name score should be ${expectedResult}."
        problem22.namesScores(names) == expectedResult

        where:
        id | names                                                          || expectedResult
        0  | ['THIS', 'IS', 'ONLY', 'A', 'TEST'] as String[]                || 791
        1  | ['I', 'REPEAT', 'THIS', 'IS', 'ONLY', 'A', 'TEST'] as String[] || 1468
    }

    @Unroll
    def 'Calculate name score'() {
        expect:
        "With the name ${name} the Score should be ${expectedResult}."
        println "With the name ${name} the Score should be ${expectedResult}."
        problem22.nameScore(name, index) == expectedResult

        where:
        name    | index || expectedResult
        'COLIN' | 1     || 53
        'COLIN' | 938   || 49714
    }

}
