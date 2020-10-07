@file:Suppress("LocalVariableName")

package com.deanmurray.datacubedproject.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.deanmurray.datacubedproject.R
import com.deanmurray.datacubedproject.view.main_activity.ScreenPagerAdapter
import com.deanmurray.datacubedproject.view.record.Record
import com.deanmurray.datacubedproject.view.saved_recordings.SavedRecordings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpViewPager(screen_pager)
    }

    private fun setUpViewPager(viewPager: ViewPager) {
        val screen_pager_adapter = ScreenPagerAdapter(supportFragmentManager)
        screen_pager_adapter.addFragment(Record(), "Record")
        screen_pager_adapter.addFragment(SavedRecordings(), "Saved Recordings")
        viewPager.adapter = screen_pager_adapter
    }
}