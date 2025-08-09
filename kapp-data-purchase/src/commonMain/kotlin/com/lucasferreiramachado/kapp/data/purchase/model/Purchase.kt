package com.lucasferreiramachado.module.data.purchase.model


data class Purchase(
    var purchasedProduct: ShoppingCartProduct,
    var address: String? = null,
    var paymentMethod: PaymentMethod? = null,
)