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

package com.aliyuncs.r_kvstore.transform.v20150101;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeIntranetAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIntranetAttributeResponseUnmarshaller {

	public static DescribeIntranetAttributeResponse unmarshall(DescribeIntranetAttributeResponse describeIntranetAttributeResponse, UnmarshallerContext _ctx) {
		
		describeIntranetAttributeResponse.setRequestId(_ctx.stringValue("DescribeIntranetAttributeResponse.RequestId"));
		describeIntranetAttributeResponse.setBandwidthExpireTime(_ctx.stringValue("DescribeIntranetAttributeResponse.BandwidthExpireTime"));
		describeIntranetAttributeResponse.setAutoRenewal(_ctx.booleanValue("DescribeIntranetAttributeResponse.AutoRenewal"));
		describeIntranetAttributeResponse.setExpireTime(_ctx.stringValue("DescribeIntranetAttributeResponse.ExpireTime"));
		describeIntranetAttributeResponse.setIntranetBandwidth(_ctx.integerValue("DescribeIntranetAttributeResponse.IntranetBandwidth"));
	 
	 	return describeIntranetAttributeResponse;
	}
}