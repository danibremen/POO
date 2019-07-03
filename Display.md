**2º Bimestre** - Trabalho de POO

O objetivo do trabalho é desenvolver um programa em Java para simular os displays dos seguintes dispositivos.

- Rádio relógio: Hora em formato 24 horas
Exemplo: 21:34, 00:30.

- Rádio FM: Estação sintonizada.
Exemplo: FM 107.5 Mhz

- Temperatura: Em graus celsius
Exemplo: 31.1 °C

- Calendário: Dia, mês e ano.
Dia Mês Ano
26 07 2019

Resolução

**Display RadioRelógio**

	package desenvolvimento;
	
	public class Relogcio {
		
		private int segundos;
		private int minutos;
		private int horas;
		
		
		public Relogio ()
		{
			segundos = 0;
			minutos = 0;
			horas = 0;
		}
		
		public void tempSegundo()
		{
			segundos++;
			if (segundos == 60)
			{
				segundos=0;
				this.tempMinuto();
			}
		}
		
		public void tempMinuto()
		{
			minutos++;
			if (minutos == 60)
			{
				minutos=0;
				this.tempfHora();
			}
		}
		
		public void addHora()
		{
			horas++;
		}
		
		public void comecar()
		{
			System.out.println("Inicio relógio");
			while (true)
			{
				
				try {Thread.sleep(500);} 
				catch (InterruptedException e) {}
				
				
				this.tempSegundo();
				System.out.println(horas+":"+minutos+":"+segundos);			
			}
		}
		
		public static void main (String[] args)
		{
			(new Relogio()).comecar();
		}
	}

**Display Calendário**

	package desenvolvimento;

	public class Calendario {
		protected int dia;
		protected int mes;
		protected int ano;
		
		public int getDia() {
			return dia;
		}
		public void setDia(int dia) {
			this.dia = dia;
		}
		public int getMes() {
			return mes;
		}
		public void setMes(int mes) {
			this.mes = mes;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
	}
	
**Formatter Calendário**
      
      
	package desenvolvimento;

	public static void main(String[] args) {
		    
		   Calendar c = Calendar.getInstance(); 
		    final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		    final Date date = rs.getDate("dataInicio");
		    System.out.println(df.format(date));
	}

**Display tempo**

	package desenvolvendo;

	public class DisplayTime extends Display<escala> {
		private escala hora;
		private Format<escala> temp;
		
		DisplayTemp(escala hora, Format<escala> time){
			this.hora = hora;
			this.time = time;
		}

		
		void show() {
			if(hora.hora <= 9) {
				System.out.println("0" + time.formatter(hora));
			}else if(hora.hora > 9 && hora.hora < 24){
				System.out.println(time.formatter(hora));
			}
			
		}

	}



**Display Rádio FM**

	package desenvolvimento;

	public class DisplayRadio extends Display<R>{
	    
		private R r;
		private Format<R> rFormat;
		
		DisplayRadio(R r, Format<R> rFormat){
			this.r = r;
			this.rFormat = rFormat;
		}
		
		void show() {
			System.out.println(rFormat.formatter(r));
		}

	}
	}

**Display Temperatura**

	package desenvolvimento;

	public class DisplayTemperatura extends Display<Temper> {
	    
		private Temper temper;
		private Format<Temper> temperFormatter;
		
		DisplayTemper(Temper temper, Format<Temper> temperFormat){
		    
			this.temper = temper;
			this.temperaturaFormatter = temperFormat;
		}
		
		void show() {
			System.out.println(temperaturaFormatter.formatter(temperatura));
		}
	}
**Rádio**

		package desenvolvimento;

		public class Radio {
			protected float estacao;
			protected String frequencia;

			public float getEstacao() {
				return estacao;
			}

			public String getFrequencia() {
				return frequenca;
			}

			public void setFrequencia(String frequencia) {
				this.frequencia = frequencia;
			}

			public void setEstacao(float estacao) {
				this.estacao = estacao;
			}
		}

**Formatter Temperatura**

	package desenvolvimento;

	public class TemperFormat implements Format<Temper>{

		
		public String formatter(Temper value) {
			String temper = new String();
			
			temper = value.temper + "°" + value.celsius;
			return temper;
		}

	}
**Radio Format**

	package desenvolvimento;

	public class RadioFormat implements Format<Radio>{
		

		public String formatter(Radio value) {
			String radio = new String();
			radio = value.frequencia +" " + value.estacao + " Mhz";
			return radio;

