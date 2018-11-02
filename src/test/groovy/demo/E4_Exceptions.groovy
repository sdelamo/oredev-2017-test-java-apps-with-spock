package demo

import spock.lang.Specification

class E4_Exceptions extends Specification {

    void 'should throw an exception'() {
        when:
        Long.valueOf("foo")

        then:
        thrown NumberFormatException
    }

    void 'exception must be thrown in when block'() {
        given:
        Long.valueOf("foo")

        when:
        String hello = "hello"

        then:
        thrown NumberFormatException
    }
}
