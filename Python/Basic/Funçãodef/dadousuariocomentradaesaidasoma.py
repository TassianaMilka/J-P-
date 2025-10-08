
#Função

def dado():
  
  nome = input("Informe o nome do usuário registrado:\n");
  idade = input("Informe a idade do usuário registrado:\n");
  idade_int = int(idade);
  soma=idade_int+5;
  return nome, idade_int,soma;

nome_usuario, idade_usuario,soma_usuario = dado();

print(f"\n\nDado do usuário registrado:{nome_usuario} com idade de {idade_usuario} anos.\n\n");


print(f"Em 2030 vai conter uma idade de {soma_idade} anos.\n\n")
