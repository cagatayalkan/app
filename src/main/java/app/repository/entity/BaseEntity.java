package app.repository.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;

@MappedSuperclass
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	Date instanceId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(Date instanceId) {
		this.instanceId = instanceId;
	}

	@PrePersist
	public void prePersist() {

		instanceId = new Date();
	}
}
