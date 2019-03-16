class Conta{
    String titular;
    int numero;
    String agencia;
    double saldo;
    Data dataAbertura;
    
    void deposita(double valor){
        this.saldo += valor;
    }

    void saca (double valor){
        this.saldo -= valor;
    }

    double calculaRendimento(){
        return this.saldo * 0.1;
    }

    String recuperaDadosParaImpressao(){
        String dados =  "Titular: " + this.titular+
                        "\nNumero da conta: "+ this.numero+
                        "\nAgencia: "+ this.agencia+
                        "\nSaldo: "+ this.saldo+
                        "\nData de Criação da conta: "+this.dataAbertura;
        return dados;
    }
}