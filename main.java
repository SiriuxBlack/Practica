public class main {
    public static void main(String[] args) {
       char[] palabra1 = {'A','M','O','R'} ;
       char[] palabra2 = {'R','O','M','A'};
       int contador=0;
       
       for (int i=0;i<palabra1.length;i++){
            for (int j=0;j<palabra2.length;j++){
                if(palabra1[i]==palabra2[j]){
                    contador++;
                    palabra2[j]=' ';
                    break;
                }
            }
        }
        if (contador==palabra2.length) {
            System.out.println("Son anagramas");
            }else{
                System.out.println("No es anagrama");
            }
    }         
}
    
