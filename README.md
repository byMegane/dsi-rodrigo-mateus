
# 📃 Aulas de DS!
Aulas de Desenvolvimento de Software I utilizando java

# Aula 05 - Operações com Variáveis
Aqui, veremos todas as operações que podemos fazer:
| Operação | Resultado | Explicação | Conta |
| :--- | :---: | :---: | :--- |
| **x = 10** | 10 | Você está atribuindo o valor 10 ao x| x = 10
| **x += 2** | 12 | Você adicionou 2 ao x | 10 + 2
|**x -= 3** | 9 | Você subtraiu 3 de x | 12 - 3
|**x** ***=** **2** |18| Você multiplicou 2 ao x | 9 * 2
|**x /= 3** | 6 | Você dividiu x por 3 | 18 / 3
|**x %= 4** | 2 | Ele exibe apenas o resto da divisão | 6 / 4

Agora, lidando com **bits**:
| Operação | Resultado | Resultado em bits |Explicação | Conta |
| :--- | :---: | :---: |  :---: |:--- |
|**x &= 22**| 2 | 00000010| Ele analisa os 2 números (2 e 22) na sua forma em bit, e exibe um novo número onde tem os bits "1" na mesma posição (em bit 22 = 00010110)| 00000010 <u>00010110</u> 00000010
|**x I= 5** | 7 | 00000111 | É um pouco mais simples, ele mescla e mantém todos os bits "1" (em bit 5=00000101) | 00000010 <u>00000101</u> 00000111
|**x ^= 3** | 4 | 00000100 | Ele só exibe bit "1" quando ele esta comparado com o bit "0" (em bit 3=00000011) | 00000111 <u>00000011</u> 00000100
|**x >>= 2**| 1 | 00000001 | Ele moveu pra direita 2 bits, jogando 2 bits da direita fora| 00000100 <u>>>00000100</u> 00000001
|**x x <<= 5**| 32 | 00100000 | Ele moveu pra esquerda 5 bits, jogando 5 bits da esquerda fora | 00000001 <u>001<<<<<</u> 00100000

- Para uma explicação mais detalhada, acesse o [projeto da aula 05](https://github.com/byMegane/dsi-rodrigo-mateus/blob/main/aula05/LicaoDeCasa.java)

# Aula 04 - Declarações de Variáveis de texto e número

## 1 - Tipos de declaração de número
**Se referem ao tamanho do número**
```java
long // números longos // 64 bits
int // números inteiros de tamanho normal // 32 bits
short // números curtos // 16 bits
byte // números extremamente curtos //8 bits
```
**Lembrando que:**
```
0 || 1 -> 1 Bit
8 bits -> 1 Byte
```
**Dizem sobre decimais:**
```java
float x = 12.2f // números decimais com precisão simples, com "f" no final
double y = 12.25d // números decimais com mais precisão, com "d" no final
double z = 12e2d // o "e" serve para notação cientifica, indicando o expoente
```
## 2 - Significado dos sinais
```==``` ------------> igual
```===``` ----------> estritamente igual
```=> ou <=``` ----> maior igual ou menor igual
```||``` -------------> ou
```&&``` -----------> e
## 3 - Declaração de texto
São poucos que mexem com texto
```java
string - armazena texto
char - armazena 1 caractére 
boolean - true or false // sim ou não
```


# Aula 03 - Continuando Variáveis Básicas

## 1 - Tipos de nomes de variáveis
- **É como nós optamos como será o nome das nossas variáveis, sendo**:
```Pascal case - NomeVariavel``` // (para variáveis)
```Camel case - nomeVariavel``` // (para variáveis)
```Snake case - nome_variavel | NOME_VARIAVEL``` // (para constantes)
```Kebab case - nome-variavel | NOME_VARIAVEL ```
(Variáveis totalmente maiúsculas são chamadas de **screaming**)

## 2 - Utilizando variáveis
- Nessa aula, vimos a soma básica de variáveis, como observado no [projeto da aula 03](https://github.com/byMegane/dsi-rodrigo-mateus/blob/main/aula03/Variaveis.java)


# Aula 02 - Iniciando Variáveis 📈

## **1 - Criação de arquivo** 📝
No terminal do Vscode (```ctrl + '```), digite esses comandos para ele identificar seu arquivo e sua pasta:
```java
cd [nome da pasta] // navega pelas pastas, identificando-a
javac .\Main.java // "javac" serve para compilar o codigo
java .\Main.java // roda o codigo
```
## 2 - Regras do Java / resumo da aula⚒️

1 - Nessa aula, eu aprendi como o java diferencia variáveis, visto no exemplo abaixo:
```java
1 == 1 (um é igual a um?)
1 == "1" (um é igual a un?) // aqui ele so analisa o caractere
1 === "1' (um é exatamente igual a un?) // aqui ele analisa o tipo de variável q ele é 
```

2 - Aprendemos também a juntar strings e vimos o ```.concat```, como visto no [projeto da aula 2](https://github.com/byMegane/dsi-rodrigo-mateus/blob/main/aula02/Variaveis.java).

# Aula 01 - Iniciando Java ✅

##  Configurando a máquina ⚙️

1. **Instalação do JDK**: Instalei o Java da [Adoptium (Temurin)](https://adoptium.net/)
2. **Configuração no VS Code**:
   - Instalei o *Extension Pack for Java* da Microsoft
   - Configurei o path do Vscode para reconhecer o JDK da Adoptium nas configurações  `java.jdt.ls.java.home`

## Regras do Java ⚒️

- **Letras maiúsculas**: O Java diferencia as letras maiúsculas de minúsculas, onde o `Main` (ou o nome do arquivo) precisa ser maiúsculo
- **Nomes dos Arquivos**: O nome do arquivo deve ser exatamente igual ao nome da classe pública (ex: `Main.java` para a classe `Main`).

## Explicação do Código  👀

Sobre o código `Main.java`:

```java
package aula01; //define q pertence a pasta aula01

public  class  Main {  //ca
// racteriza o arquivo, onde declara sua classe e seu nome (main)
	public  static  void  main(String[] args) {
		System.out.println("Hello World"); //exibe a frase na tela
	}
}
```
## Configurando o git ⚙️

1. **Instalando o GitBash**: Clique no [Git](https://git-scm.com/install/windows);
2. **Comandos do GitBash**: 
```
git config --global user.name  'Rodrigo Mateus'
git config --global user.email rodrigoglasses@gmail.com
git clone https://github.com/byMegane/dsi-rodrigo-mateus.git
code . (para abrir o vs code)
ls
cd dsi-rodrigo-mateus/
```
