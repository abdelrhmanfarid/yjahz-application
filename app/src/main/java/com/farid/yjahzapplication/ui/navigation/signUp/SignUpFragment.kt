package com.farid.yjahzapplication.ui.navigation.signUp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.farid.yjahzapplication.R
import com.farid.yjahzapplication.base.BaseFragment
import com.farid.yjahzapplication.databinding.FragmentSignUpBinding
import com.farid.yjahzapplication.ui.navigation.login.LoginViewModel
import com.farid.yjahzapplication.utils.LiveDataResource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpFragment : BaseFragment<SignUpViewModel, FragmentSignUpBinding>() {
    override fun getContentView(): Int {
        return R.layout.fragment_sign_up
    }


    override fun initializeViewModel() {
        baseViewModel = ViewModelProvider(requireActivity())[SignUpViewModel::class.java]
    }

    override fun initView() {
        baseViewBinding.signUpButton.setOnClickListener(this)
        baseViewBinding.loginTv.setOnClickListener(this)
    }

    override fun subscribeLiveData() {
        observeUserSignUp()
    }

    override fun onClick(v: View?) {
        when (v) {
            baseViewBinding.loginTv -> {

                findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
            }

            baseViewBinding.signUpButton -> {

                checkEmptyInputs()

            }

        }
    }


    private fun observeUserSignUp() {
        lifecycleScope.launchWhenStarted {
            baseViewModel!!.signUpLiveData.collect {
                when (it) {
                    is LiveDataResource.Success -> {
                        Log.d("test", "SignUp success")
                        findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
                    }

                    is LiveDataResource.ErrorResponse -> {
                        Log.d("test", "ErrorResponse")

                    }

                    is LiveDataResource.Exception -> {
                        Log.d("test", " SignUp Exception")
                    }

                    is LiveDataResource.Loading -> {
                        Log.d("test", "SignUp Loading")
                    }

                    is LiveDataResource.NoNetwork -> {
                        Log.d("test", "SignUp NoNetwork")
                    }

                    else -> {}
                }
            }
        }
    }

    private fun checkEmptyInputs():Boolean {
        var name: String = baseViewBinding.nameEditText.text.toString()
        var email: String = baseViewBinding.emailEditText.text.toString()
        var password: String = baseViewBinding.passwordEditText.text.toString()
        var confirmPassword: String = baseViewBinding.confirmPasswordEditText.text.toString()
        var phone: String = baseViewBinding.phoneNumberEditText.text.toString()

        if (name.isNullOrEmpty() || email.isNullOrEmpty()
            || password.isNullOrEmpty()
            || confirmPassword.isNullOrEmpty() || phone.isNullOrEmpty()
        ) {
            Toast.makeText(requireContext(), "please complete your data", Toast.LENGTH_SHORT).show()
            return false
        } else if (confirmPassword!=password) {
            Toast.makeText(requireContext(), "passwords is not similar", Toast.LENGTH_SHORT).show()
            return false
        } else {
            baseViewModel!!.signUpUser(name, email, password, phone)
            return true
        }
    }

}