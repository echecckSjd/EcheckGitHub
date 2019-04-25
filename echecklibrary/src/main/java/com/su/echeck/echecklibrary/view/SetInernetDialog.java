/**
 * 类名
 * 描述 网络设置弹框
 **/

package com.su.echeck.echecklibrary.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.su.echeck.echecklibrary.R;

public class SetInernetDialog extends Dialog implements DialogInterface.OnDismissListener {

    private Context context;
    private LinearLayout ll_bg;
    private TextView tv_inter_tell;
    private TextView tv_inter_go;

    public SetInernetDialog(Context context) {
        super(context, R.style.Dialog);
        this.context=context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_go_to_set);
        setCanceledOnTouchOutside(false);
        setOnDismissListener(this);

        ll_bg=(LinearLayout) findViewById(R.id.ll_bg);
        tv_inter_tell=(TextView)findViewById(R.id.tv_inter_tell);
        tv_inter_go=(TextView)findViewById(R.id.tv_inter_go);
        tv_inter_tell.setText("当前网络不可用，请前往设置...");

        ll_bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        tv_inter_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(Settings.ACTION_SETTINGS));
            }
        });
    }

    /**
     * 监听dialog是否关闭了
     */
    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        InternetHelp.isShow=false;
    }
}
