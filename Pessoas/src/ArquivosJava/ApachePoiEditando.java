package ArquivosJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\dougl\\git\\Pessoas\\Pessoas\\src\\ArquivosJava\\arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
		HSSFSheet plan = hssfWorkbook.getSheetAt(0);
		
		Iterator<Row> lIterator = plan.iterator();
		
		while(lIterator.hasNext()) {/*Enquanto tiver linha*/
			Row linha = lIterator.next();/*dados na linha*/
			
			int numeroCelulas = linha.getPhysicalNumberOfCells(); /*Quantidade de celula*/
			
			Cell cell = linha.createCell(numeroCelulas);/*cria nova celula na linha*/
			cell.setCellValue("5.487,20");
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada");
	}
}
