package com.lucasferreiramachado.kapp.data
public object AppDeeplink {

    var schemes: List<String> = listOf(
         "myapp:/", "myapp://",
    )

    fun defaultScheme(): String = schemes.first()
}