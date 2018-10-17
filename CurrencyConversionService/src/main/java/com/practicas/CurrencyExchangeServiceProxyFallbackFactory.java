package com.practicas;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class CurrencyExchangeServiceProxyFallbackFactory implements FallbackFactory<CurrencyExchangeServiceProxy> {

    @Override
    public CurrencyExchangeServiceProxy create(Throwable cause) {
        return new CurrencyExchangeServiceProxyFallback();
    }  

}

