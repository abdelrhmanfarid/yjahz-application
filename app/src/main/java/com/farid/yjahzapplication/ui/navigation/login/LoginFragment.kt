package com.farid.yjahzapplication.ui.navigation.login

import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.farid.yjahzapplication.R
import com.farid.yjahzapplication.base.BaseFragment
import com.farid.yjahzapplication.databinding.FragmentLoginBinding
import com.farid.yjahzapplication.utils.LiveDataResource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<LoginViewModel, FragmentLoginBinding>() {

    override fun getContentView(): Int {
        return R.layout.fragment_login
    }


    override fun initializeViewModel() {
        baseViewModel = ViewModelProvider(requireActivity())[LoginViewModel::class.java]
    }

    override fun initView() {

        baseViewBinding.signUpTv.setOnClickListener(this)
        baseViewBinding.loginButton.setOnClickListener(this)

    }

    override fun subscribeLiveData() {
        observeUserLogin()
    }

    override fun onClick(v: View?) {
        when (v) {
            baseViewBinding.signUpTv -> {
                findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
            }

            baseViewBinding.loginButton -> {
                checkEmptyInputs()

            }

        }
    }

    private fun observeUserLogin() {
        lifecycleScope.launchWhenStarted {
            baseViewModel!!.loginLiveData.collect {
                when (it) {
                    is LiveDataResource.Success -> {

                        Log.d("test", "SignUp success")
                        findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
                    }

                    is LiveDataResource.ErrorResponse -> {
                        Log.d("test", "ErrorResponse")
                    }

                    is LiveDataResource.Exception -> {
                        Log.d("test", "Exception")
                    }

                    is LiveDataResource.Loading -> {
                        Log.d("test", "Loading")
                    }

                    is LiveDataResource.NoNetwork -> {
                        Log.d("test", "NoNetwork")
                    }

                    else -> {}
                }
            }
        }
    }


    private fun checkEmptyInputs(): Boolean {
        var email: String = baseViewBinding.emailEditText.text.toString()
        var password: String = baseViewBinding.passwordEditText.text.toString()

        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            Toast.makeText(requireContext(), "please complete your data", Toast.LENGTH_SHORT).show()
            return false
        } else {
            baseViewModel!!.loginConsumer(email, password)
            return true
        }
    }
}