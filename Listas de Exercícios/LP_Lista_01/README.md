![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> inputNota[\ Digite sua Nota \]
      inputFrequencia[\ Digite sua Frequência em % \]
    inputNota --> inputFrequencia
    inputFrequencia --> verification{ Nota >= 50 \n e \n Frequência >= 75%? }
    verification --> |Sim| A[/ Aprovado /]
    verification --> |Não| B[/ Reprovado /]
    A --> finish([ Fim ])
    B --> finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> inputNum1[\ Digite o primeiro número \]
    inputNum1 --> inputNum2[\ Digite o segundo número \]
    inputNum2 --> sum[Somar os dois números]
    sum --> result[Exibir o resultado]
    result --> finish([ Fim ])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
       start(( Início )) --> input[\ Digite um número \]
    input --> check{ Número >= 0? }
    check --> |Sim| positive[Exibir Positivo]
    check --> |Não| negative[Exibir Negativo]
    positive --> finish([ Fim ])
    negative --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite sua idade \]
    input --> check{ Idade >= 16 \n e possui titulo ? }
    check --> |Sim| Vote[Exibir Você pode votar.]
    check --> |Não| noVote[Exibir Você não pode votar.]
    
    noVote --> finish([ Fim ])
    Vote --> finish([ Fim ])
 

   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> inputNum1[\ Digite o primeiro número \]
    inputNum1 --> inputNum2[\ Digite o segundo número \]
    inputNum2 --> check{ O primeiro número é maior que o segundo? }
    check --> |Sim| maior1[Exibir O primeiro número é o maior.]
    check --> |Não| check2{ O segundo número é maior que o primeiro? }
    check2 --> |Sim| maior2[Exibir O segundo número é o maior.]
    check2 --> |Não| igual[Exibir Os números são iguais.]
    maior1 --> finish([ Fim ])
    maior2 --> finish
    igual --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
        start(( Início )) --> inputNum1[\ Digite o primeiro número \]
    inputNum1 --> inputNum2[\ Digite o segundo número \]
    inputNum2 --> inputNum3[\ Digite o terceiro número \]
    inputNum3 --> check1{ O primeiro número é maior que os outros dois? }
    check1 --> |Sim| maior1[Exibir O primeiro número é o maior.]
    check1 --> |Não| check2{ O segundo número é maior que o terceiro? }
    check2 --> |Sim| maior2[Exibir O segundo número é o maior.]
    check2 --> |Não| check3{ Os três números são iguais? }
    check3 --> |Sim| igual[Exibir Os números são iguais.]
    check3 --> |Não| maior3[Exibir O terceiro número é o maior.]
    maior1 --> finish([ Fim ])
    maior2 --> finish
    maior3 --> finish
    igual --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
   
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      H["Sua resposta aqui!"]
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      start((Início)) --> inputNum[\Digite um número N\]
    inputNum --> check1{N <= <2?}
    check1 --> |Sim| naoprimo[/Exibir O número não é primo./]
    check1 --> |Não| primo[i=n/2]
    --> check2{i>1}
    check2 --> |Sim| check3{n % i ==0?}
    check2 --> |Não| primo2[/é primo/]
    check3 --> |Sim| naoprimo[/Exibir O número não é primo./]
    check3 --> |Não| resultado[i=i-1]
    primo2 --> finish
    naoprimo --> finish
   ```