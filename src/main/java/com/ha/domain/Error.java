package com.ha.domain;

import lombok.Data;

@Data
public class Error extends BaseEntity {
	private static final long serialVersionUID = -1798438755009463791L;

	private String error;
}
