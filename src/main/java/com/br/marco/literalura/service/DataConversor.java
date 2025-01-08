package com.br.marco.literalura.service;

public class DataConversor implements IDataConversor {
		ObjectMapper mapper = new ObjectMapper();

		@Override
		public <T> T convertData(String json, Class<T> tClass) {
				try {
						return mapper.readValue(json, tClass);
				} catch (JsonProcessingException e) {
						throw new RuntimeException(e);
				}
		}
}