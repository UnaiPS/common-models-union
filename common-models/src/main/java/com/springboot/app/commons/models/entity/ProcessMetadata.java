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
@Table(name = "process_metadates")
public class ProcessMetadata implements Serializable{

	private static final long serialVersionUID = -5156355518547835792L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_process")
	private Process process;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_meta_origin")
	private Metadates origin;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_meta_destination")
	private Metadates destination;

}
