package shomama.yoursongmanager

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

// widget libs
import android.widget.ListView
import android.widget.ArrayAdapter


class FrameMain : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_main)

        // widget initialize
        val musicListView = findViewById<ListView>(R.id.musicList)

        val array = arrayOf("shomama", "shomama2", "shomama3")

        val musicListAdapter = ArrayAdapter(this, R.id.musicList, array)

        musicListView.adapter = musicListAdapter
    }
}
