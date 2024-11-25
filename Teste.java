package modelo;
import teste.TestarNumeroRomano;

//converte de string pra romanoS
public class NumeroRomano {

	//Metodo para retorna um numero romano//
	
	
	public String onvertToRoman5(int number) {
	
		if(number<0 || number>3999) {
			//tratamento de exceção
			throw new IllegalArgumentException("Fora do intervalo de 1 a 3999.");
		}
		//vetor de caracteres com as milhares,centenas,dezenas e unidades
		String[] m= {"", "M", "MM", "MMM"};
        String[] c= {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] d = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] u= {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
       
        //conversão dos numeros para algarismo romano//
        return m[number / 1000] +
                c[(number% 1000) / 100] +
                d[(number % 100) / 10] +
                u[number% 10];
              
   }
	
}

