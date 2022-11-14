package jpabook.jpashop

import org.springframework.stereotype.Repository
import java.lang.IllegalArgumentException
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class MemberRepository {

    @PersistenceContext
    private lateinit var em: EntityManager

    fun save (member:Member):Long{
        em.persist(member)
        return if(member.id is Long){ member.id}
        else {-1}
    }

    fun find(id: Long):Member{
        val e =em.find(Member::class.java, id)
        return if (e is Member) e
            else throw IllegalArgumentException("Such Member Not Found")

    }
}