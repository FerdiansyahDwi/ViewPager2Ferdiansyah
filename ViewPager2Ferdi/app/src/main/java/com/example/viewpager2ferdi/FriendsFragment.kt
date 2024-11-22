package com.example.viewpager2ferdi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FriendsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FriendsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var friendAdapter: MyFriendAdapter
    private val friends = mutableListOf<MyFriend>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_friends, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        setupRecycleView()
        return view
    }

    private fun setupRecycleView() {
        friends.addAll(
            listOf(
                MyFriend("Ferdi","081432765987","ferdi@email.com"),
                MyFriend("Maftuh", "081122334445","maftuh@email.com"),
                MyFriend("Bintang", "085850123321","bintang@email.com"),
                MyFriend("Aril", "085124424346","aril@email.com"),
                MyFriend("Al", "085623115663","al@email.com"),
                MyFriend("Kusuma", "08111225447","kusuma@email.com"),
                MyFriend("Alfian", "081467394249","alfian@email.com"),
                MyFriend("Dido", "085122369425","dido@email.com"),
                MyFriend("Anas", "085212574421","anas@email.com"),
                MyFriend("Wahyu", "085728391461","wahyu@email.com"),
                MyFriend("Robi", "081953324146","robi@email.com"),
                MyFriend("Naulan", "085127324189","naulan@email.com"),
                MyFriend("Ainul", "081417344749","ainul@email.com"),
                MyFriend("Axl", "082142536424","axl@email.com")
            )
        )

        friendAdapter = MyFriendAdapter(friends)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = friendAdapter
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FriendsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FriendsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}