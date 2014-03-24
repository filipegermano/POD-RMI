package br.edu.ifpb.pod.rmi.opencv.server;

import java.io.ByteArrayInputStream;
import java.rmi.Remote;

/**
 *
 * @author filipe
 */
public interface AutComponent extends Remote{
    
    public String autentica(ByteArrayInputStream foto);
    
}
