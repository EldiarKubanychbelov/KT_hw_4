
package kg.geektech.kt_hw_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import kg.geektech.kt_hw_4.databinding.ActivityMainBinding
import kg.geektech.kt_hw_4.ui.fragments.FirstFragment
import kg.geektech.kt_hw_4.ui.fragments.SecondFragment
import kg.geektech.kt_hw_4.ui.fragments.ThirdFragment
import kg.geektech.kt_hw_4.ui.fragments.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragments:ArrayList<Fragment> = arrayListOf(
                FirstFragment(),
                SecondFragment(),
                ThirdFragment()
        )
        val viewPager2 = ViewPagerAdapter(fragments,this)
        binding.ViewPager2.adapter = viewPager2
    }
}