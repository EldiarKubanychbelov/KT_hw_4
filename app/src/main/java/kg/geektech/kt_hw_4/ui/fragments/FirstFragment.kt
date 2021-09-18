package kg.geektech.kt_hw_4.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kg.geektech.kt_hw_4.R
import kg.geektech.kt_hw_4.databinding.FragmentFirstBinding
import kg.geektech.kt_hw_4.ui.ModelThirdFr

class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: ModelThirdFr

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(ModelThirdFr::class.java)

        binding.PLUS.setOnClickListener {
            viewModel.onIncrementClick()
        }

        binding.MINUS.setOnClickListener {
            viewModel.onItemClickMinus()
        }

    }

}