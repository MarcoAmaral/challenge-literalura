
# 📚 Challenge LiterAlura ![MIT License](https://img.shields.io/badge/License-MIT-green.svg)
Challenge aplicação back-end para busca e persistência de livros implementado com a [API Gutendex](https://gutendex.com).<br>
Proposto pela Oracle Next Education, na formação de Back-end Java, em parceria com a Alura.

## 🛠️ Sobre o projeto 🛠️

- Uma aplicação back-end, simples e robusta, desenvolvida seguindo as melhores práticas de programação e organizada em uma arquitetura de camadas, que separa o código por funcionalidades. 
- Seu propósito é buscar livros utilizando a API Gutendex, armazenar os dados dos livros em um banco de dados relacional e fornecer funcionalidades para pesquisar os registros já salvos. 
- A interação com a aplicação ocorre por meio de linhas de comando, contando com um menu de opções para facilitar a navegação.

## 💡 Como funciona? 💡
- Ao iniciar a aplicação, é exibido um menu de interação que permite ao usuário selecionar uma das opções numeradas de 1 a 5, sendo a opção 0 destinada a encerrar a aplicação. O usuário deve inserir um número inteiro como entrada.
  <br>
<div align="center">
  <img alt="Menu Inicial" src="/assets/images/image-1.png">
</div>
<br>

- Ao selecionar a opção "1 - <b>Buscar livro pelo título"</b>, o usuário deverá inserir o nome de um livro ou de um autor para realizar a busca. Os resultados encontrados serão exibidos na tela e os dados correspondentes serão armazenados no banco de dados.
  <br>
<div align="center">
  <img alt="Busca por titulo" src="/assets/images/image-2.png">
</div>
<br>

- Com livros e autores já armazenados no banco de dados, o usuário pode selecionar as opções de 2 a 5, que permitem realizar consultas personalizadas nos registros salvos.
  <br>
<div align="center">
  <img alt="Busca livros registrados" src="/assets/images/image-3.png">
</div>
<br>
<div align="center">
  <img alt="Busca autores registrados" src="/assets/images/image-4.png">
</div>
<br>

## 🖥️ Tecnologias e ferramentas utilizadas 🤖
- Java (JDK 21)
- Spring Boot e JPA Hibernate
- Maven (3.4.1)
- IntelliJ e GIT
- PostgreSQL 17.2.3
- [Gutendex API](https://gutendex.com)