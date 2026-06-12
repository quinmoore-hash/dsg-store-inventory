package com.dsg.inventory

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class DataSeeder(private val productRepository: ProductRepository) : ApplicationRunner {

    override fun run(args: ApplicationArguments) {
        val products = listOf(
            Product(name = "Nike Alpha Menace Cleats", category = "Footwear", price = 89.99, stock = 34),
            Product(name = "Spalding NBA Basketball", category = "Team Sports", price = 29.99, stock = 52),
            Product(name = "CAP Hex Dumbbells 20lb Pair", category = "Fitness", price = 44.99, stock = 18),
            Product(name = "Titleist Pro V1 Golf Balls (12pk)", category = "Golf", price = 54.99, stock = 67),
            Product(name = "Rawlings Heart of the Hide Glove", category = "Baseball", price = 249.99, stock = 8),
            Product(name = "Wilson Evolution Basketball", category = "Team Sports", price = 69.99, stock = 25),
            Product(name = "Adidas Adizero Cleats", category = "Footwear", price = 129.99, stock = 15),
            Product(name = "Bowflex Adjustable Dumbbells", category = "Fitness", price = 349.99, stock = 6),
            Product(name = "Callaway Chrome Soft Golf Balls (12pk)", category = "Golf", price = 47.99, stock = 43),
            Product(name = "Louisville Slugger Bat", category = "Baseball", price = 199.99, stock = 12),
            Product(name = "Under Armour Spotlight Cleats", category = "Footwear", price = 99.99, stock = 22),
            Product(name = "Yoga Mat Premium 6mm", category = "Fitness", price = 34.99, stock = 41),
            Product(name = "TaylorMade SIM2 Driver", category = "Golf", price = 499.99, stock = 4),
            Product(name = "Mizuno MVP Prime Glove", category = "Baseball", price = 119.99, stock = 14),
            Product(name = "Kettlebell 35lb Cast Iron", category = "Fitness", price = 54.99, stock = 29),
            Product(name = "Franklin Soccer Ball Size 5", category = "Team Sports", price = 19.99, stock = 60),
            Product(name = "DeMarini CF Zen Bat", category = "Baseball", price = 349.99, stock = 7),
            Product(name = "Ping G425 Iron Set", category = "Golf", price = 899.99, stock = 3),
            Product(name = "Resistance Bands Set", category = "Fitness", price = 24.99, stock = 75),
            Product(name = "Nike Vapor Jet Gloves", category = "Team Sports", price = 39.99, stock = 38)
        )
        productRepository.saveAll(products)
    }
}
