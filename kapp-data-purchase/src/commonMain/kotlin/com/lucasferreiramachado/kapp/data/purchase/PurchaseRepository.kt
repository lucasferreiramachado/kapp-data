package com.lucasferreiramachado.module.data.purchase

import com.lucasferreiramachado.module.data.purchase.model.PaymentMethod
import com.lucasferreiramachado.module.data.purchase.model.Purchase
import com.lucasferreiramachado.module.data.purchase.model.ShoppingCartProduct

interface PurchaseRepository {
    fun startNewPurchase(product: ShoppingCartProduct)
    fun setAddress(address: String)
    fun setPaymentMethod(paymentMethod: PaymentMethod)
    fun getCurrentPurchase(): Purchase?
}