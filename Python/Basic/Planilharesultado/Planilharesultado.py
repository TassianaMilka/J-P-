#Observa a planilha simples para encontrar a fórmula do result-1 e result-2 e exibir na compilação.

#                                            Money                             
#         Name    Money One     Money two    %      Result-1       Result-2   
#         car      10000           200      0.3       
#         House    30000           500      0.10

#Declaração de váriaveis
money_one_one=10000;
money_two_one=200;
money_one_two=30000;
money_two_two=500;
per_one=0.3;
per_two=0.10;
result_1_one=money_one_one+money_one_two*per_one;
result_1_two=money_one_two+money_two_two*per_two;
result_2_one=money_one_one-money_one_two*per_one;
result_2_two=money_one_two-money_two_two*per_two;

#Imprimir a parte inicial da planilha
print('                                 Money                                ')
print('  Name   Money One     Money two  %    Result-1       Result-2         ')   
#Imprimir os resultados
print('-------------------------O resultado de  result-1/result-2(Car)------------------------')
print(result_1_one)
print('-----------')
print(result_1_two)
print('\n')
print('------------------------O resultado de result-1/result-2(House)-------------------------')
print(result_2_one)
print('-----------')
print(result_2_two)