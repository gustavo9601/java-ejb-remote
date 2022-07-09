package org.gmarquez.webapp.ejb.service;

import jakarta.ejb.Remote;
import org.gmarquez.webapp.ejb.models.ProductoRemoto;

import java.util.List;

@Remote  // Indica que se podra usar de forma remota, por otras aplicaciones externas
public interface ServiceEJBRemote {
    String saludar(String nombre);

    List<ProductoRemoto> listar();

    ProductoRemoto crear(ProductoRemoto producto);
}
