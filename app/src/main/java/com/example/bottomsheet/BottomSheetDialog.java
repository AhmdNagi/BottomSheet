package com.example.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BottomSheetDialog extends BottomSheetDialogFragment {
    private BottomSheetListener mlistener;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.bottom_sheet_dialog,container,false);
        Button button1 = v.findViewById(R.id.btn1);
        Button button2 = v.findViewById(R.id.btn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlistener.onButtonClicked("Button 1 is clicked");
                dismiss();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlistener.onButtonClicked("Button2 is clicked");
                dismiss();
            }
        });
    return v;
    }

    public interface BottomSheetListener {
        void onButtonClicked (String text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {

            mlistener = (BottomSheetListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString()+"Must implement BottomSheetListener");

        }



    }
}
