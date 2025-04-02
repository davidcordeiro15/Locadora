# Locadora

## Descrição
Locadora é um sistema simples para gerenciar o aluguel de veículos, incluindo cálculo de valores de locação e multas por atraso.

## Funcionalidades
- Cadastro de veículos
- Cálculo do valor do aluguel com base no tempo de locação
- Cálculo de multas para devolução atrasada

## Métodos Principais

### `calculaAluguel(int dias, Veiculo veiculo)`
Calcula o valor total do aluguel com base na quantidade de dias.

**Parâmetros:**
- `dias` (int): Número de dias que o veículo será alugado.
- `veiculo` (Veiculo): O objeto veículo a ser alugado.

**Retorno:**
- `double`: O valor total do aluguel.

**Exemplo de Uso:**
```java
Veiculo carro = new Veiculo("Ford KA", 2020, "Ford", 200.0);
double valor = carro.calculaAluguel(5, carro);
System.out.println("Total do aluguel: " + valor);
```

### `calculaMulta(int diasAtraso, Veiculo veiculo)`
Calcula a multa por atraso na devolução do veículo.

**Parâmetros:**
- `diasAtraso` (int): Quantidade de dias de atraso na devolução.
- `veiculo` (Veiculo): O objeto veículo que foi alugado.

**Retorno:**
- `double`: O valor total da multa.

**Exemplo de Uso:**
```java
Veiculo carro = new Veiculo("Ford KA", 2020, "Ford", 200.0);
double multa = carro.calculaMulta(3, carro);
System.out.println("Multa por atraso: " + multa);
```

## Como Executar
1. Certifique-se de ter o [Java 18](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html) instalado.
2. Clone o repositório:
   ```sh
   git clone https://github.com/davidcordeiro15/Locadora.git
   ```
3. Execute o programa:
   Em sua IDE rode o programa Main() 


## Tecnologias Utilizadas
- Java 18
- JUnit 5
- Maven



