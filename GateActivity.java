package com.example.admin.vision;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate);
    }
        public void goToSo(View view ) {
            goToUrl ( "https://www.geeksforgeeks.org/digital-logic-number-representation-gq/");
        }
        private void goToUrl (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
        public void goToSo2 (View view) {
            goToUrl ( "https://www.geeksforgeeks.org/dbms-gq/er-and-relational-models-gq/");
        }
        private void goToUrl2 (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
        public void goToSo3 (View view) {
            goToUrl ( "https://www.geeksforgeeks.org/data-structure-gq/linked-list-gq/");
        }
        private void goToUrl3 (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
        public void goToSo4 (View view) {
            goToUrl ( "https://www.geeksforgeeks.org/operating-systems-gq/process-synchronization-gq/");
        }
        private void goToUrl4 (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
        public void goToSo5 (View view) {
            goToUrl ( "https://www.geeksforgeeks.org/data-link-layer-gq/");
        }
        private void goToUrl5 (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
        public void goToSo6 (View view) {
            goToUrl ( "https://www.geeksforgeeks.org/regular-languages-and-finite-automata-gq/");
        }
        private void goToUrl6 (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
        public void goToSo7 (View view) {
            goToUrl ( "https://www.geeksforgeeks.org/set-theory-algebra-gq/");
        }
        private void goToUrl7 (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
        public void goToSo8 (View view) {
            goToUrl ( "https://www.geeksforgeeks.org/parsing-and-syntax-directed-translation-gq/");
        }
        private void goToUrl8 (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
        public void goToSo9 (View view) {
            goToUrl ( "https://gateoverflow.in/");
        }
        private void goToUrl9 (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
        public void goToSo10 (View view) {
            goToUrl ( "https://www.geeksforgeeks.org/gate-cs-mock-2018/");
        }
        private void goToUrl10 (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
    }





