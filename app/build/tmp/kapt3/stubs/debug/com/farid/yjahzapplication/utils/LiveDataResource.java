package com.farid.yjahzapplication.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\f\r\u000e\u000f\u0010\u0011B\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/farid/yjahzapplication/utils/LiveDataResource;", "T", "", "data", "message", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "EmptyState", "ErrorResponse", "Exception", "Loading", "NoNetwork", "Success", "Lcom/farid/yjahzapplication/utils/LiveDataResource$EmptyState;", "Lcom/farid/yjahzapplication/utils/LiveDataResource$ErrorResponse;", "Lcom/farid/yjahzapplication/utils/LiveDataResource$Exception;", "Lcom/farid/yjahzapplication/utils/LiveDataResource$Loading;", "Lcom/farid/yjahzapplication/utils/LiveDataResource$NoNetwork;", "Lcom/farid/yjahzapplication/utils/LiveDataResource$Success;", "app_debug"})
public abstract class LiveDataResource<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable
    private final T data = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String message = null;
    
    private LiveDataResource(T data, java.lang.String message) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/farid/yjahzapplication/utils/LiveDataResource$EmptyState;", "T", "Lcom/farid/yjahzapplication/utils/LiveDataResource;", "()V", "app_debug"})
    public static final class EmptyState<T extends java.lang.Object> extends com.farid.yjahzapplication.utils.LiveDataResource<T> {
        
        public EmptyState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/farid/yjahzapplication/utils/LiveDataResource$ErrorResponse;", "T", "Lcom/farid/yjahzapplication/utils/LiveDataResource;", "data", "(Ljava/lang/Object;)V", "app_debug"})
    public static final class ErrorResponse<T extends java.lang.Object> extends com.farid.yjahzapplication.utils.LiveDataResource<T> {
        
        public ErrorResponse(@org.jetbrains.annotations.Nullable
        T data) {
        }
        
        public ErrorResponse() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/farid/yjahzapplication/utils/LiveDataResource$Exception;", "T", "Lcom/farid/yjahzapplication/utils/LiveDataResource;", "()V", "app_debug"})
    public static final class Exception<T extends java.lang.Object> extends com.farid.yjahzapplication.utils.LiveDataResource<T> {
        
        public Exception() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/farid/yjahzapplication/utils/LiveDataResource$Loading;", "T", "Lcom/farid/yjahzapplication/utils/LiveDataResource;", "()V", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.farid.yjahzapplication.utils.LiveDataResource<T> {
        
        public Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/farid/yjahzapplication/utils/LiveDataResource$NoNetwork;", "T", "Lcom/farid/yjahzapplication/utils/LiveDataResource;", "()V", "app_debug"})
    public static final class NoNetwork<T extends java.lang.Object> extends com.farid.yjahzapplication.utils.LiveDataResource<T> {
        
        public NoNetwork() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/farid/yjahzapplication/utils/LiveDataResource$Success;", "T", "Lcom/farid/yjahzapplication/utils/LiveDataResource;", "data", "(Ljava/lang/Object;)V", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.farid.yjahzapplication.utils.LiveDataResource<T> {
        
        public Success(T data) {
        }
    }
}