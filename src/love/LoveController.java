package love;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class LoveController {
    public Label iLoveYou;
    public ComboBox languageComboBox;

    public void viewMessage(ActionEvent actionEvent) {
        String selected = languageComboBox.getValue().toString();
        String text = "";
        switch (selected){
            case "Sinhala":
                text = "මම ඔයාට ආදරෙයි";
                break;
            case "Greek":
                text = "Σε αγαπώ";
                break;
            case "Yiddish":
                text = "איך האב דיר ליב";
                break;
            case "Amharic":
                text = "እወድሃለሁ";
                break;
            case "Khmer":
                text = "ខ្ញុំ​ស្រលាញ់​អ្នក";
                break;
            case "Mongolian":
                text = "Би чамд хайртай";
                break;
            case "French":
                text = "je t'aime";
                break;
            case "Spanish":
                text = "Te quiero";
                break;
            case "Japanese":
                text="わたしは、あなたを愛しています";
                break;
            case "English":
                text = "I love you";
                break;
            case "Bangla":
                text = "আমি তোমায় ভালোবাসি";
                break;
        }
        String fullText = text+" :-x";
        iLoveYou.setText(fullText);
    }
}
