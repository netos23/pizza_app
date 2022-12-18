package ru.fbtw.pizzaapp.domain

import javax.persistence.*

@Entity
class Offer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @OneToOne
    var pizza: Pizza? = null,

    @OneToMany
    var appliedAddons: MutableList<PizzaAppliedAddon> = mutableListOf(),
)


@Entity
class Basket(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @OneToOne
    var user: User? = null,

    @OneToMany
    var offers: MutableList<Offer> = mutableListOf(),
)

enum class OrderState {
    verification,
    waitingForCooking,
    cooking,
    waitingForDelivery,
    delivery,
    complited,
    canseled,
}


@Entity
class Order(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var price: Long = 1,
    var oldPrice: Long? = 1,
    var state: OrderState = OrderState.verification,

    @OneToOne
    var cook: User? = null,

    @OneToOne
    var deliveryman: User? = null,

    @OneToOne
    var owner: User? = null,

    @OneToMany
    var offers: MutableList<Offer> = mutableListOf(),

)


