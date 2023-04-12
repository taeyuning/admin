package com.example.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;
import java.util.ArrayList;

@Controller
public class MainController {

  @RequestMapping("/")
  public String index(){
    return "index";
  }
  @RequestMapping("/login")
  public String login(){

    return "login";
  }
  @RequestMapping("/register")
  public String register(){
    return "register";
  }
  @RequestMapping("/charts")
  public String charts(Model model){
   model.addAttribute("center", "charts");
    return "index";
  }
  @RequestMapping("/buttons")
  public String buttons(Model model){
    model.addAttribute("center", "buttons");
    return "buttons";
  }

  @RequestMapping("/cards")
  public String cards(Model model){
    model.addAttribute("center", "cards");
    return "cards";
  }

  @RequestMapping("/tables")
  public String tables(Model model){
    ArrayList<AdminDTO> list = new ArrayList<>();

    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));
    list.add(new AdminDTO("id01","pwd01","james",0,10000));

    model.addAttribute("list", list);
    model.addAttribute("center", "tables");
    return "index";
  }
  @RequestMapping("/search")
  public String search(Model model){
    ArrayList<AdminDTO> list = new ArrayList<>();
    list.add(new AdminDTO("id01","pwd01","검",0,10000));
    list.add(new AdminDTO("id01","pwd01","색",0,10000));
    list.add(new AdminDTO("id01","pwd01","결",0,10000));
    list.add(new AdminDTO("id01","pwd01","과",0,10000));

    //search를 누르면,,,받아와서,,,뭐드라,,,
    model.addAttribute("list", list);
    model.addAttribute("center", "tables");
    return "index";
  }

}
