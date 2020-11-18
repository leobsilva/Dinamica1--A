class DataSaver {
  private int dia;
  private int mes;
  private int ano;
  private String ampm;
  private int hora;
  private int minutos;

  public void setDia(int dia) {
    this.dia = dia;
  }

  public int getDia() {
    return this.dia;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getMes() {
    return this.mes;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getAno() {
    return this.ano;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getHora() {
    return this.hora;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public int getMinutos() {
    return this.minutos;
  }

  public void setAmpm(String ampm) {
    this.ampm = ampm;
  }

  public String getAmpm() {
    return this.ampm;
  }

  public void imprimeData() {
    System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno());
    System.out.println(this.getAmpm() + " - " + this.getHora() + " : " + this.getMinutos());
  }
}

class Main {
  public static void main(String[] args) {
    DataSaver newData = new DataSaver();

    newData.setDia(26);
    newData.setMes(03);
    newData.setAno(1998);
    newData.setAmpm("AM");
    newData.setHora(6);
    newData.setMinutos(46);
    newData.imprimeData();
  }
}
