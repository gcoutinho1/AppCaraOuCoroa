package caraoucoroa.coutinhocompany.com.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView imagem;
    private ImageView botaovoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagem = findViewById(R.id.moedaId);
        botaovoltar = findViewById(R.id.botaovoltarid);

        Bundle extra = getIntent().getExtras();
        if (extra != null){

            String opcaoescolhida = extra.getString("opcao");
            if ( opcaoescolhida.equals("cara") ){
                //imagem cara
                imagem.setImageDrawable( ContextCompat.getDrawable(this,R.drawable.moeda_cara));

            }else{
                //imagem coroa
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
            }

        }


        botaovoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetalheActivity.this, MainActivity.class));
            }
        });


    }
}
