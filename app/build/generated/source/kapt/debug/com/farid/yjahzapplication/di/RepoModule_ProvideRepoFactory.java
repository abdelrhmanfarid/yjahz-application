// Generated by Dagger (https://dagger.dev).
package com.farid.yjahzapplication.di;

import com.farid.yjahzapplication.data.remote.ApiService;
import com.farid.yjahzapplication.data.remote.DataRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RepoModule_ProvideRepoFactory implements Factory<DataRepository> {
  private final Provider<ApiService> apiServiceProvider;

  public RepoModule_ProvideRepoFactory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public DataRepository get() {
    return provideRepo(apiServiceProvider.get());
  }

  public static RepoModule_ProvideRepoFactory create(Provider<ApiService> apiServiceProvider) {
    return new RepoModule_ProvideRepoFactory(apiServiceProvider);
  }

  public static DataRepository provideRepo(ApiService apiService) {
    return Preconditions.checkNotNullFromProvides(RepoModule.INSTANCE.provideRepo(apiService));
  }
}