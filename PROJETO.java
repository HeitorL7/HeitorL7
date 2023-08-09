import java.util.Random;

class CalcularHoras{
    public static void main(String [] args) {
        
      //criar um objeto que sera utilizado para criar o id de consulta
      Random consulta = new Random();
     
      //garante que tofod od numeros de consulta serao positivos
     
          int protocolo = consulta.nextInt(1000)*1234;
          
          //pede ao usuario o valor de horas trabalhadas na semana
          
          System.out.println("Por favor , anote seu protocolo "+protocolo);
      }
    
        
    }
