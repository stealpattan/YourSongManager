package shomama.yoursongmanager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

// widget libs
import android.widget.ListView
import android.widget.AdapterView


class FrameMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_main)

        // widget initialize
        val musicListView = findViewById(R.id.musicList) as ListView

        val array = arrayOf("shomama", "shomama2", "shomama3") as Array<String>


    }
}
