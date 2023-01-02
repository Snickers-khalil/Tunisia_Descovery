package iset.pidev.smartbookstore.ui.Categorie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import iset.pidev.smartbookstore.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final VideoView videoView = binding.video;
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                //  videoView.setVideoURI(Uri.parse("/sdcard/DCIM/Camera/2021-03-13-151647229.mp4"));
//                //videoView.setVideoPath("android.resource://"+getPackageName);
//               // videoView.start();
//              //  String VideoPath ="android.resource://"+ getPackageName()+"/"+ R.raw.vd;
//               // Uri uri =Uri.parse(VideoPath);
//                Uri uri = Uri.parse(Environment.getExternalStorageDirectory().getAbsolutePath()+"//sdcard/[EgyBest].La.Casa.De.Papel.S05E06.WEB-DL.480p.x264.mp4");
//                videoView.setVideoURI(uri);
//                videoView.start();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}