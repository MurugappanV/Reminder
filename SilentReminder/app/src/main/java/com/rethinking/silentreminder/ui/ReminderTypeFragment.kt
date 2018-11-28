package com.rethinking.silentreminder.ui

import android.databinding.DataBindingUtil
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rethinking.silentreminder.R
import com.rethinking.silentreminder.databinding.FragmentReminderTypeBinding
import com.rethinking.silentreminder.utils.Constants
import dagger.android.support.DaggerFragment
import android.graphics.drawable.Animatable




class ReminderTypeFragment : DaggerFragment() {
    private var binding: FragmentReminderTypeBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_reminder_type, container, false)
        arguments?.getInt(Constants.REMAINDER_TYPE_DRAWABLE_ID,0)?.let {
            var drawable = resources.getDrawable(it) as Drawable
            if (drawable is Animatable) {
                (drawable as Animatable).start()
            }
            binding?.reminderTypeImage?.setImageResource(it)
        }
        return binding?.root
    }
}
