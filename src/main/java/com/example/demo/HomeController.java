package com.example.demo;

@Controller
public class HomeController {
    @GetMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song",new Song());
    }
    @PostMapping("/songform")
    public String loadFromPage(Model model){
        model.addAttribute
    }

}
