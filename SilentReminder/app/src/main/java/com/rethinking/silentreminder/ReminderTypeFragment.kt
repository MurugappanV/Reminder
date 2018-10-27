package com.rethinking.silentreminder

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ReminderTypeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ReminderTypeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ReminderTypeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_reminder_type, container, false)
    }
}
