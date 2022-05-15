package com.spring.practice.prototype;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prototype/test")
@RequiredArgsConstructor
public class PrototypeTestController {
    
    private final ApplicationContext context;
    
    @GetMapping
    public String test() {
        TestInterface test1 = context.getBean(TestInterface.class);
        TestInterface test2 = context.getBean(TestInterface.class);
        
        // prototype 이므로, 매번 다른 객체를 가져오게 된다.
        System.out.println(test1 == test2); // false
        return "prototype test";
    }
}
