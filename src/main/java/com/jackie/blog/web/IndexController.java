package com.jackie.blog.web;


import com.jackie.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@Controller
public class IndexController {

//    @GetMapping("/admin")
    public String index() {
        return "admin/blog-input";
    }

}
