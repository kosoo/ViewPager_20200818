package kr.co.tjoeun.viewpager_20200818.adapters

import android.location.Address
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.viewpager_20200818.fragments.AddressFragment
import kr.co.tjoeun.viewpager_20200818.fragments.NameFragment
import kr.co.tjoeun.viewpager_20200818.fragments.PhoneFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){
            0 -> "이름"
            1 -> "폰번"
            else -> "거주지"
        }

    }

    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> NameFragment()
            1 -> PhoneFragment()
            else -> AddressFragment()
        }

    }

    override fun getCount(): Int {
        return 3
    }
}