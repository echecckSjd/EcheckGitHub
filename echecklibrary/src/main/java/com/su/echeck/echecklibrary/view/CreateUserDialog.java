package com.su.echeck.echecklibrary.view;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.su.echeck.echecklibrary.R;

public class CreateUserDialog extends Dialog {

    /**
     * 上下文对象 *
     */
    Activity context;

    private Button btn_save;
    private Button btn_PhonePass;

    public EditText text_name;

    public EditText text_mobile;
    public EditText text_mobile01;
    public EditText text_mobile02;
    public EditText text_mobile03;
    public EditText text_mobile04;
    public EditText text_mobile05;
    public EditText text_mobile06;
    public EditText text_mobile07;
    public EditText text_mobile08;
    public EditText text_mobile09;
    public EditText text_mobile10;
    public EditText text_mobile11;

    public EditText text_info;

    private TextView phoneJG01tV;
    private View.OnClickListener mClickListener;
    private View.OnClickListener mClickListenerCanle;

    public String strNewMobilNumber="";
    public String strOldMobilNumber="";

    public CreateUserDialog(Activity context) {
        super(context);
        this.context = context;

    }
    //清除输入框内容
    public void clear()
    {

        if(text_mobile01 !=null) text_mobile01.setText("");
        if(text_mobile02 !=null) text_mobile02.setText("");
        if(text_mobile03 !=null) text_mobile03.setText("");
        if(text_mobile04 !=null) text_mobile04.setText("");
        if(text_mobile05 !=null)text_mobile05.setText("");
        if(text_mobile06 !=null)text_mobile06.setText("");
        if(text_mobile07 !=null) text_mobile07.setText("");
        if(text_mobile08 !=null) text_mobile08.setText("");
        if(text_mobile09 !=null)text_mobile09.setText("");
        if(text_mobile10 !=null)text_mobile10.setText("");
        if(text_mobile11 !=null) text_mobile11.setText("");

    }
    //检查输入框输入是否完整
    public  boolean bCheckInput()
    {
        boolean bReturn =false;

        if(text_mobile01.getText().length()==0)
        {
            text_mobile01.setFocusable(true);
            text_mobile01.setFocusableInTouchMode(true);
            text_mobile01.requestFocus();
            return bReturn;
        }
        else if(text_mobile02.getText().length()==0)
        {
            text_mobile02.setFocusable(true);
            text_mobile02.setFocusableInTouchMode(true);
            text_mobile02.requestFocus();
            return bReturn;
        }
        else if(text_mobile03.getText().length()==0)
        {
            text_mobile03.setFocusable(true);
            text_mobile03.setFocusableInTouchMode(true);
            text_mobile03.requestFocus();
            return bReturn;
        }
        else if(text_mobile04.getText().length()==0)
        {
            text_mobile04.setFocusable(true);
            text_mobile04.setFocusableInTouchMode(true);
            text_mobile04.requestFocus();
            return bReturn;
        }
        else if(text_mobile05.getText().length()==0)
        {
            text_mobile05.setFocusable(true);
            text_mobile05.setFocusableInTouchMode(true);
            text_mobile05.requestFocus();
            return bReturn;
        }
        else if(text_mobile06.getText().length()==0)
        {
            text_mobile06.setFocusable(true);
            text_mobile06.setFocusableInTouchMode(true);
            text_mobile06.requestFocus();
            return bReturn;
        }
        else if(text_mobile07.getText().length()==0)
        {
            text_mobile07.setFocusable(true);
            text_mobile07.setFocusableInTouchMode(true);
            text_mobile07.requestFocus();
            return bReturn;
        }
        else if(text_mobile08.getText().length()==0)
        {
            text_mobile08.setFocusable(true);
            text_mobile08.setFocusableInTouchMode(true);
            text_mobile08.requestFocus();
            return bReturn;
        }
        else if(text_mobile09.getText().length()==0)
        {
            text_mobile09.setFocusable(true);
            text_mobile09.setFocusableInTouchMode(true);
            text_mobile09.requestFocus();
            return bReturn;
        }
        else if(text_mobile10.getText().length()==0)
        {
            text_mobile10.setFocusable(true);
            text_mobile10.setFocusableInTouchMode(true);
            text_mobile10.requestFocus();
            return bReturn;
        }
        else if(text_mobile11.getText().length()==0)
        {
            text_mobile11.setFocusable(true);
            text_mobile11.setFocusableInTouchMode(true);
            text_mobile11.requestFocus();
            return bReturn;
        }

        bReturn =true;


        return bReturn;
    }

