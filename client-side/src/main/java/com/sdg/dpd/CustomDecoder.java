package com.sdg.dpd;

import java.io.IOException;
import java.lang.reflect.Type;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;

public class CustomDecoder implements Decoder {

	@Override
	public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
		System.out.println("ASDSADASDSADASD");
		return null;
	}

}
