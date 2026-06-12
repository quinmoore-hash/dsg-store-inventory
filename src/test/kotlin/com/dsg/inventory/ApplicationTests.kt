package com.dsg.inventory

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.view

@SpringBootTest
@AutoConfigureMockMvc
class ApplicationTests {

    @Autowired lateinit var mockMvc: MockMvc
    @Autowired lateinit var productRepository: ProductRepository

    @Test
    fun `inventory page requires authentication`() {
        mockMvc.perform(get("/inventory"))
            .andExpect(status().is3xxRedirection)
    }

    @Test
    fun `authenticated user can access inventory`() {
        mockMvc.perform(get("/inventory").with(user("admin").roles("ADMIN")))
            .andExpect(status().isOk)
            .andExpect(view().name("inventory"))
    }

    @Test
    fun `database is seeded with 20 products`() {
        val count = productRepository.count()
        assertEquals(20L, count)
        assertTrue(productRepository.findAll().any { it.category == "Golf" })
    }
}
