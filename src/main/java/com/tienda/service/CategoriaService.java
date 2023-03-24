
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    //obtiene una lista de registros de la tabla categoria y lo coloca en una lista de objetos categoria
    public List<Categoria> getCategorias(boolean activos);
    
    
    
    //obtiene un registro de la tabla categoria que tiene guardado el objeto categoria
    public Categoria getCategoria(Categoria categoria);
    
    
    public void deleteCategoria(Categoria categoria);
    
    
    //si el idCategoria no existe o es nulo, se crea un registro nuevo
    public void saveCategoria(Categoria categoria);
    
}
