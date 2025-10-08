#Função
def dado():
  
  nome = input("Informe o nome do usuário registrado:\n");
  idade = input("Informe a idade do usuário registrado:\n");
  idade_int = int(idade);

  return nome, idade_int;

nome_usuario, idade_usuario = dado();

print(f"Dado do usuário registrado:{nome_usuario} com idade de {idade_usuario} anos.");
