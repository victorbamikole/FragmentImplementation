package com.example.fragmentimplementation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment2.view.*
import org.w3c.dom.Text

class Fragment2 : Fragment(R.layout.fragment2) {

    var displayMessage: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)

        displayMessage = arguments?.getString("Message")

        view.receiveText.text = displayMessage

        return view

    }
}
