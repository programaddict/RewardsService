package com.javaaddicts.SpringDataJpaHibernate.repository;

import org.springframework.stereotype.Repository;

import com.javaaddicts.SpringDataJpaHibernate.entity.Rewards;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface RewardsRepository extends JpaRepository<Rewards, Integer>{
	
	@Query(value="select e from Rewards e where month(e.date) = ?1")
	List<Rewards> getRewardsDataByMonth(Integer month);
}
