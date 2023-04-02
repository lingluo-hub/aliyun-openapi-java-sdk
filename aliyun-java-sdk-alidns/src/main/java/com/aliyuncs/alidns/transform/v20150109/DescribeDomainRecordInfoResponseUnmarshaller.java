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

import com.aliyuncs.alidns.model.v20150109.DescribeDomainRecordInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRecordInfoResponseUnmarshaller {

	public static DescribeDomainRecordInfoResponse unmarshall(DescribeDomainRecordInfoResponse describeDomainRecordInfoResponse, UnmarshallerContext _ctx) {
		
		describeDomainRecordInfoResponse.setRequestId(_ctx.stringValue("DescribeDomainRecordInfoResponse.RequestId"));
		describeDomainRecordInfoResponse.setStatus(_ctx.stringValue("DescribeDomainRecordInfoResponse.Status"));
		describeDomainRecordInfoResponse.setRR(_ctx.stringValue("DescribeDomainRecordInfoResponse.RR"));
		describeDomainRecordInfoResponse.setGroupName(_ctx.stringValue("DescribeDomainRecordInfoResponse.GroupName"));
		describeDomainRecordInfoResponse.setDomainName(_ctx.stringValue("DescribeDomainRecordInfoResponse.DomainName"));
		describeDomainRecordInfoResponse.setPriority(_ctx.longValue("DescribeDomainRecordInfoResponse.Priority"));
		describeDomainRecordInfoResponse.setPunyCode(_ctx.stringValue("DescribeDomainRecordInfoResponse.PunyCode"));
		describeDomainRecordInfoResponse.setTTL(_ctx.longValue("DescribeDomainRecordInfoResponse.TTL"));
		describeDomainRecordInfoResponse.setGroupId(_ctx.stringValue("DescribeDomainRecordInfoResponse.GroupId"));
		describeDomainRecordInfoResponse.setLine(_ctx.stringValue("DescribeDomainRecordInfoResponse.Line"));
		describeDomainRecordInfoResponse.setLocked(_ctx.booleanValue("DescribeDomainRecordInfoResponse.Locked"));
		describeDomainRecordInfoResponse.setType(_ctx.stringValue("DescribeDomainRecordInfoResponse.Type"));
		describeDomainRecordInfoResponse.setDomainId(_ctx.stringValue("DescribeDomainRecordInfoResponse.DomainId"));
		describeDomainRecordInfoResponse.setValue(_ctx.stringValue("DescribeDomainRecordInfoResponse.Value"));
		describeDomainRecordInfoResponse.setRecordId(_ctx.stringValue("DescribeDomainRecordInfoResponse.RecordId"));
		describeDomainRecordInfoResponse.setRemark(_ctx.stringValue("DescribeDomainRecordInfoResponse.Remark"));
	 
	 	return describeDomainRecordInfoResponse;
	}
}