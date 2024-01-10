// Generated by Dagger (https://dagger.dev).
package com.farid.yjahzapplication.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkingModule_ProvidesHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> loggerProvider;

  public NetworkingModule_ProvidesHttpClientFactory(
      Provider<HttpLoggingInterceptor> loggerProvider) {
    this.loggerProvider = loggerProvider;
  }

  @Override
  public OkHttpClient get() {
    return providesHttpClient(loggerProvider.get());
  }

  public static NetworkingModule_ProvidesHttpClientFactory create(
      Provider<HttpLoggingInterceptor> loggerProvider) {
    return new NetworkingModule_ProvidesHttpClientFactory(loggerProvider);
  }

  public static OkHttpClient providesHttpClient(HttpLoggingInterceptor logger) {
    return Preconditions.checkNotNullFromProvides(NetworkingModule.INSTANCE.providesHttpClient(logger));
  }
}