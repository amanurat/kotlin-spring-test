package de.kotlin.test

import org.hibernate.validator.constraints.NotEmpty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data public class TestEntity(
        @Id @GeneratedValue val id: Long? = null,
        @NotEmpty val name: String? = null
)