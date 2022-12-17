package com.enexse.model;


import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.enexse.enums.AgentStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agent {
	  @Id
	  @GeneratedValue(generator = "uuid")
	  @GenericGenerator(name = "uuid", strategy = "uuid2")
	  private String id;
	  
	  private String os;
      private OffsetDateTime lastKeepAlive;
      private OffsetDateTime dateAdd;
	  private String ip;
	  
	  @Column(unique=true)
	  private String name;
	  private String version;

	  @Enumerated(EnumType.STRING)
	  private AgentStatus status;


}
