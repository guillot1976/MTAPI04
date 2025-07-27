package com.example.productlist.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.productlist.data.Product

class ProductViewModel : ViewModel() {

    private val _products = MutableLiveData<List<Product>>(emptyList())
    val products: LiveData<List<Product>> = _products

    fun loadProducts() {
        _products.value = listOf(
            Product(1, "Zapatos", 29.99),
            Product(2, "Camisa", 19.99),
            Product(3, "Pantalón", 39.99)
        )
    }

    fun clearProducts() {
        _products.value = emptyList()
    }
}
