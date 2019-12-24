package com.example.statedistrict;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner state,district,city;

    ArrayList<String> states = new ArrayList<>(Arrays.asList(
            "Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh",
            "Dadra and Nagar Haveli","Daman and Diu","Delhi","Goa","Gujarat","Haryana",
            "Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka",
            "Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram",
            "Nagaland","Orissa","Puducherry","Punjab", "Rajasthan","Sikkim","Tamil Nadu",
            "Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"
    ));

    ArrayList<ArrayList<String> > districts = new ArrayList<>(Arrays.asList(

            new ArrayList<>(Arrays.asList(
                "Anantapur","Chittoor","East Godavari","Guntur","Krishna","Kurnool","Prakasam","Srikakulam","SriPotti Sri Ramulu Nellore",
                "Vishakhapatnam","Vizianagaram","West Godavari","Cudappah"
            )),
            new ArrayList<>(Arrays.asList(
                "Anjaw","Changlang","Dibang Valley","East Siang","East Kameng","Kurung Kumey","Lohit","Longding","Lower Dibang Valley","Lower Subansiri","Papum Pare",
                "Tawang","Tirap","Upper Siang","Upper Subansiri","West Kameng","West Siang"
            )),
            new ArrayList<>(Arrays.asList(
                    "Baksa","Barpeta","Bongaigaon","Cachar","Chirang","Darrang","Dhemaji","Dima Hasao","Dhubri","Dibrugarh","Goalpara","Golaghat","Hailakandi","Jorhat",
                    "Kamrup","Kamrup Metropolitan","Karbi Anglong","Karimganj","Kokrajhar","Lakhimpur","Morigaon","Nagaon","Nalbari","Sivasagar","Sonitpur","Tinsukia","Udalguri"
            ))


    ));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        state = findViewById(R.id.state);
        district = findViewById(R.id.district);
        city = findViewById(R.id.city);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, states);
        state.setAdapter(dataAdapter);

        state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item, districts.get(position));
                district.setAdapter(dataAdapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
