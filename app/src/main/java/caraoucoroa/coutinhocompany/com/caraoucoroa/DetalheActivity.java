package caraoucoroa.coutinhocompany.com.caraoucoroa;

import android.content.Intent;
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

        botaovoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // tambem pode ser utilizado o metodo finish() ao inves de startActivity
                startActivity(new Intent(DetalheActivity.this,MainActivity.class));
            }
        });
    }
}
