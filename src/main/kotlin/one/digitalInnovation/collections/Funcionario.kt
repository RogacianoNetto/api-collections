package one.digitalInnovation.collections

data class Funcionario(val nome: String, val salario: Double, val modalidContrat:String, val idade: String, val cargo: String) {
    override fun toString(): String =
        """
            Nome:                       $nome
            Salário:                    $salario
            Modalidade Contratação:     $modalidContrat
            Idade:                      $idade
            cargo:                      $cargo
         
        """.trimIndent()
}






