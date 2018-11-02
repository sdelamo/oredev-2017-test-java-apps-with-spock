package demo

import spock.lang.Specification

abstract class SuperSpec extends Specification {
    def setupSpec() {
        println "> super setupSpec"
    }

    def cleanupSpec() {
        println "> super cleanupSpec"
    }

    def setup() {
        println "--> super setup"
    }

    def cleanup() {
        println "--> super cleanup"
    }
}