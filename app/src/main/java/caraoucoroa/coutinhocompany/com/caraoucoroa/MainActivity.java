package caraoucoroa.coutinhocompany.com.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView botaojogar;
    private String[] opcao = {"cara" , "coroa"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaojogar = findViewById(R.id.botaojogarId);
        botaojogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Gerar número - imagem aleatoria
                Random rng = new Random();
                int numeroAleatorio = rng.nextInt(2);

                // zero é cara - um é coroa
                //opcao[numeroAleatorio];
                Intent intent = new Intent(MainActivity.this,DetalheActivity.class);
                intent.putExtra("opcao", opcao[numeroAleatorio]);

                startActivity( intent );


            }
        });
    }
}
