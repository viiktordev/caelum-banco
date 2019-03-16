class Main{
    public static void main(String[] args){
        Conta c1 = new Conta();
        Data data = new Data();
        //Conta c2 = new Conta();
        
        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50;
        c1.dataAbertura = data;
        /*
        c2.titular = "Hugo";
        c2.numero = 123;
        c2.agencia = "45678-9";
        c2.saldo = 50;
        c2.dataAbertura = "16/03/2018";
        */
        c1.deposita(1500);
        
        System.out.println(c1.recuperaDadosParaImpressao());
        /*
        if(c1 == c2){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
        */
    }
}