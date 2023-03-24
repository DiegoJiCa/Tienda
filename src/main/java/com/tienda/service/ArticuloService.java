
package com.tienda.service;

import com.tienda.domain.Articulo;
import java.util.List;


public interface ArticuloService {
    //obtiene una lista de registros de la tabla articulo y lo coloca en una lista de objetos articulo
    public List<Articulo> getArticulos(boolean activos);
    
    
    
    //obtiene un registro de la tabla articulo que tiene guardado el objeto articulo
    public Articulo getArticulo(Articulo articulo);
    
    
    public void deleteArticulo(Articulo articulo);
    
    
    //si el idArticulo no existe o es nulo, se crea un registro nuevo
    public void saveArticulo(Articulo articulo);
    
}
