1 - Dinheiro multi-moeda

2 - Degenerar Objetos

Eliminando efeitos colaterais nos resultados.

3 - Igualdade para Todos

Implementando método equals()

4 - Privacidade

A variável amount foi convertida para **private** e os tests foram ajustados.

5 - Falando Franca-mente*

Adicionando nova moeda (Franco).
- basicamente a regra do Dolar foi replicada.

6 - Igualdade para Todos, Restaurada

- Os métodos "equals()" de Franc e Dollar foram movidos para uma class Pai chamada **Money**
- A variável **amount** também foi movida para a class pai. _(Sem essa alteração aconteceria um erro no equals do pai)_

7 - Maçãs e Laranjas

Como implementamos o equals() padrão do Java a comparação do **"getClass()"** já estava sendo feita e **5 Dollars** já é considerado diferente de **5 Francs.**

8 - Fazendo Objetos

- Criamos métodos static na class Money para criação de objetos Dollar e Franc

9 - Tempos em que Estamos Vivendo*

- Acrescentamos uma variável para retornar uma String representando a sigla da moeda;
- Adicionamos no constructor a definição da sigla da moeda;