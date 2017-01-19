package com.clavisit.clavisit.poc.ddl.images.web;

import com.clavisit.clavisit.poc.ddl.images.model.Image;
import com.clavisit.clavisit.poc.ddl.images.model.ImageWrapper;
import com.clavisit.clavisit.poc.ddl.images.service.ImageLocalService;
import com.liferay.portal.kernel.util.ReleaseInfo;
import com.liferay.portal.portlet.bridge.soy.SoyPortlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
			"javax.portlet.display-name=Ddl Images Portlet",
			"javax.portlet.expiration-cache=0",
			"javax.portlet.init-param.copy-request-parameters=true",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=DDLImagesView",
			"javax.portlet.name=ddl_images_portlet",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=guest,power-user,user",
			"javax.portlet.supports.mime-type=text/html"
	},
	service = Portlet.class
)
public class DdImagesPortlet extends SoyPortlet {
	private ImageLocalService imageLocalService;

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		template.put("counter", 0);

		List<Image> images = imageLocalService.findFileEntries("");
		List<Map<String, Object>> imageDatas = new ArrayList<>();
		for (Image image : images) {
			imageDatas.add(new ImageWrapper(image).getModelAttributes());
		}

		template.put("images", imageDatas);

		super.render(renderRequest, renderResponse);
	}

	@Reference(unbind = "-")
	public void setImageLocalService(ImageLocalService imageLocalService) {
		this.imageLocalService = imageLocalService;
	}
}