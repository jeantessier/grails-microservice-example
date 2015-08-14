package springpack.model

import grails.rest.*

@Resource(uri="/users", formats=[ "json" ])
class User {

    String username
    String email

    static mapping = {
        version false
    }

}
