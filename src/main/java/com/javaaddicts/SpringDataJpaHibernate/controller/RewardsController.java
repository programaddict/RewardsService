package com.javaaddicts.SpringDataJpaHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaaddicts.SpringDataJpaHibernate.model.Response;
import com.javaaddicts.SpringDataJpaHibernate.service.RewardsService;

@RestController
@RequestMapping("/rewards")
public class RewardsController {
	
	@Autowired
	RewardsService rewardsService;

	@GetMapping
	public List<Response> getRewardsData() {
		return rewardsService.getRewardsData();
	}
	
	@GetMapping("/{month}")
	public List<Response> getRewardsDataByMonth(@PathVariable Integer month){
		List<Response> monthResponse = rewardsService.getRewardsDataByMonth(month);
		return monthResponse;
	}
}
