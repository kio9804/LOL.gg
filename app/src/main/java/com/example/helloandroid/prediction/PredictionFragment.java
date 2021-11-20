package com.example.helloandroid.prediction;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.helloandroid.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PredictionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PredictionFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PredictionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PredictionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PredictionFragment newInstance(String param1, String param2) {
        PredictionFragment fragment = new PredictionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflateView = inflater.inflate(R.layout.fragment_prediction, container, false);

        PredictionViewHolder viewHolder = new PredictionViewHolder(inflateView);

        viewHolder.bindData(
                new String[]{"승률 50%", "승률 50%", "승률 50%", "승률 50%", "승률 50%"},
                new String[]{"승률 10%", "승률 10%", "승률 10%", "승률 10%", "승률 10%"},
                "레드 팀이 이길 확률 50%"
        );
        return inflateView;
    }

    private static class PredictionViewHolder {
        private TextView red1TextView;
        private TextView red2TextView;
        private TextView red3TextView;
        private TextView red4TextView;
        private TextView red5TextView;
        private TextView blue1TextView;
        private TextView blue2TextView;
        private TextView blue3TextView;
        private TextView blue4TextView;
        private TextView blue5TextView;
        private TextView resultTextView;
        private PredictionViewHolder(View inflateView) {
            red1TextView = inflateView.findViewById(R.id.prediction_red1_text);
            red2TextView = inflateView.findViewById(R.id.prediction_red2_text);
            red3TextView = inflateView.findViewById(R.id.prediction_red3_text);
            red4TextView = inflateView.findViewById(R.id.prediction_red4_text);
            red5TextView = inflateView.findViewById(R.id.prediction_red5_text);

            blue1TextView = inflateView.findViewById(R.id.prediction_blue1_text);
            blue2TextView = inflateView.findViewById(R.id.prediction_blue2_text);
            blue3TextView = inflateView.findViewById(R.id.prediction_blue3_text);
            blue4TextView = inflateView.findViewById(R.id.prediction_blue4_text);
            blue5TextView = inflateView.findViewById(R.id.prediction_blue5_text);

            resultTextView = inflateView.findViewById(R.id.prediction_result_text);
        }

        private void bindData(String[] red, String[] blue, String predictionResult) {
            red1TextView.setText(red[0]);
            red2TextView.setText(red[1]);
            red3TextView.setText(red[2]);
            red4TextView.setText(red[3]);
            red5TextView.setText(red[4]);

            blue1TextView.setText(blue[0]);
            blue2TextView.setText(blue[1]);
            blue3TextView.setText(blue[2]);
            blue4TextView.setText(blue[3]);
            blue5TextView.setText(blue[4]);

            resultTextView.setText(predictionResult);
        }
    }
}