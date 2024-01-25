package com.example.kotlin_dz_5_month3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.kotlin_dz_5_month3.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: ConstraintLayout = binding.root
        setContentView(view)
        if (savedInstanceState==null){
            supportFragmentManager.beginTransaction().replace(R.id.fm_Activity,ZeroFragment.newInstance()).commit()
        }
    }

}
