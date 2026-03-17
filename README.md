# 📃 Aulas de DS!
Aulas de Desenvolvimento de Software I utilizando java

# Aula 02 - Iniciando Variaveis 📈

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

