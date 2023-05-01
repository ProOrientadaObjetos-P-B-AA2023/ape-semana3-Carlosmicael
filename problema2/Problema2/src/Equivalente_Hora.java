public class Equivalente_Hora {
    public static class EquivalenteHora {
        private int horas;
        private int minutos;
        private int segundos;
        private double dias;
        public EquivalenteHora () { }

        public EquivalenteHora(int horas) {

            this.horas = horas;
        }

        public void calcularEquivalente() {

            minutos = horas * 60;

            segundos = horas * 3600;

            dias = (double) horas / 24;
        }

        public int getMinutos() {

            return minutos;
        }

        public int getSegundos() {

            return segundos;
        }

        public double getDias() {

            return dias;
        }
        public String toString() {
            return  "DATOS EN HORAS,MINUTOS,SEGUNDOS Y DIAS" +
                    "\nhoras=" + horas +
                    " \nminutos=" + minutos +
                    " \nsegundos=" + segundos +
                    " \ndias=" + dias +
                    '.';
        }

        public static void main(String[] args) {
            EquivalenteHora equivalenteHora = new EquivalenteHora(40);
            equivalenteHora.calcularEquivalente();
            equivalenteHora.getMinutos();
            equivalenteHora.getSegundos();
            equivalenteHora.getDias();
            System.out.println(equivalenteHora);
        }
    }
}
