public class Conta{
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura;
    
    public Conta(String titular, int numero, String agencia, Data dataAbertura){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca (double valor){
        this.saldo -= valor;
    }

    public double calculaRendimento(){
        return this.saldo * 0.1;
    }

    public String getAllDatas(){
        String dados =  "Titular: " + this.titular+
                        "\nNumero da conta: "+ this.numero+
                        "\nAgencia: "+ this.agencia+
                        "\nSaldo: "+ this.saldo+
                        "\nData de Criação da conta: "+this.dataAbertura;
        return dados;
    }
}