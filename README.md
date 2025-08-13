# Compilador Bela

Projeto de compilador para a linguagem Bela, desenvolvido em Java com o uso do JavaCC para análise sintática.

## Funcionalidades implementadas

- Análise léxica e sintática (parser) da linguagem Bela utilizando JavaCC.
- Estrutura AST (Abstract Syntax Tree) representada por classes Java.
- Geração parcial de código Java a partir da árvore sintática (em desenvolvimento).

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

javacc Bela.jj

javac *.java

java Bela exemplo.bela
