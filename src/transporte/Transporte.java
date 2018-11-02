package transporte;

import java.util.Scanner;

public class Transporte {

    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int tipoTransporte;
        String continuar;
        
        //SISTEMA DE CADASTRO
        
        do {
            System.out.println("==================================================");
            System.out.println("============= CADASTRO DE VEICULOS ===============");
            System.out.println("==================================================");
            System.out.println("|            Digite [1] para CARRO               |");
            System.out.println("|            Digite [2] para MOTO                |");
            System.out.println("|            Digite [3] para CAMINHÃO            |");
            System.out.println("|            Digite [0] para SAIR                |");
            System.out.println("==================================================");
            tipoTransporte = Leitor.nextInt();
             switch (tipoTransporte) {
                case 0:
                    System.out.println("Obrigado Por utilizar");
                    System.exit(0);
                case 1:
                    System.out.print("Digite a MARCA: ");
                    String m = Leitor.next();
                    System.out.print("Digite o MODELO: ");
                    String md = Leitor.next();
                    System.out.print("Digite o ANO: ");
                    String ano = Leitor.next();
                    System.out.print("Digite a COR: ");
                    String cor = Leitor.next();
                    
                    //CRIANDO OBJETO E USANDO METODOS VERIFICADORES
                    
                    Carro c1 = new Carro(m,md,ano,cor);
                    c1.VerificaMeioTransporte();
                    System.out.print("Digite a QUANTIDADE DE PORTAS: ");
                    c1.setQtdPortas(Leitor.nextInt());
                    System.out.print("Digite [1] para CAMBIO MANUAL ou [2] para CAMBIO AUTOMATICO: ");
                    c1.setTipoCambio(Leitor.next());
                    c1.verificaCarro();
                    System.out.println("==================================");
                    System.out.println("| CARRO CADASTRADO COM SUCESSO!  |");
                    System.out.println("==================================");
                    c1.mostrarCarro();
                    break;
                case 2:
                    System.out.print("Digite a MARCA: ");
                    m = Leitor.next();
                    System.out.print("Digite o MODELO: ");
                    md = Leitor.next();
                    System.out.print("Digite o ANO: ");
                    ano = Leitor.next();
                    System.out.print("Digite a COR: ");
                    cor = Leitor.next();
                    Moto m1 = new Moto(m,md,ano,cor);
                    m1.VerificaMeioTransporte();
                    System.out.print("Digite a CILINDRADA: ");
                    m1.setCilindradas(Leitor.nextInt());
                    System.out.print("Digite [1] para RODA RAIADA ou [2] para RODA LIGA-LEVE: ");
                    m1.setTipoRodas(Leitor.next());
                    m1.verificaMoto();
                    System.out.println("=================================");
                    System.out.println("| MOTO CADASTRADA COM SUCESSO!  |");
                    System.out.println("=================================");
                    m1.mostrarMoto();
                    break;
                case 3:
                    System.out.print("Digite a MARCA: ");
                    m = Leitor.next();
                    System.out.print("Digite o MODELO: ");
                    md = Leitor.next();
                    System.out.print("Digite o ANO: ");
                    ano = Leitor.next();
                    System.out.print("Digite a COR: ");
                    cor = Leitor.next();
                    Caminhao cm1 = new Caminhao(m,md,ano,cor);
                    cm1.VerificaMeioTransporte();
                    System.out.print("Digite o TIPO DO CAMININHÃO: [VUC/TOCO/TRUCK] ");
                    cm1.setTipoCaminhao(Leitor.next());
                    System.out.print("Digite o TIPO DE CABINE: [STANDART/TETO ALTO/TETO BAIXO] ");
                    cm1.setTipoCabine(Leitor.next());
                    cm1.verificaCaminhao();
                    System.out.println("==================================");
                    System.out.println("|CAMINHÃO CADASTRADO COM SUCESSO!|");
                    System.out.println("==================================");
                    cm1.mostrarCaminhao();
                    break;  
                    
            //FINAL DO LAÇO
                    
            }
            System.out.println("Deseja cadastrar mais veiculos? [S/N]");
            continuar = Leitor.next();
        } while (continuar.equalsIgnoreCase("S"));
    }
}
