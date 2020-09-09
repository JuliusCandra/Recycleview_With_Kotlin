package com.dev_candra.recycle_view_with_kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.dev_candra.recycle_view_with_kotlin.adapter.MyAdapter
import com.dev_candra.recycle_view_with_kotlin.R
import com.dev_candra.recycle_view_with_kotlin.model.data_source
import com.dev_candra.recycle_view_with_kotlin.util.top_spacing_decoration
import kotlinx.android.synthetic.main.activity_main.recyleview

class MainActivity : AppCompatActivity() {

    private lateinit var modelAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Aksi()
    }

    private fun Aksi(){
        initailActionBar()
        initialRecyclerView()
        addDataSource()
    }

    private fun initailActionBar(){
        val actionBar = supportActionBar
        if (actionBar != null){
            actionBar.title = "Candra Julius Sinaga"
            actionBar.subtitle = "Contoh Recycleview"
        }
    }

    private fun initialRecyclerView(){

        recyleview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            modelAdapter =
                MyAdapter()
            // membuat recyleview menjadi di tengah kontentnya
            val topSpacing =
                top_spacing_decoration(
                    30
                )
            addItemDecoration(topSpacing)
            // END
            adapter = modelAdapter
        }
    }

    private fun addDataSource(){
        val data = data_source.createDataSet()
        modelAdapter.submitList(data)
    }
}
