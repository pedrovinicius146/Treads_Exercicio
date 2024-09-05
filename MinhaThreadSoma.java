public class MinhaThreadSoma implements Runnable {
    private String nome;
    private int[] nums;
    private static Calculadora calc = new Calculadora();
    private Thread thread;

    public MinhaThreadSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums.clone(); // Cria uma cópia independente do array
        thread = new Thread(this, nome);
        thread.start();
    }

    public void run() {
        System.out.println(this.nome + " iniciada");
        int soma = calc.somaArray(nums);
        System.out.println(("Resultado para " + nome + " é : " +" " + soma));
        System.out.println(this.nome + " terminada");
    }




























































}
