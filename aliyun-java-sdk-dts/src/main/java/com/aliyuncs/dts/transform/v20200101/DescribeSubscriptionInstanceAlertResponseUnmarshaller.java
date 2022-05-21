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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.DescribeSubscriptionInstanceAlertResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubscriptionInstanceAlertResponseUnmarshaller {

	public static DescribeSubscriptionInstanceAlertResponse unmarshall(DescribeSubscriptionInstanceAlertResponse describeSubscriptionInstanceAlertResponse, UnmarshallerContext _ctx) {
		
		describeSubscriptionInstanceAlertResponse.setRequestId(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.RequestId"));
		describeSubscriptionInstanceAlertResponse.setErrorAlertStatus(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrorAlertStatus"));
		describeSubscriptionInstanceAlertResponse.setErrCode(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrCode"));
		describeSubscriptionInstanceAlertResponse.setSuccess(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.Success"));
		describeSubscriptionInstanceAlertResponse.setErrorAlertPhone(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrorAlertPhone"));
		describeSubscriptionInstanceAlertResponse.setErrMessage(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrMessage"));
		describeSubscriptionInstanceAlertResponse.setDelayAlertStatus(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.DelayAlertStatus"));
		describeSubscriptionInstanceAlertResponse.setSubscriptionInstanceName(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.SubscriptionInstanceName"));
		describeSubscriptionInstanceAlertResponse.setDelayAlertPhone(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.DelayAlertPhone"));
		describeSubscriptionInstanceAlertResponse.setSubscriptionInstanceID(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.SubscriptionInstanceID"));
		describeSubscriptionInstanceAlertResponse.setDelayOverSeconds(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.DelayOverSeconds"));
	 
	 	return describeSubscriptionInstanceAlertResponse;
	}
}