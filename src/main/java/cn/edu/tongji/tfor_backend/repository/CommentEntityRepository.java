package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.CommentEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CommentEntityRepository extends JpaRepository<CommentEntity, Integer> {

    @Modifying
    @Query(value =
            "with cid as (select c.content_id from comment c where :fatherID = c.father_content_id and c.father_type = 0)" +
                "delete from comment c1 where (c1.content_id) in (select content_id from cid)"
            , nativeQuery = true)
    void deleteCommentOfComment(@Param("fatherID") int fatherID);

    @Modifying
    @Query(value =
            "with cid as (select c.content_id from comment c where :fatherID = c.father_content_id and c.father_type = 1)" +
                    "delete from comment c1 where (c1.content_id) in (select content_id from cid)"
            , nativeQuery = true)
    void deleteCommentOfPost(@Param("fatherID") int fatherID);
}