package love;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class LoveController {
    public Label iLoveYou;
    public ComboBox languageComboBox;

//    @FXML
//    private void initialize() {
//        PrefixSelectionCustomizer.customize(languageComboBox);
//    }

    public void viewMessage(ActionEvent actionEvent) {
        String selected = languageComboBox.getValue().toString();
        String text = "";
        switch (selected){
            case "Armenian":
                text = "Ես սիրում եմ քեզ";
                break;
            case "Belarusian":
                text = "я цябе кахаю";
                break;
            case "Czech":
                text = "Miluji tě";
                break;
            case "Danish":
                text = "Jeg elsker dig";
                break;
            case "Esperanto":
                text = "mi amas vin";
                break;
            case "Finnish":
                text = "Minä rakastan sinua";
                break;
            case "Greek":
                text = "Σε αγαπώ";
                break;
            case "Hausa":
                text = "Ina son ku";
                break;
            case "Icelandic":
                text = "ég elska þig";
                break;
            case "Javanese":
                text = "Aku tresna sampeyan";
                break;
            case "Khmer":
                text = "ខ្ញុំ​ស្រលាញ់​អ្នក";
                break;
            case "Lao":
                text = "ຂ້ອຍຮັກເຈົ້າ";
                break;
            case "Mongolian":
                text = "Би чамд хайртай";
                break;
            case "Nepali":
                text = "म तिमीलाई माया गर्छु";
                break;
            case "Pashto":
                text = "زه ستا سره مینه لرم";
                break;
            case "Russian":
                text = "Я люблю тебя";
                break;
            case "Sinhala":
                text = "මම ඔයාට ආදරෙයි";
                break;
            case "Tajik":
                text = "Ман туро дӯст медорам";
                break;
            case "Ukrainian":
                text = "я тебе люблю";
                break;
            case "Vietnamese":
                text = "Tôi mến bạn";
                break;
            case "Welsh":
                text = "Rwy'n dy garu di";
                break;
            case "Xhosa":
                text = "ndiyakuthanda";
                break;
            case "Yiddish":
                text = "איך האב דיר ליב";
                break;
            case "Zulu":
                text = "Ngiyakuthanda";
                break;
            case "Bangla":
                text = "আমি তোমাকে ভালোবাসি";
                break;
        }
        String fullText = text+" :-xo";
        iLoveYou.setText(fullText);
    }
}
