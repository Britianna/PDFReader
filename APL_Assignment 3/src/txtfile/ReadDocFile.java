package txtfile;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;

public class ReadDocFile  {
	
	public void Reader() throws FileNotFoundException, IOException {
		
		JFileChooser window = new JFileChooser();
		int returnValue = window.showOpenDialog(null);
		
		if(returnValue == JFileChooser.APPROVE_OPTION) {
			XWPFDocument document = new XWPFDocument(new FileInputStream(window.getSelectedFile()));
			
			XWPFWordExtractor extract = new XWPFWordExtractor(document);
			System.out.print(extract.getText());
			
			TextToSpeech tts = new TextToSpeech();
			
			tts.getSpeak(extract.getText());
		}
	}
	
	

}
