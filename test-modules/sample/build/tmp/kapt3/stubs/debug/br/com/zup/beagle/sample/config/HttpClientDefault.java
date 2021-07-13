package br.com.zup.beagle.sample.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J^\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162%\u0010\u0018\u001a!\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000b0\u0019j\u0002`\u001d2%\u0010\u001e\u001a!\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000b0\u0019j\u0002`\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lbr/com/zup/beagle/sample/config/HttpClientDefault;", "Lbr/com/zup/beagle/android/networking/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "job", "Lkotlinx/coroutines/CompletableJob;", "addRequestMethod", "", "urlConnection", "Ljava/net/HttpURLConnection;", "method", "Lbr/com/zup/beagle/android/networking/HttpMethod;", "createRequestCall", "Lbr/com/zup/beagle/android/networking/RequestCall;", "createResponseData", "Lbr/com/zup/beagle/android/networking/ResponseData;", "doHttpRequest", "request", "Lbr/com/zup/beagle/android/networking/RequestData;", "execute", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "responseData", "Lbr/com/zup/beagle/sample/config/OnSuccess;", "onError", "Lbr/com/zup/beagle/sample/config/OnError;", "getOrDeleteOrHeadHasData", "", "setRequestBody", "tryFormatException", "Lbr/com/zup/beagle/android/exception/BeagleApiException;", "sample_debug"})
@br.com.zup.beagle.android.annotation.BeagleComponent()
public final class HttpClientDefault implements br.com.zup.beagle.android.networking.HttpClient, kotlinx.coroutines.CoroutineScope {
    private final kotlinx.coroutines.CompletableJob job = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    
    public HttpClientDefault() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.beagle.android.networking.RequestCall execute(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.networking.RequestData request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super br.com.zup.beagle.android.networking.ResponseData, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super br.com.zup.beagle.android.networking.ResponseData, kotlin.Unit> onError) {
        return null;
    }
    
    private final boolean getOrDeleteOrHeadHasData(br.com.zup.beagle.android.networking.RequestData request) {
        return false;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {br.com.zup.beagle.android.exception.BeagleApiException.class})
    private final br.com.zup.beagle.android.networking.ResponseData doHttpRequest(br.com.zup.beagle.android.networking.RequestData request) throws br.com.zup.beagle.android.exception.BeagleApiException {
        return null;
    }
    
    private final br.com.zup.beagle.android.exception.BeagleApiException tryFormatException(java.net.HttpURLConnection urlConnection, br.com.zup.beagle.android.networking.RequestData request) {
        return null;
    }
    
    private final void addRequestMethod(java.net.HttpURLConnection urlConnection, br.com.zup.beagle.android.networking.HttpMethod method) {
    }
    
    private final void setRequestBody(java.net.HttpURLConnection urlConnection, br.com.zup.beagle.android.networking.RequestData request) {
    }
    
    private final br.com.zup.beagle.android.networking.ResponseData createResponseData(java.net.HttpURLConnection urlConnection) {
        return null;
    }
    
    private final br.com.zup.beagle.android.networking.RequestCall createRequestCall() {
        return null;
    }
}