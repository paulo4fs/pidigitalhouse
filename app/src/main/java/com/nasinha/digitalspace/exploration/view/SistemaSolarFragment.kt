package com.nasinha.digitalspace.exploration.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import com.nasinha.digitalspace.R

class SistemaSolarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sistema_solar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        view.findViewById<MaterialButton>(R.id.btnIniciarExploracao).setOnClickListener {
            navController.navigate(R.id.action_sistemaSolarFragment_to_planetsMenuFragment)
        }
        view.findViewById<ImageButton>(R.id.btnBackSolarSystem).setOnClickListener {
            activity?.onBackPressed()
        }
    }
}