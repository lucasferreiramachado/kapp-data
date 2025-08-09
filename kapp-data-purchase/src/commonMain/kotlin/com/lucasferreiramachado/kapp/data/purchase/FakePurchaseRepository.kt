package com.lucasferreiramachado.module.data.purchase

import com.lucasferreiramachado.module.data.purchase.model.PaymentMethod
import com.lucasferreiramachado.module.data.purchase.model.Purchase
import com.lucasferreiramachado.module.data.purchase.model.ShoppingCartProduct

class FakePurchaseRepository(
    private var purchase: Purchase? = null
): PurchaseRepository {

    override fun startNewPurchase(product: ShoppingCartProduct) {
        purchase = Purchase(
            product
        )
    }

    override fun setAddress(address: String) {
        purchase?.address = address
    }

    override fun setPaymentMethod(paymentMethod: PaymentMethod) {
         purchase?.paymentMethod = paymentMethod
    }

    override fun getCurrentPurchase(): Purchase? = purchase
}