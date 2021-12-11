package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.CommentEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentEntityRepository extends JpaRepository<CommentEntity, Integer> {

}
