package ma.emsi.iMark.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="objectbs")
public class ObjectB {

	@Transient
	public static final String SEQUENCE_NAME="objectB_sequence";
	
	
	@Id
	private int id;
	private String annotation;
	
	private List<Polygon> polygons;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public List<Polygon> getPolygons() {
		return polygons;
	}

	public void setPolygons(List<Polygon> polygons) {
		this.polygons = polygons;
	}

	

	
	
	
	
}
