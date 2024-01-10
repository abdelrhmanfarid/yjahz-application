// Generated by Dagger (https://dagger.dev).
package com.farid.yjahzapplication.di;

import com.farid.yjahzapplication.data.remote.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkingModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkingModule_ProvideApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideApiService(retrofitProvider.get());
  }

  public static NetworkingModule_ProvideApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkingModule_ProvideApiServiceFactory(retrofitProvider);
  }

  public static ApiService provideApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkingModule.INSTANCE.provideApiService(retrofit));
  }
}