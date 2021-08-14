package com.example.fragmentimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentimplementation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Communicator{

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1Button.setOnClickListener{

            replaceFragment(Fragment1())

        }

        binding.fragment2Button.setOnClickListener {

            replaceFragment2(Fragment2())

        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()

    }

    private fun replaceFragment2(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer2,fragment)
        fragmentTransaction.commit()

    }



    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("Message", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragment2 = Fragment2()
        fragment2.arguments = bundle

        transaction.replace(R.id.fragmentContainer2, fragment2)
        transaction.commit()

    }
}