package com.dsg.inventory

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class InventoryController(private val productRepository: ProductRepository) {

    @GetMapping("/login")
    fun login(): String = "login"

    @GetMapping("/inventory")
    fun inventory(model: Model): String {
        model.addAttribute("products", productRepository.findAll())
        return "inventory"
    }
}
