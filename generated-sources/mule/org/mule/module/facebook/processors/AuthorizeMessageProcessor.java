
package org.mule.module.facebook.processors;

import java.util.regex.Pattern;
import javax.annotation.Generated;
import org.mule.module.facebook.oauth.FacebookConnectorOAuthManager;
import org.mule.security.oauth.processor.BaseOAuth2AuthorizeMessageProcessor;

@Generated(value = "Mule DevKit Version 3.5.0-SNAPSHOT", date = "2014-04-28T02:56:18-05:00", comments = "Build master.1926.b0106b2")
public class AuthorizeMessageProcessor
    extends BaseOAuth2AuthorizeMessageProcessor<FacebookConnectorOAuthManager>
{

    private final static Pattern AUTH_CODE_PATTERN = Pattern.compile("code=([^&]+)");

    @Override
    protected String getAuthCodeRegex() {
        return AUTH_CODE_PATTERN.pattern();
    }

    @Override
    protected Class<FacebookConnectorOAuthManager> getOAuthManagerClass() {
        return FacebookConnectorOAuthManager.class;
    }

}