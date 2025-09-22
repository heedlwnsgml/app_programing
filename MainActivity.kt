package com.example.a2025_09_22

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a2025_09_22.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //시작함 스위치 ON/OFF
        binding.swStr.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.swStr.isChecked == true) {
                binding.textView3.visibility = android.view.View.VISIBLE
                binding.radioGroup.visibility = android.view.View.VISIBLE
                binding.btnQ.visibility = android.view.View.VISIBLE
                binding.btnOre.visibility = android.view.View.VISIBLE
                binding.btnvk.visibility = android.view.View.VISIBLE
                binding.imageView.visibility = android.view.View.VISIBLE
            }else{
                binding.textView3.visibility = android.view.View.INVISIBLE
                binding.radioGroup.visibility = android.view.View.INVISIBLE
                binding.btnQ.visibility = android.view.View.INVISIBLE
                binding.btnOre.visibility = android.view.View.INVISIBLE
                binding.btnvk.visibility = android.view.View.INVISIBLE
                binding.imageView.visibility = android.view.View.INVISIBLE
            }
        }

        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->

            when(checkedId) {
                binding.btnOre.id -> {  //오레오
                    binding.imageView.setImageResource(R.drawable.oreo)
                }

                binding.btnQ.id -> { //큐
                    binding.imageView.setImageResource(R.drawable.qand)
                }

                binding.btnvk.id -> { //파이
                    binding.imageView.setImageResource(R.drawable.pie)
                }

                else -> binding.imageView.setImageDrawable(null) // 선택 해제 시
            }
        }

        binding.btnStop.setOnClickListener {
            finish()
        }

        binding.btnRe.setOnClickListener {
            binding.swStr.isChecked = false
            binding.btnQ.isChecked = false
            binding.btnOre.isChecked = false
            binding.btnvk.isChecked = false
            binding.imageView.setImageDrawable(null)
        }
    }
}