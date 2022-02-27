/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Designed with ❤ By Krishna Kumar", Toast.LENGTH_LONG).show();

        TextView number = findViewById(R.id.numbers);
        TextView family = findViewById(R.id.family);
        TextView colors = findViewById(R.id.colors);
        TextView phrases = findViewById(R.id.phrases);

        number.setOnClickListener(View -> {
            Intent intent_NumberActivity = new Intent(MainActivity.this, NumberActivity.class);
            startActivity(intent_NumberActivity);
            Toast.makeText(this,"Opening Numbers",Toast.LENGTH_SHORT).show();

        });

        colors.setOnClickListener(View -> {
            Intent intent_ColorsActivity = new Intent(MainActivity.this, ColorsActivity.class);
            startActivity(intent_ColorsActivity);
            Toast.makeText(this,"Opening Colors",Toast.LENGTH_SHORT).show();
        });
        family.setOnClickListener(View -> {
            Intent intent_FamilyActivity = new Intent(MainActivity.this, FamilyActivity.class);
            startActivity(intent_FamilyActivity);
            Toast.makeText(this,"Opening Family",Toast.LENGTH_SHORT).show();

        });
        phrases.setOnClickListener(View -> {
            Intent intent_PhrasesActivity = new Intent(MainActivity.this, PhrasesActivity.class);
            startActivity(intent_PhrasesActivity);
            Toast.makeText(this,"Opening Phrases",Toast.LENGTH_SHORT).show();

        });


    }

}
