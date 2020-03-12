package dados;

import java.util.Date;

public class Atendimento implements java.io.Serializable {

    private Date dataEntrada;
    private Date horaPrometida;
    private Animal animal;

    public Atendimento(Animal animal) {
        this.animal = animal;
    }

    public Atendimento(Date dataEntrada, Date horaPrometida) {
        this.dataEntrada = dataEntrada;
        this.horaPrometida = horaPrometida;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getHoraPrometida() {
        return horaPrometida;
    }

    public void setHoraPrometida(Date horaPrometida) {
        this.horaPrometida = horaPrometida;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
