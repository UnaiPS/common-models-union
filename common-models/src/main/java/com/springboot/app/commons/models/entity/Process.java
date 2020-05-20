package com.springboot.app.commons.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "process")
public class Process implements Serializable{
	
	private static final long serialVersionUID = 8001573220504570852L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_conn_origin")
	private Connections origin;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_conn_destination")
	private Connections destination;
}
