//● Crie uma classe de exceção chamada LoginInvalidoException que herda de Exception.
//● Crie uma classe SistemaLogin com um atributo privado senhaSecreta
//○ O atributo senhaSecreta deve ter o valor default "123456" no construtor.
//○ Crie um método public void fazerLogin(String usuario, String senha) que deve lançar a
//exceção LoginInvalidoException se a senha informada for diferente da senhaSecreta.
//● No método main de uma classe de teste, peça para o usuário digitar o login e a senha.
//● Chame o método fazerLogin dentro de um bloco try-catch e capture a sua exceção
//personalizada, exibindo a mensagem "Acesso Negado: Credenciais incorretas".
