@file:Suppress("PrivatePropertyName")

package com.deanmurray.datacubedproject.view.main_activity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ScreenPagerAdapter(fragment_manager: FragmentManager) :
    FragmentPagerAdapter(fragment_manager) {

    private val fragment_list = arrayListOf<Fragment>()
    private val fragment_title_list = arrayListOf<String>()

    fun addFragment(fragment: Fragment, title: String) {
        fragment_list.add(fragment)
        fragment_title_list.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragment_title_list[position]
    }

    override fun getItem(position: Int): Fragment {
        return fragment_list[position]
    }

    override fun getCount(): Int {
        return fragment_list.size
    }
}