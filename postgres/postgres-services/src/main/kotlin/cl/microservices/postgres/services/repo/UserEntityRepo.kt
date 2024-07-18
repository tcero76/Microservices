package cl.microservices.postgres.services.repo

import cl.microservices.postgres.model.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserEntityRepo : JpaRepository<Customer,String> {

}