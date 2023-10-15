enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        // Adicione o usuário à lista de inscritos na formação.
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado na formação: $nome")
    }
}

fun main() {
    // Crie alguns objetos de usuário e conteúdo educacional para testar.
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 90)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 120)

    // Crie uma formação e matricule os usuários nela.
    val formacao = Formacao("Formação de Desenvolvimento de Software", listOf(conteudo1, conteudo2))
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}

