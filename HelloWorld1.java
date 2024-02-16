public class HelloWorld1{
    public static void main(String[] args) {
        String ambiente = args [0];
        if (ambiente.equalsIgnoreCase("Dev")) {    
            System.out.print("executando em dev");
        } else if (ambiente.equalsIgnoreCase("TEST")) {    
            System.out.print("Executando em TEST");
        } else {
            System.out.print(ambiente);
        }
    }
}