package com.ycl.car.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ycl.car.NextActivity;
import com.ycl.car.R;
import com.ycl.car.utils.DataCleanManager;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 个人资料
 * Created by y11621546 on 2017/1/18.
 */

public class SettingFragment extends BasePageFragment implements View.OnClickListener {
    @BindView(R.id.ll_clear_cache)
    LinearLayout llClearCache;
    @BindView(R.id.ll_pass_modify)
    LinearLayout llPassModify;
    @BindView(R.id.ll_update_check)
    LinearLayout llUpdateCheck;
    @BindView(R.id.ll_setting_ip)
    LinearLayout llSettingIp;

    public static SettingFragment newInstance() {

        Bundle args = new Bundle();

        SettingFragment fragment = new SettingFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        ButterKnife.bind(this, view);
        llPassModify.setOnClickListener(this);
        llClearCache.setOnClickListener(this);
        llUpdateCheck.setOnClickListener(this);

        llSettingIp.setOnClickListener(this);


        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        setTitle("设置");
        setTitleRight("");

        try {
//            setCache(String.valueOf(DataCleanManager.getTotalCacheSize(getContext())));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_pass_modify:
                ((NextActivity) getActivity()).addFragment(ModifyPassFragment.newInstance(), true);
                break;
            case R.id.ll_clear_cache:
                DataCleanManager.clearAllCache(getContext());
                try {
//                    setCache(String.valueOf(DataCleanManager.getTotalCacheSize(getContext())));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
//            case R.id.ll_setting_ip:
////                final EditText editText = new EditText(getContext());
////                editText.setHint("IP地址");
////                AlertDialog.Builder builder = new AlertDialog.Builder(getContext())
////                        .setTitle("设置IP")
////                        .setView(new EditText(getContext()))
////                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
////                            @Override
////                            public void onClick(DialogInterface dialogInterface, int i) {
//////                                if (TextUtils.isEmpty(editText.getText().toString()) || !RegUtil.isIP(editText.getText().toString())) {
//////                                    Toast.makeText(getActivity(), "IP 格式不正确", Toast.LENGTH_SHORT).show();
//////                                } else {
//////
//////                                }
////
////
////                            }
////                        })
////                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
////                            @Override
////                            public void onClick(DialogInterface dialogInterface, int i) {
////                                dialogInterface.dismiss();
////                            }
////                        });
////                builder.show();
//                break;
        }
    }

    @Override
    public void fetchData() {

    }
}
