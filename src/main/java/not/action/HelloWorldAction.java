package not.action;

import com.googlecode.objectify.ObjectifyService;
import com.opensymphony.xwork2.ActionSupport;
import not.entity.Account;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class HelloWorldAction extends ActionSupport {

    private Account account;

    public String doLogin() {
        boolean success = true;
        if (success) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String processLogin() {
        ObjectifyService.register(Account.class);
        boolean success = true;
        if (success) {
            ofy().save().entity(account).now();
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    @Override
    public void validate() {
        if (account == null) {
            return;
        }
        if (account.getUsername() == null || account.getUsername().length() == 0) {
            addFieldError("account.username", "Username is required");
        }
        if (account.getPassword() == null || account.getPassword().length() == 0) {
            addFieldError("account.password", "Password is required");
        }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
