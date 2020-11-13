package org.test.candidate.Problem1;

import java.util.Date;
import java.util.UUID;

public class AlertService {

	private AlertDAO storage = new MapAlertDAO();

	public AlertService(AlertDAO _storage) {
		this.storage = _storage;
	}

	public UUID raiseAlert() {
		return this.storage.addAlert(new Date());
	}

	public Date getAlertTime(UUID id) {
		return this.storage.getAlert(id);
	}
}
