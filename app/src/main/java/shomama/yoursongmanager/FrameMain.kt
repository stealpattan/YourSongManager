package shomama.yoursongmanager

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
// widgets
import android.widget.ArrayAdapter
import android.widget.ListView
// utils
import java.util.ArrayList


class FrameMain : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_main)

        // example data list
        val testList = ArrayList<Int>()
        for (i in 0 .. 10) {
            testList.add(i)
        }
        // initialize array adapter
        val testAdapter = ArrayAdapter(this, R.layout.song_each_data, testList)
        // initialize listView widget
        val listViewWidget :ListView = findViewById(R.id.musicList)
        // show
        listViewWidget.adapter = testAdapter
    }
}
