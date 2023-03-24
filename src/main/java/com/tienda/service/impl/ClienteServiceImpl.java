package com.tienda.service.impl;

import com.tienda.dao.ClienteDao;
import com.tienda.dao.CreditoDao;
import com.tienda.domain.Cliente;
import com.tienda.domain.Credito;
import com.tienda.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private CreditoDao creditoDao;
    
    @Autowired
    private ClienteDao clienteDao;
    
    @Override
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }
    
    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
        
    }
    
    @Override
    public void deleteCliente(Cliente cliente) {
        clienteDao.delete(cliente);
    }
    
    @Override
    public void saveCliente(Cliente cliente) {
        clienteDao.save(cliente);
        
        Credito credito = cliente.getCredito();
        credito = creditoDao.save(credito);
        cliente.setCredito(credito);
    }
    
}
