/**
 * 描述 自定义提示框
 */

package com.su.echeck.echecklibrary.view;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.su.echeck.echecklibrary.R;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class WeiboDialog {
    private ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    private static Dialog errloadingDialog ;
    public static Dialog createLoadingDialog(Context context, String msg) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.dialog_loading, null);// 得到加载view
        LinearLayout layout = (LinearLayout) v
                .findViewById(R.id.dialog_loading_view);// 加载布局
        TextView tipTextView = (TextView) v.findViewById(R.id.tipTextView);// 提示文字
        tipTextView.setText(msg);// 设置加载信息

        Dialog loadingDialog = new Dialog(context, R.style.MyDialogStyle);// 创建自定义样式dialog
        loadingDialog.setCancelable(true); // 是否可以按“返回键”消失
        loadingDialog.setCanceledOnTouchOutside(false); // 点击加载框以外的区域
        loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));// 设置布局
        /**
         *将显示Dialog的方法封装在这里面
         */
        Window window = loadingDialog.getWindow();
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        window.setGravity(Gravity.CENTER);
        window.setAttributes(lp);
        window.setWindowAnimations(R.style.PopWindowAnimStyle);
        loadingDialog.show();

        return loadingDialog;
    }

    public static Dialog errMessageDialog(Context context, String msg) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.dialog_err_message, null);// 得到加载view
        LinearLayout layout = (LinearLayout) v
                .findViewById(R.id.dialog_err_view);// 加载布局
        TextView tipTextView = (TextView) v.findViewById(R.id.tipErrTextView);// 提示文字
        tipTextView.setText(msg);// 设置加载信息

        errloadingDialog = new Dialog(context, R.style.MyErrDialogStyle);// 创建自定义样式dialog
        errloadingDialog.setCancelable(true); // 是否可以按“返回键”消失
        errloadingDialog.setCanceledOnTouchOutside(true); // 点击加载框以外的区域
        errloadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));// 设置布局

        Button btnJobgradeErr= (Button) v.findViewById(R.id.btn_JobgradeErr);
        btnJobgradeErr.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               if (errloadingDialog != null && errloadingDialog.isShowing()) {
                   errloadingDialog.dismiss();
               }
           }
       });


        /**
         *将显示Dialog的方法封装在这里面
         */
        Window window = errloadingDialog.getWindow();
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        window.setGravity(Gravity.CENTER);
        window.setAttributes(lp);
        window.setWindowAnimations(R.style.PopWindowAnimStyle);
        errloadingDialog.show();

        return errloadingDialog;
    }

    /**
     * 关闭dialog
     */
    public static void closeDialog(Dialog mDialogUtils) {
        if (mDialogUtils != null && mDialogUtils.isShowing()) {
            mDialogUtils.dismiss();
        }
    }


}
