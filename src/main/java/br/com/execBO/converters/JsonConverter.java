package br.com.execBO.converters;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import br.com.execBO.entidades.FieldParameters;


public class JsonConverter {
	private static Gson g = new Gson();
	
	
	
	public static String toJson(List<FieldParameters> obj ) {
		return g.toJson(obj);
	}
	
	public static ArrayList<FieldParameters> getResultFields(String result) {
		Type listType =  new TypeToken<ArrayList<FieldParameters>>(){}.getType();
	    return g.fromJson(result, listType);
	    
	}	
	

	public static ArrayList<Map<String,String>> getRecords(FieldParameters fields) {
		if (fields.getDataType().equals("temptable")) {
			JsonParser parser = new JsonParser();
			JsonElement jsonElement = parser.parse(fields.getValue().toString()).getAsJsonObject().get("records");
			Type listType = new TypeToken<ArrayList<Map<String,String>>>(){}.getType();
		    return g.fromJson(jsonElement, listType);
		}
		ArrayList<Map<String,String>> arrayList = new ArrayList<Map<String,String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(fields.getName(), (String)fields.getValue());
		arrayList.add(map);
		return arrayList;
	}
	
	

}
