package com.example.viewmodelex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding:ActivityMainBinding
private var count=0;
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.textView.text=viewModel.getCurrentCount().toString()//count.toString()
        binding.button.setOnClickListener{

            binding.textView.text= viewModel.getUpdatedCount().toString()//count.toString()
        }

    }
}