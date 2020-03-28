package appmoviles.com.listasintermedio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private ArrayList<UsuariosAdapter> usuarios;

    public CustomAdapter(){
        usuarios = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return usuarios.size();
    }

    @Override
    public Object getItem(int i) {
        return usuarios.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View row = inflater.inflate(R.layout.renglonusuario, null);
        TextView nombreRenglon = row.findViewById(R.id.nombreRenglon);
        TextView correoRenglon = row.findViewById(R.id.correoRenglon);

        nombreRenglon.setText( usuarios.get(i).getNombre() );
        correoRenglon.setText( usuarios.get(i).getCorreo() );

        return row;
    }

    public void agregarUsuario(UsuariosAdapter usuario){
        usuarios.add(usuario);
        this.notifyDataSetChanged();
    }

}
