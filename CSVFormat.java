/*
 * Class for changing excel format into Product format.
 */

public class CSVFormat implements FormatConverter{
	
	public Product changeToProduct(String oringalData) {
		return new Product("", "", 0);
	}
}
