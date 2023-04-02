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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeDeployedApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeployedApiResponse extends AcsResponse {

	private String apiId;

	private String resultType;

	private Boolean disableInternet;

	private String resultBodyModel;

	private String resultSample;

	private String allowSignatureMethod;

	private String regionId;

	private Boolean forceNonceCheck;

	private String visibility;

	private String failResultSample;

	private String authType;

	private String requestId;

	private String description;

	private String groupName;

	private String groupId;

	private String deployedTime;

	private String stageName;

	private String apiName;

	private List<ErrorCodeSample> errorCodeSamples;

	private List<ResultDescription> resultDescriptions;

	private List<SystemParameter> systemParameters;

	private List<CustomSystemParameter> customSystemParameters;

	private List<ConstantParameter> constantParameters;

	private List<RequestParameter> requestParameters;

	private List<ServiceParameter> serviceParameters;

	private List<ServiceParameterMap> serviceParametersMap;

	private RequestConfig requestConfig;

	private ServiceConfig serviceConfig;

	private OpenIdConnectConfig openIdConnectConfig;

	public String getApiId() {
		return this.apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getResultType() {
		return this.resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public Boolean getDisableInternet() {
		return this.disableInternet;
	}

	public void setDisableInternet(Boolean disableInternet) {
		this.disableInternet = disableInternet;
	}

	public String getResultBodyModel() {
		return this.resultBodyModel;
	}

	public void setResultBodyModel(String resultBodyModel) {
		this.resultBodyModel = resultBodyModel;
	}

	public String getResultSample() {
		return this.resultSample;
	}

	public void setResultSample(String resultSample) {
		this.resultSample = resultSample;
	}

	public String getAllowSignatureMethod() {
		return this.allowSignatureMethod;
	}

	public void setAllowSignatureMethod(String allowSignatureMethod) {
		this.allowSignatureMethod = allowSignatureMethod;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Boolean getForceNonceCheck() {
		return this.forceNonceCheck;
	}

	public void setForceNonceCheck(Boolean forceNonceCheck) {
		this.forceNonceCheck = forceNonceCheck;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getFailResultSample() {
		return this.failResultSample;
	}

	public void setFailResultSample(String failResultSample) {
		this.failResultSample = failResultSample;
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getDeployedTime() {
		return this.deployedTime;
	}

	public void setDeployedTime(String deployedTime) {
		this.deployedTime = deployedTime;
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public List<ErrorCodeSample> getErrorCodeSamples() {
		return this.errorCodeSamples;
	}

	public void setErrorCodeSamples(List<ErrorCodeSample> errorCodeSamples) {
		this.errorCodeSamples = errorCodeSamples;
	}

	public List<ResultDescription> getResultDescriptions() {
		return this.resultDescriptions;
	}

	public void setResultDescriptions(List<ResultDescription> resultDescriptions) {
		this.resultDescriptions = resultDescriptions;
	}

	public List<SystemParameter> getSystemParameters() {
		return this.systemParameters;
	}

	public void setSystemParameters(List<SystemParameter> systemParameters) {
		this.systemParameters = systemParameters;
	}

	public List<CustomSystemParameter> getCustomSystemParameters() {
		return this.customSystemParameters;
	}

	public void setCustomSystemParameters(List<CustomSystemParameter> customSystemParameters) {
		this.customSystemParameters = customSystemParameters;
	}

	public List<ConstantParameter> getConstantParameters() {
		return this.constantParameters;
	}

	public void setConstantParameters(List<ConstantParameter> constantParameters) {
		this.constantParameters = constantParameters;
	}

	public List<RequestParameter> getRequestParameters() {
		return this.requestParameters;
	}

	public void setRequestParameters(List<RequestParameter> requestParameters) {
		this.requestParameters = requestParameters;
	}

	public List<ServiceParameter> getServiceParameters() {
		return this.serviceParameters;
	}

	public void setServiceParameters(List<ServiceParameter> serviceParameters) {
		this.serviceParameters = serviceParameters;
	}

	public List<ServiceParameterMap> getServiceParametersMap() {
		return this.serviceParametersMap;
	}

	public void setServiceParametersMap(List<ServiceParameterMap> serviceParametersMap) {
		this.serviceParametersMap = serviceParametersMap;
	}

	public RequestConfig getRequestConfig() {
		return this.requestConfig;
	}

	public void setRequestConfig(RequestConfig requestConfig) {
		this.requestConfig = requestConfig;
	}

	public ServiceConfig getServiceConfig() {
		return this.serviceConfig;
	}

	public void setServiceConfig(ServiceConfig serviceConfig) {
		this.serviceConfig = serviceConfig;
	}

	public OpenIdConnectConfig getOpenIdConnectConfig() {
		return this.openIdConnectConfig;
	}

	public void setOpenIdConnectConfig(OpenIdConnectConfig openIdConnectConfig) {
		this.openIdConnectConfig = openIdConnectConfig;
	}

	public static class ErrorCodeSample {

		private String code;

		private String message;

		private String description;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	public static class ResultDescription {

		private String type;

		private String key;

		private Boolean hasChild;

		private String description;

		private String pid;

		private Boolean mandatory;

		private String name;

		private String id;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Boolean getHasChild() {
			return this.hasChild;
		}

		public void setHasChild(Boolean hasChild) {
			this.hasChild = hasChild;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public Boolean getMandatory() {
			return this.mandatory;
		}

		public void setMandatory(Boolean mandatory) {
			this.mandatory = mandatory;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class SystemParameter {

		private String demoValue;

		private String description;

		private String parameterName;

		private String location;

		private String serviceParameterName;

		public String getDemoValue() {
			return this.demoValue;
		}

		public void setDemoValue(String demoValue) {
			this.demoValue = demoValue;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getServiceParameterName() {
			return this.serviceParameterName;
		}

		public void setServiceParameterName(String serviceParameterName) {
			this.serviceParameterName = serviceParameterName;
		}
	}

	public static class CustomSystemParameter {

		private String demoValue;

		private String description;

		private String parameterName;

		private String location;

		private String serviceParameterName;

		public String getDemoValue() {
			return this.demoValue;
		}

		public void setDemoValue(String demoValue) {
			this.demoValue = demoValue;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getServiceParameterName() {
			return this.serviceParameterName;
		}

		public void setServiceParameterName(String serviceParameterName) {
			this.serviceParameterName = serviceParameterName;
		}
	}

	public static class ConstantParameter {

		private String description;

		private String location;

		private String serviceParameterName;

		private String constantValue;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getServiceParameterName() {
			return this.serviceParameterName;
		}

		public void setServiceParameterName(String serviceParameterName) {
			this.serviceParameterName = serviceParameterName;
		}

		public String getConstantValue() {
			return this.constantValue;
		}

		public void setConstantValue(String constantValue) {
			this.constantValue = constantValue;
		}
	}

	public static class RequestParameter {

		private String jsonScheme;

		private Long maxValue;

		private String arrayItemsType;

		private Long minValue;

		private String docShow;

		private Long maxLength;

		private String defaultValue;

		private String apiParameterName;

		private String enumValue;

		private String demoValue;

		private String required;

		private String description;

		private String parameterType;

		private String regularExpression;

		private Long minLength;

		private Integer docOrder;

		private String location;

		public String getJsonScheme() {
			return this.jsonScheme;
		}

		public void setJsonScheme(String jsonScheme) {
			this.jsonScheme = jsonScheme;
		}

		public Long getMaxValue() {
			return this.maxValue;
		}

		public void setMaxValue(Long maxValue) {
			this.maxValue = maxValue;
		}

		public String getArrayItemsType() {
			return this.arrayItemsType;
		}

		public void setArrayItemsType(String arrayItemsType) {
			this.arrayItemsType = arrayItemsType;
		}

		public Long getMinValue() {
			return this.minValue;
		}

		public void setMinValue(Long minValue) {
			this.minValue = minValue;
		}

		public String getDocShow() {
			return this.docShow;
		}

		public void setDocShow(String docShow) {
			this.docShow = docShow;
		}

		public Long getMaxLength() {
			return this.maxLength;
		}

		public void setMaxLength(Long maxLength) {
			this.maxLength = maxLength;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public String getApiParameterName() {
			return this.apiParameterName;
		}

		public void setApiParameterName(String apiParameterName) {
			this.apiParameterName = apiParameterName;
		}

		public String getEnumValue() {
			return this.enumValue;
		}

		public void setEnumValue(String enumValue) {
			this.enumValue = enumValue;
		}

		public String getDemoValue() {
			return this.demoValue;
		}

		public void setDemoValue(String demoValue) {
			this.demoValue = demoValue;
		}

		public String getRequired() {
			return this.required;
		}

		public void setRequired(String required) {
			this.required = required;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getParameterType() {
			return this.parameterType;
		}

		public void setParameterType(String parameterType) {
			this.parameterType = parameterType;
		}

		public String getRegularExpression() {
			return this.regularExpression;
		}

		public void setRegularExpression(String regularExpression) {
			this.regularExpression = regularExpression;
		}

		public Long getMinLength() {
			return this.minLength;
		}

		public void setMinLength(Long minLength) {
			this.minLength = minLength;
		}

		public Integer getDocOrder() {
			return this.docOrder;
		}

		public void setDocOrder(Integer docOrder) {
			this.docOrder = docOrder;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
	}

	public static class ServiceParameter {

		private String location;

		private String parameterType;

		private String serviceParameterName;

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getParameterType() {
			return this.parameterType;
		}

		public void setParameterType(String parameterType) {
			this.parameterType = parameterType;
		}

		public String getServiceParameterName() {
			return this.serviceParameterName;
		}

		public void setServiceParameterName(String serviceParameterName) {
			this.serviceParameterName = serviceParameterName;
		}
	}

	public static class ServiceParameterMap {

		private String requestParameterName;

		private String serviceParameterName;

		public String getRequestParameterName() {
			return this.requestParameterName;
		}

		public void setRequestParameterName(String requestParameterName) {
			this.requestParameterName = requestParameterName;
		}

		public String getServiceParameterName() {
			return this.serviceParameterName;
		}

		public void setServiceParameterName(String serviceParameterName) {
			this.serviceParameterName = serviceParameterName;
		}
	}

	public static class RequestConfig {

		private String bodyModel;

		private String requestPath;

		private String requestHttpMethod;

		private String bodyFormat;

		private String requestMode;

		private String postBodyDescription;

		private String requestProtocol;

		public String getBodyModel() {
			return this.bodyModel;
		}

		public void setBodyModel(String bodyModel) {
			this.bodyModel = bodyModel;
		}

		public String getRequestPath() {
			return this.requestPath;
		}

		public void setRequestPath(String requestPath) {
			this.requestPath = requestPath;
		}

		public String getRequestHttpMethod() {
			return this.requestHttpMethod;
		}

		public void setRequestHttpMethod(String requestHttpMethod) {
			this.requestHttpMethod = requestHttpMethod;
		}

		public String getBodyFormat() {
			return this.bodyFormat;
		}

		public void setBodyFormat(String bodyFormat) {
			this.bodyFormat = bodyFormat;
		}

		public String getRequestMode() {
			return this.requestMode;
		}

		public void setRequestMode(String requestMode) {
			this.requestMode = requestMode;
		}

		public String getPostBodyDescription() {
			return this.postBodyDescription;
		}

		public void setPostBodyDescription(String postBodyDescription) {
			this.postBodyDescription = postBodyDescription;
		}

		public String getRequestProtocol() {
			return this.requestProtocol;
		}

		public void setRequestProtocol(String requestProtocol) {
			this.requestProtocol = requestProtocol;
		}
	}

	public static class ServiceConfig {

		private String vpcId;

		private Integer mockStatusCode;

		private String servicePath;

		private String mock;

		private String serviceAddress;

		private String serviceVpcEnable;

		private String mockResult;

		private String serviceHttpMethod;

		private String serviceProtocol;

		private Integer serviceTimeout;

		private List<MockHeader> mockHeaders;

		private VpcConfig vpcConfig;

		private FunctionComputeConfig functionComputeConfig;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public Integer getMockStatusCode() {
			return this.mockStatusCode;
		}

		public void setMockStatusCode(Integer mockStatusCode) {
			this.mockStatusCode = mockStatusCode;
		}

		public String getServicePath() {
			return this.servicePath;
		}

		public void setServicePath(String servicePath) {
			this.servicePath = servicePath;
		}

		public String getMock() {
			return this.mock;
		}

		public void setMock(String mock) {
			this.mock = mock;
		}

		public String getServiceAddress() {
			return this.serviceAddress;
		}

		public void setServiceAddress(String serviceAddress) {
			this.serviceAddress = serviceAddress;
		}

		public String getServiceVpcEnable() {
			return this.serviceVpcEnable;
		}

		public void setServiceVpcEnable(String serviceVpcEnable) {
			this.serviceVpcEnable = serviceVpcEnable;
		}

		public String getMockResult() {
			return this.mockResult;
		}

		public void setMockResult(String mockResult) {
			this.mockResult = mockResult;
		}

		public String getServiceHttpMethod() {
			return this.serviceHttpMethod;
		}

		public void setServiceHttpMethod(String serviceHttpMethod) {
			this.serviceHttpMethod = serviceHttpMethod;
		}

		public String getServiceProtocol() {
			return this.serviceProtocol;
		}

		public void setServiceProtocol(String serviceProtocol) {
			this.serviceProtocol = serviceProtocol;
		}

		public Integer getServiceTimeout() {
			return this.serviceTimeout;
		}

		public void setServiceTimeout(Integer serviceTimeout) {
			this.serviceTimeout = serviceTimeout;
		}

		public List<MockHeader> getMockHeaders() {
			return this.mockHeaders;
		}

		public void setMockHeaders(List<MockHeader> mockHeaders) {
			this.mockHeaders = mockHeaders;
		}

		public VpcConfig getVpcConfig() {
			return this.vpcConfig;
		}

		public void setVpcConfig(VpcConfig vpcConfig) {
			this.vpcConfig = vpcConfig;
		}

		public FunctionComputeConfig getFunctionComputeConfig() {
			return this.functionComputeConfig;
		}

		public void setFunctionComputeConfig(FunctionComputeConfig functionComputeConfig) {
			this.functionComputeConfig = functionComputeConfig;
		}

		public static class MockHeader {

			private String headerValue;

			private String headerName;

			public String getHeaderValue() {
				return this.headerValue;
			}

			public void setHeaderValue(String headerValue) {
				this.headerValue = headerValue;
			}

			public String getHeaderName() {
				return this.headerName;
			}

			public void setHeaderName(String headerName) {
				this.headerName = headerName;
			}
		}

		public static class VpcConfig {

			private String vpcId;

			private String instanceId;

			private Integer port;

			private String name;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class FunctionComputeConfig {

			private String fcType;

			private String roleArn;

			private String method;

			private String fcBaseUrl;

			private String contentTypeValue;

			private String regionId;

			private Boolean onlyBusinessPath;

			private String functionName;

			private String contentTypeCatagory;

			private String path;

			private String serviceName;

			private String qualifier;

			public String getFcType() {
				return this.fcType;
			}

			public void setFcType(String fcType) {
				this.fcType = fcType;
			}

			public String getRoleArn() {
				return this.roleArn;
			}

			public void setRoleArn(String roleArn) {
				this.roleArn = roleArn;
			}

			public String getBizMethod() {
				return this.method;
			}

			public void setBizMethod(String method) {
				this.method = method;
			}

			public String getFcBaseUrl() {
				return this.fcBaseUrl;
			}

			public void setFcBaseUrl(String fcBaseUrl) {
				this.fcBaseUrl = fcBaseUrl;
			}

			public String getContentTypeValue() {
				return this.contentTypeValue;
			}

			public void setContentTypeValue(String contentTypeValue) {
				this.contentTypeValue = contentTypeValue;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Boolean getOnlyBusinessPath() {
				return this.onlyBusinessPath;
			}

			public void setOnlyBusinessPath(Boolean onlyBusinessPath) {
				this.onlyBusinessPath = onlyBusinessPath;
			}

			public String getFunctionName() {
				return this.functionName;
			}

			public void setFunctionName(String functionName) {
				this.functionName = functionName;
			}

			public String getContentTypeCatagory() {
				return this.contentTypeCatagory;
			}

			public void setContentTypeCatagory(String contentTypeCatagory) {
				this.contentTypeCatagory = contentTypeCatagory;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public String getQualifier() {
				return this.qualifier;
			}

			public void setQualifier(String qualifier) {
				this.qualifier = qualifier;
			}
		}
	}

	public static class OpenIdConnectConfig {

		private String openIdApiType;

		private String idTokenParamName;

		private String publicKeyId;

		private String publicKey;

		public String getOpenIdApiType() {
			return this.openIdApiType;
		}

		public void setOpenIdApiType(String openIdApiType) {
			this.openIdApiType = openIdApiType;
		}

		public String getIdTokenParamName() {
			return this.idTokenParamName;
		}

		public void setIdTokenParamName(String idTokenParamName) {
			this.idTokenParamName = idTokenParamName;
		}

		public String getPublicKeyId() {
			return this.publicKeyId;
		}

		public void setPublicKeyId(String publicKeyId) {
			this.publicKeyId = publicKeyId;
		}

		public String getPublicKey() {
			return this.publicKey;
		}

		public void setPublicKey(String publicKey) {
			this.publicKey = publicKey;
		}
	}

	@Override
	public DescribeDeployedApiResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeployedApiResponseUnmarshaller.unmarshall(this, context);
	}
}
