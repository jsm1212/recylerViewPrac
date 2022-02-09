package com.example.sample30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var userList = arrayListOf<DataVo>(
        DataVo("김철수", "kcs", "서울시", 3000000, "kim"),
        DataVo("박상현", "psh", "부산시", 5000000, "park"),
        DataVo("최진형", "cjh", "광주시", 4000000, "choi"),
        DataVo("정수동", "jsd", "충주시", 4500000, "jung")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recycleView = findViewById<RecyclerView>(R.id.recycler_view)

        val mAdapter = CustomAdapter(this, userList)
        recycleView.adapter = mAdapter

        val layout = LinearLayoutManager(this) // LinearLayoutManager의 경우 orientation 기본 값이 "VERTICAL"이므로 객체를 생성
        recycleView.layoutManager = layout

        recycleView.setHasFixedSize(true)
    }
}





