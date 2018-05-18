package br.com.execBO;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.execBO.ExecBO;
import br.com.execBO.converters.JsonConverter;
import br.com.execBO.converters.Type;
import br.com.execBO.entidades.FieldParameters;
import br.com.execBO.entidades.TempTableDefinition;
import br.com.execBO.entidades.TempTableFields;

/**
 * Hello world!
 *
 */
public class ExemploExecBO {
	
	public final static String address = "address";
	public final static String port = "port";
	public final static String user = "user";
	public final static String password = "password";
	

	public static void main(String[] args) throws Exception {

		Somar();
		Naturezas();

	}

	private static void Somar() throws Exception {

		List<FieldParameters> params = new ArrayList<>();

		params.add(new FieldParameters("valor1", Type.INPUT, 500));
		params.add(new FieldParameters("valor2", Type.INPUT, 200));
		params.add(new FieldParameters("resultado", Type.OUTPUT, Integer.class));

		String result = new ExecBO().setService(address, port)
									.setToken(user, password)
									.getResult("esp/soma.p", "soma", JsonConverter.toJson(params));

		ArrayList<FieldParameters> resultFields = JsonConverter.getResultFields(result);

		for (FieldParameters fieldParameters : resultFields) {
			System.out.println(fieldParameters.getName() + " - " + fieldParameters.getValue().toString());
		}
	}

	private static void Naturezas() throws Exception {
		List<TempTableFields> tempTableFields = new ArrayList<TempTableFields>();
		tempTableFields.add(new TempTableFields("nat_operacao", String.class));
		tempTableFields.add(new TempTableFields("denominacao", String.class));
		tempTableFields.add(new TempTableFields("aliquota_icm", BigDecimal.class));
		tempTableFields.add(new TempTableFields("tipo", String.class));

		TempTableDefinition tt_temp = new TempTableDefinition("tt_natur-oper", tempTableFields);

		Map<String, Object> record = new HashMap<String, Object>();
		for (TempTableFields tempTableField : tempTableFields) {
			record.put(tempTableField.getName(), "value");
		}
		tt_temp.addRecord(record);

		List<FieldParameters> params = new ArrayList<>();
		params.add(new FieldParameters("nat_operacao", Type.INPUT_OUTPUT, ""));
		params.add(new FieldParameters(tt_temp.getName(), Type.INPUT_OUTPUT, tt_temp));
		
		String result = new ExecBO().setService(address, port)
									.setToken(user, password)
									.getResult("esp/soma.p", "getNatureza", JsonConverter.toJson(params));

		ArrayList<FieldParameters> resultFields = JsonConverter.getResultFields(result);

		for (FieldParameters fieldParameters : resultFields) {
			ArrayList<Map<String, String>> records = JsonConverter.getRecords(fieldParameters);
			for (Map<String, String> map : records) {
				Set<String> keySet = map.keySet();
				for (String string : keySet) {
					System.out.println(string + ": " + map.get(string));
				}
				System.out.println("--");
			}

		}
	}

}
