package com.example.recycleview_inside_nestedscrolview_6_injava.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import com.example.recycleview_inside_nestedscrolview_6_injava.R
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recycleview_inside_nestedscrolview_6_injava.adapter.CustomAdapter
import com.example.recycleview_inside_nestedscrolview_6_injava.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var nestedScrollView: NestedScrollView? = null
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun initView() {
        nestedScrollView = findViewById(R.id.nestedScrolView)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView!!.setLayoutManager(GridLayoutManager(this, 1))
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomAdapter(this, members)
        recyclerView!!.adapter = adapter
        recyclerView!!.isNestedScrollingEnabled = false
    }

    private fun prepareMemberList(): List<Member> {
        val members: ArrayList<Member> = ArrayList()
        for (i in 0..29) {
                members.add(Member("Ilhombek$i", "Ubaydullayev$i"))
        }
        return members
    }
}