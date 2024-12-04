package com.keyin.Sem4_Final_DSA.repository;

import com.keyin.Sem4_Final_DSA.entity.TreeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TreeRepository extends JpaRepository<TreeEntity, Long> {
    }

