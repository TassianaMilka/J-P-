package modelo;

//Destinado para Lista dos dados descritos
public class Listadados implements Comparable <Listadados> {

    public String dados;

    public Listadados(String dados) {
        //Referência de dados atribuido a dados mesmo
        this.dados = dados;
    }


    @Override
    public int compareTo(Listadados outroListadados) {

        //O resturn da referência do dados
        return this.dados.compareTo(outroListadados.dados);

    }

}
