package hello.bean;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ScopedProxyMode;

@Component
@Scope(value= "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class GreetingBean implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4718634341289056455L;


    private String msg;

    public String getMsg() {
           return msg;
    }

    public void setMsg(String msg) {
           this.msg = msg;
    }
}
