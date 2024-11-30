package clases;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;

    //constructor default
    public Reloj() {
        this.hora = 12;
        this.minutos = 00;
        this.segundos = 00;
    }

    //constructor con 3 parametros validado
    public Reloj(int hora, int minutos, int segundos) {
        setHoras(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    //constructor para segundos medianoche
    public Reloj(int segundos){
        setReloj(segundos);
    }

    //metodo de setter para horas
    public void setHoras(int hora) {
        if ((validarHora(hora, minutos, segundos))) {
            this.hora = hora;
        } else {
            System.out.println("Formato de hora inválido");
        }
    }

    //metodo setter para minutos
    public void setMinutos(int minutos) {
        if ((validarHora(hora, minutos, segundos))) {
            this.minutos = minutos;
        } else {
            System.out.println("Formato de minutos inválido");
        }
    }

    //metodo setter para segundos
    public void setSegundos(int segundos) {
        if ((validarHora(hora, minutos, segundos))) {
            this.segundos = segundos;
        } else {
            System.out.println("Formato de segundos inválido");
        }
    }

    //metodo setter y conversión para segundos a partir de medianoche
    public void setReloj(int segundosValor) {
        double horaDouble = 0;
        double minutosDouble = 0;
        double segundosDouble = 0;
        final double segundosEnHora = 3600.0;
        if (!validarSegundosM(segundosValor)) {
            System.out.println("Error");
        }
        else {
            horaDouble = segundosValor / segundosEnHora;
            hora = (int) (Math.floor(horaDouble));
            minutosDouble = (horaDouble - hora) * 60;
            minutos = (int) (Math.floor(minutosDouble));
            segundosDouble = (minutosDouble - minutos) * 60;
            segundos = (int) (Math.round(segundosDouble));
        }
    }

    public int getHoras() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }


    //validacion para el constructor de 3 parametros
    public boolean validarHora(int hora, int minutos, int segundos) {
        if ((hora < 00) || (hora > 23)) {
            System.out.println("La hora solo es aceptada dentro del rango 00 a 23");
            return false;
        }

        if ((minutos < 00) || (minutos > 59)) {
            System.out.println("Los minutos solo son aceptados dentro del rango 00 a 59");
            return false;
        }

        if ((segundos < 00) || (segundos > 59)) {
            System.out.println("Los segundos solo son aceptados dentro del rango 00 a 59");
            return false;
        }
        return true;
    }

    //validacion para el constructor de 1 parametro
    public boolean validarSegundosM(int segundos) {
        if ((segundos < 00) || (segundos > 86399)) {
            System.out.println("Los segundos no pueden ser negativos y en un dia no superan los 86399");
            return false;
        }
        return true;
    }

    //metodo para incrementar 1 segundo
    public void tick() {
        if (segundos == 59) {
            segundos = 00;
            minutos ++;
            if (minutos == 60) {
                minutos = 00;
                hora++;
                if (hora == 24) {
                    hora = 00;
                }
            }
        } else {
            segundos++;
        }
    }

    public void calculadoraDeMas24(int totalSegundos) {
        int horas = (totalSegundos / 3600) % 24;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }


    public void addReloj(Reloj objeto) {
        int totalSegundos = (((objeto.hora * 3600) + (objeto.minutos * 60) + objeto.segundos) + ((this.hora * 3600) + (this.minutos * 60) + (this.segundos)));
        if (totalSegundos > 86399) {
            System.out.println("La hora sumada superan las 24hs, no se modifica la instancia ");
            System.out.print("Resultado: ");
            calculadoraDeMas24(totalSegundos);
        } else {
            setReloj(totalSegundos);
        }
    }

    @Override
    public String toString() {
        return String.format("[%02d:%02d:%02d]", hora, minutos, segundos);
    }

    public void tickDecrement() {
        if (segundos == 0) {
            if (minutos == 0) {
                if (hora == 0) {
                    return;
                } else {
                    hora--;
                    minutos = 59;
                    segundos = 59;
                }
            } else {
                minutos--;
                segundos = 59;
            }
        } else {
            segundos--;
        }
    }

    public Reloj restaReloj(Reloj objeto) {
        int relojActual = (this.hora * 3600) + (this.minutos * 60) + (this.segundos);
        int relojParametro = (objeto.hora * 3600) + (objeto.minutos * 60) + (objeto.segundos);
        int diferenciaEnSegundos = Math.abs(relojActual - relojParametro);
        return new Reloj(diferenciaEnSegundos);
    }

}


