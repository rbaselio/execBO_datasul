package br.com.execBO.entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TempTableDefinition {
	private String name;
	private List<TempTableFields> fields = new ArrayList<>();
	private List<Map<String, Object>> records = new ArrayList<Map<String, Object>>();

	
	public TempTableDefinition(String name, List<TempTableFields> fields) {
		this.name = name;		
		this.fields = fields;			
	}
	
	public TempTableDefinition(String name, List<TempTableFields> fields, Map<String, Object> records ) throws Exception {
		this.name = name;
		this.fields = fields;
		addRecord(records);
	}	
	
	public void addRecord(Map<String, Object> records) throws Exception {
		if (records != null) {			
			Set<String> keySet = new HashSet<>(records.keySet());
			for (TempTableFields tt_fields2 : fields) {
				if (!records.containsKey(tt_fields2.getName())) {
					throw new Exception("Não foi informada a valor para o chave \"" + tt_fields2.getName() + "\"");
				}
				keySet.remove(tt_fields2.getName());
			}
			if (!keySet.isEmpty()) {
				throw new Exception("O(s) campo(s) não contam como colunas da temp-table: " + keySet);
			}
			this.records.add(records);
		}
	}

	public String getName() {
		return name;
	}

	public List<TempTableFields> getFields() {
		return fields;
	}

	public List<Map<String, Object>> getRecordsValues() {
		return records;
	}
	
	
		

	
}
