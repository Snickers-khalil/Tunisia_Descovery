package iset.pidev.smartbookstore.ui.Categorie;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION =1;
    public static final String DATABASE_NAME="lecteur_bd";
    public static final String TABLE_LECTEUR="commentaire";
    public static final String COL_ID="id";
    public static final String Col_DESCRIPTION="description";
    public static final String CREATE_LECTEUR_TABLE = "CREATE TABLE " +
            TABLE_LECTEUR + "(" + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + Col_DESCRIPTION + " TEXT NOT NULL) ";

    private SQLiteDatabase db;

    public DataBaseHelper(@Nullable Context context) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DataBaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_LECTEUR_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF exists " + TABLE_LECTEUR);
        onCreate(db);
    }

    public SQLiteDatabase open() {
        db = this.getWritableDatabase();
        return db;
    }

    public void addcommentaire(commentaire s) {
        open();
        ContentValues v = new ContentValues();
        v.put(Col_DESCRIPTION, s.getDescription());
        db.insert(TABLE_LECTEUR, null, v);
    }

    public void updatecommentaire(commentaire s) {
        open();
        ContentValues v = new ContentValues();
        v.put(Col_DESCRIPTION, s.getDescription());
        db.update(TABLE_LECTEUR, v, COL_ID + "=?", new String[]{String.valueOf(s.getId())});
    }

    public void removecommentaire(int id) {
        open();
        db.delete(TABLE_LECTEUR, COL_ID + "=?", new String[]{String.valueOf(id)});
    }

    public ArrayList<commentaire> getAllcommentaire() {
        ArrayList<commentaire> list = new ArrayList<commentaire>();
        db = this.getReadableDatabase();
        Cursor c = db.query(TABLE_LECTEUR, null, null, null, null, null, null, null);
        c.moveToFirst();
        do {
            commentaire s = new commentaire(c.getInt(0), c.getString(1));
            list.add(s);
        } while (c.moveToNext());
        return list;

    }

    public int getcommentaireCount() {
        db=this.getReadableDatabase();
        Cursor c = db.query(TABLE_LECTEUR, null, null, null, null, null, null, null);
        return c.getCount();
    }
}

