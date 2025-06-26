<h1>Desafio Atletas Java</h1>

<p>Fazer um programa para ler uma quantidade N (supor N > 0), depois ler os dados de N atletas (nome,
sexo, altura, peso). Depois, mostrar um relatório contendo: </p>

<ul>
    <li> Peso médio dos atletas</li>
    <li>Nome do atleta mais alto</li>
    <li> Porcentagem de homens </li>
    <li> Altura média das mulheres </li>
</ul>
<p>Caso não sejam digitadas mulheres, a altura média não poderá ser calculada (pois divisão por zero não
existe). Neste caso, apenas mostrar a mensagem "Não há mulheres cadastradas". </p>

<p>Fazer validações de dados para altura e peso, não permitindo digitar valores não positivos para esses
dados. Faça também a validação do sexo, não permitindo valores diferentes de F e M.</p>

<p>Dica: para validar o sexo, a lógica é: tem que pedir para o usuário digitar novamente enquanto o valor
digitado for diferente de "F" E diferente de "M" </p>

<h2>Exemplo 1</h2>
<div>
    Qual a quantidade de atletas? 3 <br>
    Digite os dados do atleta numero 1: <br>
    Nome: Carlos Silva <br> 
    Sexo: M <br>
    Altura: -1.5 <br>
    Valor invalido! Favor digitar um valor positivo: 0 <br>
    Valor invalido! Favor digitar um valor positivo: 1.75 <br>
    Peso: 84.8 <br>
    Digite os dados do atleta numero 2: <br>
    Nome: Maria José <br>
    Sexo: F <br>
    Altura: 1.71 <br>
    Peso: 64.5 <br>
    Digite os dados do atleta numero 3: <br>
    Nome: Teresa Borges <br>
    Sexo: R <br>
    Valor invalido! Favor digitar F ou M: S <br>
    Valor invalido! Favor digitar F ou M: F <br>
    Altura: 1.65 <br>
    Peso: 0 <br>
    Valor invalido! Favor digitar um valor positivo: -60 <br>
    Valor invalido! Favor digitar um valor positivo: 54.3 <br> <br>
    RELATÓRIO: <br>
    Peso médio dos atletas: 67.87 <br>
    Atleta mais alto: Carlos Silva <br>
    Porcentagem de homens: 33.3 % <br>
    Altura média das mulheres: 1.68 <br>
</div>

<h2>Exemplo 2 </h2>
<div>
    Qual a quantidade de atletas? 1 <br>
    Digite os dados do atleta numero 1: <br>
    Nome: Carlos Silva <br>
    Sexo: M <br>
    Altura: 1.75 <br>
    Peso: 84.8 <br> <br>
    RELATÓRIO: <br>
    Peso médio dos atletas: 84.80 <br>
    Atleta mais alto: Carlos Silva <br>
    Porcentagem de homens: 100.0 % <br>
    Não há mulheres cadastradas <br>

</div>