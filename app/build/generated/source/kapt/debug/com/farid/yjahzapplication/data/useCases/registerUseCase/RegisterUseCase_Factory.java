// Generated by Dagger (https://dagger.dev).
package com.farid.yjahzapplication.data.useCases.registerUseCase;

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
public final class RegisterUseCase_Factory implements Factory<RegisterUseCase> {
  private final Provider<DataRepository> dataRepositoryProvider;

  public RegisterUseCase_Factory(Provider<DataRepository> dataRepositoryProvider) {
    this.dataRepositoryProvider = dataRepositoryProvider;
  }

  @Override
  public RegisterUseCase get() {
    return newInstance(dataRepositoryProvider.get());
  }

  public static RegisterUseCase_Factory create(Provider<DataRepository> dataRepositoryProvider) {
    return new RegisterUseCase_Factory(dataRepositoryProvider);
  }

  public static RegisterUseCase newInstance(DataRepository dataRepository) {
    return new RegisterUseCase(dataRepository);
  }
}
