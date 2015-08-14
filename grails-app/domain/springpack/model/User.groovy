package springpack.model

import grails.rest.*

@Resource(uri='/users', formats=['json', 'xml'])
class User {

    String username
    String email

}
