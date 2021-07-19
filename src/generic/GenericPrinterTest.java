package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);

		GenericPrinter<Plastic> plasitcPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasitcPrinter.setMaterial(plastic);
		System.out.println(plasitcPrinter);
		
		powderPrinter.printing();
		plasitcPrinter.printing();
	}

}
