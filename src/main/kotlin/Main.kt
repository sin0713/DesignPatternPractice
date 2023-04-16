import com.practice.design.iterator.CoffeeMemo
import com.practice.design.iterator.DripRecipe

fun main(args: Array<String>) {
    val coffeeMemo = CoffeeMemo()
    coffeeMemo.addRecipe(
        DripRecipe(
            "brazil",
            "medium roast",
            "fine"
        )
    )
    coffeeMemo.addRecipe(
        DripRecipe(
            "brazil",
            "medium roast",
            "fine"
        )
    )
    coffeeMemo.addRecipe(
        DripRecipe(
            "brazil",
            "high roast",
            "coarse"
        )
    )

    val iterator: Iterator<DripRecipe> = coffeeMemo.iterator()

    while(iterator.hasNext()) {
        val recipe: DripRecipe = iterator.next()
        println(recipe.showRecipeInfo())
    }
}