package com.springboot.app.commons.models.entity;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Table {
	private String name;
	private ArrayList<Column> columns = new ArrayList<Column>();
}
