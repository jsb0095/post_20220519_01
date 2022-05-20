package com.post.ex.service;

import com.post.ex.DTO.PostDTO;
import com.post.ex.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired private PostRepository postRepository;
    public boolean save(PostDTO postDTO) {
       int saveResult = postRepository.save(postDTO);
       if(saveResult>0){
           return true;
       }else{
           return false;
       }
    }

    public PostDTO loginCheck(PostDTO postDTO) {
        PostDTO result =  postRepository.loginCheck(postDTO);
        return  result;
    }

    public List<PostDTO> findAll() {
        List<PostDTO> postDTOList = postRepository.findAll();
        return postDTOList;
    }

    public PostDTO findById(Long id) {
        PostDTO postDTO= postRepository.findById(id);
        return postDTO;
    }

    public boolean dropId(Long id) {
        int drop = postRepository.dropId(id);
        if(drop>0){
            return  true;
        }
        return false;
    }

    public boolean update(PostDTO postDTO) {
       int updateResult = postRepository.update(postDTO);
       if(updateResult>0){
           return true;
       }else{
           return false;
       }
    }
}
