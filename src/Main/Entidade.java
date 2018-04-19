

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
public class Entidade {
    private int Idade;
    private String Resultado;
    
    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getResultado() {
        if (Idade>=5 && Idade<=7) {
            Resultado="Infantil A";
            return Resultado;
        }
        if (Idade>7 && Idade<=10) {
            Resultado="Infantil B";
            return Resultado;
        }
        if (Idade>10 && Idade<=13) {
            Resultado="Juvenil A";
            return Resultado;
        }
        if (Idade>13 && Idade<=17) {
            Resultado="Juvenil B";
            return Resultado;
        }
        if (Idade>17) {
            Resultado="Adulto";
            return Resultado;
        }
        return Resultado;
    }

    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }
    
}
