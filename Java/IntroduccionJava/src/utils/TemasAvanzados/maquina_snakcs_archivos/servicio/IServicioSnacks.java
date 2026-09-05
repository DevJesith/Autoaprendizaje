package utils.TemasAvanzados.maquina_snakcs_archivos.servicio;

import utils.TemasAvanzados.maquina_snakcs_archivos.dominio.Snack;

import java.util.List;

public interface IServicioSnacks {
    void agregarSnack(Snack snack);
    void mostrarSnacks();
    List<Snack> getSnacks();

}
