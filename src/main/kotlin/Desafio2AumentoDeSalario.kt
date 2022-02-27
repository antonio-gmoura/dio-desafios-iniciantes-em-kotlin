import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val salario = input.nextDouble()

    val reajuste = when {
        salario > 2000 -> 4.0
        salario > 1200 -> 7.0
        salario > 800 -> 10.0
        salario > 400 -> 12.0
        else -> 15.0
    }

    val novoSalario = salario * (1 + (reajuste / 100))

    System.out.printf("Novo salario: %.2f\n", novoSalario)
    System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario)
    System.out.printf("Em percentual: ${reajuste.toInt()} %%")

}