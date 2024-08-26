import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    print("Qual lição gostaria de ver?\n1. Lição-01\n2. Lição-02\n3. Lição-03\n4. Lição-04\n5. Lição-05\n6. Lição-06\n7. Lição-07\n8. Lição-08\n9. Lição-09\n10. Lição-10\n11. Lição-11\n12. Sair\n")
    val licao = readLine()!!.toInt()

    when(licao){
       1 -> licao1()
       2 -> licao2()
       3 -> licao3()
       4 -> licao4()
       5 -> licao5()
       6 -> licao6()
       7 -> licao7()
       8 -> licao8()
       9 -> licao9()
       10 -> licao10()
       11 -> licao11()
       12 -> print("Encerramos por aqui :)")
        else -> println("Valor Inválido!")
    }

}

fun licao1(){

    print("Digite um número: ")
    var n1 = readln()!!.toInt()

    print("Digite outro número: ")
    var n2 = readln()!!.toInt()

    if(n1 > n2){
        print("O primeiro número [$n1] é maior que o segundo [$n2]\n")
    }else if (n2 > n1){
        print("O segundo número [$n2] é maior que o primeiro [$n1]\n")
    }else{
        print("Os numeros [$n1] e [$n2] são iguais.\n")
    }
    main()
}

fun licao2(){

    print("Digite um valor inteiro: ")
    var valor = readln()!!.toInt()

    if(valor > 0){
        print("O valor $valor é positivo\n")
    }else{
        print("O valor $valor é negativo\n")
    }
    main()
}

fun licao3(){

    print("Digite um valor: ")
        val n1 = readln()!!.toInt()
    print("Digite outro valor: ")
        val n2 = readln()!!.toInt()
    print("Digite mais um valor: ")
        val n3 = readln()!!.toInt()

    if(n1 > n2 && n1 > n3){
        print("O maior valor dos três é: $n1\n")
    }else if(n2 > n1 && n2 > n3){
        print("O maior valor dos três é: $n2\n")
    }else{
        print("O maior valor dos três é: $n3\n")
    }
    main()
}

fun licao4(){

    print("Digite um valor: ")
        val n1 = readln()!!.toInt()
    print("Digite outro valor: ")
        val n2 = readln()!!.toInt()
    print("Digite mais um valor: ")
        val n3 = readln()!!.toInt()

    if(n1 > n2 && n3 > n2){
        val soma = n1 + n3
            print("A soma dos dois maiores valores é: $soma\n")
    }else if(n1 > n2  && n2 > n3 ){
        val soma = n1 + n2
            print("A soma dos dois maiores valores é: $soma\n")
    }else if(n2 > n3 && n3 > n1){
        val soma = n2 + n3
            print("A soma dos dois maiores valores é: $soma\n")
    }else if(n2 > n3 && n1 > n3){
        val soma = n2 + n1
            print("A soma dos dois maiores valores é: $soma\n")
    }else if(n3 > n1 && n2 > n1){
        val soma = n3 + n2
            print("A soma dos dois maiores valores é: $soma\n")
    }else if(n3 > n1 && n1 > n2){
        val soma = n3 + n1
            print("A soma dos dois maiores valores é: $soma\n")
    }
    main()
}

fun licao5(){

    println("Me informe seis valores.")
    print("Primeiro valor: ")
        val v1 = readln()!!.toInt()
    print("Segundo valor: ")
        val v2 = readln()!!.toInt()
    print("Terceiro valor: ")
        val v3 = readln()!!.toInt()
    print("Quarto valor: ")
        val v4 = readln()!!.toInt()
    print("Quinto valor: ")
        val v5 = readln()!!.toInt()
    print("Sexto valor: ")
        val v6 = readln()!!.toInt()

    val soma = v1 + v2 + v3 + v4 + v5 + v6
    val media = soma / 6
    print("Os valores informados são: $v1, $v2, $v3, $v4, $v5, $v6.\nA soma deles é: $soma\nA média deles é: $media\n")
    main()
}

