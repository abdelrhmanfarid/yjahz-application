package com.farid.yjahzapplication.ui.navigation.login;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.farid.yjahzapplication.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_homeFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToSignUpFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_signUpFragment);
  }
}
