package com.coolweather.app.util;

public interface HttpCallbackListener {
	void onSuccess(String response);

	void onError(Exception e);
}
