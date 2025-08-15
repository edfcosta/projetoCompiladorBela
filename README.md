# Compilador Bela

Projeto de compilador para a linguagem Bela, desenvolvido em Java com o uso do JavaCC para análise sintática. o programa traduz o código da linguagem bela para um código java.

## Funcionalidades implementadas

- Análise léxica e sintática (parser) da linguagem Bela utilizando JavaCC.
- Estrutura AST (Abstract Syntax Tree) representada por classes Java.
- Geração de código Java a partir da árvore sintática.

## Como executar

### Pré-requisitos

- Java JDK 11 ou superior instalado.
- JavaCC instalado (versão 5.0 recomendada).
- Git para clonar o repositório.

### Passos para rodar

1. Clone o repositório e entre na pasta do projeto:

```bash
git clone https://github.com/edfcosta/projetoCompiladorBela.git
cd projetoCompiladorBela

mkdir programas

javacc Bela.jj
javac *.java

java Bela fatorial.bela

javac programas/*.java
java -cp programas/fatorial
<digitar valor e ENTER>


```



