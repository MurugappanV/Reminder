package com.rethinking.silentreminder.ui

/**
 * Created by Murugappan V on 10/19/2018.
 */

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.SparseArray
import android.view.View
import android.widget.Toast
import com.rethinking.silentreminder.R
import com.rethinking.silentreminder.databinding.ActivityMainBinding
import com.rethinking.silentreminder.ui.base.BaseActivity
import com.rethinking.silentreminder.ui.base.BaseHandler
import com.rethinking.silentreminder.ui.base.BaseModel
import com.rethinking.silentreminder.utils.Constants
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable



class MainActivity : BaseActivity(),BaseHandler<BaseModel> {
    override fun onClick(view: View, data: BaseModel?) {
        when(view.id){
            R.id.image -> {
                val drawable = binding?.image?.drawable
                if (drawable is Animatable) {
                    (drawable as Animatable).start()
                }

            }
        }
    }

    private var mRemainderTypeCardAdapter: ReminderTypeCardAdapter? = null
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding?.handlers = this
        val imgs = intArrayOf(R.drawable.wedding_card,R.drawable.wallet_card, R.drawable.ic_android_circle,R.drawable.ic_android_circle)
        setUpViewPager(imgs.toTypedArray())
    }


    private fun setUpViewPager(messageList: Array<Int>) {
        if (mRemainderTypeCardAdapter != null) {
            setUpViews()
        } else {
            mRemainderTypeCardAdapter = ReminderTypeCardAdapter(this.supportFragmentManager,messageList)
            setUpViews()
        }

    }
    private fun setUpViews(){
        binding?.reminderTypeCard?.adapter = mRemainderTypeCardAdapter
        binding?.reminderTypeCard?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(i: Int, v: Float, i2: Int) {

            }

            override fun onPageSelected(i: Int) {
                Toast.makeText(this@MainActivity, "position $i",Toast.LENGTH_SHORT).show()
            }

            override fun onPageScrollStateChanged(i: Int) {

            }
        })
    }

    class ReminderTypeCardAdapter(var fragmentManager: FragmentManager, var list: Array<Int>) : FragmentPagerAdapter(fragmentManager) {
        private val mPageReferences = SparseArray<Fragment>()

        override fun getItem(position: Int): Fragment? {
            var bundle = Bundle()
            val remainderTypeFragment = ReminderTypeFragment()
            mPageReferences.put(position, remainderTypeFragment)
            bundle.putInt(Constants.REMAINDER_TYPE_DRAWABLE_ID,list[position])
            remainderTypeFragment.arguments = bundle
            return remainderTypeFragment
        }

        override fun getCount(): Int {
            return list.size
        }

        override fun getPageWidth(position: Int): Float {
            return 0.25f
        }

    }
}
