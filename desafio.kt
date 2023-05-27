enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: MutableList<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} matriculado na formação $nome")
    }
}

fun main() {
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Classes e Objetos")
    val conteudo3 = ConteudoEducacional("Collections")

    val formacao = Formacao("Kotlin Básico", Nivel.BASICO, mutableListOf(conteudo1, conteudo2, conteudo3))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}
