package parte_02_padroes.template_method;

class IKCV implements Imposto {


 public double calcula(Orcamento orcamento) {
  
    if(orcamento.getValor() > 500 && 
                          temItemMaiorQue100ReaisNo(orcamento)) {
        // outras ações
        return orcamento.getValor() * 0.10;
    } else {
        return orcamento.getValor() * 0.06;
    }
  }
     
  private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
    for(Item item : orcamento.getItens()) {
       if(item.getValor() > 100) return true;
    }
       
    return false;
  }
}
