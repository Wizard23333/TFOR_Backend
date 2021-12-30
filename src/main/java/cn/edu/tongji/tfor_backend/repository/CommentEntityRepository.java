package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.CommentEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CommentEntityRepository extends JpaRepository<CommentEntity, Integer> {

    @Modifying
    @Query(value =
            "with cid as (select c.content_id from comment c where :fatherID = c.father_content_id and c.father_type = 0)" +
                "delete from comment c1 where (c1.content_id) in (select content_id from cid)"
            , nativeQuery = true)
    void deleteCommentOfComment(@Param("fatherID") String fatherID);

    @Modifying
    @Query(value =
            "with cid as (select c.content_id from comment c where :fatherID = c.father_content_id and c.father_type = 1)" +
                    "delete from comment c1 where (c1.content_id) in (select content_id from cid)"
            , nativeQuery = true)
    void deleteCommentOfPost(@Param("fatherID") String fatherID);

    @Query(value = "select count(*) from comment c where c.content_id=:contentId", nativeQuery = true)
    Integer isPresent(@Param("contentId") String contentId);

    @Modifying
    @Query(value = "delete c from comment c where c.content_id=:contentId",nativeQuery = true)
    void deleteByContentId(@Param("contentId") String contentId);

    @Query(value = "select * from comment c where c.father_type=1 and c.father_content_id=:postId", nativeQuery = true)
    List<CommentEntity> getCommentOfPost(@Param("postId") String postId);
}
