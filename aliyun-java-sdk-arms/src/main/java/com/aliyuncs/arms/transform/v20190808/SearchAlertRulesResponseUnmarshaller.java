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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRuleEntity;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRuleEntity.AlarmContext;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRuleEntity.AlertRule;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRuleEntity.AlertRule.Rule;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRuleEntity.MetricParam;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRuleEntity.MetricParam.Dimension;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRuleEntity.Notice;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchAlertRulesResponseUnmarshaller {

	public static SearchAlertRulesResponse unmarshall(SearchAlertRulesResponse searchAlertRulesResponse, UnmarshallerContext _ctx) {
		
		searchAlertRulesResponse.setRequestId(_ctx.stringValue("SearchAlertRulesResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setPageNumber(_ctx.integerValue("SearchAlertRulesResponse.PageBean.PageNumber"));
		pageBean.setPageSize(_ctx.integerValue("SearchAlertRulesResponse.PageBean.PageSize"));
		pageBean.setTotalCount(_ctx.integerValue("SearchAlertRulesResponse.PageBean.TotalCount"));

		List<AlertRuleEntity> alertRules = new ArrayList<AlertRuleEntity>();
		for (int i = 0; i < _ctx.lengthValue("SearchAlertRulesResponse.PageBean.AlertRules.Length"); i++) {
			AlertRuleEntity alertRuleEntity = new AlertRuleEntity();
			alertRuleEntity.setStatus(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Status"));
			alertRuleEntity.setUpdateTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].UpdateTime"));
			alertRuleEntity.setContactGroupIdList(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].ContactGroupIdList"));
			alertRuleEntity.setCreateTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].CreateTime"));
			alertRuleEntity.setAlertTitle(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertTitle"));
			alertRuleEntity.setUserId(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].UserId"));
			alertRuleEntity.setAlertVersion(_ctx.integerValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertVersion"));
			alertRuleEntity.setHostByAlertManager(_ctx.booleanValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].HostByAlertManager"));
			alertRuleEntity.setAlertType(_ctx.integerValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertType"));
			alertRuleEntity.setContactGroupIds(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].ContactGroupIds"));
			alertRuleEntity.setConfig(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Config"));
			alertRuleEntity.setRegionId(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].RegionId"));
			alertRuleEntity.setAlertLevel(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertLevel"));
			alertRuleEntity.setTaskStatus(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].TaskStatus"));
			alertRuleEntity.setTitle(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Title"));
			alertRuleEntity.setTaskId(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].TaskId"));
			alertRuleEntity.setId(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Id"));

			List<String> alertWays = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertWays.Length"); j++) {
				alertWays.add(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertWays["+ j +"]"));
			}
			alertRuleEntity.setAlertWays(alertWays);

			AlarmContext alarmContext = new AlarmContext();
			alarmContext.setAlarmContentTemplate(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlarmContext.AlarmContentTemplate"));
			alarmContext.setSubTitle(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlarmContext.SubTitle"));
			alarmContext.setAlarmContentSubTitle(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlarmContext.AlarmContentSubTitle"));
			alarmContext.setContent(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlarmContext.Content"));
			alertRuleEntity.setAlarmContext(alarmContext);

			AlertRule alertRule = new AlertRule();
			alertRule.setOperator(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Operator"));

			List<Rule> rules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules.Length"); j++) {
				Rule rule = new Rule();
				rule.setMeasure(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].Measure"));
				rule.setValue(_ctx.floatValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].Value"));
				rule.setAggregates(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].Aggregates"));
				rule.setNValue(_ctx.integerValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].NValue"));
				rule.setOperator(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].Operator"));
				rule.setAlias(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].Alias"));

				rules.add(rule);
			}
			alertRule.setRules(rules);
			alertRuleEntity.setAlertRule(alertRule);

			MetricParam metricParam = new MetricParam();
			metricParam.setType(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Type"));
			metricParam.setAppGroupId(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.AppGroupId"));
			metricParam.setAppId(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.AppId"));
			metricParam.setPid(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Pid"));

			List<Dimension> dimensions = new ArrayList<Dimension>();
			for (int j = 0; j < _ctx.lengthValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Dimensions.Length"); j++) {
				Dimension dimension = new Dimension();
				dimension.setKey(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Dimensions["+ j +"].Key"));
				dimension.setType(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Dimensions["+ j +"].Type"));
				dimension.setValue(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Dimensions["+ j +"].Value"));

				dimensions.add(dimension);
			}
			metricParam.setDimensions(dimensions);
			alertRuleEntity.setMetricParam(metricParam);

			Notice notice = new Notice();
			notice.setEndTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Notice.EndTime"));
			notice.setNoticeEndTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Notice.NoticeEndTime"));
			notice.setStartTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Notice.StartTime"));
			notice.setNoticeStartTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Notice.NoticeStartTime"));
			alertRuleEntity.setNotice(notice);

			alertRules.add(alertRuleEntity);
		}
		pageBean.setAlertRules(alertRules);
		searchAlertRulesResponse.setPageBean(pageBean);
	 
	 	return searchAlertRulesResponse;
	}
}