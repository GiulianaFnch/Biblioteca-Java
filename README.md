# Sistema Simples de Gestão de Biblioteca

Este é um sistema simples de gestão de biblioteca desenvolvido em **Java**, que permite a inserção, edição, eliminação e listagem de livros. O sistema utiliza **XAMPP** com **MySQL** como base de dados para armazenar as informações dos livros.

## Funcionalidades

- **Inserção de Livros**: Adicionar novos livros ao banco de dados.
- **Edição de Livros**: Editar as informações de livros já cadastrados.
- **Eliminação de Livros**: Excluir livros do banco de dados.
- **Listagem de Livros**: Visualizar todos os livros cadastrados no sistema.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver o sistema.
- **XAMPP**: Plataforma para rodar o servidor Apache e o banco de dados MySQL.
- **MySQL**: Banco de dados para armazenar informações sobre os livros.
- **NetBeans IDE**: Ambiente de desenvolvimento integrado recomendado para trabalhar com o JDK.

## Instalação

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas na sua máquina:

- **NetBeans IDE**: Ambiente de desenvolvimento recomendado para trabalhar com o JDK. Pode ser baixado [aqui](https://netbeans.apache.org/download/index.html).
- **Java Development Kit (JDK)**: Necessário para compilar e executar o projeto. Disponível [aqui](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **XAMPP**: Plataforma para rodar o servidor Apache e o MySQL. Disponível [aqui](https://www.apachefriends.org/index.html).

### Passos de Instalação

1. **Clone o repositório do projeto:**

   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   2. **Configure o MySQL no XAMPP**:

   - Abra o **XAMPP Control Panel** e inicie os módulos **Apache** e **MySQL** clicando em "Start".
   - Acesse o **phpMyAdmin** no seu navegador através do endereço `http://localhost/phpmyadmin`.
   - Crie um novo banco de dados chamado `biblioteca`:
     - Clique na aba "Databases".
     - No campo "Create database", insira o nome `biblioteca` e clique em "Create".
   - Importe o arquivo SQL fornecido no projeto:
     - Selecione o banco de dados `biblioteca` que você acabou de criar.
     - Vá até a aba "Import" e selecione o arquivo SQL localizado na pasta `/database/biblioteca.sql` do projeto.
     - Clique em "Go" para importar as tabelas e dados necessários para o sistema.


3. **Compile o projeto**:

   No diretório do projeto, abra o NetBeans IDE e siga estes passos para compilar o projeto:

   - **Abra o NetBeans IDE** e selecione "File" > "Open Project".
   - Navegue até o diretório onde você clonou o repositório e selecione o projeto.
   - Clique em "Open Project" para adicionar o projeto ao NetBeans.
   - **Compile o projeto** clicando com o botão direito do mouse sobre o nome do projeto no painel "Projects" e selecionando "Clean and Build". Isso garantirá que todos os arquivos Java sejam compilados e que o projeto esteja pronto para execução.

4. **Execute o projeto**:

   Após a compilação, você pode executar o projeto diretamente no NetBeans IDE:

   - No painel "Projects", clique com o botão direito do mouse sobre o nome do projeto e selecione "Run". Isso iniciará a aplicação e abrirá a interface gráfica.
   - Certifique-se de que o serviço MySQL no XAMPP está ativo e o banco de dados `biblioteca` está acessível antes de iniciar o projeto.

## Como Usar

Após executar o projeto, você terá acesso às seguintes funcionalidades:

- **Inserir Livro**: Adicione um novo livro ao sistema preenchendo as informações solicitadas (título, autor, ano de publicação, etc.).
- **Editar Livro**: Atualize os dados de um livro existente, modificando informações como título ou autor.
- **Eliminar Livro**: Exclua um livro do catálogo ao selecioná-lo da lista de livros.
- **Listar Livros**: Exiba todos os livros cadastrados no banco de dados, mostrando informações como título, autor e ano de publicação.

### Exemplo de Uso

1. **Inserir Livro**:
   - Clique no botão "Inserir Livro" e forneça as informações solicitadas.
   - Após inserir os dados, o livro será salvo no banco de dados MySQL.

2. **Editar Livro**:
   - Selecione um livro da lista e clique em "Editar Livro".
   - Modifique as informações conforme necessário e salve as alterações.

3. **Eliminar Livro**:
   - Selecione um livro da lista e clique em "Eliminar Livro".
   - O livro será removido do banco de dados.

4. **Listar Livros**:
   - Clique em "Listar Livros" para visualizar todos os livros cadastrados.

## Estrutura do Projeto

- `/database`: Contém o arquivo SQL para criar e popular o banco de dados MySQL.
- `/config.java`: Arquivo de configuração da conexão com o banco de dados.
- `/src`: Contém os scripts Java responsáveis pela lógica do sistema (CRUD de livros).

## Melhorias Futuras

- Melhorar a interface de interação com o sistema.
- Implementar busca de livros por título ou autor.
- Adicionar um sistema de autenticação de usuários.

## Contribuição

Contribuições são bem-vindas! Se você deseja adicionar funcionalidades ou melhorar o código, sinta-se à vontade para abrir um pull request ou criar uma issue no repositório.
