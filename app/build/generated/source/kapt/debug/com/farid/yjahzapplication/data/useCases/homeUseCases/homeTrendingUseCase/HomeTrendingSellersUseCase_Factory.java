// Generated by Dagger (https://dagger.dev).
package com.farid.yjahzapplication.data.useCases.homeUseCases.homeTrendingUseCase;

import com.farid.yjahzapplication.data.remote.DataRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class HomeTrendingSellersUseCase_Factory implements Factory<HomeTrendingSellersUseCase> {
  private final Provider<DataRepository> dataRepositoryProvider;

  public HomeTrendingSellersUseCase_Factory(Provider<DataRepository> dataRepositoryProvider) {
    this.dataRepositoryProvider = dataRepositoryProvider;
  }

  @Override
  public HomeTrendingSellersUseCase get() {
    return newInstance(dataRepositoryProvider.get());
  }

  public static HomeTrendingSellersUseCase_Factory create(
      Provider<DataRepository> dataRepositoryProvider) {
    return new HomeTrendingSellersUseCase_Factory(dataRepositoryProvider);
  }

  public static HomeTrendingSellersUseCase newInstance(DataRepository dataRepository) {
    return new HomeTrendingSellersUseCase(dataRepository);
  }
}