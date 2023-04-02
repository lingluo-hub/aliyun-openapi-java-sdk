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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.DescribeMPCoSPhaseInfoResponse;
import com.aliyuncs.ltl.model.v20190510.DescribeMPCoSPhaseInfoResponse.Data;
import com.aliyuncs.ltl.model.v20190510.DescribeMPCoSPhaseInfoResponse.Data.RelatedData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMPCoSPhaseInfoResponseUnmarshaller {

	public static DescribeMPCoSPhaseInfoResponse unmarshall(DescribeMPCoSPhaseInfoResponse describeMPCoSPhaseInfoResponse, UnmarshallerContext _ctx) {
		
		describeMPCoSPhaseInfoResponse.setRequestId(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.RequestId"));
		describeMPCoSPhaseInfoResponse.setCode(_ctx.integerValue("DescribeMPCoSPhaseInfoResponse.Code"));
		describeMPCoSPhaseInfoResponse.setMessage(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Message"));
		describeMPCoSPhaseInfoResponse.setSuccess(_ctx.booleanValue("DescribeMPCoSPhaseInfoResponse.Success"));

		Data data = new Data();
		data.setPreviousHash(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.PreviousHash"));
		data.setProductKey(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.ProductKey"));
		data.setDataHash(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.DataHash"));
		data.setDataValue(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.DataValue"));
		data.setTimestamp(_ctx.longValue("DescribeMPCoSPhaseInfoResponse.Data.Timestamp"));
		data.setTransactionHash(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.TransactionHash"));
		data.setBlockHash(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.BlockHash"));
		data.setBlockNumber(_ctx.longValue("DescribeMPCoSPhaseInfoResponse.Data.BlockNumber"));
		data.setIotId(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.IotId"));

		List<RelatedData> relatedDataList = new ArrayList<RelatedData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMPCoSPhaseInfoResponse.Data.RelatedDataList.Length"); i++) {
			RelatedData relatedData = new RelatedData();
			relatedData.setRelatedDataKey(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.RelatedDataList["+ i +"].RelatedDataKey"));
			relatedData.setRelatedPhaseDataHash(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.RelatedDataList["+ i +"].RelatedPhaseDataHash"));
			relatedData.setRelatedDataSeq(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.RelatedDataList["+ i +"].RelatedDataSeq"));
			relatedData.setRelatedPhaseName(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.RelatedDataList["+ i +"].RelatedPhaseName"));
			relatedData.setRelatedPhaseId(_ctx.stringValue("DescribeMPCoSPhaseInfoResponse.Data.RelatedDataList["+ i +"].RelatedPhaseId"));

			relatedDataList.add(relatedData);
		}
		data.setRelatedDataList(relatedDataList);
		describeMPCoSPhaseInfoResponse.setData(data);
	 
	 	return describeMPCoSPhaseInfoResponse;
	}
}