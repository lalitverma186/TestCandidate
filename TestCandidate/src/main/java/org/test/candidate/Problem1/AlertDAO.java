package org.test.candidate.Problem1;

import java.util.Date;
import java.util.UUID;

public interface AlertDAO {

	UUID addAlert(Date time);

	Date getAlert(UUID id);

}
