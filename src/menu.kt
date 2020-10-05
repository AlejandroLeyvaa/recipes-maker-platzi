fun elegirIngredientes() {
    do {
        val instrucciones = """
            Seleccione los ingredientes que desea
            utilizar
        """.trimIndent()
        val response: String? = readLine()

        val ingredientes: List<String> = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite", "Salir")
        for (ingrediente in ingredientes) {
            println(ingrediente)
        }
    } while(!response?.toLowerCase().equals("salir"))

}

fun main(){
    val opciones = object {
        val hacerReceta: String = "hacer receta"
        val verRecetas: String = "ver mis recetas"
        val salir: String = "salir"
        val opcion1: String = "1"
        val opcion2: String = "2"
        val opcion3: String = "3"
    }

    val recetas = object {
        val mexicanas: List<String> = listOf<String>("Aguachile", "Tacos de asada", "Guacamole")
        val japonesas: List<String> = listOf<String>("Curry", "Setas teriyaki", "Ramen")
    }

    /*if (response?.toLowerCase().equals(opciones.hacerReceta)) {
        println("Elegir ingredientes")
    }

    if (response?.toLowerCase().equals(opciones.verRecetas)) {
        for (receta in recetas.mexicanas.plus(recetas.japonesas)) {
            println(receta)
        }
    }

    if (response?.toLowerCase().equals(opciones.salir)) {
        println("Elegir ingredientes")
    }*/

    do {
        val instrucciones = """
        Selecciona la opción deseada, escribiendo
        el número correspondiente, o escribiendo la
        acción deseada "Hacer receta"
        1. Hacer receta
        2. Ver mis recetas
        3. Salir
        """.trimIndent()
        println(instrucciones)
        val response: String? = readLine()

        when(response?.toLowerCase()) {
            opciones.hacerReceta -> elegirIngredientes()
            opciones.verRecetas ->  for (receta in recetas.mexicanas.plus(recetas.japonesas)) {
                println(receta)
            }
            opciones.salir -> println("Saliendo")

            opciones.opcion1 -> elegirIngredientes()
            opciones.opcion2 ->  for (receta in recetas.mexicanas.plus(recetas.japonesas)) {
                println(receta)
            }
            opciones.opcion3 -> println("Saliendo")

            else -> println("No entendí que quizo decir")
        }
    } while (!response.equals("3"))

}

