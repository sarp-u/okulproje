
package okulproje;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableImage;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 * FXML Controller class
 *
 * @author fener
 */
public class ReportMainController implements Initializable {
    // TextField
    @FXML private TextField inspecitonStandart;
    @FXML private TextField evaluationStandart;
    @FXML private TextField inspectionProcedure;
    @FXML private TextField page;
    @FXML private TextField reportNo;
    @FXML private TextField reportDate;
    @FXML private TextField luxMeter;
    @FXML private TextField testMedium;
    @FXML private TextField demagnetization;
    @FXML private TextField drawingNo;
    @FXML private TextField heatTreatment;
    @FXML private TextField gaussField;
    @FXML private TextField surfaceCondition2;
    @FXML private TextField lightEquip;
    @FXML private TextField liftingTestDate;
    @FXML private TextField standardDeviations;
    @FXML private TextField inspectionDates;
    @FXML private TextField descriptions;
    @FXML private TextField examinationArea;
    @FXML private TextField weldNo;
    @FXML private TextField testLength;
    @FXML private TextField weldingProcess;
    @FXML private TextField thickness;
    @FXML private TextField diameter;
    @FXML private TextField defectType;
    @FXML private TextField defectLoc;
    @FXML private TextField weldNo2;
    @FXML private TextField testLength2;
    @FXML private TextField weldingProcess2;
    @FXML private TextField thickness2;
    @FXML private TextField diameter2;
    @FXML private TextField defectType2;
    @FXML private TextField defectLoc2;
    @FXML private TextField weldNo3;
    @FXML private TextField testLength3;
    @FXML private TextField weldingProcess3;
    @FXML private TextField thickness3;
    @FXML private TextField diameter3;
    @FXML private TextField defectType3;
    @FXML private TextField defectLoc3;
    @FXML private TextField date9;
    @FXML private TextField date8;
    @FXML private TextField date7;
    @FXML private TextField date6;
    
    // ChoiceBox
    ObservableList customerList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> customer;
    ObservableList projectNameList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> projectName;
    ObservableList inspectionPlaceList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> inspectionPlace;
    ObservableList inspectionScopeList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> inspectionScope;
    ObservableList surfaceConditionList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> surfaceCondition;
    ObservableList examinationStageList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> examinationStage;
    ObservableList jobOrderNoList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> jobOrderNo;
    ObservableList offerNoList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> offerNo;
    ObservableList poleDistanceList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> poleDistance;
    ObservableList equipmentList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> equipment;
    ObservableList carrierMediumList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> carrierMedium;
    ObservableList magTechList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> magTech;
    ObservableList lightIntensityList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> lightIntensity;
    ObservableList lightDistanceList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> lightDistance;
    ObservableList currentTypeList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> currentType;
    ObservableList surfaceTemperatureList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> surfaceTemperature;
    ObservableList result1List = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> res1;
    ObservableList result2List = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> res2;
    ObservableList result3List = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> res3;
    ObservableList customer9List = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> customer9;
    
    
    // data baseden gelenler
    ObservableList dataName1List = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> dataName1;
    ObservableList dataName2List = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> dataName2;
    ObservableList dataName3List = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> dataName3;
    ObservableList levelList = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> level;
    ObservableList level2List = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> level2;
    ObservableList level3List = FXCollections.observableArrayList();
    @FXML private ChoiceBox<String> level3;
    
