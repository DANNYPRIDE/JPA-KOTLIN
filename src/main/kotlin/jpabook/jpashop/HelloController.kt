package jpabook.jpashop

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {
    @GetMapping("hello")
    fun hello(model: Model):String{ // model은 view에 값을 넘길 수 있는 자료구조
        model.addAttribute("data", "hello!!!")
        return "hello" //.html은 생략
    }
}