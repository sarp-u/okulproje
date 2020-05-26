
package okulproje;

import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


public class Exceldeneme {

   
    public static void main(String[] args) throws WriteException, IOException {
                //col
        int col0 = 0;
        int col1 = 1;
        int col2 = 2;
        int col3 = 3;
        int col4 = 4;
        int col5 = 5;
        int col6 = 6;
        int col7 = 7;
        int col8 = 8;
        int col9 = 9;
        int col10 = 10;
        int col11 = 11;
        int col12 = 12;
        int col13 = 13;
        
        //row
        int row0 = 0;
        int row1 = 1;
        int row2 = 2;
        int row3 = 3;
        int row4 = 4;
        int row5 = 5;
        int row6 = 6;
        int row7 = 7;
        int row8 = 8;
        int row9 = 9;
        int row10 = 10;
        int row11 = 11;
        int row12 = 12;
        int row13 = 13;
        int row14 = 14;
        int row15 = 15;
        int row16 = 16;
        int row17 = 17;
        int row18 = 18;
        int row19 = 19;
        int row20 = 20;
        int row21 = 21;
        int row22 = 22;
        int row23 = 23;
        int row24 = 24;
        int row25 = 25;
        int row26 = 26;
        int row27 = 27;
        int row28 = 28;
        int row29 = 29;
        int row30 = 30;
        int row31 = 31;
        int row32 = 32;
        int row33 = 33;
        int row34 = 34;
        int row35 = 35;
        int row36 = 36;
        int row37 = 37;
        int row38 = 38;
        int row39 = 39;
        int row40 = 40;
        int row41 = 41;
        int row42 = 42;
        int row43 = 43;
        
        
        File f = new File("C:\\Users\\fener\\OneDrive\\Masaüstü\\exel.xls");
        WritableWorkbook myexel = Workbook.createWorkbook(f);
        WritableSheet mysheet = myexel.createSheet("mySheet", 0);
        // Başlangıçtaki boşluk   
        mysheet.mergeCells(col0,row0,col3,row1); 
        mysheet.addCell(new Label(col1,row1,""));
        
        // Gözetim muayene
        mysheet.mergeCells(col4,row0,col13,row0); 
        mysheet.addCell(new Label(col4,row0,"gözetim muayene"));
        
        // Manyetik Parçacık
        mysheet.mergeCells(col4,row1,col13,row1); 
        mysheet.addCell(new Label(col4,row1,"Manyetik Parçacık"));
        
        // Müşteri
        mysheet.mergeCells(col0,row2,col1,row2);
        mysheet.addCell(new Label(col0,row2,"Müşteri"));
        
        mysheet.mergeCells(col2,row2,col4,row2);
        mysheet.addCell(new Label(col2,row2,"Tag Gemi"));
        
        // Proje
        mysheet.mergeCells(col0,row3,col1,row3);
        mysheet.addCell(new Label(col0,row3,"Proje Adı"));
        
        mysheet.mergeCells(col2,row3,col4,row3);
        mysheet.addCell(new Label(col2,row3,"Kaynakçı Testi"));
        
        // Test
        mysheet.mergeCells(col0,row4,col1,row4);
        mysheet.addCell(new Label(col0,row4,"Test Yeri"));
        
        mysheet.mergeCells(col2,row4,col4,row4);
        mysheet.addCell(new Label(col2,row4,"İzmit"));
        
        // Muayene
        mysheet.mergeCells(col0,row5,col1,row5);
        mysheet.addCell(new Label(col0,row5,"Muayene Standardı"));
        
        mysheet.mergeCells(col2,row5,col4,row5);
        mysheet.addCell(new Label(col2,row5,"TS En ISO"));
        
        //  Değerlendirme
        mysheet.mergeCells(col0,row6,col1,row6);
        mysheet.addCell(new Label(col0,row6,"Değerlen. Standardı"));
        
        mysheet.mergeCells(col2,row6,col4,row6);
        mysheet.addCell(new Label(col2,row6,"TS EN ISO"));
        
        // Muayene Prosedürü
        mysheet.mergeCells(col5,row2,col7,row2);
        mysheet.addCell(new Label(col5,row2,"Muayene Prosedürü"));
        
        mysheet.mergeCells(col8,row2,col9,row2);
        mysheet.addCell(new Label(col8,row2,"P-101"));
        
        // Muayene Kapsamı
        mysheet.mergeCells(col5,row3,col7,row3);
        mysheet.addCell(new Label(col5,row3,"Muayene Kapsamı"));
        
        mysheet.mergeCells(col8,row3,col9,row3);
        mysheet.addCell(new Label(col8,row3,"20%"));
        
        // Resim No
        mysheet.mergeCells(col5,row4,col7,row4);
        mysheet.addCell(new Label(col5,row4,"Resim No"));
        
        mysheet.mergeCells(col8,row4,col9,row4);
        mysheet.addCell(new Label(col8,row4,"-"));
        
        // Yüzey Durumu
        mysheet.mergeCells(col5,row5,col7,row5);
        mysheet.addCell(new Label(col5,row5,"Yüzey Durumu"));
        
        mysheet.mergeCells(col8,row5,col9,row5);
        mysheet.addCell(new Label(col8,row5,"After Welding"));
        
        // Muayene Aşaması
        mysheet.mergeCells(col5,row6,col7,row6);
        mysheet.addCell(new Label(col5,row6,"Muayene Aşaması"));
        
        mysheet.mergeCells(col8,row6,col9,row6);
        mysheet.addCell(new Label(col8,row6,"Untreated"));
        
        // Sayfa No
        mysheet.mergeCells(col10,row2,col11,row2);
        mysheet.addCell(new Label(col10,row2,"Sayfa No"));
        
        mysheet.mergeCells(col12,row2,col13,row2);
        mysheet.addCell(new Label(col12,row2,"1"));
        
        // Rapor No
        mysheet.mergeCells(col10,row3,col11,row3);
        mysheet.addCell(new Label(col10,row3,"Rapor No"));
        
        mysheet.mergeCells(col12,row3,col13,row3);
        mysheet.addCell(new Label(col12,row3,"201916"));
        
        // Rapor Tarihi
        mysheet.mergeCells(col10,row4,col11,row4);
        mysheet.addCell(new Label(col10,row4,"Rapor Tarihi"));
        
        mysheet.mergeCells(col12,row4,col13,row4);
        mysheet.addCell(new Label(col12,row4,"24/05/2020"));
        
        // İş Emri No
        mysheet.mergeCells(col10,row5,col11,row5);
        mysheet.addCell(new Label(col10,row5,"İş Emri No"));
        
        mysheet.mergeCells(col12,row5,col13,row5);
        mysheet.addCell(new Label(col12,row5,"2604"));
        
        // Teklif No
        mysheet.mergeCells(col10,row6,col11,row6);
        mysheet.addCell(new Label(col10,row6,"Teklif No"));
        
        mysheet.mergeCells(col12,row6,col13,row6);
        mysheet.addCell(new Label(col12,row6,"330-2604"));
        
        // Ekipman Bilgileri
        mysheet.mergeCells(col0,row7,col13,row7);
        mysheet.addCell(new Label(col0,row7,"Ekipman Bilgileri"));
        
        // Kutup Mesafesi
        mysheet.mergeCells(col0,row8,col1,row8);
        mysheet.addCell(new Label(col0,row8,"Kutup Mesafesi, mm"));
        
        mysheet.mergeCells(col2,row8,col3,row8);
        mysheet.addCell(new Label(col2,row8,"100 mm"));
        
        // Cihaz
        mysheet.mergeCells(col0,row9,col1,row9);
        mysheet.addCell(new Label(col0,row9,"Cihaz"));
        
        mysheet.mergeCells(col2,row9,col3,row9);
        mysheet.addCell(new Label(col2,row9,("NAWOO")));
        
        // MP Taşıyıcı
        mysheet.mergeCells(col0,row10,col1,row10);
        mysheet.addCell(new Label(col0,row10,"Mp Taşıyıcı Ortam"));
        
        mysheet.mergeCells(col2,row10,col3,row10);
        mysheet.addCell(new Label(col2,row10,"BT-20"));
        
        // Mıknatıslama Tekniği
        mysheet.mergeCells(col0,row11,col1,row11);
        mysheet.addCell(new Label(col0,row11,"Mıknatıslama Tekniği"));
        
        mysheet.mergeCells(col2,row11,col3,row11);
        mysheet.addCell(new Label(col2,row11, " "));
        
        // UV Işık
        mysheet.mergeCells(col0,row12,col1,row12);
        mysheet.addCell(new Label(col0,row12,"UV Işık Şiddeti"));
        
        mysheet.mergeCells(col2,row12,col3,row12);
        mysheet.addCell(new Label(col2,row12,"W/m2"));
        
        // Işık Mesafesi
        mysheet.mergeCells(col0,row13,col1,row13);
        mysheet.addCell(new Label(col0,row13,"Işık Mesafesi"));
        
        mysheet.mergeCells(col2,row13,col3,row13);
        mysheet.addCell(new Label(col2,row13,"mm"));
        
        // Muayene Bölgesi
        mysheet.mergeCells(col4,row8,col6,row8);
        mysheet.addCell(new Label(col4,row8,"Muayene Bölgesi"));
        
        mysheet.mergeCells(col7,row8,col8,row8);
        mysheet.addCell(new Label(col7,row8,"KAYNAK+HAZ"));
        
        // Akım Tipi
        mysheet.mergeCells(col4,row9,col6,row9);
        mysheet.addCell(new Label(col4,row9,"Akım Tipi"));
        
        mysheet.mergeCells(col7,row9,col8,row9);
        mysheet.addCell(new Label(col7,row9,("AC")));
        
        // Işık Şiddeti
        mysheet.mergeCells(col4,row10,col6,row10);
        mysheet.addCell(new Label(col4,row10,"Luxmetre/ Işık Şiddeti"));
        
        mysheet.mergeCells(col7,row10,col8,row10);
        mysheet.addCell(new Label(col7,row10,"1200 Lux"));
        
        // Muayene Ortamı
        mysheet.mergeCells(col4,row11,col6,row11);
        mysheet.addCell(new Label(col4,row11,"Muayene Ortamı"));
        
        mysheet.mergeCells(col7,row11,col8,row11);
        mysheet.addCell(new Label(col7,row11, " "));
        
        // Mıknatıs Giderimi
        mysheet.mergeCells(col4,row12,col6,row12);
        mysheet.addCell(new Label(col4,row12,"Mıknatıs Giderimi"));
        
        mysheet.mergeCells(col7,row12,col8,row12);
        mysheet.addCell(new Label(col7,row12," "));
        
        // Isıl İşlem
        mysheet.mergeCells(col4,row13,col6,row13);
        mysheet.addCell(new Label(col4,row13,"Isıl İşlem"));
        
        mysheet.mergeCells(col7,row13,col8,row13);
        mysheet.addCell(new Label(col7,row13," "));
        
       
        
        // Yüzey Sıcaklığı
        mysheet.mergeCells(col9,row8,col10,row8);
        mysheet.addCell(new Label(col9,row8,"Yüzey Sıcaklığı"));
        
        mysheet.mergeCells(col11,row8,col13,row8);
        mysheet.addCell(new Label(col11,row8,"15"));
        
        
        // Alan Şiddeti
        mysheet.mergeCells(col9,row9,col10,row10);
        mysheet.addCell(new Label(col9,row9,"Alan Şiddeti"));
        
        mysheet.mergeCells(col11,row9,col13,row10);
        mysheet.addCell(new Label(col11,row9,("3.2 kA/m")));
        
        // Yüzey
        mysheet.mergeCells(col9,row11,col10,row11);
        mysheet.addCell(new Label(col9,row11,"Yüzey"));
        
        mysheet.mergeCells(col11,row11,col13,row11);
        mysheet.addCell(new Label(col11,row11,"Taşlanmış"));
        
        // Işık Cihazı
        mysheet.mergeCells(col9,row12,col10,row12);
        mysheet.addCell(new Label(col9,row12,"Işık Cihazı"));
        
        mysheet.mergeCells(col11,row12,col13,row12);
        mysheet.addCell(new Label(col11,row12, " "));
        
        // Kaldırma Testi
        mysheet.mergeCells(col9,row13,col10,row13);
        mysheet.addCell(new Label(col9,row13,"Kaldırma Testi Tarihi"));
        
        mysheet.mergeCells(col11,row13,col13,row13);
        mysheet.addCell(new Label(col11,row13,"24/05/2020"));
        
        // Resimler
        mysheet.mergeCells(col0,row14,col3,row18);
        mysheet.addCell(new Label(col0,row14,"Resim 1"));
        
        mysheet.mergeCells(col4,row14,col7,row18);
        mysheet.addCell(new Label(col4,row14,"Resim 2"));
        
        // Süreksizlik
        mysheet.mergeCells(col8,row14,col13,row14);
        mysheet.addCell(new Label(col8,row14,"Süreksizliğin Yeri"));
        
        mysheet.mergeCells(col8,row15,col9,row15);
        mysheet.addCell(new Label(col8,row15,"BM"));
        mysheet.mergeCells(col10,row15,col13,row15);
        mysheet.addCell(new Label(col10,row15,"Ana Metal"));
        
        mysheet.mergeCells(col8,row16,col9,row16);
        mysheet.addCell(new Label(col8,row16,"HAZ"));
        mysheet.mergeCells(col10,row16,col13,row16);
        mysheet.addCell(new Label(col10,row16,"Isıdan etkilenen bölge"));
        
        mysheet.mergeCells(col8,row17,col9,row17);
        mysheet.addCell(new Label(col8,row17,"W"));
        mysheet.mergeCells(col10,row17,col13,row17);
        mysheet.addCell(new Label(col10,row17,"Kaynak"));
        
        mysheet.mergeCells(col8,row18,col9,row18);
        mysheet.addCell(new Label(col8,row18,"B"));
        mysheet.mergeCells(col10,row18,col13,row18);
        mysheet.addCell(new Label(col10,row18,"Kaynak Ağzı"));
        
        // Standarttan Sapmalar
        mysheet.mergeCells(col0,row19,col3,row19);
        mysheet.addCell(new Label(col0,row19,"Standarttan Sapmalar"));
        
        mysheet.mergeCells(col4,row19,col13,row19);
        mysheet.addCell(new Label(col4,row19,"Standarttan Sapma Yoktur."));
        
        // Muayene Tarihleri
        mysheet.mergeCells(col0,row20,col3,row20);
        mysheet.addCell(new Label(col0,row20,"Muayene Tarihleri"));
        
        mysheet.mergeCells(col4,row20,col13,row20);
        mysheet.addCell(new Label(col4,row20,"10/16/2019"));
        
        //Açıklamalar ve Ekler
        mysheet.mergeCells(col0,row21,col3,row21);
        mysheet.addCell(new Label(col0,row21,"Açıklamalar ve Ekler"));
        
        mysheet.mergeCells(col4,row21,col13,row21);
        mysheet.addCell(new Label(col4,row21," "));
        
        // Muayene Sonuçları
        mysheet.mergeCells(col0,row22,col13,row22);
        mysheet.addCell(new Label(col0,row22,"Muayene Sonuçları"));
        
        mysheet.mergeCells(col0,row23,col0,row23);
        mysheet.addCell(new Label(col0,row23,"Sıra No"));
        mysheet.mergeCells(col1,row23,col3,row23);
        mysheet.addCell(new Label(col1,row23,"Kaynak/ Parça No"));
        mysheet.mergeCells(col4,row23,col4,row23);
        mysheet.addCell(new Label(col4,row23,"Kontrol Uzun."));
        mysheet.mergeCells(col5,row23,col6,row23);
        mysheet.addCell(new Label(col5,row23,"Kaynak Yön."));
        mysheet.mergeCells(col7,row23,col8,row23);
        mysheet.addCell(new Label(col7,row23,"Kalınlık(mm)"));
        mysheet.mergeCells(col9,row23,col9,row23);
        mysheet.addCell(new Label(col9,row23,"Çap (mm)"));
        mysheet.mergeCells(col10,row23,col10,row23);
        mysheet.addCell(new Label(col10,row23,"Hata Tipi"));
        mysheet.mergeCells(col11,row23,col12,row23);
        mysheet.addCell(new Label(col11,row23,"Hatanın Yeri"));
        mysheet.mergeCells(col13,row23,col13,row23);
        mysheet.addCell(new Label(col13,row23,"Sonuç"));
        
        mysheet.mergeCells(col0,row24,col0,row24);
        mysheet.addCell(new Label(col0,row24,"1"));
        mysheet.mergeCells(col1,row24,col3,row24);
        mysheet.addCell(new Label(col1,row24,"TÜRKER ATAGÜL PC"));
        mysheet.mergeCells(col4,row24,col4,row24);
        mysheet.addCell(new Label(col4,row24,"300"));
        mysheet.mergeCells(col5,row24,col6,row24);
        mysheet.addCell(new Label(col5,row24,"FCAW (136)"));
        mysheet.mergeCells(col7,row24,col8,row24);
        mysheet.addCell(new Label(col7,row24,"12"));
        mysheet.mergeCells(col9,row24,col9,row24);
        mysheet.addCell(new Label(col9,row24,"-"));
        mysheet.mergeCells(col10,row24,col10,row24);
        mysheet.addCell(new Label(col10,row24,""));
        mysheet.mergeCells(col11,row24,col12,row24);
        mysheet.addCell(new Label(col11,row24,""));
        mysheet.mergeCells(col13,row24,col13,row24);
        mysheet.addCell(new Label(col13,row24,"OK"));
        
        mysheet.mergeCells(col0,row25,col0,row25);
        mysheet.addCell(new Label(col0,row25,"2"));
        mysheet.mergeCells(col1,row25,col3,row25);
        mysheet.addCell(new Label(col1,row25,"TÜRKER ATAGÜL PF"));
        mysheet.mergeCells(col4,row25,col4,row25);
        mysheet.addCell(new Label(col4,row25,"300"));
        mysheet.mergeCells(col5,row25,col6,row25);
        mysheet.addCell(new Label(col5,row25,"FCAW (136)"));
        mysheet.mergeCells(col7,row25,col8,row25);
        mysheet.addCell(new Label(col7,row25,"12"));
        mysheet.mergeCells(col9,row25,col9,row25);
        mysheet.addCell(new Label(col9,row25,"-"));
        mysheet.mergeCells(col10,row25,col10,row25);
        mysheet.addCell(new Label(col10,row25,""));
        mysheet.mergeCells(col11,row25,col12,row25);
        mysheet.addCell(new Label(col11,row25,""));
        mysheet.mergeCells(col13,row25,col13,row25);
        mysheet.addCell(new Label(col13,row25,"OK"));
        
        mysheet.mergeCells(col0,row26,col0,row26);
        mysheet.addCell(new Label(col0,row26,"3"));
        mysheet.mergeCells(col1,row26,col3,row26);
        mysheet.addCell(new Label(col1,row26,"TÜRKER ATAGÜL PD"));
        mysheet.mergeCells(col4,row26,col4,row26);
        mysheet.addCell(new Label(col4,row26,"300"));
        mysheet.mergeCells(col5,row26,col6,row26);
        mysheet.addCell(new Label(col5,row26,"FCAW (136)"));
        mysheet.mergeCells(col7,row26,col8,row26);
        mysheet.addCell(new Label(col7,row26,"12"));
        mysheet.mergeCells(col9,row26,col9,row26);
        mysheet.addCell(new Label(col9,row26,"-"));
        mysheet.mergeCells(col10,row26,col10,row26);
        mysheet.addCell(new Label(col10,row26,""));
        mysheet.mergeCells(col11,row26,col12,row26);
        mysheet.addCell(new Label(col11,row26,""));
        mysheet.mergeCells(col13,row26,col13,row26);
        mysheet.addCell(new Label(col13,row26,"OK"));
        
        mysheet.mergeCells(col0,row27,col0,row27);
        mysheet.addCell(new Label(col0,row27,"4"));
        mysheet.mergeCells(col1,row27,col3,row27);
        mysheet.addCell(new Label(col1,row27,"TÜRKER ATAGÜL PF"));
        mysheet.mergeCells(col4,row27,col4,row27);
        mysheet.addCell(new Label(col4,row27,"300"));
        mysheet.mergeCells(col5,row27,col6,row27);
        mysheet.addCell(new Label(col5,row27,"SMAW (111)"));
        mysheet.mergeCells(col7,row27,col8,row27);
        mysheet.addCell(new Label(col7,row27,"12"));
        mysheet.mergeCells(col9,row27,col9,row27);
        mysheet.addCell(new Label(col9,row27,"-"));
        mysheet.mergeCells(col10,row27,col10,row27);
        mysheet.addCell(new Label(col10,row27,""));
        mysheet.mergeCells(col11,row27,col12,row27);
        mysheet.addCell(new Label(col11,row27,""));
        mysheet.mergeCells(col13,row27,col13,row27);
        mysheet.addCell(new Label(col13,row27,"OK"));
        
        mysheet.mergeCells(col0,row28,col0,row28);
        mysheet.addCell(new Label(col0,row28,"5"));
        mysheet.mergeCells(col1,row28,col3,row28);
        mysheet.addCell(new Label(col1,row28,"TÜRKER ATAGÜL PD"));
        mysheet.mergeCells(col4,row28,col4,row28);
        mysheet.addCell(new Label(col4,row28,"300"));
        mysheet.mergeCells(col5,row28,col6,row28);
        mysheet.addCell(new Label(col5,row28,"SMAW (111)"));
        mysheet.mergeCells(col7,row28,col8,row28);
        mysheet.addCell(new Label(col7,row28,"12"));
        mysheet.mergeCells(col9,row28,col9,row28);
        mysheet.addCell(new Label(col9,row28,"-"));
        mysheet.mergeCells(col10,row28,col10,row28);
        mysheet.addCell(new Label(col10,row28,""));
        mysheet.mergeCells(col11,row28,col12,row28);
        mysheet.addCell(new Label(col11,row28,""));
        mysheet.mergeCells(col13,row28,col13,row28);
        mysheet.addCell(new Label(col13,row28,"OK"));
        
        mysheet.mergeCells(col0,row29,col0,row29);
        mysheet.addCell(new Label(col0,row29,"6"));
        mysheet.mergeCells(col1,row29,col3,row29);
        mysheet.addCell(new Label(col1,row29,"TÜRKER ATAGÜL H045"));
        mysheet.mergeCells(col4,row29,col4,row29);
        mysheet.addCell(new Label(col4,row29,"300"));
        mysheet.mergeCells(col5,row29,col6,row29);
        mysheet.addCell(new Label(col5,row29,"TIG (141)"));
        mysheet.mergeCells(col7,row29,col8,row29);
        mysheet.addCell(new Label(col7,row29,"4"));
        mysheet.mergeCells(col9,row29,col9,row29);
        mysheet.addCell(new Label(col9,row29,"4\""));
        mysheet.mergeCells(col10,row29,col10,row29);
        mysheet.addCell(new Label(col10,row29,""));
        mysheet.mergeCells(col11,row29,col12,row29);
        mysheet.addCell(new Label(col11,row29,""));
        mysheet.mergeCells(col13,row29,col13,row29);
        mysheet.addCell(new Label(col13,row29,"OK"));
        
        mysheet.mergeCells(col0,row30,col0,row30);
        mysheet.addCell(new Label(col0,row30,"7"));
        mysheet.mergeCells(col1,row30,col3,row30);
        mysheet.addCell(new Label(col1,row30,""));
        mysheet.mergeCells(col4,row30,col4,row30);
        mysheet.addCell(new Label(col4,row30,""));
        mysheet.mergeCells(col5,row30,col6,row30);
        mysheet.addCell(new Label(col5,row30,""));
        mysheet.mergeCells(col7,row30,col8,row30);
        mysheet.addCell(new Label(col7,row30,""));
        mysheet.mergeCells(col9,row30,col9,row30);
        mysheet.addCell(new Label(col9,row30,""));
        mysheet.mergeCells(col10,row30,col10,row30);
        mysheet.addCell(new Label(col10,row30,""));
        mysheet.mergeCells(col11,row30,col12,row30);
        mysheet.addCell(new Label(col11,row30,""));
        mysheet.mergeCells(col13,row30,col13,row30);
        mysheet.addCell(new Label(col13,row30,""));
        
        mysheet.mergeCells(col0,row31,col0,row31);
        mysheet.addCell(new Label(col0,row31,"8"));
        mysheet.mergeCells(col1,row31,col3,row31);
        mysheet.addCell(new Label(col1,row31,""));
        mysheet.mergeCells(col4,row31,col4,row31);
        mysheet.addCell(new Label(col4,row31,""));
        mysheet.mergeCells(col5,row31,col6,row31);
        mysheet.addCell(new Label(col5,row31,""));
        mysheet.mergeCells(col7,row31,col8,row31);
        mysheet.addCell(new Label(col7,row31,""));
        mysheet.mergeCells(col9,row31,col9,row31);
        mysheet.addCell(new Label(col9,row31,""));
        mysheet.mergeCells(col10,row31,col10,row31);
        mysheet.addCell(new Label(col10,row31,""));
        mysheet.mergeCells(col11,row31,col12,row31);
        mysheet.addCell(new Label(col11,row31,""));
        mysheet.mergeCells(col13,row31,col13,row31);
        mysheet.addCell(new Label(col13,row31,""));
        
        mysheet.mergeCells(col0,row32,col0,row32);
        mysheet.addCell(new Label(col0,row32,"9"));
        mysheet.mergeCells(col1,row32,col3,row32);
        mysheet.addCell(new Label(col1,row32,""));
        mysheet.mergeCells(col4,row32,col4,row32);
        mysheet.addCell(new Label(col4,row32,""));
        mysheet.mergeCells(col5,row32,col6,row32);
        mysheet.addCell(new Label(col5,row32,""));
        mysheet.mergeCells(col7,row32,col8,row32);
        mysheet.addCell(new Label(col7,row32,""));
        mysheet.mergeCells(col9,row32,col9,row32);
        mysheet.addCell(new Label(col9,row32,""));
        mysheet.mergeCells(col10,row32,col10,row32);
        mysheet.addCell(new Label(col10,row32,""));
        mysheet.mergeCells(col11,row32,col12,row32);
        mysheet.addCell(new Label(col11,row32,""));
        mysheet.mergeCells(col13,row32,col13,row32);
        mysheet.addCell(new Label(col13,row32,""));
        
        mysheet.mergeCells(col0,row33,col0,row33);
        mysheet.addCell(new Label(col0,row33,"10"));
        mysheet.mergeCells(col1,row33,col3,row33);
        mysheet.addCell(new Label(col1,row33,""));
        mysheet.mergeCells(col4,row33,col4,row33);
        mysheet.addCell(new Label(col4,row33,""));
        mysheet.mergeCells(col5,row33,col6,row33);
        mysheet.addCell(new Label(col5,row33,""));
        mysheet.mergeCells(col7,row33,col8,row33);
        mysheet.addCell(new Label(col7,row33,""));
        mysheet.mergeCells(col9,row33,col9,row33);
        mysheet.addCell(new Label(col9,row33,""));
        mysheet.mergeCells(col10,row33,col10,row33);
        mysheet.addCell(new Label(col10,row33,""));
        mysheet.mergeCells(col11,row33,col12,row33);
        mysheet.addCell(new Label(col11,row33,""));
        mysheet.mergeCells(col13,row33,col13,row33);
        mysheet.addCell(new Label(col13,row33,""));
        
        mysheet.mergeCells(col0,row34,col0,row34);
        mysheet.addCell(new Label(col0,row34,"11"));
        mysheet.mergeCells(col1,row34,col3,row34);
        mysheet.addCell(new Label(col1,row34,""));
        mysheet.mergeCells(col4,row34,col4,row34);
        mysheet.addCell(new Label(col4,row34,""));
        mysheet.mergeCells(col5,row34,col6,row34);
        mysheet.addCell(new Label(col5,row34,""));
        mysheet.mergeCells(col7,row34,col8,row34);
        mysheet.addCell(new Label(col7,row34,""));
        mysheet.mergeCells(col9,row34,col9,row34);
        mysheet.addCell(new Label(col9,row34,""));
        mysheet.mergeCells(col10,row34,col10,row34);
        mysheet.addCell(new Label(col10,row34,""));
        mysheet.mergeCells(col11,row34,col12,row34);
        mysheet.addCell(new Label(col11,row34,""));
        mysheet.mergeCells(col13,row34,col13,row34);
        mysheet.addCell(new Label(col13,row34,""));
        
        mysheet.mergeCells(col0,row35,col0,row35);
        mysheet.addCell(new Label(col0,row35,"12"));
        mysheet.mergeCells(col1,row35,col3,row35);
        mysheet.addCell(new Label(col1,row35,""));
        mysheet.mergeCells(col4,row35,col4,row35);
        mysheet.addCell(new Label(col4,row35,""));
        mysheet.mergeCells(col5,row35,col6,row35);
        mysheet.addCell(new Label(col5,row35,""));
        mysheet.mergeCells(col7,row35,col8,row35);
        mysheet.addCell(new Label(col7,row35,""));
        mysheet.mergeCells(col9,row35,col9,row35);
        mysheet.addCell(new Label(col9,row35,""));
        mysheet.mergeCells(col10,row35,col10,row35);
        mysheet.addCell(new Label(col10,row35,""));
        mysheet.mergeCells(col11,row35,col12,row35);
        mysheet.addCell(new Label(col11,row35,""));
        mysheet.mergeCells(col13,row35,col13,row35);
        mysheet.addCell(new Label(col13,row35,""));
        
        mysheet.mergeCells(col0,row36,col0,row36);
        mysheet.addCell(new Label(col0,row36,"13"));
        mysheet.mergeCells(col1,row36,col3,row36);
        mysheet.addCell(new Label(col1,row36,""));
        mysheet.mergeCells(col4,row36,col4,row36);
        mysheet.addCell(new Label(col4,row36,""));
        mysheet.mergeCells(col5,row36,col6,row36);
        mysheet.addCell(new Label(col5,row36,""));
        mysheet.mergeCells(col7,row36,col8,row36);
        mysheet.addCell(new Label(col7,row36,""));
        mysheet.mergeCells(col9,row36,col9,row36);
        mysheet.addCell(new Label(col9,row36,""));
        mysheet.mergeCells(col10,row36,col10,row36);
        mysheet.addCell(new Label(col10,row36,""));
        mysheet.mergeCells(col11,row36,col12,row36);
        mysheet.addCell(new Label(col11,row36,""));
        mysheet.mergeCells(col13,row36,col13,row36);
        mysheet.addCell(new Label(col13,row36,""));
        
        mysheet.mergeCells(col0,row37,col0,row37);
        mysheet.addCell(new Label(col0,row37,"14"));
        mysheet.mergeCells(col1,row37,col3,row37);
        mysheet.addCell(new Label(col1,row37,""));
        mysheet.mergeCells(col4,row37,col4,row37);
        mysheet.addCell(new Label(col4,row37,""));
        mysheet.mergeCells(col5,row37,col6,row37);
        mysheet.addCell(new Label(col5,row37,""));
        mysheet.mergeCells(col7,row37,col8,row37);
        mysheet.addCell(new Label(col7,row37,""));
        mysheet.mergeCells(col9,row37,col9,row37);
        mysheet.addCell(new Label(col9,row37,""));
        mysheet.mergeCells(col10,row37,col10,row37);
        mysheet.addCell(new Label(col10,row37,""));
        mysheet.mergeCells(col11,row37,col12,row37);
        mysheet.addCell(new Label(col11,row37,""));
        mysheet.mergeCells(col13,row37,col13,row37);
        mysheet.addCell(new Label(col13,row37,""));
        
        // Personel Bilgileri
        mysheet.mergeCells(col0,row38,col2,row38);
        mysheet.addCell(new Label(col0,row38,"Personel Bilgileri"));
        mysheet.mergeCells(col3,row38,col5,row38);
        mysheet.addCell(new Label(col3,row38,"Operatör"));
        mysheet.mergeCells(col6,row38,col8,row38);
        mysheet.addCell(new Label(col6,row38,"Değerlendiren"));
        mysheet.mergeCells(col9,row38,col10,row38);
        mysheet.addCell(new Label(col9,row38,"Onay"));
        mysheet.mergeCells(col11,row38,col13,row38);
        mysheet.addCell(new Label(col11,row38,"Müşteri"));
        
        mysheet.mergeCells(col0,row39,col2,row39);
        mysheet.addCell(new Label(col0,row39,"Adı Soyadı"));
        mysheet.mergeCells(col3,row39,col5,row39);
        mysheet.addCell(new Label(col3,row39,"fsdf"));
        mysheet.mergeCells(col6,row39,col8,row39);
        mysheet.addCell(new Label(col6,row39,"dasdasd"));
        mysheet.mergeCells(col9,row39,col10,row39);
        mysheet.addCell(new Label(col9,row39,"asdasd"));
        mysheet.mergeCells(col11,row39,col13,row39);
        mysheet.addCell(new Label(col11,row39,""));
        
        mysheet.mergeCells(col0,row40,col2,row40);
        mysheet.addCell(new Label(col0,row40,"Seviye"));
        mysheet.mergeCells(col3,row40,col5,row40);
        mysheet.addCell(new Label(col3,row40,"LEVEL 2"));
        mysheet.mergeCells(col6,row40,col8,row40);
        mysheet.addCell(new Label(col6,row40,"LEVEL 2"));
        mysheet.mergeCells(col9,row40,col10,row40);
        mysheet.addCell(new Label(col9,row40,"LEVEL 3"));
        mysheet.mergeCells(col11,row40,col13,row40);
        mysheet.addCell(new Label(col11,row40,""));
        
        mysheet.mergeCells(col0,row41,col2,row41);
        mysheet.addCell(new Label(col0,row41,"Tarih"));
        mysheet.mergeCells(col3,row41,col5,row41);
        mysheet.addCell(new Label(col3,row41,"10/16/2019"));
        mysheet.mergeCells(col6,row41,col8,row41);
        mysheet.addCell(new Label(col6,row41,"10/16/2019"));
        mysheet.mergeCells(col9,row41,col10,row41);
        mysheet.addCell(new Label(col9,row41,"10/16/2019"));
        mysheet.mergeCells(col11,row41,col13,row41);
        mysheet.addCell(new Label(col11,row41,""));
        
        mysheet.mergeCells(col0,row42,col2,row43);
        mysheet.addCell(new Label(col0,row42,"İmza"));
        mysheet.mergeCells(col3,row42,col5,row43);
        mysheet.addCell(new Label(col3,row42,""));
        mysheet.mergeCells(col6,row42,col8,row43);
        mysheet.addCell(new Label(col6,row42,""));
        mysheet.mergeCells(col9,row42,col10,row43);
        mysheet.addCell(new Label(col9,row42,""));
        mysheet.mergeCells(col11,row42,col13,row43);
        mysheet.addCell(new Label(col11,row42,""));

              
        myexel.write();
        myexel.close();
        System.out.println("Finished");
    }
    
}
