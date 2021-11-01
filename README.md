## React

* Para criar o ambiente React
```cli
    npx create-react-app frontend --template typescript
```

## Spring Boot
* Vscode: Instalar Lombok, Java Extension Pack e Spring Boot Extension Pack
* Para criar o ambiente Spring Boot
* https://start.spring.io/
* Spring Initializr ajuda a criar o projeto
* Seleciona Maven como gerenciador de projeto de
* Linguagem Java
* Versao 2.4.12 por ser mais otimizada
* Group: com.devsuperior => base do pacote das classes
* Artifact e Name: dsvendas => nome do projeto
* Descricao: Projeto desenvolvido durante a semana Spring React da DevSuperior => descricao da aplicacao
* Package: jar => compilador do Java
* Java: 11 => por ser mais otimizado que o 17
* Dependencies
    - Spring Web
    - H2 Database (banco de dados em memoria para testes)
    - PostgreSQL Driver (conexao ao banco PostgreSQL)
    - Spring Data JPA 
    - Spring Security
* pom.xml => Add Starters para adicionar mais dependencias
* Ctrl + F5 => para iniciar a aplicacao


## Netlify
* Para que o build funcione no Netlify:
* Criar arquivo _redirects na public
* E colocar "/* /index.html 200" sem as aspas