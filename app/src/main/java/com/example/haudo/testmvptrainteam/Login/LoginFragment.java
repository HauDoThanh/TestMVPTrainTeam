package com.example.haudo.testmvptrainteam.Login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.haudo.testmvptrainteam.R;

/**
 * Created by HauDo on 1/11/2018.
 */

public class LoginFragment extends Fragment {

    private View mView;

    private EditText mUser;

    private EditText mPassword;

    private Button mLogin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_login, container, false);

        mUser = mView.findViewById(R.id.edtUser);
        mPassword = mView.findViewById(R.id.edtPass);
        mLogin = mView.findViewById(R.id.btnLogin);

        return mView;
    }
}
