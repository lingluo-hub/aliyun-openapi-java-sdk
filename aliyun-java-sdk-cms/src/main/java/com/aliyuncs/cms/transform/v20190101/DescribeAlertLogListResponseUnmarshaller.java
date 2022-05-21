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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm.DimensionsItem;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm.Escalation;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm.ExtInfo;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm.SendDetail;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm.SendDetail.ChannelResult;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm.SendDetail.ChannelResult.Result;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm.SendResult;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm.WebhookListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertLogListResponseUnmarshaller {

	public static DescribeAlertLogListResponse unmarshall(DescribeAlertLogListResponse describeAlertLogListResponse, UnmarshallerContext _ctx) {
		
		describeAlertLogListResponse.setRequestId(_ctx.stringValue("DescribeAlertLogListResponse.RequestId"));
		describeAlertLogListResponse.setSuccess(_ctx.booleanValue("DescribeAlertLogListResponse.Success"));
		describeAlertLogListResponse.setCode(_ctx.stringValue("DescribeAlertLogListResponse.Code"));
		describeAlertLogListResponse.setMessage(_ctx.stringValue("DescribeAlertLogListResponse.Message"));
		describeAlertLogListResponse.setPageNumber(_ctx.integerValue("DescribeAlertLogListResponse.PageNumber"));
		describeAlertLogListResponse.setPageSize(_ctx.integerValue("DescribeAlertLogListResponse.PageSize"));

		List<Alarm> alertLogList = new ArrayList<Alarm>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setMetricName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].MetricName"));
			alarm.setEventName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].EventName"));
			alarm.setProduct(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Product"));
			alarm.setBlackListUUID(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].BlackListUUID"));
			alarm.setMessage(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Message"));
			alarm.setNamespace(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Namespace"));
			alarm.setLevelChange(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].LevelChange"));
			alarm.setInstanceId(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].InstanceId"));
			alarm.setRuleName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].RuleName"));
			alarm.setRuleId(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].RuleId"));
			alarm.setBlackListName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].BlackListName"));
			alarm.setGroupName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].GroupName"));
			alarm.setGroupId(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].GroupId"));
			alarm.setAlertTime(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].AlertTime"));
			alarm.setInstanceName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].InstanceName"));
			alarm.setBlackListDetail(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].BlackListDetail"));
			alarm.setLevel(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Level"));
			alarm.setSendStatus(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendStatus"));

			List<String> dingdingWebhookList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].DingdingWebhookList.Length"); j++) {
				dingdingWebhookList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].DingdingWebhookList["+ j +"]"));
			}
			alarm.setDingdingWebhookList(dingdingWebhookList);

			List<String> contactOnCallList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactOnCallList.Length"); j++) {
				contactOnCallList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactOnCallList["+ j +"]"));
			}
			alarm.setContactOnCallList(contactOnCallList);

			List<String> contactMailList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactMailList.Length"); j++) {
				contactMailList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactMailList["+ j +"]"));
			}
			alarm.setContactMailList(contactMailList);

			List<String> contactGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactGroups.Length"); j++) {
				contactGroups.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactGroups["+ j +"]"));
			}
			alarm.setContactGroups(contactGroups);

			List<String> contactALIIWWList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactALIIWWList.Length"); j++) {
				contactALIIWWList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactALIIWWList["+ j +"]"));
			}
			alarm.setContactALIIWWList(contactALIIWWList);

			List<String> contactSMSList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactSMSList.Length"); j++) {
				contactSMSList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactSMSList["+ j +"]"));
			}
			alarm.setContactSMSList(contactSMSList);

			List<String> contactDingList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactDingList.Length"); j++) {
				contactDingList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactDingList["+ j +"]"));
			}
			alarm.setContactDingList(contactDingList);

			SendDetail sendDetail = new SendDetail();
			sendDetail.setResultCode(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendDetail.ResultCode"));

			List<ChannelResult> channelResultList = new ArrayList<ChannelResult>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendDetail.ChannelResultList.Length"); j++) {
				ChannelResult channelResult = new ChannelResult();
				channelResult.setChannel(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendDetail.ChannelResultList["+ j +"].Channel"));

				List<Result> resultList = new ArrayList<Result>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendDetail.ChannelResultList["+ j +"].ResultList.Length"); k++) {
					Result result = new Result();
					result.setCode(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendDetail.ChannelResultList["+ j +"].ResultList["+ k +"].Code"));
					result.setRequestId(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendDetail.ChannelResultList["+ j +"].ResultList["+ k +"].RequestId"));
					result.setSuccess(_ctx.booleanValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendDetail.ChannelResultList["+ j +"].ResultList["+ k +"].Success"));
					result.setDetail(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendDetail.ChannelResultList["+ j +"].ResultList["+ k +"].Detail"));

					List<String> notifyTargetList = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendDetail.ChannelResultList["+ j +"].ResultList["+ k +"].notifyTargetList.Length"); l++) {
						notifyTargetList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendDetail.ChannelResultList["+ j +"].ResultList["+ k +"].notifyTargetList["+ l +"]"));
					}
					result.setNotifyTargetList(notifyTargetList);

					resultList.add(result);
				}
				channelResult.setResultList(resultList);

				channelResultList.add(channelResult);
			}
			sendDetail.setChannelResultList(channelResultList);
			alarm.setSendDetail(sendDetail);

			Escalation escalation = new Escalation();
			escalation.setExpression(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Escalation.Expression"));
			escalation.setTimes(_ctx.integerValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Escalation.Times"));
			escalation.setLevel(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Escalation.Level"));
			alarm.setEscalation(escalation);

			List<ExtInfo> extendedInfo = new ArrayList<ExtInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ExtendedInfo.Length"); j++) {
				ExtInfo extInfo = new ExtInfo();
				extInfo.setName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ExtendedInfo["+ j +"].Name"));
				extInfo.setValue(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ExtendedInfo["+ j +"].Value"));

				extendedInfo.add(extInfo);
			}
			alarm.setExtendedInfo(extendedInfo);

			List<DimensionsItem> dimensions = new ArrayList<DimensionsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Dimensions.Length"); j++) {
				DimensionsItem dimensionsItem = new DimensionsItem();
				dimensionsItem.setKey(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Dimensions["+ j +"].Key"));
				dimensionsItem.setValue(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Dimensions["+ j +"].Value"));

				dimensions.add(dimensionsItem);
			}
			alarm.setDimensions(dimensions);

			List<WebhookListItem> webhookList = new ArrayList<WebhookListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].WebhookList.Length"); j++) {
				WebhookListItem webhookListItem = new WebhookListItem();
				webhookListItem.setCode(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].WebhookList["+ j +"].code"));
				webhookListItem.setUrl(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].WebhookList["+ j +"].url"));
				webhookListItem.setMessage(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].WebhookList["+ j +"].message"));

				webhookList.add(webhookListItem);
			}
			alarm.setWebhookList(webhookList);

			List<SendResult> sendResultList = new ArrayList<SendResult>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendResultList.Length"); j++) {
				SendResult sendResult = new SendResult();
				sendResult.setKey(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendResultList["+ j +"].Key"));

				List<String> value = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendResultList["+ j +"].Value.Length"); k++) {
					value.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendResultList["+ j +"].Value["+ k +"]"));
				}
				sendResult.setValue(value);

				sendResultList.add(sendResult);
			}
			alarm.setSendResultList(sendResultList);

			alertLogList.add(alarm);
		}
		describeAlertLogListResponse.setAlertLogList(alertLogList);
	 
	 	return describeAlertLogListResponse;
	}
}