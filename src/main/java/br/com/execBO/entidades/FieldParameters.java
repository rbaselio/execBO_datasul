package br.com.execBO.entidades;

import br.com.execBO.converters.DataTypeConverter;

public class FieldParameters {

	private String name;
	private String type;
	private String dataType;
	private Object value;

	public FieldParameters(String name, String type, Object value) {
		this.dataType = DataTypeConverter.getDataType(value.getClass());
		this.name = name;
		this.value = value;
		this.type = type;
	}

	@SuppressWarnings("unchecked")
	public FieldParameters(String name, String type, Class clazz) {
		this.dataType = DataTypeConverter.getDataType(clazz);
		this.name = name;
		this.value = "";
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getDataType() {
		return dataType;
	}

	public Object getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
	
	
	

	
}