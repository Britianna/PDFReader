import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
public class ReadPdf {

	public static void main(String[] args) {
		//Loading an existing document
	      File file = new File("D:\\Test2.pdf");
	      
	      PDDocument document;
		try {
			document = PDDocument.load(file);
			 PDFTextStripper pdfStripper = new PDFTextStripper();
			  String text = pdfStripper.getText(document);
			  Speaker.getSpeak(text);
			  System.out.println(text);
			  document.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
