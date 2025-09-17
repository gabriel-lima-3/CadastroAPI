# 🎓 Sistema de Gerenciamento de Alunos - Spring Boot

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7.0-brightgreen)](https://spring.io/projects/spring-boot)
[![Postman](https://img.shields.io/badge/Postman-tested-orange)](https://www.postman.com/)

---

## 📄 Descrição
Este é meu primeiro projeto em **Spring Boot**, um CRUD completo no contexto de uma **Universidade**.  
Permite gerenciar alunos, adicionando atributos personalizados e vinculando **atividades** através de uma chave estrangeira.  

O projeto foi desenvolvido durante um curso online, mas eu alterei o contexto original (que era sobre **ninjas do Naruto**) para tornar mais próximo de um caso real de universidade.  

Foram utilizadas **mensagens personalizadas** com `ResponseEntity` para fornecer feedback detalhado nas operações, e todos os endpoints foram testados usando **Postman**.  

> ⚠️ Este é um projeto inicial, então ainda podem existir alguns bugs ou melhorias a serem feitas.

---

## 🛠 Tecnologias utilizadas
- Java 17  
- Spring Boot  
- Spring Data JPA
- Loombok
- H2 Database (banco em memória)  
- Maven  
- Postman (para testes)  

---

## ✨ Funcionalidades
- Criar, listar, atualizar e deletar alunos  
- Adicionar atributos personalizados aos alunos  
- Vincular alunos a atividades (relacionamento 1:N)  
- Mensagens personalizadas para feedback de cada operação  

---

## 📁 Estrutura do projeto

``` controller # Rotas e endpoints (AlunosController, AtividadesController)```
```dto # Objetos de transferência de dados```
``` mapper # Conversão DTO <-> Model```
```model # Entidades do banco de dados (Aluno, Atividade)```
```repository # Interface de acesso ao banco```
``` service # Regras de negócio```
```application.properties # Configurações do Spring Boot```
