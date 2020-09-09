package com.dev_candra.recycle_view_with_kotlin.util

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class top_spacing_decoration(val padding : Int): RecyclerView.ItemDecoration(){
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.top = padding
    }
}