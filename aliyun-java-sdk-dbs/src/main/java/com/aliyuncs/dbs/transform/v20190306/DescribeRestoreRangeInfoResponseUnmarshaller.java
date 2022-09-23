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

package com.aliyuncs.dbs.transform.v20190306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbs.model.v20190306.DescribeRestoreRangeInfoResponse;
import com.aliyuncs.dbs.model.v20190306.DescribeRestoreRangeInfoResponse.DBSRecoverRange;
import com.aliyuncs.dbs.model.v20190306.DescribeRestoreRangeInfoResponse.DBSRecoverRange.FullBackupDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreRangeInfoResponseUnmarshaller {

	public static DescribeRestoreRangeInfoResponse unmarshall(DescribeRestoreRangeInfoResponse describeRestoreRangeInfoResponse, UnmarshallerContext _ctx) {
		
		describeRestoreRangeInfoResponse.setRequestId(_ctx.stringValue("DescribeRestoreRangeInfoResponse.RequestId"));
		describeRestoreRangeInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeRestoreRangeInfoResponse.HttpStatusCode"));
		describeRestoreRangeInfoResponse.setErrCode(_ctx.stringValue("DescribeRestoreRangeInfoResponse.ErrCode"));
		describeRestoreRangeInfoResponse.setSuccess(_ctx.booleanValue("DescribeRestoreRangeInfoResponse.Success"));
		describeRestoreRangeInfoResponse.setErrMessage(_ctx.stringValue("DescribeRestoreRangeInfoResponse.ErrMessage"));

		List<DBSRecoverRange> items = new ArrayList<DBSRecoverRange>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreRangeInfoResponse.Items.Length"); i++) {
			DBSRecoverRange dBSRecoverRange = new DBSRecoverRange();
			dBSRecoverRange.setEndTimestampForRestore(_ctx.longValue("DescribeRestoreRangeInfoResponse.Items["+ i +"].EndTimestampForRestore"));
			dBSRecoverRange.setSourceEndpointInstanceType(_ctx.stringValue("DescribeRestoreRangeInfoResponse.Items["+ i +"].SourceEndpointInstanceType"));
			dBSRecoverRange.setRangeType(_ctx.stringValue("DescribeRestoreRangeInfoResponse.Items["+ i +"].RangeType"));
			dBSRecoverRange.setBeginTimestampForRestore(_ctx.longValue("DescribeRestoreRangeInfoResponse.Items["+ i +"].BeginTimestampForRestore"));
			dBSRecoverRange.setSourceEndpointInstanceID(_ctx.stringValue("DescribeRestoreRangeInfoResponse.Items["+ i +"].SourceEndpointInstanceID"));

			List<FullBackupDetail> fullBackupList = new ArrayList<FullBackupDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRestoreRangeInfoResponse.Items["+ i +"].FullBackupList.Length"); j++) {
				FullBackupDetail fullBackupDetail = new FullBackupDetail();
				fullBackupDetail.setEndTime(_ctx.longValue("DescribeRestoreRangeInfoResponse.Items["+ i +"].FullBackupList["+ j +"].EndTime"));
				fullBackupDetail.setStartTime(_ctx.longValue("DescribeRestoreRangeInfoResponse.Items["+ i +"].FullBackupList["+ j +"].StartTime"));
				fullBackupDetail.setBackupSetId(_ctx.stringValue("DescribeRestoreRangeInfoResponse.Items["+ i +"].FullBackupList["+ j +"].BackupSetId"));

				fullBackupList.add(fullBackupDetail);
			}
			dBSRecoverRange.setFullBackupList(fullBackupList);

			items.add(dBSRecoverRange);
		}
		describeRestoreRangeInfoResponse.setItems(items);
	 
	 	return describeRestoreRangeInfoResponse;
	}
}