    // CheckBox
    @FXML private CheckBox buttWeld;
    @FXML private CheckBox filletWeld;
    
    
    private ObservableList<employeeManagement> data;
    private dataBase dc;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dc = new dataBase();
        try {
            startAll();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ReportMainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleExcel(MouseEvent event) throws IOException, WriteException{
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
        

        File f = new File("C:\\Users\\fener\\OneDrive\\Masaüstü\\excel2.xls");
        WritableWorkbook myexel = Workbook.createWorkbook(f);
        WritableSheet mysheet = myexel.createSheet("mySheet", 0);
        mysheet.getSettings().setDefaultColumnWidth(12);
        mysheet.getSettings().setDefaultRowHeight(500);
        
        
        
        // Başlangıçtaki boşluk   
        mysheet.mergeCells(col0,row0,col3,row1); 
        mysheet.addCell(new Label(col1,row1,""));
        
        // Gözetim muayene
        mysheet.mergeCells(col4,row0,col13,row0); 
        mysheet.addCell(new Label(col4,row0,"                                                                             "
                + "GÖZETİM MUAYENE VE EĞİTİM HİZMETLERİ"));
        
        // Manyetik Parçacık
        mysheet.mergeCells(col4,row1,col13,row1); 
        mysheet.addCell(new Label(col4,row1,"                                                                              "
                + "MANYETİK PARÇACIK MUAYENE RAPORU\n"
        + "                                                                             "
                + "MAGNETIC PARTICLE INSPECTION REPORT"));
        
        // Müşteri
        mysheet.mergeCells(col0,row2,col1,row2);
        mysheet.addCell(new Label(col0,row2,"Müşteri\n"
        + "Customer"));
        
        String customerSelected = customer.getValue();
        mysheet.mergeCells(col2,row2,col4,row2);
        mysheet.addCell(new Label(col2,row2, customerSelected));
        
        // Proje
        mysheet.mergeCells(col0,row3,col1,row3);
        mysheet.addCell(new Label(col0,row3,"Proje Adı\n"
        + "Project Name"));
        
        String projectNameSelected = projectName.getValue();
        mysheet.mergeCells(col2,row3,col4,row3);
        mysheet.addCell(new Label(col2,row3, projectNameSelected));
        
        // Test
        mysheet.mergeCells(col0,row4,col1,row4);
        mysheet.addCell(new Label(col0,row4,"Test Yeri\n"
        + "Inspection Place"));
        
        String inspectionPlaceSelected = inspectionPlace.getValue();
        mysheet.mergeCells(col2,row4,col4,row4);
        mysheet.addCell(new Label(col2,row4, inspectionPlaceSelected));
        
        // Muayene
        mysheet.mergeCells(col0,row5,col1,row5);
        mysheet.addCell(new Label(col0,row5,"Muayene Standardı\n"
        + "Inspection Standart"));
        
        mysheet.mergeCells(col2,row5,col4,row5);
        mysheet.addCell(new Label(col2,row5, inspecitonStandart.getText()));
        
        //  Değerlendirme
        mysheet.mergeCells(col0,row6,col1,row6);
        mysheet.addCell(new Label(col0,row6,"Değerlen. Standardı\n"
        + "Evaluation Standart"));
        
        mysheet.mergeCells(col2,row6,col4,row6);
        mysheet.addCell(new Label(col2,row6, evaluationStandart.getText()));
        
        // Muayene Prosedürü
        mysheet.mergeCells(col5,row2,col7,row2);
        mysheet.addCell(new Label(col5,row2,"Muayene Prosedürü\n"
        + "Inspection Procedure"));
        
        mysheet.mergeCells(col8,row2,col9,row2);
        mysheet.addCell(new Label(col8,row2, inspectionProcedure.getText()));
        
        // Muayene Kapsamı
        mysheet.mergeCells(col5,row3,col7,row3);
        mysheet.addCell(new Label(col5,row3,"Muayene Kapsamı\n"
        + "Inspection Scope"));
        
        String inspectionScopeSelected = inspectionScope.getValue();
        mysheet.mergeCells(col8,row3,col9,row3);
        mysheet.addCell(new Label(col8,row3, inspectionScopeSelected));
        
        // Resim No
        mysheet.mergeCells(col5,row4,col7,row4);
        mysheet.addCell(new Label(col5,row4,"Resim No\n"
        + "Drawing No"));
        
        mysheet.mergeCells(col8,row4,col9,row4);
        mysheet.addCell(new Label(col8,row4, drawingNo.getText()));
        
        // Yüzey Durumu
        mysheet.mergeCells(col5,row5,col7,row5);
        mysheet.addCell(new Label(col5,row5,"Yüzey Durumu\n"
        + "Surface Condition"));
        
        String surfaceConditionSelected = surfaceCondition.getValue();
        mysheet.mergeCells(col8,row5,col9,row5);
        mysheet.addCell(new Label(col8,row5, surfaceConditionSelected));
        
        // Muayene Aşaması
        mysheet.mergeCells(col5,row6,col7,row6);
        mysheet.addCell(new Label(col5,row6,"Muayene Aşaması\n"
        + "State of Examination"));
        
        String examinationStageSelected = examinationStage.getValue();
        mysheet.mergeCells(col8,row6,col9,row6);
        mysheet.addCell(new Label(col8,row6, examinationStageSelected));
        
        // Sayfa No
        mysheet.mergeCells(col10,row2,col11,row2);
        mysheet.addCell(new Label(col10,row2,"Sayfa No\n"
        +"Page"));
        
        mysheet.mergeCells(col12,row2,col13,row2);
        mysheet.addCell(new Label(col12,row2, page.getText()));
        
        // Rapor No
        mysheet.mergeCells(col10,row3,col11,row3);
        mysheet.addCell(new Label(col10,row3,"Rapor No\n"
        + "Report No"));
        
        mysheet.mergeCells(col12,row3,col13,row3);
        mysheet.addCell(new Label(col12,row3, reportNo.getText()));
        
        // Rapor Tarihi
        mysheet.mergeCells(col10,row4,col11,row4);
        mysheet.addCell(new Label(col10,row4,"Rapor Tarihi\n"
        + "Report Date"));
        
        mysheet.mergeCells(col12,row4,col13,row4);
        mysheet.addCell(new Label(col12,row4, reportDate.getText()));
        
        // İş Emri No
        mysheet.mergeCells(col10,row5,col11,row5);
        mysheet.addCell(new Label(col10,row5,"İş Emri No\n"
        + "Job Order No"));
        
        String jobOrderNoSelected = jobOrderNo.getValue();
        mysheet.mergeCells(col12,row5,col13,row5);
        mysheet.addCell(new Label(col12,row5, jobOrderNoSelected));
        
        // Teklif No
        mysheet.mergeCells(col10,row6,col11,row6);
        mysheet.addCell(new Label(col10,row6,"Teklif No\n"
        + "Offer No"));
        
        String offerNoSelected = offerNo.getValue();
        mysheet.mergeCells(col12,row6,col13,row6);
        mysheet.addCell(new Label(col12,row6, offerNoSelected));
        
        // Ekipman Bilgileri
        mysheet.mergeCells(col0,row7,col13,row7);
        mysheet.addCell(new Label(col0,row7,"                                                                                                                                           "
                + "Ekipman Bilgileri/ Equipment Informations"));
        
        // Kutup Mesafesi
        mysheet.mergeCells(col0,row8,col1,row8);
        mysheet.addCell(new Label(col0,row8,"Kutup Mesafesi, mm\n"
                + "Pole Distance"));
        
        String poleDistanceSelected = poleDistance.getValue();
        mysheet.mergeCells(col2,row8,col3,row8);
        mysheet.addCell(new Label(col2,row8, poleDistanceSelected));
        
        // Cihaz
        mysheet.mergeCells(col0,row9,col1,row9);
        mysheet.addCell(new Label(col0,row9,"Cihaz\n"
                + "Equipment"));
        
        String equipmentSelected = equipment.getValue();
        mysheet.mergeCells(col2,row9,col3,row9);
        mysheet.addCell(new Label(col2,row9, equipmentSelected));
        
        // MP Taşıyıcı
        mysheet.mergeCells(col0,row10,col1,row10);
        mysheet.addCell(new Label(col0,row10,"Mp Taşıyıcı Ortam\n"
                + "MP Carrier Medium"));
        
        String carrierMediumSelected = carrierMedium.getValue();
        mysheet.mergeCells(col2,row10,col3,row10);
        mysheet.addCell(new Label(col2,row10, carrierMediumSelected));
        
        // Mıknatıslama Tekniği
        mysheet.mergeCells(col0,row11,col1,row11);
        mysheet.addCell(new Label(col0,row11,"Mıknatıslama Tekniği\n"
                + "Meg. Tech."));
        
        String magTechSelected = magTech.getValue();
        mysheet.mergeCells(col2,row11,col3,row11);
        mysheet.addCell(new Label(col2,row11, magTechSelected));
        
        // UV Işık
        mysheet.mergeCells(col0,row12,col1,row12);
        mysheet.addCell(new Label(col0,row12,"UV Işık Şiddeti\n"
                + "UV Light Intensity"));
        
        String lightIntensitySelected = lightIntensity.getValue();
        mysheet.mergeCells(col2,row12,col3,row12);
        mysheet.addCell(new Label(col2,row12, lightIntensitySelected));
        
        // Işık Mesafesi
        mysheet.mergeCells(col0,row13,col1,row13);
        mysheet.addCell(new Label(col0,row13,"Işık Mesafesi\n"
                + "Distance of Light"));
        
        String lightDistanceSelected = lightDistance.getValue();
        mysheet.mergeCells(col2,row13,col3,row13);
        mysheet.addCell(new Label(col2,row13, lightDistanceSelected));
        
        // Muayene Bölgesi
        mysheet.mergeCells(col4,row8,col6,row8);
        mysheet.addCell(new Label(col4,row8,"Muayene Bölgesi\n"
                + "Examination Area"));
        
        mysheet.mergeCells(col7,row8,col8,row8);
        mysheet.addCell(new Label(col7,row8, examinationArea.getText()));
        
        // Akım Tipi
        mysheet.mergeCells(col4,row9,col6,row9);
        mysheet.addCell(new Label(col4,row9,"Akım Tipi\n"
                + "Current Type"));
        
        String currentTypeSelected = currentType.getValue();
        mysheet.mergeCells(col7,row9,col8,row9);
        mysheet.addCell(new Label(col7,row9, currentTypeSelected));
        
        // Işık Şiddeti
        mysheet.mergeCells(col4,row10,col6,row10);
        mysheet.addCell(new Label(col4,row10,"Luxmetre/ Işık Şiddeti\n"
                + "Luxmeter"));
        
        mysheet.mergeCells(col7,row10,col8,row10);
        mysheet.addCell(new Label(col7,row10, luxMeter.getText()));
        
        // Muayene Ortamı
        mysheet.mergeCells(col4,row11,col6,row11);
        mysheet.addCell(new Label(col4,row11,"Muayene Ortamı\n"
                + "Test Medium"));
        
        mysheet.mergeCells(col7,row11,col8,row11);
        mysheet.addCell(new Label(col7,row11, testMedium.getText()));
        
        // Mıknatıs Giderimi
        mysheet.mergeCells(col4,row12,col6,row12);
        mysheet.addCell(new Label(col4,row12,"Mıknatıs Giderimi\n"
                + "Demagnetization"));
        
        mysheet.mergeCells(col7,row12,col8,row12);
        mysheet.addCell(new Label(col7,row12, demagnetization.getText()));
        
        // Isıl İşlem
        mysheet.mergeCells(col4,row13,col6,row13);
        mysheet.addCell(new Label(col4,row13,"Isıl İşlem\n"
                + "Heat Treatment"));
        
        mysheet.mergeCells(col7,row13,col8,row13);
        mysheet.addCell(new Label(col7,row13, heatTreatment.getText()));
        
       
        
        // Yüzey Sıcaklığı
        mysheet.mergeCells(col9,row8,col10,row8);
        mysheet.addCell(new Label(col9,row8,"Yüzey Sıcaklığı °C\n"
                + "Surface Temperature"));
        
        String surfaceTemperatureSelected = surfaceTemperature.getValue();
        mysheet.mergeCells(col11,row8,col13,row8);
        mysheet.addCell(new Label(col11,row8, surfaceTemperatureSelected));
        
        
        // Alan Şiddeti
        mysheet.mergeCells(col9,row9,col10,row10);
        mysheet.addCell(new Label(col9,row9,"Muayene Bölgesindeki Alan Şiddeti\n"
                + "                  kA/m\n"
                + "      Gauss Field Strength"));
        
        mysheet.mergeCells(col11,row9,col13,row10);
        mysheet.addCell(new Label(col11,row9, gaussField.getText()));
        
        // Yüzey
        mysheet.mergeCells(col9,row11,col10,row11);
        mysheet.addCell(new Label(col9,row11,"Yüzey\n"
                + "Surface Condition"));
        
        mysheet.mergeCells(col11,row11,col13,row11);
        mysheet.addCell(new Label(col11,row11, surfaceCondition2.getText()));
        
        // Işık Cihazı
        mysheet.mergeCells(col9,row12,col10,row12);
        mysheet.addCell(new Label(col9,row12,"Işık Cihazı Tanımı\n"
                + "Identification of Light Equip."));
        
        mysheet.mergeCells(col11,row12,col13,row12);
        mysheet.addCell(new Label(col11,row12, lightEquip.getText()));
        
        // Kaldırma Testi
        mysheet.mergeCells(col9,row13,col10,row13);
        mysheet.addCell(new Label(col9,row13,"Kaldırma Testi Tarihi/ No\n"
                + "Lifting Test Date/ Number"));
        
        mysheet.mergeCells(col11,row13,col13,row13);
        mysheet.addCell(new Label(col11,row13, liftingTestDate.getText()));
        
        // Resimler
        mysheet.mergeCells(col0,row14,col3,row18);
        java.io.File imageFile = new java.io.File("C:\\Users\\fener\\OneDrive\\Belgeler\\NetBeansProjects\\okulproje\\src\\images\\alın.png");
        BufferedImage input = ImageIO.read(imageFile);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(input, "PNG", baos);
        mysheet.addImage(new WritableImage(0,14,3.75,4.75, baos.toByteArray()));
        
        mysheet.mergeCells(col4,row14,col7,row18);
        java.io.File imageFile2 = new java.io.File("C:\\Users\\fener\\OneDrive\\Belgeler\\NetBeansProjects\\okulproje\\src\\images\\kose.png");
        BufferedImage input2 = ImageIO.read(imageFile2);
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        ImageIO.write(input2, "PNG", baos2);
        mysheet.addImage(new WritableImage(4,14,3.75,4.75, baos2.toByteArray()));
        

        if(buttWeld.isSelected()){
            java.io.File imageFile3 = new java.io.File("C:\\Users\\fener\\OneDrive\\Belgeler\\NetBeansProjects\\okulproje\\src\\images\\tik.png");
            BufferedImage input3 = ImageIO.read(imageFile3);
            ByteArrayOutputStream baos3 = new ByteArrayOutputStream();
            ImageIO.write(input3, "PNG", baos3);
            mysheet.addImage(new WritableImage(3,18,0.5,0.5, baos3.toByteArray()));
        }
        if(filletWeld.isSelected()){
            java.io.File imageFile3 = new java.io.File("C:\\Users\\fener\\OneDrive\\Belgeler\\NetBeansProjects\\okulproje\\src\\images\\tik.png");
            BufferedImage input3 = ImageIO.read(imageFile3);
            ByteArrayOutputStream baos3 = new ByteArrayOutputStream();
            ImageIO.write(input3, "PNG", baos3);
            mysheet.addImage(new WritableImage(7,18,0.5,0.5, baos3.toByteArray()));
        }

        
        // Süreksizlik
        mysheet.mergeCells(col8,row14,col13,row14);
        mysheet.addCell(new Label(col8,row14,"                                    "
                + "Süreksizliğin Yeri/ Location of Discontinuity"));
        
        mysheet.mergeCells(col8,row15,col9,row15);
        mysheet.addCell(new Label(col8,row15,"BM"));
        mysheet.mergeCells(col10,row15,col13,row15);
        mysheet.addCell(new Label(col10,row15,"Ana Metal/ Base Metal"));
        
        mysheet.mergeCells(col8,row16,col9,row16);
        mysheet.addCell(new Label(col8,row16,"HAZ"));
        mysheet.mergeCells(col10,row16,col13,row16);
        mysheet.addCell(new Label(col10,row16,"Isıdan etkilenen bölge / Heat affected zone"));
        
        mysheet.mergeCells(col8,row17,col9,row17);
        mysheet.addCell(new Label(col8,row17,"W"));
        mysheet.mergeCells(col10,row17,col13,row17);
        mysheet.addCell(new Label(col10,row17,"Kaynak/ Weld"));
        
        mysheet.mergeCells(col8,row18,col9,row18);
        mysheet.addCell(new Label(col8,row18,"B"));
        mysheet.mergeCells(col10,row18,col13,row18);
        mysheet.addCell(new Label(col10,row18,"Kaynak Ağzı/ Bevel"));
        
        // Standarttan Sapmalar
        mysheet.mergeCells(col0,row19,col3,row19);
        mysheet.addCell(new Label(col0,row19,"Standarttan Sapmalar\n"
                + "Standard Deviations"));
        
        mysheet.mergeCells(col4,row19,col13,row19);
        mysheet.addCell(new Label(col4,row19, standardDeviations.getText()));
        
        // Muayene Tarihleri
        mysheet.mergeCells(col0,row20,col3,row20);
        mysheet.addCell(new Label(col0,row20,"Muayene Tarihleri\n"
                + "Inspection Dates"));
        
        mysheet.mergeCells(col4,row20,col13,row20);
        mysheet.addCell(new Label(col4,row20, inspectionDates.getText()));
        
        //Açıklamalar ve Ekler
        mysheet.mergeCells(col0,row21,col3,row21);
        mysheet.addCell(new Label(col0,row21,"Açıklamalar ve Ekler\n"
                + "Description and Attachments"));
        
        mysheet.mergeCells(col4,row21,col13,row21);
        mysheet.addCell(new Label(col4,row21, descriptions.getText()));
        
        // Muayene Sonuçları
        mysheet.mergeCells(col0,row22,col13,row22);
        mysheet.addCell(new Label(col0,row22,"                                                                                                                                  "
                + "Muayene Sonuçları/ Inspection Results"));
        
        mysheet.mergeCells(col0,row23,col0,row23);
        mysheet.addCell(new Label(col0,row23,"     Sıra No\n"
                + "    Serial No"));
        mysheet.mergeCells(col1,row23,col3,row23);
        mysheet.addCell(new Label(col1,row23,"                    Kaynak/ Parça No\n"
                + "                      Weld/ Piece No"));
        mysheet.mergeCells(col4,row23,col4,row23);
        mysheet.addCell(new Label(col4,row23," Kontrol Uzun.\n"
                + "  Test Length"));
        mysheet.mergeCells(col5,row23,col6,row23);
        mysheet.addCell(new Label(col5,row23,"              Kaynak Yön.\n"
                + "           Welding Process"));
        mysheet.mergeCells(col7,row23,col8,row23);
        mysheet.addCell(new Label(col7,row23,"              Kalınlık(mm)\n"
                + "               Thickness"));
        mysheet.mergeCells(col9,row23,col9,row23);
        mysheet.addCell(new Label(col9,row23,"   Çap (mm)\n"
                + "    Diameter"));
        mysheet.mergeCells(col10,row23,col10,row23);
        mysheet.addCell(new Label(col10,row23,"    Hata Tipi\n"
                + "  Defect Type"));
        mysheet.mergeCells(col11,row23,col12,row23);
        mysheet.addCell(new Label(col11,row23,"              Hatanın Yeri\n"
                + "               Defect Loc."));
        mysheet.mergeCells(col13,row23,col13,row23);
        mysheet.addCell(new Label(col13,row23,"     Sonuç\n"
                + "     Result"));
        
        mysheet.mergeCells(col0,row24,col0,row24);
        mysheet.addCell(new Label(col0,row24,"1"));
        mysheet.mergeCells(col1,row24,col3,row24);
        mysheet.addCell(new Label(col1,row24, weldNo.getText()));
        mysheet.mergeCells(col4,row24,col4,row24);
        mysheet.addCell(new Label(col4,row24,testLength.getText()));
        mysheet.mergeCells(col5,row24,col6,row24);
        mysheet.addCell(new Label(col5,row24,weldingProcess.getText()));
        mysheet.mergeCells(col7,row24,col8,row24);
        mysheet.addCell(new Label(col7,row24,thickness.getText()));
        mysheet.mergeCells(col9,row24,col9,row24);
        mysheet.addCell(new Label(col9,row24,diameter.getText()));
        mysheet.mergeCells(col10,row24,col10,row24);
        mysheet.addCell(new Label(col10,row24,defectType.getText()));
        mysheet.mergeCells(col11,row24,col12,row24);
        mysheet.addCell(new Label(col11,row24,defectLoc.getText()));
        mysheet.mergeCells(col13,row24,col13,row24);
        String result1Selected = res1.getValue();
        mysheet.addCell(new Label(col13,row24, result1Selected));
        
        mysheet.mergeCells(col0,row25,col0,row25);
        mysheet.addCell(new Label(col0,row25,"2"));
        mysheet.mergeCells(col1,row25,col3,row25);
        mysheet.addCell(new Label(col1,row25, weldNo2.getText()));
        mysheet.mergeCells(col4,row25,col4,row25);
        mysheet.addCell(new Label(col4,row25,testLength2.getText()));
        mysheet.mergeCells(col5,row25,col6,row25);
        mysheet.addCell(new Label(col5,row25, weldingProcess2.getText()));
        mysheet.mergeCells(col7,row25,col8,row25);
        mysheet.addCell(new Label(col7,row25, thickness2.getText()));
        mysheet.mergeCells(col9,row25,col9,row25);
        mysheet.addCell(new Label(col9,row25,diameter2.getText()));
        mysheet.mergeCells(col10,row25,col10,row25);
        mysheet.addCell(new Label(col10,row25,defectType2.getText()));
        mysheet.mergeCells(col11,row25,col12,row25);
        mysheet.addCell(new Label(col11,row25,defectLoc2.getText()));
        mysheet.mergeCells(col13,row25,col13,row25);
        String result2Selected = res2.getValue();
        mysheet.addCell(new Label(col13,row25,result2Selected));
        
        mysheet.mergeCells(col0,row26,col0,row26);
        mysheet.addCell(new Label(col0,row26,"3"));
        mysheet.mergeCells(col1,row26,col3,row26);
        mysheet.addCell(new Label(col1,row26,weldNo3.getText()));
        mysheet.mergeCells(col4,row26,col4,row26);
        mysheet.addCell(new Label(col4,row26,testLength3.getText()));
        mysheet.mergeCells(col5,row26,col6,row26);
        mysheet.addCell(new Label(col5,row26,weldingProcess3.getText()));
        mysheet.mergeCells(col7,row26,col8,row26);
        mysheet.addCell(new Label(col7,row26,thickness3.getText()));
        mysheet.mergeCells(col9,row26,col9,row26);
        mysheet.addCell(new Label(col9,row26,diameter3.getText()));
        mysheet.mergeCells(col10,row26,col10,row26);
        mysheet.addCell(new Label(col10,row26,defectType3.getText()));
        mysheet.mergeCells(col11,row26,col12,row26);
        mysheet.addCell(new Label(col11,row26,defectLoc3.getText()));
        mysheet.mergeCells(col13,row26,col13,row26);
        String result3Selected = res3.getValue();
        mysheet.addCell(new Label(col13,row26,result3Selected));
        
        mysheet.mergeCells(col0,row27,col0,row27);
        mysheet.addCell(new Label(col0,row27,"4"));
        mysheet.mergeCells(col1,row27,col3,row27);
        mysheet.addCell(new Label(col1,row27,""));
        mysheet.mergeCells(col4,row27,col4,row27);
        mysheet.addCell(new Label(col4,row27,""));
        mysheet.mergeCells(col5,row27,col6,row27);
        mysheet.addCell(new Label(col5,row27,""));
        mysheet.mergeCells(col7,row27,col8,row27);
        mysheet.addCell(new Label(col7,row27,""));
        mysheet.mergeCells(col9,row27,col9,row27);
        mysheet.addCell(new Label(col9,row27,""));
        mysheet.mergeCells(col10,row27,col10,row27);
        mysheet.addCell(new Label(col10,row27,""));
        mysheet.mergeCells(col11,row27,col12,row27);
        mysheet.addCell(new Label(col11,row27,""));
        mysheet.mergeCells(col13,row27,col13,row27);
        mysheet.addCell(new Label(col13,row27,""));
        
        mysheet.mergeCells(col0,row28,col0,row28);
        mysheet.addCell(new Label(col0,row28,"5"));
        mysheet.mergeCells(col1,row28,col3,row28);
        mysheet.addCell(new Label(col1,row28,""));
        mysheet.mergeCells(col4,row28,col4,row28);
        mysheet.addCell(new Label(col4,row28,""));
        mysheet.mergeCells(col5,row28,col6,row28);
        mysheet.addCell(new Label(col5,row28,""));
        mysheet.mergeCells(col7,row28,col8,row28);
        mysheet.addCell(new Label(col7,row28,""));
        mysheet.mergeCells(col9,row28,col9,row28);
        mysheet.addCell(new Label(col9,row28,""));
        mysheet.mergeCells(col10,row28,col10,row28);
        mysheet.addCell(new Label(col10,row28,""));
        mysheet.mergeCells(col11,row28,col12,row28);
        mysheet.addCell(new Label(col11,row28,""));
        mysheet.mergeCells(col13,row28,col13,row28);
        mysheet.addCell(new Label(col13,row28,""));
        
        mysheet.mergeCells(col0,row29,col0,row29);
        mysheet.addCell(new Label(col0,row29,"6"));
        mysheet.mergeCells(col1,row29,col3,row29);
        mysheet.addCell(new Label(col1,row29,""));
        mysheet.mergeCells(col4,row29,col4,row29);
        mysheet.addCell(new Label(col4,row29,""));
        mysheet.mergeCells(col5,row29,col6,row29);
        mysheet.addCell(new Label(col5,row29,""));
        mysheet.mergeCells(col7,row29,col8,row29);
        mysheet.addCell(new Label(col7,row29,""));
        mysheet.mergeCells(col9,row29,col9,row29);
        mysheet.addCell(new Label(col9,row29,""));
        mysheet.mergeCells(col10,row29,col10,row29);
        mysheet.addCell(new Label(col10,row29,""));
        mysheet.mergeCells(col11,row29,col12,row29);
        mysheet.addCell(new Label(col11,row29,""));
        mysheet.mergeCells(col13,row29,col13,row29);
        mysheet.addCell(new Label(col13,row29,""));
        
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
        mysheet.addCell(new Label(col0,row38,"Personel Bilgileri/ Person. Infor."));
        mysheet.mergeCells(col3,row38,col5,row38);
        mysheet.addCell(new Label(col3,row38,"                      "
                + "Operatör/ Operator"));
        mysheet.mergeCells(col6,row38,col8,row38);
        mysheet.addCell(new Label(col6,row38,"             "
                + "Değerlendiren/ Evaluated by"));
        mysheet.mergeCells(col9,row38,col10,row38);
        mysheet.addCell(new Label(col9,row38,"        Onay/ Confirmation"));
        mysheet.mergeCells(col11,row38,col13,row38);
        mysheet.addCell(new Label(col11,row38,"                    "
                + "Müşteri/ Customer"));
        
        mysheet.mergeCells(col0,row39,col2,row39);
        mysheet.addCell(new Label(col0,row39,"Adı Soyadı/ Name Surname"));
        mysheet.mergeCells(col3,row39,col5,row39);
        String nameSelected = dataName1.getValue();
        mysheet.addCell(new Label(col3,row39, nameSelected));
        mysheet.mergeCells(col6,row39,col8,row39);
        String name2Selected = dataName2.getValue();
        mysheet.addCell(new Label(col6,row39,name2Selected));
        mysheet.mergeCells(col9,row39,col10,row39);
        String name3Selected = dataName3.getValue();
        mysheet.addCell(new Label(col9,row39,name3Selected));
        mysheet.mergeCells(col11,row39,col13,row39);
        String customer9Selected = customer9.getValue();
        mysheet.addCell(new Label(col11,row39, customer9Selected));
        
        mysheet.mergeCells(col0,row40,col2,row40);
        mysheet.addCell(new Label(col0,row40,"Seviye/ Level"));
        mysheet.mergeCells(col3,row40,col5,row40);
        String levelSelected = level.getValue();
        mysheet.addCell(new Label(col3,row40,levelSelected));
        mysheet.mergeCells(col6,row40,col8,row40);
        String level2Selected = level2.getValue();
        mysheet.addCell(new Label(col6,row40,level2Selected));
        mysheet.mergeCells(col9,row40,col10,row40);
        String level3Selected = level3.getValue();
        mysheet.addCell(new Label(col9,row40,level3Selected));
        mysheet.mergeCells(col11,row40,col13,row40);
        mysheet.addCell(new Label(col11,row40,""));
        
        mysheet.mergeCells(col0,row41,col2,row41);
        mysheet.addCell(new Label(col0,row41,"Tarih/ Date"));
        mysheet.mergeCells(col3,row41,col5,row41);
        mysheet.addCell(new Label(col3,row41,date9.getText()));
        mysheet.mergeCells(col6,row41,col8,row41);
        mysheet.addCell(new Label(col6,row41,date8.getText()));
        mysheet.mergeCells(col9,row41,col10,row41);
        mysheet.addCell(new Label(col9,row41,date7.getText()));
        mysheet.mergeCells(col11,row41,col13,row41);
        mysheet.addCell(new Label(col11,row41,date6.getText()));
        
        mysheet.mergeCells(col0,row42,col2,row43);
        mysheet.addCell(new Label(col0,row42,"İmza/ Signature"));
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

    @FXML
    private void handleMainScene(MouseEvent event) throws IOException{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }    
    
    @FXML
    private void changeScreenButtonClicked(javafx.scene.input.MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("employeeMain.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    private void handleClose(MouseEvent event) {
        System.exit(0);
    }

    private void customerSelect(){
        customerList.removeAll(customerList);
        String customer1 = "SARP GEMİ";
        String customer2 = "AKSU GEMİ";
        String customer3 = "YESİLDAL GEMİ";
        String customer4 = "YILDIZ GEMİ";
        customerList.addAll(customer1, customer2, customer3, customer4);
        customer.getItems().addAll(customerList);
    }
    
    private void customer9Select(){
        customer9List.removeAll(customer9List);
        String customer1 = "SARP GEMİ";
        String customer2 = "AKSU GEMİ";
        String customer3 = "YESİLDAL GEMİ";
        String customer4 = "YILDIZ GEMİ";
        customer9List.addAll(customer1, customer2, customer3, customer4);
        customer9.getItems().addAll(customer9List);
    }
    
    private void projectNameSelect(){
        projectNameList.removeAll(projectNameList);
        String projectName1 = "KAYNAKÇI TESTİ";
        String projectName2 = "LEHİMCİ TESTİ";
        String projectName3 = "KESİCİ TESTİ";
        projectNameList.addAll(projectName1, projectName2, projectName3);
        projectName.getItems().addAll(projectNameList);
    }
    
    private void inspectionPlaceSelect(){
        inspectionPlaceList.removeAll(inspectionPlaceList);
        String inspectionPlace1 = "İZMİT";
        String inspectionPlace2 = "İSTANBUL";
        String inspectionPlace3 = "BALIKESİR";
        inspectionPlaceList.addAll(inspectionPlace1, inspectionPlace2, inspectionPlace3);
        inspectionPlace.getItems().addAll(inspectionPlaceList);
    }
    
     private void inspectionScopeSelect(){
        inspectionScopeList.removeAll(inspectionScopeList);
        String inspectionScope1 = "100%";
        String inspectionScope2 = "80%";
        String inspectionScope3 = "60%";
        String inspectionScope4 = "40%";
        String inspectionScope5 = "20%";
        String inspectionScope6 = "0%";
        inspectionScopeList.addAll(inspectionScope1, inspectionScope2, inspectionScope3, inspectionScope4, inspectionScope5, inspectionScope6);
        inspectionScope.getItems().addAll(inspectionScopeList);
    }
     
    private void surfaceConditionSelect(){
        surfaceConditionList.removeAll(surfaceConditionList);
        String surfaceCondition1 = "After Welding";
        String surfaceCondition22= "Welding";
        String surfaceCondition3 = "Before Welding";
        surfaceConditionList.addAll(surfaceCondition1, surfaceCondition22, surfaceCondition3);
        surfaceCondition.getItems().addAll(surfaceConditionList);
    }
    
    private void examinationStageSelect(){
        examinationStageList.removeAll(examinationStageList);
        String examinationStage1 = "Untreated";
        String examinationStage2= "Treadted";
        examinationStageList.addAll(examinationStage1, examinationStage2);
        examinationStage.getItems().addAll(examinationStageList);
    }
    
    private void jobOrderNoSelect(){
        jobOrderNoList.removeAll(jobOrderNoList);
        String jobOrderNo1 = "2604";
        String jobOrderNo2 = "2605";
        String jobOrderNo3 = "2606";
        jobOrderNoList.addAll(jobOrderNo1, jobOrderNo2, jobOrderNo3);
        jobOrderNo.getItems().addAll(jobOrderNoList);
    }
    
    private void offerNoSelect(){
        offerNoList.removeAll(offerNoList);
        String offerOrder1 = "330-2018";
        String offerOrder2 = "330-2019";
        String offerOrder3 = "330-2020";
        offerNoList.addAll(offerOrder1, offerOrder2, offerOrder3);
        offerNo.getItems().addAll(offerNoList);
    }
    
    private void poleDistanceSelect(){
        poleDistanceList.removeAll(poleDistanceList);
        String poleDistance1 = "100 mm";
        String poleDistance2 = "200 mm";
        String poleDistance3 = "300 mm";
        poleDistanceList.addAll(poleDistance1, poleDistance2, poleDistance3);
        poleDistance.getItems().addAll(poleDistanceList);
    }
    
    private void equipmentSelect(){
        equipmentList.removeAll(equipmentList);
        String equipment1 = "NAWOO Sn:1701020";
        String equipment2 = "KAKOO Sn:1953542";
        String equipment3 = "SASOO Sn:9518423";
        equipmentList.addAll(equipment1, equipment2, equipment3);
        equipment.getItems().addAll(equipmentList);
    }
    
    private void carrierMediumSelect(){
        carrierMediumList.removeAll(carrierMediumList);
        String carrierMedium1 = "BT10 LOT:B036P01";
        String carrierMedium2 = "BT20 LOT:B036P01";
        String carrierMedium3 = "BT30 LOT:B036P01";
        carrierMediumList.addAll(carrierMedium1, carrierMedium2, carrierMedium3);
        carrierMedium.getItems().addAll(carrierMediumList);
    }
    
    private void magTechSelect(){
        magTechList.removeAll(magTechList);
        String magTech1 = "Teknik 10";
        String magTech2 = "Teknik 80";
        String magTech3 = "Teknik 130";
        magTechList.addAll(magTech1, magTech2, magTech3);
        magTech.getItems().addAll(magTechList);
    }
    
    private void lightIntensitySelect(){
        lightIntensityList.removeAll(lightIntensityList);
        String lightIntensity1 = "W/m2";
        String lightIntensity2 = "W/sr";
        String lightIntensity3 = "lm/sr";
        lightIntensityList.addAll(lightIntensity1, lightIntensity2, lightIntensity3);
        lightIntensity.getItems().addAll(lightIntensityList);
    }
    
    private void lightDistanceSelect(){
        lightDistanceList.removeAll(lightDistanceList);
        String lightDistance1 = "mm";
        String lightDistance2 = "cm";
        String lightDistance3 = "dm";
        lightDistanceList.addAll(lightDistance1, lightDistance2, lightDistance3);
        lightDistance.getItems().addAll(lightDistanceList);
    }
    
    private void currentTypeSelect(){
        currentTypeList.removeAll(currentTypeList);
        String currentType1 = "AC";
        String currentType2 = "DC";
        currentTypeList.addAll(currentType1, currentType2);
        currentType.getItems().addAll(currentTypeList);
    }
    
    private void surfaceTemperatureSelect(){
        surfaceTemperatureList.removeAll(surfaceTemperatureList);
        String surfaceTemperature1 = "15°C";
        String surfaceTemperature2 = "20°C";
        String surfaceTemperature3 = "25°C";
        surfaceTemperatureList.addAll(surfaceTemperature1, surfaceTemperature2, surfaceTemperature3);
        surfaceTemperature.getItems().addAll(surfaceTemperatureList);
    }
    
    private void result1Select(){
        result1List.removeAll(result1List);
        String resu1t11 = "OK";
        String resu1t12 = "RED";
        result1List.addAll(resu1t11, resu1t12);
        res1.getItems().addAll(result1List);
    }
    
    private void result2Select(){
        result2List.removeAll(result2List);
        String result21 = "OK";
        String resu1t22 = "RED";
        result2List.addAll(result21, resu1t22);
        res2.getItems().addAll(result2List);
    }
    
    private void result3Select(){
        result3List.removeAll(result3List);
        String result31 = "OK";
        String result32 = "RED";
        result3List.addAll(result31, result32);
        res3.getItems().addAll(result3List);
    }
    
    public void dataDenemeSelect() throws ClassNotFoundException, SQLException{
        Connection conn = dc.Connect();
        data = FXCollections.observableArrayList();
        ResultSet rs = conn.createStatement().executeQuery("select concat(first_name, last_name)  from employees");
        while (rs.next()){
            dataName1.getItems().addAll(rs.getString("concat(first_name, last_name)"));
        }
        dataName1List.addAll(data);
    }
    
    public void dataDeneme2Select() throws ClassNotFoundException, SQLException{
        Connection conn = dc.Connect();
        data = FXCollections.observableArrayList();
        ResultSet rs = conn.createStatement().executeQuery("select concat(first_name, last_name)  from employees");
        while (rs.next()){
            dataName2.getItems().addAll(rs.getString("concat(first_name, last_name)"));
        }
        dataName2List.addAll(data);
    }
    
        
    public void dataDeneme3Select() throws ClassNotFoundException, SQLException{
        Connection conn = dc.Connect();
        data = FXCollections.observableArrayList();
        ResultSet rs = conn.createStatement().executeQuery("select concat(first_name, last_name)  from employees");
        while (rs.next()){
            dataName3.getItems().addAll(rs.getString("concat(first_name, last_name)"));
        }
        dataName3List.addAll(data);
    }
    
    public void levelSelect() throws ClassNotFoundException, SQLException{
        Connection conn = dc.Connect();
        data = FXCollections.observableArrayList();
        ResultSet rs = conn.createStatement().executeQuery("select distinct level from employees order by level desc");
        while (rs.next()){
            level.getItems().addAll(rs.getString("level"));
        }
        levelList.addAll(data);
    }
    
    public void level2Select() throws ClassNotFoundException, SQLException{
        Connection conn = dc.Connect();
        data = FXCollections.observableArrayList();
        ResultSet rs = conn.createStatement().executeQuery("select distinct level from employees order by level desc");
        while (rs.next()){
            level2.getItems().addAll(rs.getString("level"));
        }
        level2List.addAll(data);
    }
    
    
    public void level3Select() throws ClassNotFoundException, SQLException{
        Connection conn = dc.Connect();
        data = FXCollections.observableArrayList();
        ResultSet rs = conn.createStatement().executeQuery("select distinct level from employees order by level desc");
        while (rs.next()){
            level3.getItems().addAll(rs.getString("level"));
        }
        level3List.addAll(data);
    }
    
    public void startAll() throws ClassNotFoundException, SQLException{
        customerSelect();
        customer9Select();
        projectNameSelect();
        inspectionPlaceSelect();
        inspectionScopeSelect();
        surfaceConditionSelect();
        examinationStageSelect();
        jobOrderNoSelect();
        offerNoSelect();
        poleDistanceSelect();
        equipmentSelect();
        carrierMediumSelect();
        magTechSelect();
        lightIntensitySelect();
        lightDistanceSelect();
        currentTypeSelect();
        surfaceTemperatureSelect();
        result1Select();
        result2Select();
        result3Select();
        dataDenemeSelect();
        dataDeneme2Select();
        dataDeneme3Select();
        levelSelect();
        level2Select();
        level3Select();
    }
    
    
}
