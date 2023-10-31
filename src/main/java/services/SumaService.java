package services;

import entities.Suma;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import repositories.SumaRepository;

import java.util.Date;
import java.util.List;

@Service
public class SumaService {

    @Autowired
    private SumaRepository sumaRepository;

    @Transactional
    public void crearSuma(@RequestParam double precio, @RequestParam double porcentaje){

        Suma suma= new Suma();
        double iva=precio*porcentaje/100;
        suma.setPrecio(precio);
        suma.setPorcentaje(porcentaje);
        suma.setIva(iva);
        suma.setResultado(precio+iva);
        suma.setCreated(new Date());
        sumaRepository.save(suma);

    }

    public List<Suma> listarTodos(){

        List<Suma> lista=sumaRepository.findAll();

        return lista;

    }


}
