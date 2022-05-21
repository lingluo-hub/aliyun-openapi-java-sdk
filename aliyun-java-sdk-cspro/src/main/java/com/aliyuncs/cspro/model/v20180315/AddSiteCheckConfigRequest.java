/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cspro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddSiteCheckConfigRequest extends RpcAcsRequest<AddSiteCheckConfigResponse> {
	   

	private Boolean setBaseLine;

	private Integer siteCheckFrequency;

	private String siteProtocol;

	private String indexUrl;

	private Integer indexCheckFrequency;

	private String siteDomain;
	public AddSiteCheckConfigRequest() {
		super("cspro", "2018-03-15", "AddSiteCheckConfig", "cspro");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getSetBaseLine() {
		return this.setBaseLine;
	}

	public void setSetBaseLine(Boolean setBaseLine) {
		this.setBaseLine = setBaseLine;
		if(setBaseLine != null){
			putBodyParameter("SetBaseLine", setBaseLine.toString());
		}
	}

	public Integer getSiteCheckFrequency() {
		return this.siteCheckFrequency;
	}

	public void setSiteCheckFrequency(Integer siteCheckFrequency) {
		this.siteCheckFrequency = siteCheckFrequency;
		if(siteCheckFrequency != null){
			putBodyParameter("SiteCheckFrequency", siteCheckFrequency.toString());
		}
	}

	public String getSiteProtocol() {
		return this.siteProtocol;
	}

	public void setSiteProtocol(String siteProtocol) {
		this.siteProtocol = siteProtocol;
		if(siteProtocol != null){
			putBodyParameter("SiteProtocol", siteProtocol);
		}
	}

	public String getIndexUrl() {
		return this.indexUrl;
	}

	public void setIndexUrl(String indexUrl) {
		this.indexUrl = indexUrl;
		if(indexUrl != null){
			putBodyParameter("IndexUrl", indexUrl);
		}
	}

	public Integer getIndexCheckFrequency() {
		return this.indexCheckFrequency;
	}

	public void setIndexCheckFrequency(Integer indexCheckFrequency) {
		this.indexCheckFrequency = indexCheckFrequency;
		if(indexCheckFrequency != null){
			putBodyParameter("IndexCheckFrequency", indexCheckFrequency.toString());
		}
	}

	public String getSiteDomain() {
		return this.siteDomain;
	}

	public void setSiteDomain(String siteDomain) {
		this.siteDomain = siteDomain;
		if(siteDomain != null){
			putBodyParameter("SiteDomain", siteDomain);
		}
	}

	@Override
	public Class<AddSiteCheckConfigResponse> getResponseClass() {
		return AddSiteCheckConfigResponse.class;
	}

}
