package demo.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "hello world");
        return "helloworld";
    }

    @GetMapping("/article")
    public String getArticle(Model model) {

        List<Article> articles = new LinkedList<>();
        articles.add(new Article("The biy guy", LocalDateTime.now(), "Was just a small guy", "anonymous"));
        articles.add(new Article("The biy guy", LocalDateTime.now(), "Was just a small guy", "anonymous"));
        articles.add(new Article("The biy guy", LocalDateTime.now(), "Was just a small guy", "anonymous"));
        articles.add(new Article("The biy guy", LocalDateTime.now(), "Was just a small guy", "anonymous"));
        articles.add(new Article("The biy guy", LocalDateTime.now(), "Was just a small guy", "anonymous"));
        articles.add(new Article("The biy guy", LocalDateTime.now(), "Was just a small guy", "anonymous"));
        model.addAttribute("articles", articles);
        return "article";
    }
}
