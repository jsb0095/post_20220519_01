package com.post.ex.repository;

import com.post.ex.DTO.PostDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepository {
    @Autowired
    SqlSessionTemplate sql;
    public int save(PostDTO postDTO) {
        int saveResult = sql.insert("Post.save",postDTO);
        return saveResult;
    }

    public PostDTO loginCheck(PostDTO postDTO) {
        PostDTO result= sql.selectOne("Post.loginCheck",postDTO);
                return result;
    }

    public List<PostDTO> findAll() {
      return   sql.selectList("Post.findAll");
    }

    public PostDTO findById(Long id) {
        PostDTO postDTO = sql.selectOne("Post.findById",id);
        return  postDTO;
    }

    public int dropId(Long id) {
        int drop= sql.delete("Post.dropId",id);

        return drop;
    }
}
