package br.edu.ifpb.pod.rmi.opencv.server;

import java.io.ByteArrayInputStream;
import java.rmi.Remote;

public interface OpenCVRemoteService extends Remote {

    /**
     * Registra quatro imagens relacionadas a uma determinada pessoa.
     *     
     * Retorna um token de identificação ou uma exceção, caso ocorra alguma
     * falha.
     *     
     * @param images
     * @return
     * @throws OpenCVRemoteServiceException
     */
    String registry(ByteArrayInputStream... images) throws OpenCVRemoteServiceException;

    /**
     * Realiza o reconhecimento de uma determina pessoa a partir de uma
     * determinada imagem
     *     
     *
     * @param image
     * @return
     * @throws OpenCVRemoteServiceException
     */
    String recognize(ByteArrayInputStream image) throws OpenCVRemoteServiceException;
}