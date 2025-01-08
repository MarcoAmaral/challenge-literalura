package com.br.marco.literalura.service;

public interface IDataConversor {
		<T> T convertData(String json, Class<T> tClass);
}