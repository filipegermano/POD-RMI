package br.edu.ifpb.pod.rmi.opencv.server;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author filipe
 */
public class Autentica {

    public String autenticaFoto(ByteArrayInputStream foto) throws OpenCVRemoteServiceException {
        try {
            OpenCVRemoteService ocvrs = (OpenCVRemoteService) Naming.lookup("rmi://200.129.71.228/OpenCVService");
            return ocvrs.recognize(foto);
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Autentica.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
