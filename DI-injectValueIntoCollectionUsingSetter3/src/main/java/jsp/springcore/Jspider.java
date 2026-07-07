package jsp.springcore;

import java.util.List;

public class Jspider {
private String ceo;
private String cofounder;
private List<String> trainers;
public String getCeo() {
	return ceo;
}
public void setCeo(String ceo) {
	this.ceo = ceo;
}
public String getCofounder() {
	return cofounder;
}
public void setCofounder(String cofounder) {
	this.cofounder = cofounder;
}
public List<String> getTrainers() {
	return trainers;
}
public void setTrainers(List<String> trainers) {
	this.trainers = trainers;
}
@Override
public String toString() {
	return "Jspider [ceo=" + ceo + ", cofounder=" + cofounder + ", trainers=" + trainers + "]";
}

}
