package ru.fbtw.pizzaapp.domain

import java.time.LocalDate
import javax.persistence.*

enum class IngredientType {
    piece,
    weight,
    liquid,
}


@Entity
class Ingredient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    @Enumerated(EnumType.STRING)
    var type: IngredientType = IngredientType.piece,
)

@Entity
class IngredientStorageInformation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @OneToOne
    var amount: IngredientAmount? = null,
    @OneToOne
    var notificationLimit: IngredientAmount? = null,
    @OneToOne
    var maximumLimit: IngredientAmount? = null,

    var expirationDate: LocalDate? = null,
)

@Entity
class IngredientAmount(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @OneToOne
    var ingredient: Ingredient? = null
)


@Entity
class ReceptStep(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var title: String? = null,
    var description: String? = null,

    @OneToMany
    @JoinColumn(name = "ingredient_amount_id")
    var ingredientAmountList: MutableList<IngredientAmount> = mutableListOf(),
)

@Entity
class Recept(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var title: String? = null,
    var dificalty: Double? = null,

    @OneToMany
    @JoinColumn(name = "recept_step_id")
    var steps: MutableList<ReceptStep> = mutableListOf(),
)

@Entity
class Pizza(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var title: String? = null,
    var description: String? = null,
    @ElementCollection
    var pictures: MutableList<String> = mutableListOf(),

    @OneToMany
    @JoinColumn(name = "pizza_addon__id")
    var addons: MutableList<PizzaAddon> = mutableListOf(),

    @OneToOne
    var recept: Recept? = null,
)


@Entity
class PizzaPrice(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @OneToOne
    var pizza: Pizza? = null,
    var price: Long? = 1,
    var oldPrice: Long? = 1,
)

enum class PizzaAddonAction {
    include,
    exclude,
}

@Entity
class PizzaAddon(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var description: String? = null,
    @Enumerated(EnumType.STRING)
    var action: PizzaAddonAction = PizzaAddonAction.include,
    @OneToOne
    var ingredient: IngredientAmount? = null,
    var price: Long = 1,
    var oldPrice: Long? = 1,
)

@Entity
class PizzaAppliedAddon(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @OneToOne
    var addon: PizzaAddon? = null,

    var count: Long = 1,
)

