package com.enexse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.enexse.dto.AgentCount;
import com.enexse.model.Agent;
/**
 * 
 * @author lamiam
 *
 */

@Repository
public interface AgentRepository extends JpaRepository<Agent, String> {
	
  Agent findByName(String name);
  
  @Query("select new com.enexse.dto.AgentCount(a.status , count(*)) from Agent a group by a.status")
  List<AgentCount> getCountAgentsByStatus();
}
