package controller;

import model.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryServiceImpl;

import java.util.List;

@Controller
public class DictionaryController {
    private DictionaryServiceImpl dictionaryService = new DictionaryServiceImpl();

    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @PostMapping("/result")
    public String convertToVietnamese(@RequestParam String anh, Model model) {
        List<Dictionary> dictionaries = this.dictionaryService.findAll();
        for (int i = 0; i < dictionaries.size(); i++){
            if (anh.equalsIgnoreCase(dictionaries.get(i).getEn())){
                model.addAttribute("word", dictionaries.get(i).getVi());
                model.addAttribute("key",anh);
                return "result";
            }
        }
        return "result";
    }
}
