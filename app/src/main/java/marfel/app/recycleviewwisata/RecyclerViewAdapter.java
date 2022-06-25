package marfel.app.recycleviewwisata;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Integer> gbrWisata = new ArrayList<>();
    private ArrayList<String> namaWisata = new ArrayList<>();
    private ArrayList<String> ket_Wisata = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<Integer> gbrWisata, ArrayList<String> namaWisata, ArrayList<String> ket_Wisata, Context context) {
        this.gbrWisata = gbrWisata;
        this.namaWisata = namaWisata;
        this.ket_Wisata = ket_Wisata;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(gbrWisata.get(position)).into(holder.gambar_wisata);

        holder.nama_wisata.setText(namaWisata.get(position));
        holder.cLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WisataActivity.class);

                intent.putExtra("image", gbrWisata.get(position));
                intent.putExtra("nama_Wisata", namaWisata.get(position));
                intent.putExtra("ket_Wisata", ket_Wisata.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaWisata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView gambar_wisata;
        TextView nama_wisata;
        ConstraintLayout cLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar_wisata = itemView.findViewById(R.id.gambar_wisata);
            nama_wisata = itemView.findViewById(R.id.nama_wisata);
            cLayout = itemView.findViewById(R.id.cLayout);
        }
    }

}
