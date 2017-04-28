package jamesson.com.br.ex02_activity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jamesson on 4/28/17.
 */

public class Cliente implements Parcelable {

    public int codigo;
    public String nome;

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    private Cliente(Parcel from){
        codigo = from.readInt();
        nome = from.readString();
    }

    public static final Creator<Cliente> CREATOR = new Creator<Cliente>() {
        @Override
        public Cliente createFromParcel(Parcel in) {
            return new Cliente(in);
        }

        @Override
        public Cliente[] newArray(int size) {
            return new Cliente[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(codigo);
        dest.writeString(nome);
    }
}
