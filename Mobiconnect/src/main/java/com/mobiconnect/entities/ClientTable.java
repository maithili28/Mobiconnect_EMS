package com.mobiconnect.entities;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client_tbl")
public class ClientTable
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String name;
	private String location;
	private String start_date;
	private String end_date;

	//Getter-Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	//constructors
	public ClientTable(int id, String name, String location, String start_date, String end_date,
			List<ProjectTable> projectTable) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	//default constructor
   public ClientTable()
   {
	
   }
}