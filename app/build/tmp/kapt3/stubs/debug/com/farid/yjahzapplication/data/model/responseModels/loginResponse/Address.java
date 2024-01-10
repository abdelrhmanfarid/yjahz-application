package com.farid.yjahzapplication.data.model.responseModels.loginResponse;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bH\u00c6\u0003Ji\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012\u00a8\u0006+"}, d2 = {"Lcom/farid/yjahzapplication/data/model/responseModels/loginResponse/Address;", "", "id", "", "lat", "", "lng", "address", "Lcom/google/gson/JsonElement;", "street", "building", "apartment", "floor", "name", "(JLjava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonElement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)V", "getAddress", "()Lcom/google/gson/JsonElement;", "getApartment", "()Ljava/lang/String;", "getBuilding", "getFloor", "getId", "()J", "getLat", "getLng", "getName", "getStreet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Address {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lat = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lng = null;
    @org.jetbrains.annotations.Nullable
    private final com.google.gson.JsonElement address = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String street = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String building = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String apartment = null;
    @org.jetbrains.annotations.Nullable
    private final com.google.gson.JsonElement floor = null;
    @org.jetbrains.annotations.Nullable
    private final com.google.gson.JsonElement name = null;
    
    public Address(long id, @org.jetbrains.annotations.NotNull
    java.lang.String lat, @org.jetbrains.annotations.NotNull
    java.lang.String lng, @org.jetbrains.annotations.Nullable
    com.google.gson.JsonElement address, @org.jetbrains.annotations.NotNull
    java.lang.String street, @org.jetbrains.annotations.NotNull
    java.lang.String building, @org.jetbrains.annotations.NotNull
    java.lang.String apartment, @org.jetbrains.annotations.Nullable
    com.google.gson.JsonElement floor, @org.jetbrains.annotations.Nullable
    com.google.gson.JsonElement name) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLng() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.gson.JsonElement getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStreet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBuilding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getApartment() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.gson.JsonElement getFloor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.gson.JsonElement getName() {
        return null;
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.gson.JsonElement component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.gson.JsonElement component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.gson.JsonElement component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.farid.yjahzapplication.data.model.responseModels.loginResponse.Address copy(long id, @org.jetbrains.annotations.NotNull
    java.lang.String lat, @org.jetbrains.annotations.NotNull
    java.lang.String lng, @org.jetbrains.annotations.Nullable
    com.google.gson.JsonElement address, @org.jetbrains.annotations.NotNull
    java.lang.String street, @org.jetbrains.annotations.NotNull
    java.lang.String building, @org.jetbrains.annotations.NotNull
    java.lang.String apartment, @org.jetbrains.annotations.Nullable
    com.google.gson.JsonElement floor, @org.jetbrains.annotations.Nullable
    com.google.gson.JsonElement name) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}