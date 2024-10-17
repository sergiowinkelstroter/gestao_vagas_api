<h1 align="center">
  Gestão de vagas
</h1>

API REST  que abrange o controle de empresas, vagas de emprego e aplicações. O projeto faz uso dos principais pacotes do Spring Boot para persistência de dados, implementação de segurança e autorização. A aplicação permite a criação, leitura, atualização e exclusão de registros relacionados a empresas, vagas de emprego e candidaturas, proporcionando uma solução completa para o gerenciamento de recursos humanos.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Security](https://spring.io/projects/spring-security)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [PostGreSQL](https://www.postgresql.org/)
- [Swagger](https://swagger.io/tools/swagger-ui/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:

```
$ ./mvnw clean package
```

- Executar a aplicação:

```
$ java -jar target/gestao_vagas-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
