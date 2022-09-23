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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeSiteMonitorAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSiteMonitorAttributeResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<MetricRule> metricRules;

	private SiteMonitors siteMonitors;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<MetricRule> getMetricRules() {
		return this.metricRules;
	}

	public void setMetricRules(List<MetricRule> metricRules) {
		this.metricRules = metricRules;
	}

	public SiteMonitors getSiteMonitors() {
		return this.siteMonitors;
	}

	public void setSiteMonitors(SiteMonitors siteMonitors) {
		this.siteMonitors = siteMonitors;
	}

	public static class MetricRule {

		private String metricName;

		private String evaluationCount;

		private String namespace;

		private String okActions;

		private String alarmActions;

		private String ruleId;

		private String ruleName;

		private String period;

		private String comparisonOperator;

		private String expression;

		private String dimensions;

		private String stateValue;

		private String actionEnable;

		private String level;

		private String threshold;

		private String statistics;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getEvaluationCount() {
			return this.evaluationCount;
		}

		public void setEvaluationCount(String evaluationCount) {
			this.evaluationCount = evaluationCount;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getOkActions() {
			return this.okActions;
		}

		public void setOkActions(String okActions) {
			this.okActions = okActions;
		}

		public String getAlarmActions() {
			return this.alarmActions;
		}

		public void setAlarmActions(String alarmActions) {
			this.alarmActions = alarmActions;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public String getComparisonOperator() {
			return this.comparisonOperator;
		}

		public void setComparisonOperator(String comparisonOperator) {
			this.comparisonOperator = comparisonOperator;
		}

		public String getExpression() {
			return this.expression;
		}

		public void setExpression(String expression) {
			this.expression = expression;
		}

		public String getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}

		public String getStateValue() {
			return this.stateValue;
		}

		public void setStateValue(String stateValue) {
			this.stateValue = stateValue;
		}

		public String getActionEnable() {
			return this.actionEnable;
		}

		public void setActionEnable(String actionEnable) {
			this.actionEnable = actionEnable;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getThreshold() {
			return this.threshold;
		}

		public void setThreshold(String threshold) {
			this.threshold = threshold;
		}

		public String getStatistics() {
			return this.statistics;
		}

		public void setStatistics(String statistics) {
			this.statistics = statistics;
		}
	}

	public static class SiteMonitors {

		private String endTime;

		private String taskType;

		private String interval;

		private String taskState;

		private String taskName;

		private String address;

		private String taskId;

		private List<IspCity> ispCities;

		private OptionJson optionJson;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getInterval() {
			return this.interval;
		}

		public void setInterval(String interval) {
			this.interval = interval;
		}

		public String getTaskState() {
			return this.taskState;
		}

		public void setTaskState(String taskState) {
			this.taskState = taskState;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public List<IspCity> getIspCities() {
			return this.ispCities;
		}

		public void setIspCities(List<IspCity> ispCities) {
			this.ispCities = ispCities;
		}

		public OptionJson getOptionJson() {
			return this.optionJson;
		}

		public void setOptionJson(OptionJson optionJson) {
			this.optionJson = optionJson;
		}

		public static class IspCity {

			private String city;

			private String ispName;

			private String isp;

			private String cityName;

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getIspName() {
				return this.ispName;
			}

			public void setIspName(String ispName) {
				this.ispName = ispName;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}

			public String getCityName() {
				return this.cityName;
			}

			public void setCityName(String cityName) {
				this.cityName = cityName;
			}
		}

		public static class OptionJson {

			private String request_format;

			private String response_content;

			private Integer port;

			private Boolean proxy_protocol;

			private Integer authentication;

			private Integer match_rule;

			private String dns_match_rule;

			private String ipv6_task;

			private String request_content;

			private String acceptable_response_code;

			private String username;

			private Long traceroute;

			private String dns_type;

			private String response_format;

			private String password;

			private String expect_value;

			private Long time_out;

			private Float failure_rate;

			private String header;

			private String cookie;

			private Integer ping_num;

			private String http_method;

			private Boolean unfollow_redirect;

			private Boolean cert_verify;

			private String dns_server;

			private Boolean enable_operator_dns;

			private Long attempts;

			private String protocol;

			private String isBase64Encode;

			private Boolean diagnosis_mtr;

			private Boolean diagnosis_ping;

			private Integer retry_delay;

			private Boolean save_response_body;

			private List<AssertionsItem> assertions;

			public String getRequest_format() {
				return this.request_format;
			}

			public void setRequest_format(String request_format) {
				this.request_format = request_format;
			}

			public String getResponse_content() {
				return this.response_content;
			}

			public void setResponse_content(String response_content) {
				this.response_content = response_content;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public Boolean getProxy_protocol() {
				return this.proxy_protocol;
			}

			public void setProxy_protocol(Boolean proxy_protocol) {
				this.proxy_protocol = proxy_protocol;
			}

			public Integer getAuthentication() {
				return this.authentication;
			}

			public void setAuthentication(Integer authentication) {
				this.authentication = authentication;
			}

			public Integer getMatch_rule() {
				return this.match_rule;
			}

			public void setMatch_rule(Integer match_rule) {
				this.match_rule = match_rule;
			}

			public String getDns_match_rule() {
				return this.dns_match_rule;
			}

			public void setDns_match_rule(String dns_match_rule) {
				this.dns_match_rule = dns_match_rule;
			}

			public String getIpv6_task() {
				return this.ipv6_task;
			}

			public void setIpv6_task(String ipv6_task) {
				this.ipv6_task = ipv6_task;
			}

			public String getRequest_content() {
				return this.request_content;
			}

			public void setRequest_content(String request_content) {
				this.request_content = request_content;
			}

			public String getAcceptable_response_code() {
				return this.acceptable_response_code;
			}

			public void setAcceptable_response_code(String acceptable_response_code) {
				this.acceptable_response_code = acceptable_response_code;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public Long getTraceroute() {
				return this.traceroute;
			}

			public void setTraceroute(Long traceroute) {
				this.traceroute = traceroute;
			}

			public String getDns_type() {
				return this.dns_type;
			}

			public void setDns_type(String dns_type) {
				this.dns_type = dns_type;
			}

			public String getResponse_format() {
				return this.response_format;
			}

			public void setResponse_format(String response_format) {
				this.response_format = response_format;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getExpect_value() {
				return this.expect_value;
			}

			public void setExpect_value(String expect_value) {
				this.expect_value = expect_value;
			}

			public Long getTime_out() {
				return this.time_out;
			}

			public void setTime_out(Long time_out) {
				this.time_out = time_out;
			}

			public Float getFailure_rate() {
				return this.failure_rate;
			}

			public void setFailure_rate(Float failure_rate) {
				this.failure_rate = failure_rate;
			}

			public String getHeader() {
				return this.header;
			}

			public void setHeader(String header) {
				this.header = header;
			}

			public String getCookie() {
				return this.cookie;
			}

			public void setCookie(String cookie) {
				this.cookie = cookie;
			}

			public Integer getPing_num() {
				return this.ping_num;
			}

			public void setPing_num(Integer ping_num) {
				this.ping_num = ping_num;
			}

			public String getHttp_method() {
				return this.http_method;
			}

			public void setHttp_method(String http_method) {
				this.http_method = http_method;
			}

			public Boolean getUnfollow_redirect() {
				return this.unfollow_redirect;
			}

			public void setUnfollow_redirect(Boolean unfollow_redirect) {
				this.unfollow_redirect = unfollow_redirect;
			}

			public Boolean getCert_verify() {
				return this.cert_verify;
			}

			public void setCert_verify(Boolean cert_verify) {
				this.cert_verify = cert_verify;
			}

			public String getDns_server() {
				return this.dns_server;
			}

			public void setDns_server(String dns_server) {
				this.dns_server = dns_server;
			}

			public Boolean getEnable_operator_dns() {
				return this.enable_operator_dns;
			}

			public void setEnable_operator_dns(Boolean enable_operator_dns) {
				this.enable_operator_dns = enable_operator_dns;
			}

			public Long getAttempts() {
				return this.attempts;
			}

			public void setAttempts(Long attempts) {
				this.attempts = attempts;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public String getIsBase64Encode() {
				return this.isBase64Encode;
			}

			public void setIsBase64Encode(String isBase64Encode) {
				this.isBase64Encode = isBase64Encode;
			}

			public Boolean getDiagnosis_mtr() {
				return this.diagnosis_mtr;
			}

			public void setDiagnosis_mtr(Boolean diagnosis_mtr) {
				this.diagnosis_mtr = diagnosis_mtr;
			}

			public Boolean getDiagnosis_ping() {
				return this.diagnosis_ping;
			}

			public void setDiagnosis_ping(Boolean diagnosis_ping) {
				this.diagnosis_ping = diagnosis_ping;
			}

			public Integer getRetry_delay() {
				return this.retry_delay;
			}

			public void setRetry_delay(Integer retry_delay) {
				this.retry_delay = retry_delay;
			}

			public Boolean getSave_response_body() {
				return this.save_response_body;
			}

			public void setSave_response_body(Boolean save_response_body) {
				this.save_response_body = save_response_body;
			}

			public List<AssertionsItem> getAssertions() {
				return this.assertions;
			}

			public void setAssertions(List<AssertionsItem> assertions) {
				this.assertions = assertions;
			}

			public static class AssertionsItem {

				private String property;

				private String type;

				private String operator;

				private String target;

				public String getProperty() {
					return this.property;
				}

				public void setProperty(String property) {
					this.property = property;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getTarget() {
					return this.target;
				}

				public void setTarget(String target) {
					this.target = target;
				}
			}
		}
	}

	@Override
	public DescribeSiteMonitorAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeSiteMonitorAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
