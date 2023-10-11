package com.example.semoc_bes_droid_builders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecycleViewInterface {
    List<EventItem> eventItems = new ArrayList<EventItem>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addEventData();
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterEventItem(getApplicationContext(), eventItems,this));
    }

    private void addEventData() {
        //name, eventType, local, date, image
        eventItems.add(new EventItem("Generative AI", "Palestra", "Auditório", "05/10/2023", R.drawable.placeholder));
        eventItems.add(new EventItem("Programação Competitiva", "Debate", "Sala 414", "05/10/2023", R.drawable.placeholder));
        eventItems.add(new EventItem("Segurança de Sistemas", "Palestra", "Auditório", "05/10/2023", R.drawable.placeholder));
        eventItems.add(new EventItem("Análise de Dados", "Debate", "Sala 412", "06/10/2023", R.drawable.placeholder));
        eventItems.add(new EventItem("Testes Automatizados", "Palestra", "Auditório", "06/10/2023", R.drawable.placeholder));
        eventItems.add(new EventItem("Governança de TI", "Palestra", "Auditório", "06/10/2023", R.drawable.placeholder));
        eventItems.add(new EventItem("Building Tech Leaders", "Palestra", "Auditório", "06/10/2023", R.drawable.placeholder));
        eventItems.add(new EventItem("Gerenciamento de Projetos", "Palestra", "Auditório", "07/10/2023", R.drawable.placeholder));
        eventItems.add(new EventItem("Metodologias Ágeis", "Palestra", "Auditório", "07/10/2023", R.drawable.placeholder));
        eventItems.add(new EventItem("Machine Learning", "Palestra", "Auditório", "07/10/2023", R.drawable.placeholder));
        eventItems.add(new EventItem("Natural Language Processing", "Palestra", "Auditório", "07/10/2023", R.drawable.placeholder));
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this,NewActivity.class);
        intent.putExtra("NAME", eventItems.get(position).getName());
        intent.putExtra("TYPE", eventItems.get(position).getType());
        intent.putExtra("LOCAL", eventItems.get(position).getLocal());
        intent.putExtra("DATE", eventItems.get(position).getDate());
        intent.putExtra("IMAGE", eventItems.get(position).getImage());
        startActivity(intent);
    }
}