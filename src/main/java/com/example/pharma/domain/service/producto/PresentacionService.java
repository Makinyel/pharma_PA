package com.example.pharma.domain.service.producto;

import com.example.pharma.domain.entities.producto.Presentacion;
import com.example.pharma.infrastructure.repository.producto.PresentacionRepository;
import com.example.pharma.shared.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PresentacionService {
    private PresentacionRepository presentacionRepository;

    // seleccionar todos los datos
    public List<Presentacion> getPresentacion() {
        return presentacionRepository.findAll();
    }

    public Presentacion getPresentacionByName(String name) {
        Optional<Presentacion> presentacion = presentacionRepository.findByNombre(name);
        return presentacion
                .orElseThrow(() -> new NotFoundException("Presentacion with name: " + name + " was not found"));
    }

    public Presentacion guardar(Presentacion presentacion) {
        return presentacionRepository.save(presentacion);
    }

    public void delete(Long id) {
        presentacionRepository.deleteById(id);
    }
}
