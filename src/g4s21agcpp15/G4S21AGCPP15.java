/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21agcpp15;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author alexg
 */
public class G4S21AGCPP15 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        PdfWriter pdfwriter = null;
        try {
            // TODO code application logic here
            String nombrearch = "mipdf.pdf";
            File file = new File(nombrearch);
            pdfwriter = new PdfWriter(file);
            
            String cadena = "este es otro parrafo el cual contendra mas informacion de lo debido ya que estamos probando que se pueda escribir dentro del archivo pdf";
            
            PdfDocument pdfDocument = new PdfDocument(pdfwriter);
            Document document = new Document(pdfDocument);
            Paragraph paragraph = new Paragraph("Sera mi primer linea de mi pdf la cual puede contener texto");
            document.add(paragraph);
            paragraph = new Paragraph(cadena);
            document.add(paragraph);
            PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
            
            cadena = "Tu tiempo es limitado, de modo que no lo malgastes viviendo la vida de alguien distinto. No quedes atrapado en el dogma, que es vivir como otros piensan que deberías vivir. No dejes que los ruidos de las opiniones de los demás acallen tu propia voz interior. Y, lo que es más importante, ten el coraje para hacer lo que te dice tu corazón y tu intuición.Steve Jobs.";
            paragraph = new Paragraph(cadena);
            paragraph.setFont(font);
            Color myColor = new DeviceRgb(255, 100, 20);
            paragraph.setFontColor(myColor);
            paragraph.setFirstLineIndent(100);
            paragraph.setTextAlignment(TextAlignment.JUSTIFIED_ALL);
            document.add(paragraph);
            pdfDocument.close();
            pdfwriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        
    }
    
}
