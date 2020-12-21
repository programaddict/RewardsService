package com.javaaddicts.SpringDataJpaHibernate.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaaddicts.SpringDataJpaHibernate.entity.Rewards;
import com.javaaddicts.SpringDataJpaHibernate.model.Response;
import com.javaaddicts.SpringDataJpaHibernate.repository.RewardsRepository;

@Service
public class RewardsService {
	
	@Autowired
	RewardsRepository rewardsRepository;
	
	public List<Response> getRewardsData() {
		List<Rewards> rewardsList = rewardsRepository.findAll();
		List<Response> finalResponse = calculateRewards(rewardsList);
		return finalResponse;
	}

	public List<Response> getRewardsDataByMonth(Integer month) {
		List<Rewards> rewardsByMonth = rewardsRepository.getRewardsDataByMonth(month);
		List<Response> finalResponseByMonth = calculateRewards(rewardsByMonth);
		
		return finalResponseByMonth;
	}
	
	public List<Response> calculateRewards(List<Rewards> rewardsByMonth) {
		
		Map<String, Integer> map = new HashMap<>();
		List<Response> finalResponseByMonth = new CopyOnWriteArrayList<>();
		List<String> accountIds = new ArrayList<>();
		
		for(Rewards e : rewardsByMonth) {
			int count=0;
			Integer transactionAmount = e.getTransactionAmount();
			
			if(map.containsKey(e.getAccountId())) {

				//calculate the transaction amount for the existing user
				count = map.get(e.getAccountId());
				if(transactionAmount > 100) {
					count = count + ((transactionAmount - 100) * 2) + 50;
				}else if(transactionAmount > 50 && transactionAmount <= 100){
					count = count + (transactionAmount - 50);
				}
				map.put(e.getAccountId(), count);
			}else {
				
				//calculate the transaction amount
				if(transactionAmount > 100) {
					count = ((transactionAmount - 100) * 2) + 50;
				}else if(transactionAmount > 50 && transactionAmount <= 100){
					count = count + (transactionAmount - 50);
				}
				map.put(e.getAccountId(), count);
			}
		}
		
		//build response object
		for(Rewards e: rewardsByMonth) {
			Response response= new Response();
			if(!finalResponseByMonth.isEmpty()) {
				for(Response resp : finalResponseByMonth) {
					if(!accountIds.contains(e.getAccountId())) {
						response.setAccountId(e.getAccountId());
						response.setFirstName(e.getFirstName());
						response.setLastName(e.getLastName());
						response.setRewards(map.get(e.getAccountId()));
						finalResponseByMonth.add(response);
						accountIds.add(e.getAccountId());
					}
				}	
			}else {
				response.setAccountId(e.getAccountId());
				response.setFirstName(e.getFirstName());
				response.setLastName(e.getLastName());
				response.setRewards(map.get(e.getAccountId()));
				finalResponseByMonth.add(response);
				accountIds.add(e.getAccountId());
			}
			
		}
		
		return finalResponseByMonth;
	}
}
