package demo

class E14_SubSpec extends SuperSpec {
    def setupSpec() {
        println "-> sub setupSpec"
    }

    def cleanupSpec() {
        println "-> sub cleanupSpec"
    }

    def setup() {
        println "---> sub setup"
    }

    def cleanup() {
        println "---> sub cleanup"
    }

    def "feature method 1"() {
        println "----> feature method 1"
        expect:
        2 * 2 == 4
    }

    def "feature method 2"() {
        println "----> feature method 2"
        expect:
        3 * 2 == 6
    }
}
