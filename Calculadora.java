public class Calculadora {
    private int soma;
   int somaArray(int[] nums){
        soma = 0;
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
            System.out.println("executando thread" + "somando valor"+ nums[i]+ " e a soma total é" + " "+ soma);
       try {
        Thread.sleep(100);
       } catch (InterruptedException e) {
        e.printStackTrace();
       }
       
        }
return soma;
    }

}
