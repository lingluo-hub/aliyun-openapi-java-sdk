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

package com.aliyuncs.alidns.transform.v20150109;

import com.aliyuncs.alidns.model.v20150109.DescribeBatchResultCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBatchResultCountResponseUnmarshaller {

	public static DescribeBatchResultCountResponse unmarshall(DescribeBatchResultCountResponse describeBatchResultCountResponse, UnmarshallerContext _ctx) {
		
		describeBatchResultCountResponse.setRequestId(_ctx.stringValue("DescribeBatchResultCountResponse.RequestId"));
		describeBatchResultCountResponse.setStatus(_ctx.integerValue("DescribeBatchResultCountResponse.Status"));
		describeBatchResultCountResponse.setTotalCount(_ctx.integerValue("DescribeBatchResultCountResponse.TotalCount"));
		describeBatchResultCountResponse.setTaskId(_ctx.longValue("DescribeBatchResultCountResponse.TaskId"));
		describeBatchResultCountResponse.setFailedCount(_ctx.integerValue("DescribeBatchResultCountResponse.FailedCount"));
		describeBatchResultCountResponse.setSuccessCount(_ctx.integerValue("DescribeBatchResultCountResponse.SuccessCount"));
		describeBatchResultCountResponse.setBatchType(_ctx.stringValue("DescribeBatchResultCountResponse.BatchType"));
		describeBatchResultCountResponse.setReason(_ctx.stringValue("DescribeBatchResultCountResponse.Reason"));
	 
	 	return describeBatchResultCountResponse;
	}
}