package com.enexse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enexse.dto.AgentCount;
import com.enexse.model.Agent;
import com.enexse.service.AgentService;

/**
 * 
 * @author lamiam
 *
 */
@RestController
@RequestMapping("/api/v1")
public class AgentController {
	
	@Autowired
	private AgentService agentService;
	
	/**
	 * 
	 * @param agent
	 * @return the Saved agent
	 */
	@PostMapping("/agent")
	public Agent saveAgent(@RequestBody Agent agent)
	{
		return agentService.saveAgent(agent);
	}
	
	
	/**
	 * 
	 * @param name of the agent to update 
	 * @param agent 
	 * @return
	 */
    @PutMapping("/{name}")
	public Agent updateAgent(@PathVariable String name, @RequestBody Agent agent)
	{
		return agentService.updateAgent(agent,name);
	}
    
    /**
     * 
     * @return all agent in DB
     */
	
    @GetMapping("/agents")
	public List<Agent> getAllAgents()
	{
		return agentService.getAllAgents();
	}
    
    /**
     * 
     * @param id of agent to delete 
     */
	@DeleteMapping("/{id}")
	public void deleteAgent(@PathVariable String id) {
		agentService.deleteAgent(id);
	}
	
	/**
	 * 
	 * @return number of agents
	 */
	@GetMapping("/count-agents")
	public Long countAgents()
	{
		return agentService.countAgents();
	}
	
	@GetMapping("/count-agents-by-status")
	public List<AgentCount> countAgentsByStatus()
	{
		return agentService.getCountAgentsByStatus();
	}
}
