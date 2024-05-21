import com.google.gson.annotations.SerializedName;

public class Moeda {
     @SerializedName("conversion_result")
        private String moeda;

        public String getMoeda() {
            return moeda;
        }

        public void setMoeda(String moeda) {
            this.moeda = moeda;
        }

        public String toString() {
            return "O resultado da conversão da conversão entre as moedas selecionadas é: " + moeda;
        }



}
