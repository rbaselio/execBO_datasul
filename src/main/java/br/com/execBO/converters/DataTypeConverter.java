package br.com.execBO.converters;

public class DataTypeConverter {

	public static String getDataType(Class<? extends Object> clazz) {
		
		String s = clazz.getName();
		s = s.substring(s.lastIndexOf('.') + 1);		
		
		switch (s) {
		case "Integer" : 
			return "integer";
			
		case "String" : 
			return "character";	
			
		case "BigDecimal" : 
			return "decimal";
			
		case "TempTableDefinition" : 
			return "temptable";
			
			
			
			
			
			

		default:
			break;
		}
		return new StringBuilder().append("Classe ")
								  .append(s)
								  .append(" não traduzido ainda ou incompativel")
								  .toString();
		
	}

	
	

		
	
	
	
	
	
	
	

}
