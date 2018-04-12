package DOC;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class worldFileFormat {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis= new FileInputStream("WOrd.doc");
			
			//this class is used to extract the content
			XWPFDocument doc= new XWPFDocument(fis);
			
			//fetch paragraph using getParagraphText() method
			//we get a list of all paragraphs of the document
		java.util.List<XWPFParagraph> paragraphList = doc.getParagraphs();
			
			//iterate over paragraphList
			for(XWPFParagraph paragraph: paragraphList){
				System.out.println(paragraph.getText());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

	}

	}
	}
