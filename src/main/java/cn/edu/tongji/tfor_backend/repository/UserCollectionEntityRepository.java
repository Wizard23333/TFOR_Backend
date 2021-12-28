package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.UserCollectionEntity;
import cn.edu.tongji.tfor_backend.model.UserCollectionEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface UserCollectionEntityRepository extends JpaRepository<UserCollectionEntity, UserCollectionEntityPK> {

    @Transactional
    @Modifying
    @Query(value = "delete from user_collection where user_id=:uid and content_id=:cid",nativeQuery = true)
    void deleteByUidAndCid(@Param("uid") int uid, @Param("cid") int cid);

    @Query("select contentId from UserCollectionEntity where userId = :userId")
    List<Integer> findContentIdByUserId(@Param("userId") Integer userId);
}