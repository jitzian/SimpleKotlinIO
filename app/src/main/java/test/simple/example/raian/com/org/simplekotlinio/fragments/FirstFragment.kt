package test.simple.example.raian.com.org.simplekotlinio.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import test.simple.example.raian.com.org.simplekotlinio.R
import java.util.logging.Logger

class FirstFragment : Fragment() {
    var log = Logger.getLogger(FirstFragment::class.java.simpleName)

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null
    var mButtonFragment: Button?= null
    var rootView: View?=null

    private var mListener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments.getString(ARG_PARAM1)
            mParam2 = arguments.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        log.warning("onCreateView")
        rootView = inflater!!.inflate(R.layout.fragment_first, container, false)

        return rootView
    }

    override fun onStart() {
        super.onStart()
        mButtonFragment = rootView!!.findViewById(R.id.mButtonFragment) as Button?

        mButtonFragment!!.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                log.warning("Neelam is sleeping")

                Snackbar.make(rootView!!, "Kotlin RULES", Snackbar.LENGTH_LONG)
                        .setAction("Action", null)
                        .show()
            }
        })

    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        if (mListener != null) {
            mListener!!.onFragmentInteraction(uri)
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private val ARG_PARAM1 = "param1"
        private val ARG_PARAM2 = "param2"

        fun newInstance(param1: String, param2: String): FirstFragment {
            val fragment = FirstFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }

        fun newInstance(): FirstFragment {
            val fragment = FirstFragment()
            return fragment
        }
    }
}// Required empty public constructor
