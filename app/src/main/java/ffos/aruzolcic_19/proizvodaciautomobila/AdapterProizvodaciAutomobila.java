package ffos.aruzolcic_19.proizvodaciautomobila;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class AdapterProizvodaciAutomobila extends RecyclerView.Adapter<AdapterProizvodaciAutomobila.Red>  {

    private List<ProizvodaciAutomobila> podaci1;
    private List<ProizvodaciAutomobila> podaci2;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public AdapterProizvodaciAutomobila(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci1 = new ArrayList<>();
    }


    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        podaci2 = new ArrayList<>(podaci1);
        View view = mInflater.inflate(R.layout.red_liste_proizvodaci, roditelj, false);
        return new Red(view);
    }


    @Override
    public void onBindViewHolder(Red red, int position) {
        ProizvodaciAutomobila pa = podaci1.get(position);


        red.markaAutomobila.setText(pa.getMarkaAutomobila());
        red.proizvodac.setText(pa.getProizvodac());
        red.sjediste.setText(pa.getSjediste());
        red.opis.setText(pa.getOpis());

    }

    @Override
    public int getItemCount() {
        return podaci1==null ? 0 : podaci1.size();
    }


    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView markaAutomobila;
        private TextView proizvodac;
        private TextView sjediste;
        private TextView opis;

        Red(View itemView) {
            super(itemView);

            markaAutomobila = itemView.findViewById(R.id.marka);
            proizvodac =itemView.findViewById(R.id.proizvodac);
            sjediste = itemView.findViewById(R.id.sjediste);
            opis = itemView.findViewById(R.id.opis);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }


    public ProizvodaciAutomobila getItem(int id) {
        return podaci1.get(id);
    }

    public void setPodaci(List<ProizvodaciAutomobila> itemList) {
        this.podaci1 = itemList;
    }


    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }


    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }


};



