package com.rain.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val fragment1 = Fragment1()
        val fragment2 = Fragment2()
        val fragment3 = Fragment3()
        val fragment4 = Fragment4()
        val fragment5 = Fragment5()
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    viewPager.currentItem = 0
                }
                R.id.discover -> {
                    viewPager.currentItem = 1
                }
                R.id.provider -> {
                    viewPager.currentItem = 2
                }
                R.id.provider1 -> {
                    viewPager.currentItem = 3
                }
                R.id.provider2 -> {
                    viewPager.currentItem = 4
                }
            }
            false
        }
        viewPager.offscreenPageLimit = 5
        viewPager.adapter = VpAdapter(this, arrayListOf(fragment1, fragment2, fragment3, fragment4, fragment5))
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == 2) {
                    //fragment3.findNavController().navigate(R.id.action_go_fragment)
                }
            }
        })
    }

    class VpAdapter(private val fragmentActivity: FragmentActivity, private val listFragment: ArrayList<Fragment>) : FragmentStateAdapter(fragmentActivity) {
        override fun getItemCount(): Int {
            return 5
        }

        override fun createFragment(position: Int): Fragment {
            return listFragment[position]
        }

    }

    class Fragment1 : Fragment() {
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            return inflater.inflate(R.layout.fragment_rain, null, false)
        }

        override fun onResume() {
            super.onResume()
            Log.e("Fragment1", "onResume")
        }

        override fun onDestroyView() {
            super.onDestroyView()
            Log.e("Fragment1", "onDestroyView")
        }
    }

    class Fragment2 : Fragment() {
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            return inflater.inflate(R.layout.hihiih, null, false)
        }

        override fun onResume() {
            super.onResume()
            Log.e("Fragment2", "onResume")
        }

        override fun onDestroyView() {
            super.onDestroyView()
            Log.e("Fragment2", "onDestroyView")
        }
    }

    class Fragment3 : Fragment() {
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            return inflater.inflate(R.layout.fragment1, null, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
//            val navHostFragment = childFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//            val navController = navHostFragment.navController

        }

        override fun onResume() {
            super.onResume()
            Log.e("Fragment3", "onResume")
        }

        override fun onDestroyView() {
            super.onDestroyView()
            Log.e("Fragment3", "onDestroyView")
        }
    }

    class Fragment4 : Fragment() {
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            return inflater.inflate(R.layout.hihiih, null, false)
        }

        override fun onResume() {
            super.onResume()
            Log.e("Fragment4", "onResume")
        }

        override fun onDestroyView() {
            super.onDestroyView()
            Log.e("Fragment4", "onDestroyView")
        }
    }

    class Fragment5 : Fragment() {
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            return inflater.inflate(R.layout.fragment_home, null, false)
        }

        override fun onResume() {
            super.onResume()
            Log.e("Fragment5", "onResume")
        }

        override fun onDestroyView() {
            super.onDestroyView()
            Log.e("Fragment5", "onDestroyView")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("onSaveInstanceState", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("onRestoreInstanceState", "onRestoreInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "onDestroy")
    }


    override fun onBackPressed() {
        super.onBackPressed()
    }

}