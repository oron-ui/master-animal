package bernat.oron.catadoption.fragments

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import bernat.oron.catadoption.R

class FragmentImageFullScreen : Fragment(){

    lateinit var draws : Array<Drawable>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_image_full_screen, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val img = view.findViewById<ImageView>(R.id.image_full)
        img.setImageDrawable(draws.random())

    }
}