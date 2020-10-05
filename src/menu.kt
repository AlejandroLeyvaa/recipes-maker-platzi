fun main(){
   val opciones = object {
        val hacerReceta: String = "hacer receta"
        val verRecetas: String = "ver mis recetas"
        val salir: String = "salir"
        val opcion1: String = "1"
        val opcion2: String = "2"
        val opcion3: String = "3"
    }

    fun verRecetas() {
        do {

            """
                Ver mis recetas
            """.trimIndent()
            val recetas = object {
                val mexicanas: Array<String> = arrayOf<String>("Aguachile", "Tacos de asada", "Guacamole")
                val japonesas: Array<String> = arrayOf<String>("Curry", "Setas teriyaki", "Ramen")
                val colombianas: Array<String> = arrayOf<String>("Arepas", "Bandeja paisa", "Aguapanela con queso")
                val argentinas: Array<String> = arrayOf<String>("chocotorta", "Torta matera", "Medialunas")
                var delMundo = mexicanas.plus(japonesas).plus(colombianas).plus(argentinas)
            }
            var contador: Int = 0
            for (receta in recetas.delMundo) {
                contador ++
                println("$contador $receta")
            }
            println("${contador.plus(1)} Salir")
            val response: String? = readLine()
        } while(!response.equals("salir"))


    }

    fun elegirIngredientes() {
        do {
            val instrucciones = """
            Seleccione los ingredientes que desea
            utilizar
        """.trimIndent()
            var contador: Int = 0
            val ingredientes: List<String> = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite", "Salir")
            for (ingrediente in ingredientes) {
                contador++
                println("$contador. $ingrediente")
            }
            val response: String? = readLine()
        } while(!response.equals("salir"))
    }

    fun menuPrincipal() {
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
                opciones.verRecetas -> verRecetas()
                opciones.salir -> println("Saliendo")

                opciones.opcion1 -> elegirIngredientes()
                opciones.opcion2 -> verRecetas()
                opciones.opcion3 -> println("Saliendo")

                else -> println("No entendí que quizo decir")
            }
        } while (!response.equals("3"))
    }
    menuPrincipal()
}

