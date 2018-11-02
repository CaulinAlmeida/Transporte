
package transporte;

public class MeioTransporte {
    protected String marca;
    protected String modelo;
    protected String ano;
    protected String cor;
    
    //CONSTRUTORES
    
    public void MeioTransporte(){
        
    }

    public MeioTransporte(String marca, String modelo, String ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    
    //METODO VERIFICADOR
    
    public boolean VerificaMeioTransporte(){
        boolean valido = true;

        if(marca.length() < 3){
            valido = false;
        }
        if(modelo.length() < 3){
            valido = false;
        }
        if(ano.length() < 4){
            valido = false;
        }
        if(cor.length() < 3){
            valido = false;
        }
        if (!marca.matches("[A-Z]*") && 
            !modelo.matches("[A-Z]*") &&
            !ano.matches("[0-9]*") &&
            !cor.matches("[A-Z]*")){
            valido = false;
        }       
        if (valido == false){
            System.out.println("DIGITE INFORMAÇOES VALIDAS!");
            System.exit(0);
        }         
        return valido;
    }

    //GETTERS E SETTERS
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
     
}
