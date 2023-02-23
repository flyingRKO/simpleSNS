package com.fast.campus.simplesns.repository;

import com.fast.campus.simplesns.model.entity.LikeEntity;
import com.fast.campus.simplesns.model.entity.PostEntity;
import com.fast.campus.simplesns.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeEntityRepository extends JpaRepository<LikeEntity, Integer> {

    Optional<LikeEntity> findByUserAndPost(UserEntity user, PostEntity post);
}
