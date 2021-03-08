package com.euler.problem2

import com.euler.problem2.Problem24
import spock.lang.Specification
import spock.lang.Unroll

class Problem24Test extends Specification {

    def problem24 = new Problem24()


    @Unroll
    def 'Calculate lexicographic Permutations'() {
        expect:
        "With the number ${number} the lexicographic Permutations should be ${expectedResult}."
        println "With the number ${number} the lexicographic Permutations should be ${expectedResult}."
        problem24.lexicographicPermutations(number) == expectedResult

        where:
        number || expectedResult
        699999 || "1938246570"
        899999 || "2536987410"
        900000 || "2537014689"
    }

    @Unroll
    def 'Calculate number of permutations'() {
        expect:
        "With the numberOfElements ${numberOfElements} the number of permutations should be ${expectedResult}."
        println "With the numberOfElements ${numberOfElements} the number of permutations should be ${expectedResult}."
        problem24.numberOfPermutations(numberOfElements) == expectedResult

        where:
        numberOfElements || expectedResult
        0                || 1
        1                || 1
        4                || 24
        9                || 362880
        10               || 3628800
    }

}
