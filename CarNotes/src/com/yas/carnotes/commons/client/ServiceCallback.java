package com.yas.carnotes.commons.client;

public interface ServiceCallback<T> {
	void execute(T serviceResponse);
}