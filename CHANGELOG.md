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

9.1 - Tempos em que Estamos Vivendo*

- A variável **"currency"** na **class** Money foi alterada de **private** para **protected** e foi retirada das classes Dollar e Money
- Subimos os construdores de ambos objetos para o constructor do **super**

10 Tempos interessantes

- Conciliando implementação do método **times();**
- Escrevendo toString() na super **class Money;**
- Ajustes em método equals();

11 A Raiz de todo Mal

- Eliminamos as subclasses Dolar e Franc

12 Adição, Finalmente

- Criando classes Bank, Expression;
- Criando método reduce;

13 Faça-o

- Eliminando duplicação de código e implementando reduce Bank;
- Acrescentando reduce em interface Expression e implementando na class Money;
- Forçamos a criação de uma class Sum que recebe sua responsabilidade;


14 Mudança

- Acrescentamos uma class auxiliar Pair para auxiliar lógica de taxas em um objeto Map
- Lógica para adicionar taxa de câmbio
- Lógica para converter Francos em Dollar
