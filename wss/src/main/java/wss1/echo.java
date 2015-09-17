package wss1;

import javax.jws.WebService;

@WebService
public interface echo {

	public String echo(String name);
}
