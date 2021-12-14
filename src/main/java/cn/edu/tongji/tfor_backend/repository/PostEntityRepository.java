package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.PostEntity;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostEntityRepository extends JpaRepository<PostEntity, Integer> {

    PostEntity findByContentId(Integer contentId);
}
