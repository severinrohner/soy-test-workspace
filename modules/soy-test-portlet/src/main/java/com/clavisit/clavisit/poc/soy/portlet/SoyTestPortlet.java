package com.clavisit.clavisit.poc.soy.portlet;

import com.liferay.portal.kernel.util.ReleaseInfo;
import com.liferay.portal.portlet.bridge.soy.SoyPortlet;
import org.osgi.service.component.annotations.Component;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;

@Component(
	immediate = true,
	property = {
			"com.liferay.portlet.add-default-resource=true",
			"com.liferay.portlet.application-type=full-page-application",
			"com.liferay.portlet.application-type=widget",
			"com.liferay.portlet.display-category=category.sample",
			"com.liferay.portlet.layout-cacheable=true",
			"com.liferay.portlet.preferences-owned-by-group=true",
			"com.liferay.portlet.private-request-attributes=false",
			"com.liferay.portlet.private-session-attributes=false",
			"com.liferay.portlet.render-weight=50",
			"com.liferay.portlet.scopeable=true",
			"com.liferay.portlet.use-default-template=true",
			"javax.portlet.display-name=Soy Test Portlet",
			"javax.portlet.expiration-cache=0",
			"javax.portlet.init-param.copy-request-parameters=true",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=View",
			"javax.portlet.name=test_soy_portlet",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=guest,power-user,user",
			"javax.portlet.supports.mime-type=text/html"
	},
	service = Portlet.class
)
public class SoyTestPortlet extends SoyPortlet {
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		template.put("releaseInfo", ReleaseInfo.getReleaseInfo());

		super.render(renderRequest, renderResponse);
	}
}