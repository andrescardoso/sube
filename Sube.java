
public class Sube {

	public static void main(String[] args) {
		
		Sube persona1 = new Sube(0,20);
		persona1.efectuar_viaje();
		persona1.efectuar_viaje();
		persona1.efectuar_viaje();
		persona1.efectuar_viaje();
		persona1.carga_saldo(100);
		persona1.efectuar_viaje();
		System.out.println(persona1.toString());

	}
//
	private int cant_viajes;
	private double saldo;
	
	public Sube (int cant_viajes, double saldo) { // CONSTRUCTOR
		this.setCant_viajes(cant_viajes);
		this.setSaldo(saldo);
	}
	
	public boolean verifica_saldo(double ingreso) {
		if(ingreso>(-50))
			return true;
		else
		return false;
	}
	
	public void carga_saldo(int importe) {
		System.out.println("Saldo anterior: "+this.getSaldo());
		this.setSaldo(getSaldo()+importe);
		System.out.println("Nuevo saldo disponible: "+this.getSaldo());
	}
	
	public void efectuar_viaje() {
		double importe=0;
		if(this.verifica_saldo(this.getSaldo())) {
			if(this.getCant_viajes()>=0 && this.getCant_viajes()<20) 
				importe=19;
			if(this.getCant_viajes()>21 && this.getCant_viajes()<30) 
				importe=15.20;
			if(this.getCant_viajes()>31 && this.getCant_viajes()<40) 
				importe=13.30;
			if(this.getCant_viajes()>41) 
				importe=11.40;
		double saldo_aux=this.getSaldo()-importe;
			if(saldo_aux>(-50)) {	
				this.setSaldo(getSaldo()-importe);	
				this.setCant_viajes(getCant_viajes()+1);
		System.out.println("Cobrado: "+importe);
		System.out.println("Nuevo saldo disponible: "+this.getSaldo());
		}
		else
			System.out.println("No tiene suficiente saldo en la tarjeta");
		}
		else
			System.out.println("No tiene suficiente saldo en la tarjeta");
	}
	
	// SETTERS & GETTERS
	public void setCant_viajes(int cant_viajes) {
		this.cant_viajes=cant_viajes;
	}
	public int getCant_viajes() {
		return cant_viajes;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public double getSaldo() {
		return saldo;
	}

	// TOSTRING
	public String toString() {
		return "SUBE [Cantidad de viajes: " + cant_viajes + " | Saldo: " + saldo + "]";
	}

	// EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sube other = (Sube) obj;
		if (cant_viajes != other.cant_viajes)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}

	// CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}