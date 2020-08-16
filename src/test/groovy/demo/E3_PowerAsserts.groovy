package demo

import spock.lang.Specification

class E3_PowerAsserts extends Specification {

    void 'should fail with numbers'() {
        expect:
         2 * 3 == 5 * 4
    }

    void 'should fail with maps and lists'() {
        given:
        Map data = [
                name  : 'Iván',
                age   : 37,
                childs: [
                    [name: 'Judith', age: 10], [name: 'Adriana', age: 7]
                ]
        ]

        expect:
        data.childs.name.first() == 'Adriana'
    }

    void 'careful with loop assertions, not asserting anything'() {
        expect:
        for (String fruit : ['apple', 'orange', 'straweberry'] ) {
            fruit.startsWith('a')
        }
    }

    void 'should fail with every'() {
        expect:
        ['apple', 'orange', 'straweberry'].every { String fruit -> fruit.startsWith('a') }
    }

    void 'group assertions on the same object'() {
        given:
        User user = new User('Sergio', 'del Amo')

        expect:
        user.name == 'Sergio'
        user.lastName == 'del Amo'

        and:
        with(user) {
            name == 'Sergio'
            lastName == 'del Amo'
        }
    }

}
