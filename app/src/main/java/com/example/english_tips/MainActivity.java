package com.example.english_tips;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.english_tips.adapter.CategoryAdapter;
import com.example.english_tips.adapter.CourseAdapter;
import com.example.english_tips.model.Category;
import com.example.english_tips.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView categoryRecycler;
    RecyclerView courseRecycler;
    CategoryAdapter categoryAdapter;
    CourseAdapter courseAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "November"));
        categoryList.add(new Category(2, "December"));
        categoryList.add(new Category(3, "January"));
        categoryList.add(new Category(4, "February"));
        categoryList.add(new Category(5, "March"));

        setCategoryRecycler(categoryList);


        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "java", "Профессия Java\nразработчик", "5 ноября", "начальный", "#424345"));
        courseList.add(new Course(2, "qa", "Профессия QA\nспециалист", "15 ноября", "средний", "#9FA52D"));


        setCourseRecycler(courseList);
    }

    private void setCourseRecycler(List<Course> courseList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);


    }
}