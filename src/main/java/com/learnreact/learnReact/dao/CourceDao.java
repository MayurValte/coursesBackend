package com.learnreact.learnReact.dao;

import com.learnreact.learnReact.model.Cources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
    public interface CourceDao extends JpaRepository<Cources,Integer> {
}
