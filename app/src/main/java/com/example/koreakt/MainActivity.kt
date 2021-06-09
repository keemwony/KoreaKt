package com.example.koreakt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.koreakt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // ViewBinding
    private lateinit var binding : ActivityMainBinding
    // RecyclerView 가 불러올 목록
    private val data:MutableList<Map> = mutableListOf()
    var i = 4
    override fun onCreate(savedInstanceState: Bundle?) {
// ViewBinding
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initialize() // data 값 초기화
        refreshRecyclerView() // recyclerView 데이터 바인딩


    }
    private fun initialize(){
        Area.cat1.forEach {
            data.add(Map(it))
        }


    }
    private fun refreshRecyclerView(){
        val adapter = MyAdapter()
        adapter.listData = data
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}

