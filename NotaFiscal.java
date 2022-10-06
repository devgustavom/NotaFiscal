public class NotaFiscal {
    
    public static void main(String[] args) {
        
 
 produto produto = new produto();
      produto.desc = "000002";
      produto.qtd = 9.654f;
      produto.vlrU = 3.85f;
      produto.vlrT = produto.qtd * produto.vlrU; 
      produto.tipoP = "ETANOL COMUM";
      produto.codp = "001";

 cliente cliente1 = new cliente();
         cliente1.nome = "Gustavo Maximiano - Rodrigo Mattos";
         cliente1.cpf = "123.456.789-01";
         cliente1.dinheiro = 37.16f;


 produto loja = new produto();
     loja.nomeL = "TANCA INFORMÁTICA EIRELI";
     loja.cnpj = "0872218000186 IE 149626224113";
     loja.endereco = "      RUA MARECHAL FLORIANO PEIXOTO, 166 VILA\n          MARCONDES, PRESIDENTE PRUDENTE";
     loja.troco = produto.vlrT-cliente1.dinheiro ;

     produto tributo = new produto();
         tributo.Te = produto.vlrT * 0.27f;
         tributo.Tf = produto.vlrT * 0.1346f;
         tributo.tt = tributo.Te + tributo.Tf;
        System.out.println("                    TANCA\n" + loja.endereco + "        \n       CNPJ: " + loja.cnpj); 
        System.out.println(".................................................\n         Extrato N° 1208 \n CUPOM FISCAL ELETRÔNICO-SAT \n.................................................");
        System.out.println("CPF/CNPJ do consumidor : " + cliente1.cpf + "\nRazão social/Nome: " + cliente1.nome + "\n................................................. " );
        System.out.println("#|COD|DESC|QTD|UN| VL UN R$ |(VLTR R$)*| VL ITEM R$ \n ................................................");
        System.out.println(" " + produto.codp + " " + produto.desc + "        " + produto.qtd + " x " + produto.vlrU + "(15,03)\n" + produto.tipoP + "                 " + produto.vlrT + "\n________________________________________________\nSubtotal :                               " + produto.vlrT + "\nVALOR TOTAL R$                           " + produto.vlrT + "\nDinheiro                                 " + cliente1.dinheiro + "\nTroco R$                                 " + loja.troco ) ; 
        System.out.printf("Valor aproximado dos tributos     %.2f     " , tributo.tt );
        System.out.println("\n (Conforme Lei Fed. 12.741/2012)\n * Valor Aproximado dos Tributos dos Itens \n          SAT N° 900013491\n 15/07/2019 - 09:40:11");
        

    }}