fun licao6(){

    println("Me informe quatro valores: ")
    print("Primeiro valor: ")
        val v1 = readln()!!.toInt()
    print("Segundo valor: ")
        val v2 = readln()!!.toInt()
    print("Terceiro valor: ")
        val v3 =  readln()!!.toInt()
    print("Quarto valor: ")
        val v4 = readln()!!.toInt()

    var maior = v1
    if(v2 > v1){
        maior = v2
    }
    if(v3 > v2){
        maior = v3
    }
    if(v4 > v3){
        maior = v4
    }

    print("O primeiro valor informado é [$v1] e o último é [$v4]\nO maior número é: $maior\n")
    main()
}

fun licao7(){

    println("Me informe seis valores")
    print("Primeiro valor: ")
        val v1 = readln()!!.toInt()
    print("Segundo valor: ")
        val v2 = readln()!!.toInt()
    print("Terceiro valor: ")
        val v3 = readln()!!.toInt()
    print("Quarto valor: ")
        val v4 = readln()!!.toInt()
    print("Quinto valor: ")
        val v5 = readln()!!.toInt()
    print("Sexto valor: ")
    val v6 = readln()!!.toInt()

    var soma = 0
    if(v1 < 72) {
        soma = soma + v1
    }
    if(v2 < 72){
        soma = soma + v2
    }
    if(v3 < 72){
        soma = soma + v3
    }
    if(v4 < 72){
        soma = soma + v4
    }
    if(v5 < 72){
        soma = soma + v5
    }
    if(v6 < 72){
        soma = soma + v6
    }
    print("A soma dos valores é [$soma], os números informados é $v1, $v2, $v3, $v4, $v5, $v6\n")
    main()
}

fun licao8(){

    println("Me informe quatro valores")
    print("Primeiro valor: ")
        val v1 = readln()!!.toInt()
    print("Segundo valor: ")
        val v2 = readln()!!.toInt()
    print("Terceiro valor: ")
        val v3 = readln()!!.toInt()
    print("Quarto valor: ")
        val v4 = readln()!!.toInt()

    var soma = 0
    if(v1 > 0 && v1 <= 10){
        soma = soma + v1
    }
    if(v2 > 0 && v2 <= 10){
        soma = soma + v2
    }
    if(v3 > 0 && v3 <= 10){
        soma = soma + v3
    }
    if(v4 > 0 && v4 <= 10){
        soma = soma + v4
    }

    val media = soma / 4
    if(media > 5){
        print("Sua média é $media\nVocê passou no teste.\n")
    }else{
        print("Tente novamente.\n")
        licao8()
    }
    main()
}

fun licao9(){

    println("Em que ano você nasceu? ")
    val ano = readln()!!.toInt()

    if(2024 - ano >= 18){
        print("Este ano você terá que votar\n")
    }else{
        print("Não será necessário votar este ano\n")
    }
    main()
}

fun licao10(){

    print("Qual é o seu gênero?\n[1]-Masculino\n[2]-Feminino\n")
        val genero = readLine()!!.toInt()
        print("Qual é a sua altura?\n")
        val h = readLine()!!.toDouble()

    if(genero == 1){
        val pesoIdeal: Double = (72.7 * h) - 58
        println("O seu peso ideal é: $pesoIdeal")
        main()
    }else if(genero == 2){
        val pesoIdeal = (62.1 * h) - 44.7
        println("O seu peso ideal é: $pesoIdeal")
        main()
    }
}

fun licao11(){


    print("Digite um valor: \n")
        val v1 = readln()!!.toDouble()
    print("Digite outro valor: \n")
        val v2 = readln()!!.toDouble()

    println("Qual conta gostaria de fazer?\n[1]-Adição\n[2]-Subtração\n[3]-Multiplicação\n[4]-Divisão\n[5]-Sair")
        val conta = readln()!!.toInt()

    if(conta == 1){
        var resultado = v1 + v2
        print("O resultado é: $resultado\n")
        licao11()
    }else if(conta == 2){
        var resultado = v1 - v2
        print("O resultado é: $resultado\n")
        licao11()
    }else if(conta == 3){
        var resultado = v1 * v2
        print("O resultado é: $resultado\n")
        licao11()
    }else if(conta == 4) {
        var resultado = v1 / v2
        print("O resultado é: $resultado\n")
        licao11()
    }else if(conta == 5){
        println("Lição encerrada.")
        main()
    }
}