    public CreateUserDialog(Activity context, int theme, View.OnClickListener clickListener, View.OnClickListener clickListenerCanle) {
        super(context, theme);
        this.context = context;
        this.mClickListener = clickListener;
        this.mClickListenerCanle = clickListenerCanle;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 指定布局
        this.setContentView(R.layout.create_user_phone);

        // text_name = (EditText) findViewById(R.id.text_name);
        // text_mobile = (EditText) findViewById(R.id.text_mobile);
        //phoneJG01tV = (TextView) findViewById(R.id.tv_phoneJG01);
        //  text_info = (EditText) findViewById(R.id.text_info);

        //  phoneJG01tV.setTextSize(ValueUtil.getInstance().getTextSize());
        /*
         * 获取圣诞框的窗口对象及参数对象以修改对话框的布局设置, 可以直接调用getWindow(),表示获得这个Activity的Window
         * 对象,这样这可以以同样的方式改变这个Activity的属性.
         */
        Window dialogWindow = this.getWindow();

        WindowManager m = context.getWindowManager();
        Display d = m.getDefaultDisplay(); // 获取屏幕宽、高用
        WindowManager.LayoutParams p = dialogWindow.getAttributes(); // 获取对话框当前的参数值
        // p.height = (int) (d.getHeight() * 0.6); // 高度设置为屏幕的0.6
        p.width = (int) (d.getWidth() * 0.8); // 宽度设置为屏幕的0.8
        dialogWindow.setAttributes(p);

        // 根据id在布局中找到控件对象
        btn_save = (Button) findViewById(R.id.btn_save_Phone);
        btn_PhonePass = (Button) findViewById(R.id.btn_PhonePass);
        text_mobile01 = (EditText) findViewById(R.id.text_mobile01);
        text_mobile02  = (EditText) findViewById(R.id.text_mobile02);
        text_mobile03 = (EditText) findViewById(R.id.text_mobile03);
        text_mobile04= (EditText) findViewById(R.id.text_mobile04);
        text_mobile05= (EditText) findViewById(R.id.text_mobile05);
        text_mobile06= (EditText) findViewById(R.id.text_mobile06);
        text_mobile07= (EditText) findViewById(R.id.text_mobile07);
        text_mobile08= (EditText) findViewById(R.id.text_mobile08);
        text_mobile09= (EditText) findViewById(R.id.text_mobile09);
        text_mobile10= (EditText) findViewById(R.id.text_mobile10);
        text_mobile11= (EditText) findViewById(R.id.text_mobile11);

        // 为按钮绑定点击事件监听器
        btn_save.setOnClickListener(mClickListener);
        btn_PhonePass.setOnClickListener(mClickListenerCanle);
        text_mobile01.addTextChangedListener(editclick);
        text_mobile02.addTextChangedListener(editclick);
        text_mobile03.addTextChangedListener(editclick);
        text_mobile04.addTextChangedListener(editclick);
        text_mobile05.addTextChangedListener(editclick);
        text_mobile06.addTextChangedListener(editclick);
        text_mobile07.addTextChangedListener(editclick);
        text_mobile08.addTextChangedListener(editclick);
        text_mobile09.addTextChangedListener(editclick);
        text_mobile10.addTextChangedListener(editclick);
        text_mobile11.addTextChangedListener(editclick);


        this.setCancelable(true);
    }
    private TextWatcher editclick = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }
        //一般我们都是在这个里面进行我们文本框的输入的判断，上面两个方法用到的很少
        @Override
        public void afterTextChanged(Editable s) {
            //首先获得所有控件值
            String strMobile01 = text_mobile01.getText().toString();
            String strMobile02 = text_mobile02.getText().toString();
            String strMobile03 = text_mobile03.getText().toString();
            String strMobile04 = text_mobile04.getText().toString();
            String strMobile05 = text_mobile05.getText().toString();
            String strMobile06 = text_mobile06.getText().toString();
            String strMobile07 = text_mobile07.getText().toString();
            String strMobile08 = text_mobile08.getText().toString();
            String strMobile09 = text_mobile09.getText().toString();
            String strMobile10 = text_mobile10.getText().toString();
            String strMobile11 = text_mobile11.getText().toString();


            //拼接成新的手机号
            strNewMobilNumber = strMobile01+ strMobile02 + strMobile03 +strMobile04 + strMobile05 + strMobile06+strMobile07 + strMobile08 +strMobile09 +strMobile10 + strMobile11;

            //新录入长度大于之前录入则认为是新增，正向获得焦点
            if(strNewMobilNumber.length() > strOldMobilNumber.length())
            {
                if(strMobile01.length()>0 && strMobile02.length()==0)
                {
                    text_mobile02.setFocusable(true);
                    text_mobile02.setFocusableInTouchMode(true);
                    text_mobile02.requestFocus();
                }
                else  if(strMobile02.length()>0 && strMobile03.length()==0)
                {
                    text_mobile03.setFocusable(true);
                    text_mobile03.setFocusableInTouchMode(true);
                    text_mobile03.requestFocus();
                }
                else if(strMobile03.length()>0 && strMobile04.length()==0)
                {
                    text_mobile04.setFocusable(true);
                    text_mobile04.setFocusableInTouchMode(true);
                    text_mobile04.requestFocus();
                }
                else if(strMobile04.length()>0 && strMobile05.length()==0)
                {
                    text_mobile05.setFocusable(true);
                    text_mobile05.setFocusableInTouchMode(true);
                    text_mobile05.requestFocus();
                }
                else if(strMobile05.length()>0 && strMobile06.length()==0)
                {
                    text_mobile06.setFocusable(true);
                    text_mobile06.setFocusableInTouchMode(true);
                    text_mobile06.requestFocus();
                }
                else if(strMobile06.length()>0 && strMobile07.length()==0)
                {
                    text_mobile07.setFocusable(true);
                    text_mobile07.setFocusableInTouchMode(true);
                    text_mobile07.requestFocus();
                }
                else if(strMobile07.length()>0 && strMobile08.length()==0)
                {
                    text_mobile08.setFocusable(true);
                    text_mobile08.setFocusableInTouchMode(true);
                    text_mobile08.requestFocus();
                }
                else if(strMobile08.length()>0 && strMobile09.length()==0)
                {
                    text_mobile09.setFocusable(true);
                    text_mobile09.setFocusableInTouchMode(true);
                    text_mobile09.requestFocus();
                }
                else if(strMobile09.length()>0 && strMobile10.length()==0)
                {
                    text_mobile10.setFocusable(true);
                    text_mobile10.setFocusableInTouchMode(true);
                    text_mobile10.requestFocus();
                }
                else if(strMobile10.length()>0 && strMobile11.length()==0)
                {
                    text_mobile11.setFocusable(true);
                    text_mobile11.setFocusableInTouchMode(true);
                    text_mobile11.requestFocus();
                }
            }
            else
            {
                //反之是反向获得
                if(strMobile01.length()>0 && strMobile02.length()==0)
                {
                    text_mobile01.setFocusable(true);
                    text_mobile01.setFocusableInTouchMode(true);
                    text_mobile01.requestFocus();
                }
                else  if(strMobile02.length()>0 && strMobile03.length()==0)
                {
                    text_mobile02.setFocusable(true);
                    text_mobile02.setFocusableInTouchMode(true);
                    text_mobile02.requestFocus();
                }
                else if(strMobile03.length()>0 && strMobile04.length()==0)
                {
                    text_mobile03.setFocusable(true);
                    text_mobile03.setFocusableInTouchMode(true);
                    text_mobile03.requestFocus();
                }
                else if(strMobile04.length()>0 && strMobile05.length()==0)
                {
                    text_mobile04.setFocusable(true);
                    text_mobile04.setFocusableInTouchMode(true);
                    text_mobile04.requestFocus();
                }
                else if(strMobile05.length()>0 && strMobile06.length()==0)
                {
                    text_mobile05.setFocusable(true);
                    text_mobile05.setFocusableInTouchMode(true);
                    text_mobile05.requestFocus();
                }
                else if(strMobile06.length()>0 && strMobile07.length()==0)
                {
                    text_mobile06.setFocusable(true);
                    text_mobile06.setFocusableInTouchMode(true);
                    text_mobile06.requestFocus();
                }
                else if(strMobile07.length()>0 && strMobile08.length()==0)
                {
                    text_mobile07.setFocusable(true);
                    text_mobile07.setFocusableInTouchMode(true);
                    text_mobile07.requestFocus();
                }
                else if(strMobile08.length()>0 && strMobile09.length()==0)
                {
                    text_mobile08.setFocusable(true);
                    text_mobile08.setFocusableInTouchMode(true);
                    text_mobile08.requestFocus();
                }
                else if(strMobile09.length()>0 && strMobile10.length()==0)
                {
                    text_mobile09.setFocusable(true);
                    text_mobile09.setFocusableInTouchMode(true);
                    text_mobile09.requestFocus();
                }
                else if(strMobile10.length()>0 && strMobile11.length()==0)
                {
                    text_mobile10.setFocusable(true);
                    text_mobile10.setFocusableInTouchMode(true);
                    text_mobile10.requestFocus();
                }

            }



            //变更完毕暂存新的手机号
            strOldMobilNumber = strNewMobilNumber;
        }
    };





}