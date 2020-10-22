package com.example.loginapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home extends Fragment {

    private TextView textName;
    private TextView textFirstName;
    private TextView textPassword;
    private Button passwordButton;

    public Home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home.
     */
    // TODO: Rename and change types and number of parameters
    public static Home newInstance(String param1, String param2) {
        Home fragment = new Home();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, true);
        // Inflate the layout for this fragment

        textName = (TextView) rootView.findViewById(R.id.nom);
        textFirstName = (TextView) rootView.findViewById(R.id.prenom);
        textPassword = (TextView) rootView.findViewById(R.id.password);
        passwordButton = (Button) rootView.findViewById(R.id.showPassword);
        passwordButton.setOnClickListener(passwordBtnListener);

        return rootView;
    }
    private View.OnClickListener passwordBtnListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){

        }
    };
}