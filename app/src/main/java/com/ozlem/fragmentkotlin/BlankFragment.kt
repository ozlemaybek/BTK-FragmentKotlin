package com.ozlem.fragmentkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragment : Fragment() {

    // Burada onCreate'i kullanmayacağız bir etkisi olmayacak.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    // Bir dosyayı bir XML dosyasına bağlamak istediğimizde inflater kullanırız.
    // Bu fonksiyon bizden bir görünüm döndürmemizi istiyor.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

}