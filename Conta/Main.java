class Main{
    public static void main(String[] args){
        Data data = new Data();
        Conta c1 = new Conta("Victor", 123, "45678-9", data);
        
        c1.deposita(1500);
        
        System.out.println(c1.getAllDatas());
        
    }
}