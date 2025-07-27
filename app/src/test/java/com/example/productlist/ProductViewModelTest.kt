package com.example.productlist

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.productlist.ui.ProductViewModel
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class ProductViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Test
    fun `cuando el listado tiene productos, se deben mostrar`() {
        val viewModel = ProductViewModel()
        viewModel.loadProducts()
        val result = viewModel.products.value
        assertNotNull(result)
        assertTrue(result!!.isNotEmpty())
    }

    @Test
    fun `cuando el listado está vacío, no se debe mostrar información`() {
        val viewModel = ProductViewModel()
        viewModel.clearProducts()
        val result = viewModel.products.value
        assertNotNull(result)
        assertTrue(result!!.isEmpty())
    }
}
