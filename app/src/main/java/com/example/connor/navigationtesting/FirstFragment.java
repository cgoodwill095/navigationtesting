package com.example.connor.navigationtesting;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import org.antlr.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import com.example.connor.antlrlp.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FirstFragment extends Fragment {

    View myView;
    Context thisContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final Context thisContext = getActivity();
        myView = inflater.inflate(R.layout.first_layout, container,false);
        Button submit = (Button) myView.findViewById(R.id.input1Button);
        Log.v("main","TEST");
        submit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View myView){
                    testDetails();
            }
        });
        return myView;
    }


    public void testDetails(){
        EditText userEntry = (EditText) myView.findViewById(R.id.userDate1);
        String source = userEntry.getText().toString();
        dategrammar2Lexer lexer = new dategrammar2Lexer(CharStreams.fromString(source));
       dategrammar2Parser parser = new dategrammar2Parser(new CommonTokenStream(lexer));
        Log.v("main", parser.toString());
        Log.v("main", parser.toString());
    }




}
