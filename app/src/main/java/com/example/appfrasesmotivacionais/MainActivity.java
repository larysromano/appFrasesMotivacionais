package com.example.appfrasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mudarFrase(View view){
        TextView txtResultado;

        txtResultado = findViewById(R.id.txtResultado);

        String[] frases = {
                "Comece onde você está, use o que você tem e faça o que você pode.",
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",
                "Devíamos ser ensinados a não esperar por inspiração para começar algo. Ação sempre gera inspiração. Inspiração raramente gera ação.",
                "Não importa que você vá devagar, contanto que você não pare.",
                "A inspiração existe, porém temos que encontrá-la trabalhando.",
                "Coragem é saber o que não temer.",
                "A persistência é a chave mestra que abre todas as portas do sucesso. Não desista, mesmo diante dos desafios, pois cada obstáculo é uma oportunidade para crescer mais forte.",
                "Seja a mudança que você deseja ver no mundo. Cada pequena ação positiva que você realiza contribui para um impacto maior. Seja a inspiração que faz a diferença.",
                "O caminho para o topo da montanha pode ser íngreme, mas a vista lá de cima é incomparável. Mantenha-se focado em seus objetivos, pois a jornada é parte fundamental da conquista.",
                "Acredite no poder dos seus sonhos, pois são eles que alimentam a chama da realização. Transforme cada desafio em uma oportunidade para se aproximar daquilo que você deseja alcançar.",
                "Cada novo dia é uma página em branco esperando para ser preenchida com suas conquistas. Levante-se com determinação, supere os obstáculos com coragem e escreva uma história de sucesso que inspire o mundo."
        };
        int n = new Random().nextInt(frases.length);
        txtResultado.setText(frases[n]);
    }

}