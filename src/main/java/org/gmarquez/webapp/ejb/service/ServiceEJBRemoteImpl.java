package org.gmarquez.webapp.ejb.service;

import jakarta.ejb.Stateful;
import org.gmarquez.webapp.ejb.models.ProductoRemoto;

import java.util.ArrayList;
import java.util.List;

@Stateful
public class ServiceEJBRemoteImpl implements ServiceEJBRemote {

    @Override
    public String saludar(String nombre) {
        return "Hello World " + nombre + "!";
    }

    @Override
    public List<ProductoRemoto> listar() {
        System.out.println("Listando productos en EJB Remoto");
        List<ProductoRemoto> productos = new ArrayList<>();
        productos.add(new ProductoRemoto("Producto 1"));
        productos.add(new ProductoRemoto("Producto 2"));
        return productos;
    }

    @Override
    public ProductoRemoto crear(ProductoRemoto producto) {
        System.out.println("Creando producto en EJB Remoto");
        ProductoRemoto nuevoProducto = new ProductoRemoto();
        nuevoProducto.setNombre(producto.getNombre());
        return nuevoProducto;
    }
}
