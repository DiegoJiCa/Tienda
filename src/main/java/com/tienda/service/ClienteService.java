package com.tienda.service;

import com.tienda.domain.Cliente;
import java.util.List;

public interface ClienteService {

    //obtiene una lista de registros de la tabla cliente y lo coloca en una lista de objetos cliente
    public List<Cliente> getClientes();

    //obtiene un registro de la tabla cliente que tiene guardado el objeto cliente
    public Cliente getCliente(Cliente cliente);

    public void deleteCliente(Cliente cliente);

    //si el idCliente no existe o es nulo, se crea un registro nuevo
    public void saveCliente(Cliente cliente);

}
