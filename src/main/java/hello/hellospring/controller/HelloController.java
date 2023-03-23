package hello.hellospring.controller;

import org.springframework.stereotype.Controller; //spring은 이거 해줘야 함
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
//    html에서 Get api 쏘는것과 같은 get. /hello url 을 받은거임
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!???");
        return "hello";
        //resources 에 있는 hello.html 을 실행시키라는 소리임
    }
}
