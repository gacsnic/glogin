package glogin

import glogin.data.model.Users
import spock.lang.Specification

class UsersTest extends Specification {
    def "Usert test "() {
        setup:
        def users = new Users()

        when:

        users.id=1
       users.firtName='Gustavo'
        users.lastName='Castro'
        //users.status=1

        then:
        users.id==1
        users.firtName=='Gustavo'
        users.status==0
    }
}
