package com.ozlem.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickFirstFragment(view : View){

        val fragmentManager = supportFragmentManager
        // Bu fragment ile ilgili değişiklik yapacağız demiş oluyoruz:
        val fragmentTransaction = fragmentManager.beginTransaction()
        // Artık işlemlerimizi fragmentTransaction objesini kullanarak yapabiliriz.

        // Önce Fragment'ı oluşturalım:
        val firstFragment = BlankFragment()
        // add : Başka bir fragement var mı diye bakmaz ve direkt üzerine ekler
        // replace : Öncesinde bir fragment varsa onu kaldırır ve istediğimiz fragment'ı ekler.
        // ilk parametre: conteinerViewId (Bu fragment'ı kim kullanacak)
        // ikinci parametre: Hangi fragment'ı gösterecek
        // .commit() diyerek transaction'ı commit ediyorum yani burada yaptığım işlemi artık sonlandırıyorum.
        fragmentTransaction.replace(R.id.frameLayoutID , firstFragment).commit()
    }

    fun onClickSecondFragment(view : View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val secondFragment = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayoutID , secondFragment).commit()
    }
}