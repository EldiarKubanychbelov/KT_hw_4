package kg.geektech.kt_hw_4.ui.fragments

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.geektech.kt_hw_4.MainActivity

class ViewPagerAdapter(private val fragments: ArrayList<Fragment>, mainActivity: MainActivity) : FragmentStateAdapter(mainActivity){

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }


}