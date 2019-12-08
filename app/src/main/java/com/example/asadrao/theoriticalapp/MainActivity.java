package com.example.asadrao.theoriticalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    List<String> subjects;
    Map<String, List<String>> topics;
    ExpandableListAdapter listAdapter;
    public String EXTRA_TEXT = "com.example.application.theoriticalapp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
        fillData();
        listAdapter = new MyListAdapter(this,subjects,topics);
        expandableListView.setAdapter(listAdapter);
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                if (groupPosition ==0) {
                    if (childPosition == 0) {
                        String n="History";
                        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                        intent.putExtra(EXTRA_TEXT, n);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "History", Toast.LENGTH_SHORT).show();
                    } else if (childPosition == 1) {
                        Toast.makeText(MainActivity.this, "Characterstics", Toast.LENGTH_SHORT).show();
                    } else if (childPosition == 2) {
                        Toast.makeText(MainActivity.this, "Basic Syntax", Toast.LENGTH_SHORT).show();
                    } else if (childPosition == 3) {
                        Toast.makeText(MainActivity.this, "Loops", Toast.LENGTH_SHORT).show();
                    } else if (childPosition == 4) {
                        Toast.makeText(MainActivity.this, "Modifiers", Toast.LENGTH_SHORT).show();
                    } else if (childPosition == 5) {
                        Toast.makeText(MainActivity.this, "Basic Operation", Toast.LENGTH_SHORT).show();
                    } else if (childPosition == 6) {
                        Toast.makeText(MainActivity.this, "Character Class", Toast.LENGTH_SHORT).show();
                    } else if (childPosition == 7) {
                        Toast.makeText(MainActivity.this, "Number Class", Toast.LENGTH_SHORT).show();
                    } else if (childPosition == 8) {
                        Toast.makeText(MainActivity.this, "String Class", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (groupPosition == 1)
                {
                 if (childPosition == 0)
                 {
                     Toast.makeText(MainActivity.this, "Introduction", Toast.LENGTH_SHORT).show();
                 }
                 else if (childPosition == 1)
                 {
                     Toast.makeText(MainActivity.this, "DFA", Toast.LENGTH_SHORT).show();
                 }
                 else if (childPosition == 2)
                 {
                     Toast.makeText(MainActivity.this, "NFA", Toast.LENGTH_SHORT).show();
                 }
                 else if (childPosition == 3)
                 {
                     Toast.makeText(MainActivity.this, "Moore and Mealy Machine", Toast.LENGTH_SHORT).show();
                 }
                }
                else if (groupPosition == 2)
                {

                }
                else if (groupPosition == 3)
                {

                }
                else if (groupPosition == 4)
                {

                }
                return false;
            }
        });
    }
    public void fillData()
    {

        subjects = new ArrayList<>();
        topics = new HashMap<>();

        subjects.add("Advance Object Oriented Programming");
        List<String> AOOP = new ArrayList<>();
        AOOP.add("History");
        AOOP.add("Characterstics");
        AOOP.add("Basic Syntax");
        AOOP.add("Loops");
        AOOP.add("Modifiers");
        AOOP.add("Basic Operations");
        AOOP.add("Character Class");
        AOOP.add("Number Class");
        AOOP.add("String Class");

        subjects.add("Automata Theory");
        List<String> AT = new ArrayList<>();
        AT.add("Introduction");
        AT.add("Deteministic Finite Automata");
        AT.add("Non Deteministic Finite Automata");
        AT.add("Moore and Mealy Machines");

        subjects.add("Computer Graphics");
        List<String> CG = new ArrayList<>();
        CG.add("Topic 1");
        CG.add("Topic 2");
        CG.add("Topic 3");
        CG.add("Topic 4");
        CG.add("Topic 5");

        subjects.add("Operating System");
        List<String> OS = new ArrayList<>();
        OS.add("Topics One");
        OS.add("Topic Two");
        OS.add("Topic Three");
        OS.add("Topic Four");
        OS.add("Topic Five");
        OS.add("Topic Six");

        subjects.add("Software Engineering");
        List<String> SE = new ArrayList<>();
        SE.add("Topics One");
        SE.add("Topic Two");
        SE.add("Topic Three");
        SE.add("Topic Four");
        SE.add("Topic Five");
        SE.add("Topic Six");

        topics.put(subjects.get(0),AOOP);
        topics.put(subjects.get(1),AT);
        topics.put(subjects.get(2),CG);
        topics.put(subjects.get(3),OS);
        topics.put(subjects.get(4),SE);
    }
}