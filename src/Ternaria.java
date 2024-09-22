
public class Ternaria{
    public static void main(String[] args) throws Exception{
        int nota = 6;

        String resultado = nota <=5 ? "Aprovado": nota > 3 && nota == 3 ? "Reprovado":"recuperação";
            System.out.println(resultado);

        
    }
}