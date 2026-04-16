# 📌 Sistema de Login com Java + MySQL

## 🧾 Descrição
Este projeto consiste em um sistema de login desenvolvido em Java utilizando **Swing** para interface gráfica e **MySQL** para armazenamento de dados.

O sistema realiza:
- Conexão com banco de dados
- Verificação de usuário e senha
- Indicação visual do status da conexão
- Redirecionamento para tela principal após login

---

## 🛠️ Tecnologias utilizadas

- ☕ Java (Swing)
- 🗄️ MySQL
- 🌐 phpMyAdmin
- ⚙️ XAMPP
- 💻 Apache NetBeans

---

## 📦 Bibliotecas necessárias

⚠️ Algumas bibliotecas NÃO vão junto para o GitHub automaticamente.

### 🔹 MySQL Connector (JDBC)

Você precisa adicionar o driver do MySQL manualmente:

👉 Baixe:
https://dev.mysql.com/downloads/connector/j/

### 🔹 Como adicionar no NetBeans

1. Clique com o botão direito no projeto  
2. Vá em **Properties**  
3. Clique em **Libraries**  
4. Clique em **Add JAR/Folder**  
5. Selecione o arquivo `.jar` do MySQL Connector  

---

## ⚙️ Configuração do ambiente

### 🔹 1. Iniciar o servidor (XAMPP)

1. Abra o XAMPP  
2. Inicie:
   - Apache  
   - MySQL  

---

### 🔹 2. Configurar o banco de dados (phpMyAdmin)

1. Acesse:
   http://localhost/phpmyadmin

2. Crie o banco:

dbpoo

3. Crie a tabela:

CREATE TABLE tb_usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL
);

4. Insira um usuário de teste:

INSERT INTO tb_usuarios (nome, senha)
VALUES ('admin', '123');

---

## 🔌 Configuração da conexão (DAO)

Classe `ConexaoDAO`:

String driver = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/dbpoo";
String user = "root";
String password = "";

> ⚠️ Caso tenha senha no MySQL, altere o campo `password`

---

## ▶️ Execução do sistema

1. Abra o projeto no Apache NetBeans  
2. Execute a classe `conexao.java`  
3. A tela de login será exibida  

---

## 🔐 Funcionamento do login

O sistema utiliza a seguinte consulta SQL:

SELECT * FROM tb_usuarios WHERE nome = ? AND senha = ?

### ✔️ Se os dados estiverem corretos:
- Exibe mensagem de sucesso
- Abre a tela principal (`TelaPrincipal`)
- Fecha a tela de login  

### ❌ Se incorretos:
- Exibe mensagem de erro  

---

## 🖼️ Funcionalidades

### 🔹 Indicador de conexão com banco
- 🟢 Ícone verde → conexão ativa  
- ⚪ Ícone cinza → sem conexão  

### 🔹 Interface gráfica
- Campos para nome e senha  
- Botão de login  
- Feedback ao usuário via mensagens  

### 🔹 Navegação entre telas
- Tela de Login → Tela Principal  

---

## 📁 Estrutura do projeto

📦 Projeto  
 ┣ 📂 DAO  
 ┃ ┗ ConexaoDAO.java  
 ┣ 📂 VIEW  
 ┃ ┣ conexao.java (tela de login)  
 ┃ ┗ TelaPrincipal.java  
 ┗ 📂 icones  
   ┣ database_verde.png  
   ┗ database_cinza.png  

---

## ⚠️ Observações

- As senhas são armazenadas em texto simples (não recomendado para produção)  
- Projeto voltado para aprendizado  
- É necessário adicionar manualmente o driver do MySQL  

---

## 🚀 Melhorias futuras

- Criptografia de senha  
- Uso de `JPasswordField`  
- Cadastro de usuários  
- Implementação de DTO  
- Melhorias visuais na interface  

---

## 👨‍💻 Autor

Ricardo Linhares Borges
