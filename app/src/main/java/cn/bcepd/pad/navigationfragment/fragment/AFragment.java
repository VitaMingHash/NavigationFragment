package cn.bcepd.pad.navigationfragment.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import cn.bcepd.pad.navigationfragment.R;


public class AFragment extends Fragment {
    Button button;
    private static final String CHANNEL_ID = "1";
    private static final int notificationId = 8;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("data", "11223344");
                Navigation.findNavController(getView()).navigate(R.id.to_BFragment, bundle);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("onStart", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("onResume", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("onPause", "onPause");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("onDetach", "onDetach");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("onStop", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("onDestroyView", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "onDestroy");
    }
}
