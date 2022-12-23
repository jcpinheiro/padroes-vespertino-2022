package parte_02_padroes.template_method;

class ICPP implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
   
      if(orcamento.getValor() > 500) {
       // outras ações
        return orcamento.getValor() * 0.07;

      } else {
        return orcamento.getValor() * 0.05;
      }
    }
}
