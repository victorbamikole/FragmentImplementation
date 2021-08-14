package com.example.fragmentimplementation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragmentone.view.*

open class Fragment1 : Fragment(){

    private lateinit var communicator: Communicator


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragmentone, container, false)


        communicator  = activity as Communicator

        view.sendBtn.setOnClickListener{
            communicator.passDataCom(view.textInput.text.toString())
        }
        return view
    }

}