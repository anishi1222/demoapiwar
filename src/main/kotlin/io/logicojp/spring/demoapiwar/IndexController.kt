package io.logicojp.spring.demoapiwar

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger

@Controller
class IndexController {
    val atomic: AtomicInteger = AtomicInteger(0);

    @GetMapping("/")
    fun indexGet(model: Model): String {
        model.addAttribute("data", atomic.get())
        return "index.html"
    }

    @PostMapping("/")
    fun indexPost(model: Model): String {
        atomic.incrementAndGet()
        return "redirect:/"
    }
}