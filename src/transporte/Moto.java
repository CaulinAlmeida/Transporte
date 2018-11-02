package transporte;

public class Moto extends MeioTransporte {
    private int cilindradas;
    private String tipoRodas;
    
    //CONTRUTORES
    
    public void Moto(){
        
    }

    public Moto(String marca, String modelo, String ano, String cor) {
        super(marca,modelo,ano,cor);
      
    }

    //GETTERS E SETTERS
    
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoRodas() {
        return tipoRodas;
    }

    public void setTipoRodas(String tipoRodas) {
        this.tipoRodas = tipoRodas;
    }
    
    //ESTE METODO MOSTRA OS DADOS DO VEICULO
    
    public void mostrarMoto(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Ano: "+getAno());
        System.out.println("Cor: "+getCor());
        System.out.println("Cilindradas: "+getCilindradas()+"cc");
        System.out.println(getTipoRodas());
        System.out.println("==================================================");
    }
    
    //METODO VERIFICADOR
    
    public void verificaMoto(){
        switch (this.tipoRodas) {
            case "1":
                this.tipoRodas = "RODA RAIADA";
                break;
            case "2":
                this.tipoRodas = "RODA DE LIGA-LEVE";
                break;
            default:
                System.out.println("INVALIDO");
                System.exit(0);
        }
        
        if (this.cilindradas < 100) {
            System.out.println("!ERRO! VEICULOS DE 50CC ATÉ 99CC SÃO CONSIDERADOS CICLOMOTORES");
            System.exit(0);
        } else if (this.cilindradas < 50 || this.cilindradas > 1200) {
            System.out.println("CILINDRADAS INVALIDAS");
            System.exit(0);
        }
                  
    }
    
    
}
