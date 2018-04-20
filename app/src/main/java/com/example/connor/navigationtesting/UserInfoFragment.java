package com.example.connor.navigationtesting;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.IOException;

public class UserInfoFragment extends Fragment {
    View myView;
    Context thisContext;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final Context thisContext = getActivity();
        myView = inflater.inflate(R.layout.user_info_layout, container, false);

        Button submitButton = (Button) myView.findViewById(R.id.submitButton);
        Log.v("main","TEST");
        submitButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View myView) {
                getDetails();
            }
        });
        return myView;
    }

    public void getDetails(){
        EditText inputID = (EditText) myView.findViewById(R.id.inputIDText);
        final String participantID = inputID.getText().toString();

        RadioGroup handRadioGroup = (RadioGroup) myView.findViewById(R.id.handRGroup);
        int selectedId = handRadioGroup.getCheckedRadioButtonId();
        RadioButton handRadio = (RadioButton) myView.findViewById(selectedId);
        final String selectedHand = handRadio.getText().toString();

        EditText inputOcc = (EditText) myView.findViewById(R.id.inputOccupationText);
        final String occupation = inputOcc.getText().toString();

        RadioGroup operatingSystem = (RadioGroup) myView.findViewById(R.id.mobileRadioGroup);
        int selectedOSID = operatingSystem.getCheckedRadioButtonId();
        RadioButton OSRButton = (RadioButton) myView.findViewById(selectedOSID);
        final String OSString = OSRButton.getText().toString();

        RadioGroup frequencyRadioGroup = (RadioGroup) myView.findViewById(R.id.freqRGroup);
        int selectedFreqID = frequencyRadioGroup.getCheckedRadioButtonId();
        RadioButton freqRadio = (RadioButton) myView.findViewById(selectedFreqID);
        final String selectedFreq = freqRadio.getText().toString();

        if (!participantID.isEmpty() && !selectedHand.isEmpty() && !occupation.isEmpty() && !selectedFreq.isEmpty()) {
            StringBuilder sb = new StringBuilder(participantID);
            sb.append(System.getProperty("line.separator") + selectedHand +
                    System.getProperty("line.separator")+ OSString +
                    System.getProperty("line.separator") + occupation +
                    System.getProperty("line.separator") + selectedFreq);
            String info = sb.toString();
            Log.v("MAIN", info);

            try {
                submitInfo(participantID, info, thisContext);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void submitInfo(String ParticipantID, String info, Context ctx) throws IOException {
        File path = Environment.getExternalStorageDirectory();
        String cardName = path.getName();
        if (!path.exists()){
            try{
                path.createNewFile();
                Log.i("main", "Path" + path.getCanonicalPath());

            } catch (IOException e){

            }
        }
        String testPrint = info;
        ctx = thisContext;
        String participant = ParticipantID;
        participant = participant + ".txt";
        File filePath;
        ctx = getActivity();
        ctx.getFilesDir();
        filePath = ctx.getFilesDir();
        if (!filePath.exists()) {
            try {
                filePath.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        File file = new File(filePath, participant);
        FileOutputStream writer = new FileOutputStream(file);
        try {
            writer.write(testPrint.getBytes());
            Log.v("main","SUCCESS PRINT");
            Log.i("main", "Path" + file.getCanonicalPath());
        }  finally {writer.close();
        }



    }

}