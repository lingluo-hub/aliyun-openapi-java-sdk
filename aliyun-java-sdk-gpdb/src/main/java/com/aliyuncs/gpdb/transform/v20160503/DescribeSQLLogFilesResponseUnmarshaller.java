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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogFilesResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogFilesResponse.LogFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogFilesResponseUnmarshaller {

	public static DescribeSQLLogFilesResponse unmarshall(DescribeSQLLogFilesResponse describeSQLLogFilesResponse, UnmarshallerContext _ctx) {
		
		describeSQLLogFilesResponse.setRequestId(_ctx.stringValue("DescribeSQLLogFilesResponse.RequestId"));
		describeSQLLogFilesResponse.setTotalRecordCount(_ctx.integerValue("DescribeSQLLogFilesResponse.TotalRecordCount"));
		describeSQLLogFilesResponse.setPageRecordCount(_ctx.integerValue("DescribeSQLLogFilesResponse.PageRecordCount"));
		describeSQLLogFilesResponse.setPageNumber(_ctx.integerValue("DescribeSQLLogFilesResponse.PageNumber"));

		List<LogFile> items = new ArrayList<LogFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLLogFilesResponse.Items.Length"); i++) {
			LogFile logFile = new LogFile();
			logFile.setFileID(_ctx.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].FileID"));
			logFile.setLogStartTime(_ctx.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].LogStartTime"));
			logFile.setLogSize(_ctx.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].LogSize"));
			logFile.setLogDownloadURL(_ctx.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].LogDownloadURL"));
			logFile.setLogEndTime(_ctx.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].LogEndTime"));
			logFile.setLogStatus(_ctx.stringValue("DescribeSQLLogFilesResponse.Items["+ i +"].LogStatus"));

			items.add(logFile);
		}
		describeSQLLogFilesResponse.setItems(items);
	 
	 	return describeSQLLogFilesResponse;
	}
}