package jpabook.jpashop

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
internal class MemberRepositoryTest{

    @Autowired
    lateinit var memberRepository: MemberRepository

    @Test
    @Transactional
    @Rollback(false)
    fun testMember(){
        var member=  Member("memberA")
        val savedId =memberRepository.save(member)
        var findMember = memberRepository.find(savedId)
        Assertions.assertThat(findMember.id).isEqualTo(member.id)
    }

}