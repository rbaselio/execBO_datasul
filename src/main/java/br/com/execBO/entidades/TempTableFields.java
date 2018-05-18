package br.com.execBO.entidades;

import br.com.execBO.converters.DataTypeConverter;

public class TempTableFields {
	private String name;
	private String label;
	private String type;

	@SuppressWarnings("unchecked")
	public TempTableFields(String nome, Class clazz) {
		this.name = nome;
		this.label = nome;
		this.type= DataTypeConverter.getDataType(clazz);
	}

	public String getName() {
		return name;
	}

	public String getLabel() {
		return label;
	}

	public String getType() {
		return type;
	}
	
	

	

}
