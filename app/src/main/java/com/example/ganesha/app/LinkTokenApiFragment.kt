package com.example.ganesha.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.ganesha.R
import com.example.ganesha.databinding.FragmentLinkTokenApiBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
@AndroidEntryPoint
class LinkTokenApiFragment : Fragment() {
    private lateinit var binding: FragmentLinkTokenApiBinding
    private val viewModel: LinkTokenApiViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_link_token_api,
            container,
            false
        )
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonCreateLinkToken.setOnClickListener {
            viewModel.fetchLinkToken()
        }

        viewModel.linkLoading.observe(viewLifecycleOwner){
            if (it) {
                binding.progressGetLinkToken.visibility = View.VISIBLE
            } else {
                binding.progressGetLinkToken.visibility = View.INVISIBLE
            }
        }
    }
}