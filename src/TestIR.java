public class TestIR {

  public static void main(String[] args) {
    Double salario = 500.00;

    Double checkFirstTax = (7.5 / 100) * salario;
    Double checkSecondeTax = (15.0 / 100) * salario;
    Double checkThirdTax = (22.5 / 100) * salario;

    if (salario >= 1900.0 && salario <= 2800.0 && checkFirstTax >= 145.00) {
      Double newSalario = salario - 145.00;
      System.out.println(
        "o seu salario tera um desconto de R$ 145.00 " +
        " o saldo sera: R$ " +
        newSalario
      );
    } else if (
      salario >= 1900.0 && salario <= 2800.0 && checkFirstTax < 145.00
    ) {
      Double newSalario = salario - checkFirstTax;
      System.out.println(
        "o seu salario tera um desconto de R$ " +
        checkFirstTax +
        " o saldo sera: R$ " +
        newSalario
      );
    } else if (
      salario >= 2800.01 && salario <= 3571.0 && checkSecondeTax >= 350.00
    ) {
      Double newSalario = salario - 350.00;
      System.out.println(
        "o seu salario de " +
        salario +
        " tera um desconto de R$ 350.00 " +
        " o saldo sera: R$ " +
        newSalario
      );
    } else if (
      salario >= 2800.01 && salario <= 3571.0 && checkSecondeTax < 350.00
    ) {
      Double newSalario = salario - checkSecondeTax;
      System.out.println(
        "o seu salario de " +
        salario +
        " tera um desconto de R$ " +
        checkSecondeTax +
        " o saldo sera: R$ " +
        newSalario
      );
    } else if (salario >= 3751.01 && checkThirdTax > 636.00) {
      Double newSalario = salario - 636.00;
      System.out.println(checkThirdTax);
      System.out.println(
        "o seu salario de " +
        salario +
        " tera um desconto de R$ 636.00 " +
        " o saldo sera: R$ " +
        newSalario
      );
    } else if (salario >= 3751.01 && checkThirdTax <= 636.00) {
      System.out.println(checkThirdTax);
      Double newSalario = salario - checkThirdTax;
      System.out.println(
        "o seu salario de " +
        salario +
        " tera um desconto de R$ " +
        checkThirdTax +
        " o saldo sera: R$ " +
        newSalario
      );
    } else {
      System.out.println("Valor abaixo, está livre de impostos.");
    }
  }
}
