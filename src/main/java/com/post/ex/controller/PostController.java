package com.post.ex.controller;

import com.post.ex.DTO.PostDTO;
import com.post.ex.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PostController {
    @Autowired private PostService postService;
    @GetMapping("/save")
    public String save(){
        return "save";
    }
    @PostMapping("save-form")
    public String saveForm(@ModelAttribute PostDTO postDTO){
        boolean saveResult  = postService.save(postDTO);
        if(saveResult){
            return "login";
        }
        return "save";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/loginCheck")
    public String loginCheck(@ModelAttribute PostDTO postDTO, Model model, HttpSession session){
        PostDTO result = postService.loginCheck(postDTO);
        model.addAttribute("result1", result);
        session.setAttribute("result2",result.getPostId());
        session.setAttribute("result3",result.getId());
        if(result!=null){
            return "loginresult";
        }else {
            return "login";}

    }
    @GetMapping("/findAll")
    public String findAll(@ModelAttribute PostDTO postDTO, Model model ){
        List<PostDTO> postDTOList = postService.findAll();
        model.addAttribute(postDTOList);

        return "findAll";
    }
    @GetMapping("/detail")
    public String findById(@RequestParam("id")Long id ,Model model){
        PostDTO postDTO =postService.findById(id);
        model.addAttribute("Post",postDTO);
        return "findById";
    }
    @GetMapping("/detailDrop")
    public String dropId(@RequestParam("id")Long id){
        boolean drop =postService.dropId(id);
        if(drop){

            //redirect: ??????????????? ??????????????? ?????? ???????????? ????????? ??????
          //redirect: ???????????? findAll ???????????? ????????? ????????? ????????? ??????
            return "redirect:/findAll";

        }else{ return "dropId";}


    }
    @GetMapping("/update-form")
    public String updateForm(HttpSession session,Model model){
        //???????????? ??? ????????? ????????? ????????? id, memberId??? ????????????
        //????????? ????????? ?????? id??? ????????????
      Long updateId = (Long) session.getAttribute("result3");
      PostDTO postDTO = postService.findById(updateId);
      model.addAttribute("updatePost",postDTO);
        System.out.println(postDTO);
        System.out.println(updateId);
      return "update";
    }
    @PostMapping("/update")
    public String  update(@ModelAttribute PostDTO postDTO){
        boolean updateResult = postService.update(postDTO);
        if(updateResult){
            //?????? ????????? ????????????
            return "redirect:/detail?id="+ postDTO.getId();
        }else{
            return "update-fail";
        }
    }
}
