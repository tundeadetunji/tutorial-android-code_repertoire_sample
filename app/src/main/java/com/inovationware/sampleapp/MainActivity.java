package com.inovationware.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.inovationware.generalmodule.Feedback;
import static com.inovationware.generalmodule.Device.*;

/**
 * Yorùbá:
 * Àkójọpọ̀/ẹ̀yà yìí jẹ́ àpẹrẹ láti ṣe àfihàn Code Repertoire, tó jẹ́
 * àwọn àkójọpọ̀ tó lè wúlò lójoojúmọ́ láti jẹ́ kí iṣé rọrùn.
 * Bótilẹ̀jẹ́pé iṣẹ́ ṣì ńlọ, àwọn ìwúlò rẹ̀ ju iye tí a fi ṣ'àpẹrẹ níbíyìí lọ,
 * kàn jẹ́ àpẹrẹ ni.
 *
 * Ọ̀pọ̀lọpọ̀ àlàyé wà ní https://github.com/tundeadetunji/api-android-general_module.
 * Fún ẹ̀ya Java/Spring Boot: https://github.com/tundeadetunji/api-java-code.
 * Fún ẹ̀ya .Net: https://github.com/tundeadetunji/api-dot_net-all_modules.
 *
 *
 * English:
 * This class is a sample to showcase Code Repertoire, which is
 * a set of packages containing handy day-to-day functions to handle tasks easily.
 * Although it is work in progress, there are more features there than shown here,
 * this is just a sample.
 *
 * More details at https://github.com/tundeadetunji/api-android-general_module.
 * For the Java/Spring Boot version, see https://github.com/tundeadetunji/api-java-code.
 * For the .Net version, see https://github.com/tundeadetunji/api-dot_net-all_modules.
 */
public class MainActivity extends AppCompatActivity {

    Button ToastButton;
    Button InternetButton;
    TextView DetailsTextView;

    Feedback feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastButton = findViewById(R.id.ToastButton);
        InternetButton = findViewById(R.id.InternetButton);
        DetailsTextView = findViewById(R.id.DetailsTextView);

        feedback = new Feedback(getApplicationContext());

        InternetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //láti ṣe àyẹ̀wò nípa ìsopò ẹ̀rọ ayára bí àsá
                //to check for internet availability...
                boolean internetIsConnected = thereIsInternet(getApplicationContext());
                DetailsTextView.setText(String.valueOf(internetIsConnected));
            }
        });

        ToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //láti sọ nǹkan ní ṣókí
                //to issue a toast
                feedback.toast("Báwo ni nǹkan?");
            }
        });

    }
}