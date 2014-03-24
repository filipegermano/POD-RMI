package br.edu.ifpb.pod.rmi.opencv.server;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author filipe
 */
public class AutComponentImpl extends RemoteObject implements AutComponent {

    @Override
    public String autentica(ByteArrayInputStream foto) {
        OpenCVRemoteService openCVRemoteService;
        try {
            AutComponent autComponent = new AutComponentImpl();
            Naming.rebind("rmi://localhost:9999/Autentica", autComponent);
            return openCVRemoteService.recognize(foto);
        } catch (RemoteException | MalformedURLException | OpenCVRemoteServiceException ex) {
            Logger.getLogger(AutComponentImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
