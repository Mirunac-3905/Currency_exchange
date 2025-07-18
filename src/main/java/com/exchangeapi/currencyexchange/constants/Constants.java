package com.exchangeapi.currencyexchange.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constants {

    public static String EXCHANGE_API_BASE_URL;
    public static String EXCHANGE_API_API_KEY;

    public static String EXCHANGE_CACHE_NAME;
    public static Integer EXCHANGE_API_CALL_LIMIT;

    @Value("${exchange.api-url}")
    public void setExchangeApiBaseUrl(String apiUrl) {
        Constants.EXCHANGE_API_BASE_URL = apiUrl;
    }

    @Value("${exchange.api-key}")
    public void setExchangeApiKey(String apiKey) {
        EXCHANGE_API_API_KEY = apiKey;
    }

    @Value("${exchange.cache-name}")
    public void setExchangeCacheName(String cacheName) {
        Constants.EXCHANGE_CACHE_NAME = cacheName;
    }

    @Value("${exchange.api-call-limit}")
    public void setExchangeApiCallLimit(Integer apiCallLimit) {
        EXCHANGE_API_CALL_LIMIT = apiCallLimit;
    }

}