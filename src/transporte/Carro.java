package transporte;

public class Carro extends MeioTransporte {

    private int qtdPortas;
    private String tipoCambio;
    
    //CONSTRUTORES
    
    public void Carro(){
        
    }

    public Carro(String marca, String modelo, String ano, String cor) {
        super(marca,modelo,ano,cor);
       
    }

    //GETTERS E SETTERS
    
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    //ESTE METODO MOSTRA OS DADOS DO VEICULO
    
    public void mostrarCarro() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Cor: " + getCor());
        System.out.println("Quantidade de Portas: " + getQtdPortas());
        System.out.println(getTipoCambio());
        System.out.println("==================================================");
    }

    //METODO VERIFICADOR
    
    public void verificaCarro() {
        if (this.qtdPortas == 2 || this.qtdPortas == 4 || this.qtdPortas == 3 || this.qtdPortas == 5) {

        } else {
            System.out.println("DIGITE UMA QUANTIDADE DE PORTAS VALIDAS");
            System.exit(0);
        }
        switch (this.tipoCambio) {
            case "1":
                this.tipoCambio = "CAMBIO MANUAL";
                break;
            case "2":
                this.tipoCambio = "CAMBIO AUTOMATICO";
                break;
            default:
                System.out.println("DIGITE UM TIPO DE CAMBIO VALIDO");
                System.exit(0);
        }

    }

}
