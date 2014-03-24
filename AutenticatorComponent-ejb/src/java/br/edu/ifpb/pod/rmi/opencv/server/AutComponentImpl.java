package br.edu.ifpb.pod.rmi.opencv.server;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author filipe
 */
public class AutComponentImpl extends UnicastRemoteObject implements AutComponent {
    
    public AutComponentImpl() throws RemoteException{
        super();
    }

    @Override
    public String autentica(ByteArrayInputStream foto) {
        OpenCVRemoteService openCVRemoteService;
        try {        
            AutComponent autComponent = new AutComponentImpl();
            return openCVRemoteService.recognize(foto);
        } catch (RemoteException ex) {
            Logger.getLogger(AutComponentImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
        
    }
    
}
