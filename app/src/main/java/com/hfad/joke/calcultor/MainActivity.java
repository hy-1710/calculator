package com.hfad.joke.calcultor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

//    Button one,two,three,four,five,six,seven,eight,nine,zero,clear,dot,equal,add,sub,mul,div;
//    EditText et;

    Float value1, value2;
    boolean mAdd, mSub, mDiv, mMul, isVal;

    @BindViews({R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8
            , R.id.button9, R.id.button10, R.id.buttonadd, R.id.buttonsub, R.id.buttonmul, R.id.buttondiv, R.id.buttoneql
            , R.id.buttonC})
    List<Button> btnViews;
    @BindView(R.id.edt1)
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        et.setInputType(InputType.TYPE_NULL);


    }

    @OnClick({R.id.button1, R.id.button0, R.id.button2, R.id.button3, R.id.button4, R.id.button5
            , R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button10})
    public void btnClick(Button btn) {
        switch (btn.getId()) {
            case R.id.button0:
                et.setText(et.getText() + "0");
                break;

            case R.id.button1:
                et.setText(et.getText() + "1");
                break;

            case R.id.button2:
                et.setText(et.getText() + "2");
                break;

            case R.id.button3:
                et.setText(et.getText() + "3");
                break;

            case R.id.button4:
                et.setText(et.getText() + "4");
                break;

            case R.id.button5:
                et.setText(et.getText() + "5");
                break;

            case R.id.button6:
                et.setText(et.getText() + "6");
                break;

            case R.id.button7:
                et.setText(et.getText() + "7");
                break;

            case R.id.button8:
                et.setText(et.getText() + "8");
                break;

            case R.id.button9:
                et.setText(et.getText() + "9");
                break;
//            case R.id.buttonadd:
//
//                if(et==null)
//                {
//                    et.setText("");
//                } else
//                {
//                    value1 =Float.parseFloat(et.getText()+" ");
//                    mAdd=true;
//                    et.setText(null);
//
//                }
//                break;
//
//            case R.id.buttonsub:
//                value1=Float.parseFloat(et.getText()+"");
//                mSub=true;
//                et.setText(null);
//                break;
//            case R.id.buttonmul:
//                value1=Float.parseFloat(et.getText()+"");
//                mMul=true;
//                et.setText(null);
//                break;
//            case R.id.buttondiv:
//                value1=Float.parseFloat(et.getText()+"");
//                et.setText(null);
//                break;
//
//
//            case R.id.buttoneql:
//                value2=Float.parseFloat(et.getText()+"");
//
//                if (mAdd==true){
//
//                    et.setText(value1+value2+"");
//                    mAdd=false;
//
//                }
//                if(mSub== true){
//                    et.setText(value1-value2+"");
//                    mSub=false;
//
//                }
//                if(mMul== true){
//                    et.setText(value1*value2+"");
//                    mMul=false;
//
//                }
//                if(mDiv==true){
//                    et.setText(value1/value2+"");
//
//                }
//                break;
//
//            case R.id.buttonC:
//                et.setText("");
//                break;
//
            case R.id.button10:
                if (et.getText().toString().isEmpty()) {
                    et.setText("0.");
                } else if (!et.getText().toString().contains(".")) {
                    et.setText(et.getText().toString() + ".");
                }
                break;
        }
    }


    @OnClick(R.id.buttonadd)
    public void onSum(Button button) {
        if (!et.getText().toString().isEmpty()) {
            value1 = Float.parseFloat(et.getText().toString());
            mAdd = true;
            et.setText(null);
        }

    }

    @OnClick(R.id.buttonsub)
    public void onSub(Button button) {
        if (!et.getText().toString().isEmpty()) {
            value1 = Float.parseFloat(et.getText().toString());
            mSub = true;
            et.setText(null);

        }
    }

    @OnClick(R.id.buttonmul)
    public void onMul(Button button) {
        if (!et.getText().toString().isEmpty()) {
            value1 = Float.parseFloat(et.getText().toString());
            mMul = true;
            et.setText(null);
        }


    }

    @OnClick(R.id.buttondiv)
    public void onDiv(Button button) {
        if (!et.getText().toString().isEmpty()) {
            value1 = Float.parseFloat(et.getText().toString());
            mDiv = true;
            et.setText(null);
        }
    }

    @OnClick(R.id.buttoneql)
    public void onEqual(Button button) {
        isVal = true;

        if (value1 != null && !et.getText().toString().isEmpty()) {


            value2 = Float.parseFloat(et.getText() + "");

            if (mAdd) {

                et.setText(String.valueOf(value1 + value2));
                mAdd = false;


            }
            if (mSub) {
                et.setText(String.valueOf(value1 - value2));
                mSub = false;


            }
            if (mMul) {
                et.setText(String.valueOf(value1 * value2));
                mMul = false;


            }
            if (mDiv) {
                et.setText(String.valueOf(value1 / value2));
                mDiv = false;


            }
        }
        value1 = null;
        value2 = null;

//        if(isVal==true)
//        {
//            et.setText("");
//        }


    }

    @OnClick(R.id.buttonC)
    public void onClear(Button button) {
        et.setText("");
    }
}
