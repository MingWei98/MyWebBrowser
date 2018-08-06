package sg.edu.rp.c346.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView wvMyPage;
    Button btnLoadURL;
    EditText etUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);
        etUrl = findViewById(R.id.editTextUrl);

        wvMyPage.setWebViewClient(new WebViewClient());
        wvMyPage.getSettings().setDisplayZoomControls(true);
        wvMyPage.getSettings().setJavaScriptEnabled(false);

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = etUrl.getText().toString();
                wvMyPage.loadUrl(url);
            }
        });
    }
}
