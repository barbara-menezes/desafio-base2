# Desafio Base2 - Selenium Java Test Automation

Este projeto é uma implementação de testes automatizados utilizando o Selenium WebDriver e a linguagem Java. O objetivo é garantir que as funcionalidades do sistema sejam testadas de forma eficiente e automatizada, utilizando boas práticas de desenvolvimento de testes.

## Dependências

Este projeto utiliza as seguintes dependências:

- **JUnit 5**: Para execução dos testes unitários e de integração.
- **Selenium WebDriver**: Para automação de testes no navegador.
- **Selenium ChromeDriver**: Driver necessário para executar testes automatizados no navegador Chrome.
- **JavaDotenv**: Para carregar variáveis de ambiente de um arquivo `.env`, facilitando a configuração de credenciais e parâmetros sensíveis.

## Pré-requisitos

Antes de começar, verifique se você tem as seguintes ferramentas instaladas no seu sistema:

- **Java 11 ou superior**: O código foi desenvolvido e testado com a versão mais recente do JDK.
- **Maven**: Para gerenciar dependências e executar os testes.
- **Chrome**: O Selenium usa o ChromeDriver para rodar os testes no navegador Google Chrome.

## Configuração

### 1. Clonar o Repositório

Clone este repositório para o seu ambiente local:

```bash
git clone git@github.com:barbara-menezes/desafio-base2.git
cd desafio-base2
```

### 2. Instalar as Dependências

Execute o seguinte comando para instalar as dependências do projeto:

## Estrutura do Projeto

- **src/test/java**: Contém os testes automatizados escritos em Java.
- **src/test/resources**: Arquivos de configuração, como o arquivo `.env` para carregar variáveis de ambiente.
```bash
mvn install
```

### 4. Configurar Variáveis de Ambiente

O projeto usa o **JavaDotenv** para carregar variáveis de ambiente. Crie um arquivo `.env` na raiz do projeto com as seguintes variáveis utilizando dados reais de usuário e senha (esses dados foram repassados por email para a base2 conforme solicitado):

```
USER_NAME=
PASSWORD=
```

### 6. Executar os Testes

Com tudo configurado, você pode rodar os testes utilizando o Maven. Para executar todos os testes, use o seguinte comando:

```bash
mvn test -e
```

![build success](../desafio-base2/screenshot_build_success.png)

## Contato

Se você tiver alguma dúvida ou sugestão, fique à vontade para abrir uma issue ou entrar em contato diretamente.

---

**Desafio Base2 - Selenium Java Test Automation**  
Desenvolvido por Bárbara Menezes