package services;

import entities.Deduccion;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import repositories.DeduccionRepository;

import java.util.Date;
import java.util.List;

@Service
public class DeduccionService {

    @Autowired
    private DeduccionRepository deduccionRepository;

    @Transactional
    public void crearDeduccion(@RequestParam double precio, @RequestParam double porcentaje){

        Deduccion deduccion=new Deduccion();

        deduccion.setPrecio(precio);
        deduccion.setPorcentaje(porcentaje);
        double iva =precio*porcentaje/100;
        deduccion.setIva(iva);
        deduccion.setResultado(precio-iva);
        deduccion.setCreated(new Date());
        deduccionRepository.save(deduccion);

    }

    public List<Deduccion> listarTodos(){

        List<Deduccion> lista= deduccionRepository.findAll();

        return lista;

    }

}
