package scom.hossainrps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static final int r=0;
    static final int p=1;
    static final int s=2;
    static final int max_trials=8;
    static int cs=0;
    static int ps=0;

    static int trials=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView p_move=(TextView)findViewById(R.id.p_move);
        final TextView p_score=(TextView)findViewById(R.id.p_score);
        final TextView c_move=(TextView)findViewById(R.id.c_move);
        final TextView c_score=(TextView)findViewById(R.id.c_score);
        final TextView result=(TextView) findViewById(R.id.result);
        Button r_button=(Button)findViewById(R.id.r_button);
        Button p_button=(Button)findViewById(R.id.p_button);
        Button s_button=(Button)findViewById(R.id.s_button);



        r_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int cm=( new Random().nextInt())%3;
                if(cm<0) cm=-cm;

                if(cm==p) cs++;
                else if(cm==s) ps++;

                p_move.setText("ROCK");
                p_score.setText(ps);

                if(cm==r) {
                    c_move.setText("ROCK");
                }
                else if(cm==s)
                {
                    c_move.setText("SCISSOR");
                }
                else {
                    c_move.setText("PAPER");
                }
                c_score.setText(cs);

                trials++;
                if(trials==max_trials)
                {
                    if(ps>cs)
                    {
                        result.setText("The Winner: You!!!" );
                    }
                    else  if (cs>ps)
                    {
                        result.setText("The Winner is: Computer");
                    }
                }
            }
        });


        p_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int cm=( new Random().nextInt())%3;
                if(cm<0) cm=-cm;

                if(cm==r) ps++;
                else if(cm==s) cs++;

                p_move.setText(" PAPER");
                p_score.setText(ps);

                if(cm==r) {
                    c_move.setText("ROCK");
                }
                else if(cm==s)
                {
                    c_move.setText("SCISSOR");
                }
                else {
                    c_move.setText("PAPER");
                }
                c_score.setText(cs);

                trials++;
                if(trials==max_trials)
                {
                    if(ps>cs)
                    {
                        result.setText("The Winner: You!!!" );
                    }
                    else  if (cs>ps)
                    {
                        result.setText("The Winner is: Computer");
                    }
                }
            }
        });


        s_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int cm=( new Random().nextInt())%3;
                if(cm<0) cm=-cm;

                if(cm==p) ps++;
                else if(cm==r) cs++;

                p_move.setText("SCISSOR");
                p_score.setText(ps);

                if(cm==r) {
                    c_move.setText("ROCK");
                }
                else if(cm==p)
                {
                    c_move.setText("PAPER");
                }
                else {
                    c_move.setText("SCISSOR");
                }
                c_score.setText(cs);

                trials++;
                if(trials==max_trials)
                {
                    if(ps>cs)
                    {
                        result.setText("The Winner: You!!!" );
                    }
                    else  if (cs>ps)
                    {
                        result.setText("The Winner is: Computer");
                    }
                }
            }
        });


    }
}
