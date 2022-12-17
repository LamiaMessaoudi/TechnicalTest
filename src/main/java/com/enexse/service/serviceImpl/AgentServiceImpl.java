package com.enexse.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enexse.dto.AgentCount;
import com.enexse.model.Agent;
import com.enexse.repository.AgentRepository;
import com.enexse.service.AgentService;
/**
 * 
 * @author lamiam
 *
 */

@Service
public class AgentServiceImpl implements AgentService{

	@Autowired
	private AgentRepository agentRepository;
	
	@Override
	public Agent saveAgent(Agent agent) {
		return agentRepository.save(agent);
	}

	@Override
	public Agent updateAgent(Agent agentToUpdate, String name) {
		Agent agent = agentRepository.findByName(name);
		agentToUpdate.setId(agent.getId());
		return agentRepository.save(agentToUpdate);
	}

	@Override
	public List<Agent> getAllAgents() {
		return agentRepository.findAll();
	}

	@Override
	public void deleteAgent(String id) {
		agentRepository.deleteById(id);
	}

	@Override
	public Long countAgents() {
		return agentRepository.count();
	}

	@Override
	public List<AgentCount> getCountAgentsByStatus() {
		return agentRepository.getCountAgentsByStatus();
	}

}
