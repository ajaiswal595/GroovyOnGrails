package rewards

import grails.gorm.transactions.Transactional

@Transactional
class CalculationsService {

    def welcome(params) {

        def firstName = params.firstName
        def lastName = params.lastName

        "Hello $firstName $lastName welcome to learning grails"

    }
}
