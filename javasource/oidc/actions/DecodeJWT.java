// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package oidc.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Decodes a JWT string into a plain text JSON for the header and payload. This enables the user to implement a specific JSON mapping that decodes the header or payload. Throws an exception when the token could not be decoded or verified.
 */
public class DecodeJWT extends CustomJavaAction<IMendixObject>
{
	private java.lang.String encodedJWT;

	public DecodeJWT(IContext context, java.lang.String encodedJWT)
	{
		super(context);
		this.encodedJWT = encodedJWT;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "DecodeJWT";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
