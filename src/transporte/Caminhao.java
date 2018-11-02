
package transporte;

public class Caminhao extends MeioTransporte {
    private String tipoCaminhao;
    private String tipoCabine;
    
    //CONTRUTORES
    
    public void Caminhao(){
        
    }

    public Caminhao(String marca, String modelo, String ano, String cor) {
        super(marca,modelo,ano,cor);
     
    }

    //GETTERS E SETTERS
    
    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    public String getTipoCabine() {
        return tipoCabine;
    }

    public void setTipoCabine(String tipoCabine) {
        this.tipoCabine = tipoCabine;
    }
 
    //ESTE METODO MOSTRA OS DADOS DO VEICULO
    
    public void mostrarCaminhao(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Ano: "+getAno());
        System.out.println("Cor: "+getCor());
        System.out.println("Tipo de Caminhão: "+getTipoCaminhao());
        System.out.println("Tipo de Cabine: "+getTipoCabine());
        System.out.println("==================================================");
    }  
    
    //METODO VERIFICADOR
    
    public void verificaCaminhao(){
       if(this.tipoCabine.equalsIgnoreCase("standart") || this.tipoCabine.equalsIgnoreCase("teto alto") 
       || this.tipoCabine.equalsIgnoreCase("teto baixo")){
       } else {
           System.out.println("DIGITE UM TIPO DE CAMINHÃO VALIDO");
           System.exit(0);
       } 
       if (this.tipoCaminhao.equalsIgnoreCase("vuc") || this.tipoCaminhao.equalsIgnoreCase("toco")
       || this.tipoCaminhao.equalsIgnoreCase("truck") ){    
       }else {
           System.out.println("DIGITE UM TIPO DE CABINE VALIDO");
           System.exit(0);
       }
    }
    
}
