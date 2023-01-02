package iset.pidev.smartbookstore;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfilFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final String ARG_PARAM4 = "param4";
    private static final String ARG_PARAM5 = "param5";
    private static final String ARG_PARAM6 = "param6";
    private static final String ARG_PARAM7 = "param7";
    private static final String ARG_PARAM8 = "param8";
    // TODO: Rename and change types of parameters

    private String mParam1;
    private String mParam2;
    private String mParam3;
    private String mParam4;
    private String mParam5;
    private String mParam6;
    private String mParam7;
    private String mParam8;

    public ProfilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @param param3 Parameter 3.
     * @param param4 Parameter 4.
     * @param param5 Parameter 5.
     * @param param6 Parameter 6.
     * @param param7 Parameter 7.
     * @param param8 Parameter 8.
     * @return A new instance of fragment ProfilFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfilFragment newInstance(String param1, String param2, String param3,
                                             String param4, String param5, String param6,
                                             String param7, String param8) {
        ProfilFragment fragment = new ProfilFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM2, param3);
        args.putString(ARG_PARAM4, param4);
        args.putString(ARG_PARAM5, param5);
        args.putString(ARG_PARAM6, param6);
        args.putString(ARG_PARAM7, param7);
        args.putString(ARG_PARAM7, param8);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getString(ARG_PARAM3);
            mParam4 = getArguments().getString(ARG_PARAM4);
            mParam5 = getArguments().getString(ARG_PARAM5);
            mParam6 = getArguments().getString(ARG_PARAM6);
            mParam7 = getArguments().getString(ARG_PARAM7);
            mParam8 = getArguments().getString(ARG_PARAM8);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_profil, container, false);
        View view= inflater.inflate(R.layout.fragment_profil, container, false);
        TextView n=view.findViewById(R.id.nomv);
        TextView pr=view.findViewById(R.id.prenomv);
        TextView c=view.findViewById(R.id.cinv);
        TextView l=view.findViewById(R.id.loginv);
        TextView e=view.findViewById(R.id.emailv);
        TextView p=view.findViewById(R.id.passwordv);
        TextView a=view.findViewById(R.id.adressev);
        TextView te=view.findViewById(R.id.telv);
        SharedPreferences sp= getActivity().getSharedPreferences("MyInf", Context.MODE_PRIVATE);
        n.setText(sp.getString("l",""));
        pr.setText(sp.getString("e",""));
        c.setText(sp.getString("c",""));
        l.setText(sp.getString("l",""));
        e.setText(sp.getString("e",""));
        p.setText(sp.getString("p",""));
        a.setText(sp.getString("a",""));
        te.setText(sp.getString("te",""));

        return view;
    }
}