package com.bach.dv.bulletcurtain

import android.content.Context
import android.util.AttributeSet
import android.view.View

class BulletVideoTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : BulletVideoView<String>(context, attrs, defStyleAttr) {

    override fun drawView(item: String): View {
        TODO("Not yet implemented")
    }
}