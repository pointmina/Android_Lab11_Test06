package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.myapplication.databinding.ActivityTest06Binding

class Test06Activity : AppCompatActivity() {

    //토글버튼

    lateinit var toggle : ActionBarDrawerToggle



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTest06Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //토글 객체생성
        //화면에 출력되는 문자열은 아닌데 내부적으로 상태를 표현하기 위한것
        toggle = ActionBarDrawerToggle(this, binding.drawer, R.string.drawer_open, R.string.drawer_close)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toggle.syncState()
    }


    //메뉴이벤트를 못타게
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }



}