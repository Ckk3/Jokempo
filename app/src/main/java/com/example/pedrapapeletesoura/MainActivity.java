package com.example.pedrapapeletesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opcaoPedra(View view){
        escolhaPlayer("pedra");
    }

    public void opcaoPapel(View view){
        escolhaPlayer("papel");
    }

    public void opcaoTesoura(View view){
        escolhaPlayer("tesoura");
    }

    public void escolhaPlayer(String escolha){
        //System.out.println(escolha);
        TextView resposta = findViewById(R.id.txtResposta);
        ImageView imagem = findViewById(R.id.imgApp);
        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra","papel","tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp){
            case "pedra":
                imagem.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagem.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagem.setImageResource(R.drawable.tesoura);
                break;
        }

        if(escolha == "pedra" && opcaoApp == "tesoura" || escolha == "tesoura" && opcaoApp == "papel" || escolha == "papel" && opcaoApp == "pedra"){
            //Jogador Vence
            resposta.setText("VOCÊ VENCEU!\nO oponente escolheu " + opcaoApp + ".");
        }
        else if(escolha == opcaoApp){
            //Empate
            resposta.setText("EMPATE!\nVocês dois escolheram " + opcaoApp + ".");


        }
        else {//App Vence
            resposta.setText("VOCÊ PERDEU. \nO oponente escolheu " + opcaoApp + ".");
        }



    }


}