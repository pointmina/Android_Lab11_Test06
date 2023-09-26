package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStateManagerControl
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivityTest05Binding

class Test05Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding  = ActivityTest05Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.adapter = Myadapter(this)
    }
}

//어뎁터 준비

class Myadapter(activity: FragmentActivity) : FragmentStateAdapter(activity){
    val fragments : List<Fragment>
    init {
        fragments = listOf(OneFragment(), TwoFragment(), ThreeFragment())
    }

    // 항목개수가 몇개니 화면 개수가 몇개니

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }


}