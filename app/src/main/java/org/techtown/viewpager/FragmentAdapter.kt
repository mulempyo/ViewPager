package org.techtown.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

//뷰페이저는 리사이클러뷰와 구현 방식이 비슷한데 한 화면에 하나의 아이템만 보이는 리사이클러뷰라고 생각하면 됩니다.
//뷰페이저를 사용하면 여러 개의 화면이 스와이프 되는 앱을 짧은 코드로 작성할 수 있습니다
class FragmentAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {

    var fragmentList = listOf<Fragment>()
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}