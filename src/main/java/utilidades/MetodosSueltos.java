/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import Classes.Aeropuerto;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author rgpriede
 */
public class MetodosSueltos {

    public static void leerAeropuertos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(VariablesGlobales.FICHERO_AEROUERTOS))) {
            // TODO code application logic here
            while (true) {
                Aeropuerto a = (Aeropuerto) ois.readObject();
                VariablesGlobales.aeropuertos.add(a);
            }
        } catch (FileNotFoundException | EOFException ex) {
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void escribirAeropuerto(Aeropuerto a) throws FileNotFoundException, IOException {

        File f = new File(VariablesGlobales.FICHERO_AEROUERTOS);

        if (f.exists()) {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(VariablesGlobales.FICHERO_AEROUERTOS));
            oos.writeObject(a);
            oos.close();
        }
       
        else{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(VariablesGlobales.FICHERO_AEROUERTOS));
        oos.writeObject(a);
        oos.close();
        VariablesGlobales.aeropuertos.add(a);
    }
}

public class MiObjectOutputStream extends ObjectOutputStream {

    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected MiObjectOutputStream() throws IOException, SecurityException {
        super();
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        //To change body of generated methods, choose Tools | Templates.
    }

}
}
