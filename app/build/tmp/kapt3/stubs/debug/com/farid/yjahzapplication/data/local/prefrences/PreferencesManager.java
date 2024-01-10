package com.farid.yjahzapplication.data.local.prefrences;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\'\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0001J\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/farid/yjahzapplication/data/local/prefrences/PreferencesManager;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "clearSharedPreferences", "", "getObject", "Model", "key", "", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "returnToken", "saveObject", "model", "saveToken", "value", "app_debug"})
public final class PreferencesManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences.Editor editor = null;
    
    public PreferencesManager(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    public final void saveToken(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String returnToken(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return null;
    }
    
    public final <Model extends java.lang.Object>Model getObject(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.Class<Model> modelClass) {
        return null;
    }
    
    public final void saveObject(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.Object model) {
    }
    
    public final void clearSharedPreferences() {
    }
}