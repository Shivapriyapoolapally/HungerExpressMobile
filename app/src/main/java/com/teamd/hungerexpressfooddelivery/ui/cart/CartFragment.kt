package com.teamd.hungerexpressfooddelivery.ui.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.teamd.hungerexpressfooddelivery.R
import com.teamd.hungerexpressfooddelivery.databinding.FragmentCartBinding
import com.teamd.hungerexpressfooddelivery.ui.base.BaseFragment


class CartFragment : BaseFragment() {
    lateinit var cartbinding: FragmentCartBinding
    override fun getBinding(inflater: LayoutInflater, container: ViewGroup?): ViewBinding {
        cartbinding = FragmentCartBinding.inflate(layoutInflater)
        return cartbinding
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}