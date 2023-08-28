// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package emailtemplate.actions;

import com.mendix.core.Core;
import com.mendix.externalinterface.connector.RequestHandler;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import emailtemplate.proxies.constants.Constants;

public class OAuthRequestsHandler extends CustomJavaAction<java.lang.Boolean>
{
	public OAuthRequestsHandler(IContext context)
	{
		super(context);
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		var signinPath = Constants.getOAuthSignInPath().endsWith("/") ?
				Constants.getOAuthSignInPath() : Constants.getOAuthSignInPath().concat("/");
		var callbackPath = Constants.getOAuthCallbackPath().endsWith("/") ?
				Constants.getOAuthCallbackPath() : Constants.getOAuthCallbackPath().concat("/");
		RequestHandler signInRequestHandler = new OauthSignInRequestHandler();
		Core.addRequestHandler(signinPath, signInRequestHandler);
		RequestHandler callBackRequestHandler = new OauthCallBackRequestHandler();
		Core.addRequestHandler(callbackPath, callBackRequestHandler);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "OAuthRequestsHandler";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
