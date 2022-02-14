package atores;

public abstract class Bot {
		public Bot () {
			
		}
	
		private String place;
		private int saude;
		private double forca;
		
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		public int getSaude() {
			return saude;
		}
		public void setSaude(int saude) {
			this.saude = saude;
		}
		public double getForca() {
			return forca;
		}
		public void setForca(double forca) {
			this.forca = forca;
		}
	
}
 