package tv.comnata.mainservice.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import tv.comnata.mainservice.entities.User
import tv.comnata.mainservice.repositories.UserRepository


@Service
class UserService(
    @Autowired
    private var repository: UserRepository
) {
    fun getUser(): User {
        val user = repository.findByUsername("Vakosta")
        return user
    }
}