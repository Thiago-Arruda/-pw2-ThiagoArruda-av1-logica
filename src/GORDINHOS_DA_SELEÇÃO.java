import java.util.Scanner;

public class GORDINHOS_DA_SELEÇÃO {

	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    	
   
		
		System.out.println("Informe sua altura:");
		 double altura = ler.nextDouble();
		 
		 System.out.println("Informe o peso:");
		 double peso = ler.nextDouble();
		
         double imc;	 
		 
		 imc = peso/(altura * altura);
		
		
		 System.out.println("IMC:"+imc);	 
		 System.out.println("peso:"+ peso);	
		 System.out.println("altura:"+ altura);
		 
		 if(imc < 18.5){
			
			 System.out.println("Abaixo do peso");
			 System.out.println("Muito alto ");			
			
		}
		
		if(imc > 18.5 && imc < 24.9){
			
			 System.out.println("Peso normal");
			 System.out.println("Baixo");			
			
		}	 
		if(imc > 25.0 && imc < 29.9){
			
			 System.out.println(" Pré-obesidade");
			 System.out.println("Médio");			
			
		}	 
		if(imc > 30.0 && imc < 34.9){
			
			 System.out.println(" Obesidade Grau I");
			 System.out.println("Alto");			
			
		}	 
		if(imc > 35.0 && imc < 39.9){
			
			 System.out.println(" Obesidade Grau II");
			 System.out.println(" Muito Alto");			
			
		}	 		
		if(imc > 40.0){
			
			 System.out.println(" Obesidade Grau III");
			 System.out.println("Muitíssimo alto");			
			
		}	 
		
}
	
	
	
	
}

