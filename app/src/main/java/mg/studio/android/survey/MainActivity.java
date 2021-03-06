package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
public Button btn_next;
public RadioGroup rg;
public CheckBox cb;
public LinearLayout linea;
final Bundle bond=new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        //to do:the first page and it's action
        cb=(CheckBox)findViewById(R.id.cb_accept);
        btn_next=(Button)findViewById(R.id.btn_start);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_next.setEnabled(true);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPage2();
            }
        });
    }

    public void gotoPage2(){
        setContentView(R.layout.question_one);
        btn_next=(Button)findViewById(R.id.btn_next1);
        rg=(RadioGroup)findViewById(R.id.rg_Q1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                btn_next.setEnabled((true));
                RadioButton rg2=group.findViewById(checkedId);
                bond.putString("Q1",rg2.getText().toString().trim());
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPage3();
            }
        });
    }

    public void gotoPage3(){
        setContentView(R.layout.question_two);
        btn_next=(Button)findViewById(R.id.btn_next2);
        rg=(RadioGroup)findViewById(R.id.rg_Q2);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                btn_next.setEnabled((true));
                RadioButton rg2=group.findViewById(checkedId);
                bond.putString("Q2",rg2.getText().toString().trim());
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPage4();
            }
        });
    }

    public void gotoPage4(){
        setContentView(R.layout.question_three);
        btn_next=(Button)findViewById(R.id.btn_next3);

        rg=(RadioGroup)findViewById(R.id.rg_Q3);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                btn_next.setEnabled((true));
                RadioButton rg2=group.findViewById(checkedId);
                bond.putString("Q3",rg2.getText().toString().trim());
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPage5();
            }
        });
    }

    public void gotoPage5(){
        setContentView(R.layout.question_four);
        btn_next=(Button)findViewById(R.id.btn_next4);
        btn_next.setEnabled(true);
        linea=(LinearLayout)findViewById(R.id.LinearQ4);
        linea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_next.setEnabled(true);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer buffer=new StringBuffer();
                int count=linea.getChildCount();
                for(int i=0;i<count;i++){
                    CheckBox turn_cb=(CheckBox)linea.getChildAt(i);
                    if(turn_cb.isChecked()){
                        buffer.append(turn_cb.getText().toString()+" and ");
                    }
                }
                if(buffer!=null){bond.putString("Q4",buffer.toString());
                gotoPage6();}
            }
        });
    }

    public void gotoPage6(){
        setContentView(R.layout.question_five);
        btn_next=(Button)findViewById(R.id.btn_next5);
        btn_next.setEnabled(true);
        linea=(LinearLayout)findViewById(R.id.LinearQ5);
        linea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_next.setEnabled(true);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer buffer=new StringBuffer();
                int count=linea.getChildCount();
                for(int i=0;i<count;i++){
                    CheckBox turn_cb=(CheckBox)linea.getChildAt(i);
                    if(turn_cb.isChecked()){
                        buffer.append(turn_cb.getText().toString()+" and ");
                    }
                }
                if(buffer!=null){bond.putString("Q5",buffer.toString());
                    gotoPage7();}
            }
        });
}

    public void gotoPage7(){
        setContentView(R.layout.question_six);
        btn_next=(Button)findViewById(R.id.btn_next6);
        btn_next.setEnabled(true);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et=(EditText)findViewById(R.id.ed_Q6);
                if(et.getText()!=null) {bond.putString("Q6",et.getText().toString());
                    gotoPage8();}
            }
        });
    }

    public void gotoPage8(){
        setContentView(R.layout.question_seven);
        btn_next=(Button)findViewById(R.id.btn_next7);

        rg=(RadioGroup)findViewById(R.id.rg_Q7);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                btn_next.setEnabled((true));
                RadioButton rg2=group.findViewById(checkedId);
                bond.putString("Q7",rg2.getText().toString().trim());
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPage9();
            }
        });

    }

    public void gotoPage9(){
        setContentView(R.layout.question_eight);
        btn_next=(Button)findViewById(R.id.btn_next8);

        rg=(RadioGroup)findViewById(R.id.rg_Q8);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                btn_next.setEnabled((true));
                RadioButton rg2=group.findViewById(checkedId);
                bond.putString("Q8",rg2.getText().toString().trim());
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPage10();
            }
        });

    }

    public void gotoPage10(){
        setContentView(R.layout.question_nine);
        btn_next=(Button)findViewById(R.id.btn_next9);

        rg=(RadioGroup)findViewById(R.id.rg_Q9);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                btn_next.setEnabled((true));
                RadioButton rg2=group.findViewById(checkedId);
                bond.putString("Q9",rg2.getText().toString().trim());
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPage11();
            }
        });

    }

    public void gotoPage11(){
        setContentView(R.layout.question_ten);
        btn_next=(Button)findViewById(R.id.btn_next10);

        rg=(RadioGroup)findViewById(R.id.rg_Q10);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                btn_next.setEnabled((true));
                RadioButton rg2=group.findViewById(checkedId);
                bond.putString("Q10",rg2.getText().toString().trim());
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPage12();
            }
        });

    }

    public void gotoPage12(){
        setContentView(R.layout.question_eleven);
        btn_next=(Button)findViewById(R.id.btn_next11);

        rg=(RadioGroup)findViewById(R.id.rg_Q11);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                btn_next.setEnabled((true));
                RadioButton rg2=group.findViewById(checkedId);
                bond.putString("Q11",rg2.getText().toString().trim());
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPage13();
            }
        });

    }

    public void gotoPage13(){
        setContentView(R.layout.question_twelve);
        btn_next=(Button)findViewById(R.id.btn_next12);

        rg=(RadioGroup)findViewById(R.id.rg_Q12);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                btn_next.setEnabled((true));
                RadioButton rg2=group.findViewById(checkedId);
                bond.putString("Q12",rg2.getText().toString().trim());
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPage14();
            }
        });

    }

    public void gotoPage14(){
        setContentView(R.layout.finish_survey);
        btn_next=(Button)findViewById(R.id.btn_finish);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Report.class);
                intent.putExtras(bond);
                startActivity(intent);
            }
        });

    }
}
/*
public class MainActivity extends AppCompatActivity {
protected Button btn;
public RadioGroup rg1;
final Bundle d=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //显示意图
        btn=(Button)findViewById(R.id.next);
        rg1=(RadioGroup)findViewById(R.id.rg);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                btn.setEnabled((true));
               // Bundle bd=new Bundle();
                RadioButton rg2=group.findViewById(checkedId);
                d.putString("sex",rg2.getText().toString().trim());
            }
        });
        btn=findViewById(R.id.two);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        //Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(d);
                startActivity(intent);
            }
        });

    }

}



TextView tv_sex=(TextView)findViewById(R.id.sex);
        Intent intent=getIntent();
        String s=intent.getExtras().getString("sex");
        tv_sex.setText("your sex is"+s);*/