package com.enexse.service;

import java.util.List;

import com.enexse.dto.AgentCount;
import com.enexse.model.Agent;

/**
 * 
 * @author lamiam
 *
 */
public interface AgentService {

	Agent saveAgent(Agent agent);
	Agent updateAgent(Agent agent,String name);
	List<Agent> getAllAgents();
	void deleteAgent(String id);
	Long countAgents();
	List<AgentCount> getCountAgentsByStatus();
}
