fun main(){
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

    val opciones = object {
        val hacerReceta: String = "hacer receta"
        val verRecetas: String = "ver mis recetas"
        val salir: String = "Salir"
        val opcion1: Int = 1
        val opcion2: Int = 2
        val opcion3: Int = 3
    }

    val ingredientes: List<String> = listOf("Agua", "Harina", "Huevos")

    val recetas = object {
        val mexicanas: List<String> = listOf<String>("Aguachile", "Tacos de asada", "Guacamole" )
        val japonesas: List<String> = listOf<String>("Curry", "Setas teriyaki", "Ramen" )

    }

    if (response?.toLowerCase().equals(opciones.hacerReceta)) {
        println("Elegir ingredientes")
    }

    if (response?.toLowerCase().equals(opciones.verRecetas)) {
        for (receta in recetas.mexicanas.plus(recetas.japonesas) ) {
            println(receta)
        }
    }

    if(response?.toLowerCase().equals(opciones.salir))





}

