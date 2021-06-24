package com.example.draganddrop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.jmedeisis.draglinearlayout.DragLinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize Drag Linear Layout
        DragLinearLayout dragLinearLayout = findViewById(R.id.container);

        //for loop for dragging and dropping of child items
        for(int i = 0; i < dragLinearLayout.getChildCount(); i++){
            //the child inside dragger layout
            View child = dragLinearLayout.getChildAt(i);

            //set all children draggable
            //except the header layout
            //the child is its own drag handle
            dragLinearLayout.setViewDraggable(child, child);
        }
    }
}