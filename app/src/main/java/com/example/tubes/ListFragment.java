package com.example.tubes;
// Travel Log
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.tubes.databinding.ActivityMainBinding;
import org.jetbrains.annotations.Nullable;
import java.util.ArrayList;
public class ListFragment extends Fragment implements AdapterView.OnItemClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @androidx.annotation.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[]  data_name={ "Museum Sulawesi Tengah", "Taman Nasional Lore Lindu", "Souraja","Cagar alam morowali",
                "Tugu Perdamaian/Monumen Nosarara Nosabatutu", "Danau Poso", "Danau Tambing", "Pulau Togean"};

        ListView listView=(ListView)view.findViewById(R.id.lv_list);
        ArrayAdapter<String> adapter=new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1,data_name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        if(i==0){
            Intent intent = new Intent(view.getContext(), museum.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Museum Sulawesi Tengah", Toast.LENGTH_SHORT).show();
        }
        if(i==1){
            Intent intent = new Intent(view.getContext(), tamannasional.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Taman Nasional Lore Lindu", Toast.LENGTH_SHORT).show();
        }
        if(i==2){
            Intent intent = new Intent(view.getContext(), sourajaa.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Souraja", Toast.LENGTH_SHORT).show();
        }
        if(i==3){
            Intent intent = new Intent(view.getContext(), cagaralammorowali.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Cagar alam morowali", Toast.LENGTH_SHORT).show();
        }
        if(i==4){
            Intent intent = new Intent(view.getContext(), tuguperdamaian.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Tugu Perdamaian/Monumen Nosarara Nosabatutu", Toast.LENGTH_SHORT).show();
        }
        if(i==5){
            Intent intent = new Intent(view.getContext(), danauposo.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Danau Poso", Toast.LENGTH_SHORT).show();
        }
        if(i==6){
            Intent intent = new Intent(view.getContext(), danautambing.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Danau Tambing", Toast.LENGTH_SHORT).show();
        }
        if(i==7){
            Intent intent = new Intent(view.getContext(), pulautogean.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Pulau Togeans", Toast.LENGTH_SHORT).show();
        }
    }
}
