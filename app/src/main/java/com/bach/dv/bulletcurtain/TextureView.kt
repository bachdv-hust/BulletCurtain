package com.bach.dv.bulletcurtain

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.constraintlayout.motion.widget.MotionLayout
import java.util.concurrent.Flow
import kotlin.math.pow


class TextureView : LinearLayout {
    constructor(context: Context) : super(context) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView(context, attrs = attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initView(context, attrs = attrs)
    }

    private fun initView(context: Context, attrs: AttributeSet? = null) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = inflater.inflate(R.layout.layout_bullet_curtain, this, true)
        val text = view.findViewById<View>(R.id.text )
        val maxWidth = 200
        val maxHeight = 3000

    }


}


class MathsCalculator(private val x0: Float, private val y0: Float) {
    fun getYFromX(x: Float): Float {
        return x0 * x.pow(2) + y0
    }
}





