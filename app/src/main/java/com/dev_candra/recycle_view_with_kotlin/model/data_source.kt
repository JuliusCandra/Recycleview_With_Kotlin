package com.dev_candra.recycle_view_with_kotlin.model

import com.dev_candra.recycle_view_with_kotlin.R

class data_source {
    companion object{
        fun createDataSet() : ArrayList<model>{
            val list = ArrayList<model>()
            list.add(
                model(
                    "Cupcake",
                    "version 1.5",
                    R.drawable.cupcake
                )
        )

            list.add(
                model(
                    "donut",
                    "version 1.6",
                    R.drawable.donut
                )
        )
            list.add(
                model(
                    "eclair",
                    "version 2.0",
                    R.drawable.eclair
                )
            )

            list.add(
                model(
                    "froyo",
                    "version android 2.2",
                    R.drawable.froyo
                )
        )
            list.add(
                model(
                    "ginggerbread",
                    "version android 2.3",
                    R.drawable.ginggear_bread
                )
        )
            list.add(
                model(
                    "honeycomb",
                    "version android 3.0",
                    R.drawable.honeycomb
                )
        )
            list.add(
                model(
                    "ice crean sandwich",
                    "version android 4.0",
                    R.drawable.ice_cream_sandwich
                )
        )
            list.add(
                model(
                    "jelly bean",
                    "version android 4.1",
                    R.drawable.jellybean
                )
        )
            list.add(
                model(
                    "kitkat",
                    "version android 4.4",
                    R.drawable.kitakat
                )
        )
            list.add(
                model(
                    "lollipop",
                    "version android 5.0",
                    R.drawable.lollipop
                )
        )
            list.add(
                model(
                    "marshmellow",
                    "version android 6.0",
                    R.drawable.marshmellow
                )
        )
            list.add(
                model(
                    "nougat",
                    "version android 7.0",
                    R.drawable.nougat
                )
        )
            list.add(
                model(
                    "oreo",
                    "version android 8.0",
                    R.drawable.oreo
                )
        )
            list.add(
                model(
                    "pie",
                    "version android 10.0",
                    R.drawable.pie
                )
            )

            return list
        }
    }

}