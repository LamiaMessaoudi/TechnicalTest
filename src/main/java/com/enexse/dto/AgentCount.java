package com.enexse.dto;

import com.enexse.enums.AgentStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgentCount {
	
    private AgentStatus status;
    private Long total;
    
}
