package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.PostEntity;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

public interface PostEntityRepository extends JpaRepository<PostEntity, Integer> {

    @Transactional
    @Modifying
    @Query(value = "update post set like_num=like_num+1 where content_id=:cid",nativeQuery = true)
    void addLikeNum(@Param("cid") Integer cid);

    PostEntity findByContentId(Integer contentId);

    // 根据时间区间和likenum查询前50条
    List<PostEntity> findTop50ByLastEditTimeBetweenOrderByLikeNumDesc(Timestamp t1, Timestamp t2);

//    PostEntity findTopByLastEditTimeBetweenOrderByLikeNumDesc(Timestamp t1, Timestamp t2);

    List<PostEntity> findByPostTitleContainingOrTextContaining(String keyword1, String keyword2);


}
