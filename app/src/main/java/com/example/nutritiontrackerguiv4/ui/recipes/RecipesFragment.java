package com.example.nutritiontrackerguiv4.ui.recipes;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.net.*;

import com.example.nutritiontrackerguiv4.R;

public class RecipesFragment extends Fragment {

    private RecipesViewModel mViewModel;
    View root;

    public static RecipesFragment newInstance() {
        return new RecipesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.recipes_fragment, container, false);


        root.findViewById(R.id.veganButton).setOnClickListener(view -> clicked_btn("https://simple-veganista.com/"));

        root.findViewById(R.id.vegetarianButton).setOnClickListener(view -> clicked_btn("https://themodernproper.com/60-best-vegetarian-meals"));

        root.findViewById(R.id.ketoButton).setOnClickListener(view -> clicked_btn("https://www.delish.com/keto-recipes/"));

        root.findViewById(R.id.glutenFreeButton).setOnClickListener(view -> clicked_btn("https://www.allrecipes.com/recipes/741/healthy-recipes/gluten-free/"));

        root.findViewById(R.id.lowFatButton).setOnClickListener(view -> clicked_btn("https://www.allrecipes.com/recipes/1231/healthy-recipes/low-fat/"));

        root.findViewById(R.id.highProteinButton).setOnClickListener(view -> clicked_btn("https://www.skinnytaste.com/high-protein/"));

        root.findViewById(R.id.mindButton).setOnClickListener(view -> clicked_btn("https://www.pinterest.com/thespicyrd/mediterranean-diet-mind-diet-recipes/"));

        root.findViewById(R.id.highFiberButton).setOnClickListener(view -> clicked_btn("https://www.foodnetwork.com/topics/high-fiber-recipes"));

        root.findViewById(R.id.lowCostButton).setOnClickListener(view -> clicked_btn("https://www.budgetbytes.com/"));

        root.findViewById(R.id.lowEffortButton).setOnClickListener(view -> clicked_btn("https://www.taste.com.au/quick-easy/galleries/low-cook-dinners-busy-weeknights/hyu3sf13"));


        return root;
    }

    public void clicked_btn(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(RecipesViewModel.class);
        // TODO: Use the ViewModel
    }

}