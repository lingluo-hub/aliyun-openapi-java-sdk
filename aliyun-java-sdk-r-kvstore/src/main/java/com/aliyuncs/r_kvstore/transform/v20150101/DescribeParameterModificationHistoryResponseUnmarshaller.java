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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeParameterModificationHistoryResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeParameterModificationHistoryResponse.HistoricalParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterModificationHistoryResponseUnmarshaller {

	public static DescribeParameterModificationHistoryResponse unmarshall(DescribeParameterModificationHistoryResponse describeParameterModificationHistoryResponse, UnmarshallerContext _ctx) {
		
		describeParameterModificationHistoryResponse.setRequestId(_ctx.stringValue("DescribeParameterModificationHistoryResponse.RequestId"));

		List<HistoricalParameter> historicalParameters = new ArrayList<HistoricalParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterModificationHistoryResponse.HistoricalParameters.Length"); i++) {
			HistoricalParameter historicalParameter = new HistoricalParameter();
			historicalParameter.setOldParameterValue(_ctx.stringValue("DescribeParameterModificationHistoryResponse.HistoricalParameters["+ i +"].OldParameterValue"));
			historicalParameter.setParameterName(_ctx.stringValue("DescribeParameterModificationHistoryResponse.HistoricalParameters["+ i +"].ParameterName"));
			historicalParameter.setNewParameterValue(_ctx.stringValue("DescribeParameterModificationHistoryResponse.HistoricalParameters["+ i +"].NewParameterValue"));
			historicalParameter.setModifyTime(_ctx.stringValue("DescribeParameterModificationHistoryResponse.HistoricalParameters["+ i +"].ModifyTime"));

			historicalParameters.add(historicalParameter);
		}
		describeParameterModificationHistoryResponse.setHistoricalParameters(historicalParameters);
	 
	 	return describeParameterModificationHistoryResponse;
	}
}